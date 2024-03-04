package com.github.voxxin.shp.api;

import com.github.voxxin.shp.api.option.Attributable;
import com.github.voxxin.shp.api.option.Hyperlink;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class ScreenBuilder {

    public static class Button extends Attributable {
        private Component component = Component.empty();
        private Hyperlink link = null;

        private final int backgroundColour;

        public Button() {
            this(0, 0);
        }

        public Button(int width, int height) {
            this(width, height, 0, 0);
        }

        public Button(int width, int height, int padding, int backgroundColour) {
            super(width, height, padding, backgroundColour);
        }

        public void setLink(Hyperlink link) {
            this.link = link;
        }

        public Hyperlink getLink() {
            return link;
        }

        public void setComponent(Component component) {
            this.component = component;
        }

        public Component getComponent() {
            return component;
        }

        public void setBackgroundColour() {
            

        }

        public net.minecraft.client.gui.components.Button build() {
            net.minecraft.client.gui.components.Button.Builder buttonToBeCreated = new net.minecraft.client.gui.components.Button.Builder(this.component, null);
            return buttonToBeCreated.build();
        }
    }
}
