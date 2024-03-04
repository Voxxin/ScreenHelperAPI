package com.github.voxxin.shp;

import com.github.voxxin.shp.api.ScreenBuilder;
import com.github.voxxin.shp.test.SreenTest;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;

public class ScreenHelperAPI implements ClientModInitializer {

    public static Minecraft minecraft() { return Minecraft.getInstance(); }

    @Override
    public void onInitializeClient() {

        /**
         * Idea:
         * ScreenBuilder builder = new ScreenBuilder();
         * ScreenBuilder.Button btn = new ScreenBuilder.Button();
         *
         * btn.setWidth(24);
         * btn.setHeight(16);
         *
         * btn.setTooltip(...);
         *
         * btn.callback((action) -> {
         *     System.out.println("I was clicked!");
         * });
         *
         * btn.hover((action) -> {
         *  System.out.println("I was clicked!");
         * });
         *
         * btn.background_color()
         *
         * builder.addButton(btn);
         * Screen screen = builder.build();
         */

    }
}
