package com.sironeko.TutorialMod.regi.tab;

import com.sironeko.TutorialMod.regi.TutorialModBlocks;
import com.sironeko.TutorialMod.regi.TutorialModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class TutorialMain {
    public static final Item[] ITEMS = {
            TutorialModItems.Tutorial_ITEM.get(),
            TutorialModItems.Tutorial_ingot.get(),
            TutorialModBlocks.BlockItems.Tutorial_BLOCK.get(),
            Items.CHERRY_PLANKS,
            Items.STONE,
    };
}
