package com.github.franckyi.gameadapter.api.common.world;

import com.github.franckyi.gameadapter.api.common.tag.CompoundTag;

public interface Item {
    CompoundTag getData();

    <S> S get();
}
