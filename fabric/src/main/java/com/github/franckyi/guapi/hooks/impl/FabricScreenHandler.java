package com.github.franckyi.guapi.hooks.impl;

import com.github.franckyi.guapi.hooks.api.RenderContext;
import com.github.franckyi.guapi.hooks.api.ScreenHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;

import java.util.function.Consumer;

public final class FabricScreenHandler extends AbstractScreenHandler<Screen> {
    public static final ScreenHandler INSTANCE = new FabricScreenHandler();

    private FabricScreenHandler() {
        initScreen(new ScreenImpl());
    }

    @Override
    protected Consumer<Screen> getMinecraftScreenHandler() {
        return MinecraftClient.getInstance()::openScreen;
    }

    private final class ScreenImpl extends Screen {
        protected ScreenImpl() {
            super(new LiteralText(""));
        }

        @Override
        public void render(MatrixStack matrices, int mouseX, int mouseY, float partialTicks) {
            if (!currentSceneProperty().hasValue()) return;
            if (getCurrentScene().isTexturedBackground()) {
                renderBackgroundTexture(0);
            } else {
                renderBackground(matrices);
            }
            getCurrentScene().render(new RenderContext<MatrixStack>() {
                @Override
                public MatrixStack getMatrices() {
                    return matrices;
                }

                @Override
                public int getMouseX() {
                    return mouseX;
                }

                @Override
                public int getMouseY() {
                    return mouseY;
                }

                @Override
                public float getDelta() {
                    return partialTicks;
                }
            });
        }

        @Override
        public void tick() {
            if (currentSceneProperty().hasValue()) {
                getCurrentScene().tick();
            }
        }

        @Override
        public void init(MinecraftClient client, int width, int height) {
            super.init(client, width, height);
            FabricScreenHandler.this.updateSize(width, height);
        }

        @Override
        public boolean mouseClicked(double mouseX, double mouseY, int button) {
            return FabricScreenHandler.this.mouseClicked(mouseX, mouseY, button);
        }

        @Override
        public boolean mouseReleased(double mouseX, double mouseY, int button) {
            return FabricScreenHandler.this.mouseReleased(mouseX, mouseY, button);
        }

        @Override
        public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
            return FabricScreenHandler.this.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
        }

        @Override
        public boolean mouseScrolled(double mouseX, double mouseY, double amount) {
            return FabricScreenHandler.this.mouseScrolled(mouseX, mouseY, amount);
        }

        @Override
        public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
            return FabricScreenHandler.this.keyPressed(keyCode, scanCode, modifiers);
        }

        @Override
        public boolean keyReleased(int keyCode, int scanCode, int modifiers) {
            return FabricScreenHandler.this.keyReleased(keyCode, scanCode, modifiers);
        }

        @Override
        public boolean charTyped(char chr, int modifiers) {
            return FabricScreenHandler.this.charTyped(chr, modifiers);
        }

        @Override
        public void mouseMoved(double mouseX, double mouseY) {
           FabricScreenHandler.this.mouseMoved(mouseX, mouseY);
        }
    }
}