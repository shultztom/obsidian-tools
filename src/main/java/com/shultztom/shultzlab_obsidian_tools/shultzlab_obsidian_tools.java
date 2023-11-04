package com.shultztom.shultzlab_obsidian_tools;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import com.shultztom.shultzlab_obsidian_tools.datagen.DataGeneration;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(shultzlab_obsidian_tools.MODID)
public class shultzlab_obsidian_tools {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "shultzlab_obsidian_tools";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Tier
    public static final Tier OBSIDIAN_TIER = new Tier() {
        @Override
        public int getUses() {
            return 10000;
        }

        @Override
        public float getSpeed() {
            return 10;
        }

        @Override
        public float getAttackDamageBonus() {
            return 10;
        }

        @Override
        public int getLevel() {
            return 5;
        }

        @Override
        public int getEnchantmentValue() {
            return 500;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Item.byId(49));
        }
    };

    public shultzlab_obsidian_tools() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.init(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataGeneration::generate);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
