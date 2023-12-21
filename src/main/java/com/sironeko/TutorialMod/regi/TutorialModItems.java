package com.sironeko.TutorialMod.regi;

import com.sironeko.TutorialMod.item.TutorialIngot;
import com.sironeko.TutorialMod.item.ItemsTutorial;
import com.sironeko.TutorialMod.main.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TutorialModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Tutorial_ITEM =
            ITEMS.register("tutorial_item", ItemsTutorial::new);

    public static final RegistryObject<Item>  Tutorial_ingot =
            ITEMS.register("tutorial_ingot", TutorialIngot::new);
}
