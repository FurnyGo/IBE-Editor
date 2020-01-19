package com.github.franckyi.guapi.node;

import com.github.franckyi.guapi.IValueNode;
import com.github.franckyi.guapi.Node;
import com.github.franckyi.guapi.Scene;
import com.github.franckyi.guapi.gui.IGuiView;
import com.google.common.collect.Lists;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import net.minecraftforge.fml.client.config.GuiUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

public class CheckBox extends Node<CheckBox.GuiCheckBoxView> implements IValueNode<Boolean> {

    private final Set<BiConsumer<Boolean, Boolean>> onValueChangedListeners;

    public CheckBox() {
        this("", false);
    }

    public CheckBox(String text) {
        this(text, false);
    }

    public CheckBox(boolean checked) {
        this("", checked);
    }

    public CheckBox(String text, boolean checked) {
        super(new GuiCheckBoxView(text, checked));
        onValueChangedListeners = new HashSet<>();
        this.computeSize();
        this.updateSize();
    }

    public String getText() {
        return this.getView().getMessage();
    }

    public void setText(String text) {
        this.getView().setMessage(text);
    }

    public boolean getValue() {
        return this.getView().isChecked();
    }

    public void setValue(boolean checked) {
        boolean old = this.getValue();
        this.getView().setChecked(checked);
        if (old != checked) {
            this.onValueChanged(old, checked);
        }
    }

    public List<String> getTooltipText() {
        return this.getView().tooltipText;
    }

    public boolean isDisabled() {
        return !this.getView().active;
    }

    public void setDisabled(boolean disabled) {
        this.getView().active = !disabled;
    }

    @Override
    protected void computeWidth() {
        this.setComputedWidth(11 + 2 + mc.fontRenderer.getStringWidth(this.getText()));
    }

    @Override
    protected void computeHeight() {
        this.setComputedHeight(11);
    }

    @Override
    public boolean onMouseClicked(GuiScreenEvent.MouseClickedEvent event) {
        if (super.onMouseClicked(event)) {
            this.setValue(!this.getValue());
            return true;
        }
        return false;
    }

    @Override
    public Set<BiConsumer<Boolean, Boolean>> getOnValueChangedListeners() {
        return onValueChangedListeners;
    }

    public static class GuiCheckBoxView extends GuiButtonExt implements IGuiView {

        private boolean checked;
        private final List<String> tooltipText;
        private Scene.GUAPIScreen screen;

        public GuiCheckBoxView(String displayString, boolean checked, String... tooltipText) {
            super(0, 0, 0, 0, displayString, (b) -> {
            });
            this.checked = checked;
            this.tooltipText = Lists.newArrayList(tooltipText);
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        @Override
        public int getViewX() {
            return x;
        }

        @Override
        public void setViewX(int x) {
            this.x = x;
        }

        @Override
        public int getViewY() {
            return y;
        }

        @Override
        public void setViewY(int y) {
            this.y = y;
        }

        @Override
        public int getViewWidth() {
            return super.getWidth();
        }

        @Override
        public void setViewWidth(int width) {
            super.setWidth(width);
        }

        @Override
        public int getViewHeight() {
            return height;
        }

        @Override
        public void setViewHeight(int height) {
            this.height = height;
        }

        @Override
        public boolean isViewVisible() {
            return visible;
        }

        @Override
        public void setViewVisible(boolean visible) {
            this.visible = visible;
        }

        @Override
        public void renderView(int mouseX, int mouseY, float partialTicks) {
            int boxWidth = this.height;
            GuiUtils.drawContinuousTexturedBox(WIDGETS_LOCATION, this.x, this.y, 0, 46, boxWidth, this.height, 200, 20, 2, 3, 2, 2, this.blitOffset);
            if (this.checked) {
                this.drawCenteredString(mc.fontRenderer, "x", this.x + boxWidth / 2 + 1, this.y + 1, 14737632);
            }
            this.drawString(mc.fontRenderer, this.getMessage(), this.x + boxWidth + 2, this.y + 2, 0xffffff);
            if (this.inBounds(mouseX, mouseY)) {
                if (screen == null) {
                    screen = (Scene.GUAPIScreen) mc.currentScreen;
                }
                screen.renderTooltip(tooltipText, mouseX, mouseY);
            }
        }
    }
}
