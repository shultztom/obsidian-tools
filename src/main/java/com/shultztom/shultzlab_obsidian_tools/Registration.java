package com.shultztom.shultzlab_obsidian_tools;

import com.shultztom.shultzlab_obsidian_tools.items.*;
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

    public static final RegistryObject<ShovelItem> SHOVEL = ITEMS.register("obsidian_shovel", Shovel::new);

    public static final RegistryObject<SwordItem> SWORD = ITEMS.register("obsidian_sword", Sword::new);

    public static final RegistryObject<HoeItem> HOE = ITEMS.register("obsidian_hoe", Hoe::new);
    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(PICKAXE);
            event.accept(AXE);
            event.accept(SHOVEL);
            event.accept(SWORD);
            event.accept(HOE);
        }
    }
}
