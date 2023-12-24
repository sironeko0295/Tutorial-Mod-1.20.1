package com.sironeko.TutorialMod.item.tool;

import com.sironeko.TutorialMod.main.TutorialMod;
import com.sironeko.TutorialMod.regi.TutorialModItems;
import com.sironeko.TutorialMod.regi.TutorialModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class TutorialModTiers {
    public static final ForgeTier TUTORIAL =
            new ForgeTier(5,400,11.0F,5.0F,20, TutorialModTags.Blocks.NEEDS_TUTORIAL_TOOL,() -> Ingredient.of(TutorialModItems.Tutorial_ingot.get()));

    static {
        TierSortingRegistry.registerTier(TUTORIAL,new ResourceLocation(TutorialMod.MOD_ID,"tutorial"), List.of(Tiers.NETHERITE),List.of());
    }
}
