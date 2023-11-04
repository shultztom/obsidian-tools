package com.shultztom.shultzlab_obsidian_tools;

import com.shultztom.shultzlab_obsidian_tools.items.Axe;
import com.shultztom.shultzlab_obsidian_tools.items.Pickaxe;
import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, shultzlab_obsidian_tools.MODID);
    public static final RegistryObject<PickaxeItem> PICKAXE = ITEMS.register("obsidian_pickaxe", Pickaxe::new);
    public static final RegistryObject<AxeItem> AXE = ITEMS.register("obsidian_axe", Axe::new);
    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(PICKAXE);
            event.accept(AXE);
        }
    }
}
