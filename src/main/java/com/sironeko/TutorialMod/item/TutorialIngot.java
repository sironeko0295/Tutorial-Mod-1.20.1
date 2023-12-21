package com.sironeko.TutorialMod.item;

import net.minecraft.world.item.Item;

public class TutorialIngot extends Item {
    public TutorialIngot(){
        super(new Properties()
                .fireResistant()
                .stacksTo(64)
        );
    }
}
