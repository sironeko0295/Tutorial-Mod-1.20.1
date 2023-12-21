package com.sironeko.TutorialMod.main;

import com.sironeko.TutorialMod.regi.TutorialModItems;
import com.sironeko.TutorialMod.regi.tab.TutorialModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tutorialmod")
public class TutorialMod {
    public static final String MOD_ID = "tutorialmod";

    public TutorialMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        TutorialModItems.ITEMS.register(bus);
        TutorialModTabs.MOD_TABS.register(bus);
    }
}
