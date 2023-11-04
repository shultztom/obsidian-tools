package com.shultztom.shultzlab_obsidian_tools.datagen;

import com.shultztom.shultzlab_obsidian_tools.Registration;
import com.shultztom.shultzlab_obsidian_tools.shultzlab_obsidian_tools;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, shultzlab_obsidian_tools.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.PICKAXE.getId().getPath(),
                mcLoc("item/handheld"),
                "layer0",
                modLoc("item/obsidian_pickaxe")
                );

        singleTexture(Registration.AXE.getId().getPath(),
                mcLoc("item/handheld"),
                "layer0",
                modLoc("item/obsidian_axe")
        );

        singleTexture(Registration.SHOVEL.getId().getPath(),
                mcLoc("item/handheld"),
                "layer0",
                modLoc("item/obsidian_shovel")
        );

        singleTexture(Registration.SWORD.getId().getPath(),
                mcLoc("item/handheld"),
                "layer0",
                modLoc("item/obsidian_sword")
        );

        singleTexture(Registration.HOE.getId().getPath(),
                mcLoc("item/handheld"),
                "layer0",
                modLoc("item/obsidian_hoe")
        );
    }
}