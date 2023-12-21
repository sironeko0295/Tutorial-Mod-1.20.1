package com.sironeko.TutorialMod.regi;

import com.sironeko.TutorialMod.item.Ingod;
import com.sironeko.TutorialMod.item.ItemsTutorial;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TutorialModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "tutorialmod");

    public static final RegistryObject<Item> Tutorial_ITEM =
            ITEMS.register("tutorial_item", ItemsTutorial::new);

    public static final RegistryObject<Item>  Tutorial_Ingod =
            ITEMS.register("tutorial_ingod", Ingod::new);
}
