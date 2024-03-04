package com.github.voxxin.shp.test;

import com.github.voxxin.shp.api.ScreenBuilder;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.narration.NarratableEntry;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class SreenTest extends Screen {
    public SreenTest() {
        super(Component.literal("die!"));
    }

    @Override
    protected void init() {
        super.init();

        ScreenBuilder builder = new ScreenBuilder();
        ScreenBuilder.Button btn = new ScreenBuilder.Button(24, 16);
        btn.setComponent(Component.literal("Hello, World"));

        this.addRenderableWidget(btn.build());
    }

    @Override
    public void render(GuiGraphics guiGraphics, int i, int j, float f) {
        super.render(guiGraphics, i, j, f);
        renderDirtBackground(guiGraphics);
    }
}
