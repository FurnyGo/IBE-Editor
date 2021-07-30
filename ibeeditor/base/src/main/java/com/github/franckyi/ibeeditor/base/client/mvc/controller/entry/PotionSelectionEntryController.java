package com.github.franckyi.ibeeditor.base.client.mvc.controller.entry;

import com.github.franckyi.gameadapter.Color;
import com.github.franckyi.gameadapter.Game;
import com.github.franckyi.ibeeditor.base.client.ModScreenHandler;
import com.github.franckyi.ibeeditor.base.client.mvc.model.ColorSelectionScreenModel;
import com.github.franckyi.ibeeditor.base.client.mvc.model.entry.PotionSelectionEntryModel;
import com.github.franckyi.ibeeditor.base.client.mvc.view.entry.PotionSelectionEntryView;

public class PotionSelectionEntryController extends SelectionEntryController<PotionSelectionEntryModel, PotionSelectionEntryView> {
    public PotionSelectionEntryController(PotionSelectionEntryModel model, PotionSelectionEntryView view) {
        super(model, view);
    }

    @Override
    public void bind() {
        super.bind();
        view.getChooseColorButton().onAction(() -> ModScreenHandler.openColorSelectionScreen(ColorSelectionScreenModel.Target.POTION, this::updatePotionColor, model.getCustomColor()));
        view.getRemoveColorButton().onAction(() -> model.setCustomColor(Color.NONE));
        view.getResetColorButton().onAction(model::resetCustomColor);
        model.customColorProperty().addListener(this::updatePotionItem);
        model.valueProperty().addListener(this::updatePotionItem);
        updatePotionItem();
    }

    private void updatePotionItem() {
        view.getPotionView().setItem(Game.getCommon().createPotionItem(model.getValue(), model.getCustomColor()));
    }

    private void updatePotionColor(String value) {
        model.setCustomColor(Color.fromHex(value));
    }
}
