package com.github.franckyi.ibeeditor.common.packet;

import com.github.franckyi.ibeeditor.common.EditorType;
import net.minecraft.network.FriendlyByteBuf;

public class MainHandItemEditorRequestPacket extends AbstractEditorRequestPacket {
    public MainHandItemEditorRequestPacket(EditorType editorType) {
        super(editorType);
    }

    public MainHandItemEditorRequestPacket(FriendlyByteBuf buffer) {
        super(buffer);
    }
}