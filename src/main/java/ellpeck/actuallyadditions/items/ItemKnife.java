package ellpeck.actuallyadditions.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ellpeck.actuallyadditions.config.ConfigValues;
import ellpeck.actuallyadditions.util.IName;
import ellpeck.actuallyadditions.util.ItemUtil;
import ellpeck.actuallyadditions.util.KeyUtil;
import ellpeck.actuallyadditions.util.ModUtil;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemKnife extends Item implements IName{

    public ItemKnife(){
        this.setMaxDamage(ConfigValues.itemKnifeMaxDamage);
        this.setMaxStackSize(1);
        this.setContainerItem(this);
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack){
        ItemStack theStack = stack.copy();
        theStack.setItemDamage(theStack.getItemDamage() + 1);
        theStack.stackSize = 1;
        return theStack;
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack){
        return false;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack){
        return EnumRarity.epic;
    }

    @Override
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
        if(KeyUtil.isShiftPressed()){
            list.add(StatCollector.translateToLocal("tooltip." + ModUtil.MOD_ID_LOWER + "." + this.getName() + ".desc"));
            list.add(StatCollector.translateToLocal("tooltip." + ModUtil.MOD_ID_LOWER + ".durability.desc") + ": " + (this.getMaxDamage()-this.getDamage(stack)) + "/" + this.getMaxDamage());
        }
        else list.add(ItemUtil.shiftForInfo());

    }

    @Override
    public boolean getShareTag(){
        return true;
    }

    @Override
    public IIcon getIcon(ItemStack stack, int pass){
        return this.itemIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconReg){
        this.itemIcon = iconReg.registerIcon(ModUtil.MOD_ID_LOWER + ":" + this.getName());
    }

    @Override
    public String getName(){
        return "itemKnife";
    }
}
