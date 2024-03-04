package com.github.voxxin.shp.mixin;

import com.github.voxxin.shp.ScreenHelperAPI;
import com.github.voxxin.shp.test.SreenTest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(TitleScreen.class)
public class InventoryMixin {

    @Inject(at = @At("HEAD"), method = "tick", locals = LocalCapture.CAPTURE_FAILHARD)
    private void load(CallbackInfo ci) {
        Minecraft.getInstance().setScreen(new SreenTest());

    }
}
