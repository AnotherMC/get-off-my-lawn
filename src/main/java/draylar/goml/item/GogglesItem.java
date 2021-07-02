package draylar.goml.item;

import draylar.goml.GetOffMyLawn;
import draylar.goml.api.ClaimUtils;
import draylar.goml.api.WorldRendererUtils;
import eu.pb4.polymer.item.VirtualItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GogglesItem extends ArmorItem implements VirtualItem {

    public GogglesItem() {
        super(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Settings().group(GetOffMyLawn.GROUP).maxDamage(-1));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity.age % 10 != 0) {
            return;
        }

        if (entity instanceof ServerPlayerEntity player && (slot == EquipmentSlot.HEAD.getEntitySlotId() || player.getMainHandStack() == stack || player.getOffHandStack() == stack)) {
            ClaimUtils.getClaimsInBox(world, player.getBlockPos().add(-100, -100, -100), player.getBlockPos().add(100, 100, 100)).forEach((c) -> {
                BlockPos og = c.getKey().getOrigin();
                int radius = c.getKey().getRadius();
                WorldRendererUtils.render(player, og.add(radius, radius, radius), og.add(-radius, -radius, -radius), 1, 1, 1);
            });
        }
    }

    @Override
    public Item getVirtualItem() {
        return Items.IRON_HELMET;
    }
}
