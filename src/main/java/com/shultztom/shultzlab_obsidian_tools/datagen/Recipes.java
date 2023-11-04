package com.shultztom.shultzlab_obsidian_tools.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;

import com.shultztom.shultzlab_obsidian_tools.shultzlab_obsidian_tools;
import com.shultztom.shultzlab_obsidian_tools.Registration;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Registration.PICKAXE.get())
                .pattern("ooo")
                .pattern(" s ")
                .pattern(" s ")
                .define('o', Tags.Items.OBSIDIAN)
                .define('s', Items.STICK)
                .group("shultzlab_obsidian_tools")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Tags.Items.OBSIDIAN).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Registration.AXE.get())
                .pattern("oo ")
                .pattern("os ")
                .pattern(" s ")
                .define('o', Tags.Items.OBSIDIAN)
                .define('s', Items.STICK)
                .group("shultzlab_obsidian_tools")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(
                        ItemPredicate.Builder.item().of(Tags.Items.OBSIDIAN).build()))
                .save(consumer);
    }
}
