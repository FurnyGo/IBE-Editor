package com.github.franckyi.minecraft.impl.common.world;

import com.github.franckyi.minecraft.api.common.tag.CompoundTag;
import com.github.franckyi.minecraft.api.common.text.Text;
import com.github.franckyi.minecraft.api.common.world.Item;
import com.github.franckyi.minecraft.impl.common.nbt.ForgeCompoundTag;
import com.github.franckyi.minecraft.impl.common.text.ForgeTextFactory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class ForgeItem implements Item {
    private final ItemStack item;
    private final CompoundTag tag;
    private Text name;
    private Text defaultName;

    public ForgeItem(ItemStack item) {
        this(item, new ForgeCompoundTag(item.save(new CompoundNBT())));
    }

    public ForgeItem(CompoundTag tag) {
        this(ItemStack.of(tag.get()), tag);
    }

    public ForgeItem(ItemStack item, CompoundTag tag) {
        this.item = item;
        this.tag = tag;
    }

    @Override
    public CompoundTag getTag() {
        return tag;
    }

    @Override
    public Text getName() {
        if (name == null) {
            name = ForgeTextFactory.INSTANCE.createTextFromComponent(item.getDisplayName());
        }
        return name;
    }

    @Override
    public Text getDefaultName() {
        if (defaultName == null) {
            defaultName = ForgeTextFactory.INSTANCE.createTextFromComponent(item.getItem().getName(item));
        }
        return defaultName;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ItemStack get() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}