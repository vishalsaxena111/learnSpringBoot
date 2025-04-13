package com.learn.springBoot.ControllerExample;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class FirstNamePropertyEditot extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.trim().toUpperCase());
    }
}
