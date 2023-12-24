package com.sironeko.TutorialMod.regi;

import com.sironeko.TutorialMod.main.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.swing.text.html.HTML;

public class TutorialModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_TUTORIAL_TOOL = tag("needs_tutorial_tool");
            private static TagKey<Block> tag (String name){
                return BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID,name));
        }
    }

    public static class Items{
        public static final TagKey<Item> Tutorial_Series = tag("tutorial_series");
        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(TutorialMod.MOD_ID, name));
        }
    }
}
