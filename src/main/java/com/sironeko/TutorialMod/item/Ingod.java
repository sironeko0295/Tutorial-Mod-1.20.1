package com.sironeko.TutorialMod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Ingod extends Item {
    public Ingod(){
        super(new Properties()
                .food(new FoodProperties.Builder().build())
                .rarity(Rarity.RARE)
        );
    }
}
