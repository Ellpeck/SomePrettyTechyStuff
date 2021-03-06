package de.ellpeck.actuallyadditions.common.jei.crusher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.ellpeck.actuallyadditions.api.booklet.IBookletPage;
import de.ellpeck.actuallyadditions.common.blocks.InitBlocks;
import de.ellpeck.actuallyadditions.booklet.misc.BookletUtils;
import de.ellpeck.actuallyadditions.common.jei.RecipeWrapperWithButton;
import de.ellpeck.actuallyadditions.common.util.StackUtil;
import de.ellpeck.actuallyadditions.common.util.StringUtil;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class CrusherRecipeWrapper extends RecipeWrapperWithButton {

    public final CrusherRecipe theRecipe;

    public CrusherRecipeWrapper(CrusherRecipe recipe) {
        this.theRecipe = recipe;
    }

    @Override
    public void getIngredients(IIngredients ingredients) {
        ingredients.setInputs(VanillaTypes.ITEM, Arrays.asList(this.theRecipe.getInput().getMatchingStacks()));

        List<ItemStack> list = new ArrayList<>();
        list.add(this.theRecipe.getOutputOne());
        if (StackUtil.isValid(this.theRecipe.getOutputTwo())) {
            list.add(this.theRecipe.getOutputTwo());
        }
        ingredients.setOutputs(VanillaTypes.ITEM, list);
    }

    @Override
    public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
        if (StackUtil.isValid(this.theRecipe.getOutputTwo())) {
            minecraft.fontRenderer.drawString(this.theRecipe.getSecondChance() + "%", 60, 60, StringUtil.DECIMAL_COLOR_GRAY_TEXT, false);
        }

        super.drawInfo(minecraft, recipeWidth, recipeHeight, mouseX, mouseY);
    }

    @Override
    public int getButtonX() {
        return -5;
    }

    @Override
    public int getButtonY() {
        return 26;
    }

    @Override
    public IBookletPage getPage() {
        return BookletUtils.findFirstPageForStack(new ItemStack(InitBlocks.blockGrinder));
    }
}
