package com.sironeko.TutorialMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.level.ExplosionEvent;

public class Tutorial_TNT extends Item {
    public Tutorial_TNT(){
        super(new Properties()
                .rarity(Rarity.EPIC)

        );
    }
}
