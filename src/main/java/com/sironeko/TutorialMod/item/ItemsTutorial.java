package com.sironeko.TutorialMod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemsTutorial extends Item{
    public ItemsTutorial() {
        super(new Properties()
                .fireResistant()
                .rarity(Rarity.EPIC)
                .food(new FoodProperties.Builder().build())
                .stacksTo(64)
        );
    }
}
