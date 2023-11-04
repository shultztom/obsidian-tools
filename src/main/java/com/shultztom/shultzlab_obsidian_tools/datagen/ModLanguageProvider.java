package com.shultztom.shultzlab_obsidian_tools.datagen;

import com.shultztom.shultzlab_obsidian_tools.shultzlab_obsidian_tools;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import com.shultztom.shultzlab_obsidian_tools.Registration;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, shultzlab_obsidian_tools.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Registration.PICKAXE.get(), "Obsidian Pickaxe");
    }
}
