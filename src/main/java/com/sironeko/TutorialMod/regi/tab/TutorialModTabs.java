package com.sironeko.TutorialMod.regi.tab;

import com.sironeko.TutorialMod.main.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TutorialModTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Tutorial_MIAN =
            MOD_TABS.register("tutorial_main", () ->
            {return CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.CHERRY_PLANKS))
                        .title(Component.translatable("itemGroup.tutorial_main"))
                                .displayItems((param, output) -> {
                                    for(Item item:TutorialMain.ITEMS){
                                        output.accept(item);
                                    }
                                })
                                .build();
                        });
}
