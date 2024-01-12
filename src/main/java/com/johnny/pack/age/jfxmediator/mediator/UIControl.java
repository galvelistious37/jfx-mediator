package com.johnny.pack.age.jfxmediator.mediator;

// Abstract colleague
public interface UIControl {
    void controlChanged(UIControl control);
    String getControlValue();
    String getControlName();
}
