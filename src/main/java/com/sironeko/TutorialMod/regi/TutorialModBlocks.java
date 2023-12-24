package com.sironeko.TutorialMod.regi;

import com.sironeko.TutorialMod.block.BlockTutorial;
import com.sironeko.TutorialMod.main.TutorialMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TutorialModBlocks {
    public static class Blocks{
        public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

        public static final RegistryObject<Block> Tutorial_BLOCK =
                BLOCKS.register("tutorial_block", BlockTutorial::new);
    }
    public static class BlockItems{
        public static final DeferredRegister<Item> BLOCK_ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

        public static final RegistryObject<Item> Tutorial_BLOCK =
                BLOCK_ITEMS.register("tutorial_block"
                        ,() -> new BlockItem(Blocks.Tutorial_BLOCK.get(),new Item.Properties().fireResistant()));
    }
}
