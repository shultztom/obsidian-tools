package com.shultztom.shultzlab_obsidian_tools.datagen;

import com.shultztom.shultzlab_obsidian_tools.shultzlab_obsidian_tools;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, blockTags.contentsGetter(), shultzlab_obsidian_tools.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
    }

}
