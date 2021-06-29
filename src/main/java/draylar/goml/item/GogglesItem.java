package draylar.goml.item;

import draylar.goml.GetOffMyLawn;
import eu.pb4.polymer.item.VirtualItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class GogglesItem extends ArmorItem implements VirtualItem {

    public GogglesItem() {
        super(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Settings().group(GetOffMyLawn.GROUP).maxDamage(-1));
    }

    @Override
    public Item getVirtualItem() {
        return Items.IRON_HELMET;
    }
}
