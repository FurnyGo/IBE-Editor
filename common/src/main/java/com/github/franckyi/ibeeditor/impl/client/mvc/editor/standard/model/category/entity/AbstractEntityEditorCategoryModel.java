package com.github.franckyi.ibeeditor.impl.client.mvc.editor.standard.model.category.entity;

import com.github.franckyi.ibeeditor.api.client.mvc.editor.standard.model.StandardEditorModel;
import com.github.franckyi.ibeeditor.impl.client.mvc.base.model.AbstractEditorCategoryModel;

public abstract class AbstractEntityEditorCategoryModel extends AbstractEditorCategoryModel {
    public AbstractEntityEditorCategoryModel(String name, StandardEditorModel editor) {
        super(name, editor);
    }
}