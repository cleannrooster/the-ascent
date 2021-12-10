package com.cleannrooster.theascent;

import com.cleannrooster.theascent.registry.items.ModItems;
import com.cleannrooster.theascent.registry.items.StatusEffectsModded;
import net.fabricmc.api.ModInitializer;

public class Ascent implements ModInitializer {

    public static final String MOD_ID = "theascent";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        StatusEffectsModded.registerStatusEffects();
    }
}

