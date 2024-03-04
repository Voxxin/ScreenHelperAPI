package com.github.voxxin.shp.api.option;

import com.github.voxxin.shp.api.option.intr.Attributes;

public class Attributable implements Attributes {
    private final int width;
    private final int height;
    private final int padding;
    private final int backgroundColour;

    public Attributable(int width, int height, int padding, int backgroundColour) {
        this.width = width;
        this.height = height;
        this.padding = padding;
        this.backgroundColour = backgroundColour;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public float getPadding() {
        return this.padding;
    }

    @Override
    public int getBackgroundColour() {
        return this.backgroundColour;
    }
}
