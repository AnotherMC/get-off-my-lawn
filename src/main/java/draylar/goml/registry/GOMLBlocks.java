package draylar.goml.registry;

import com.mojang.datafixers.util.Pair;
import draylar.goml.GetOffMyLawn;
import draylar.goml.block.ClaimAnchorBlock;
import draylar.goml.block.ClaimAugmentBlock;
import draylar.goml.block.augment.*;
import draylar.goml.item.TooltippedBlockItem;
import eu.pb4.polymer.item.VirtualBlockItem;
import eu.pb4.polymer.item.VirtualHeadBlockItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class GOMLBlocks {

    public static final List<ClaimAnchorBlock> ANCHORS = new ArrayList<>();
    public static final List<ClaimAugmentBlock> AUGMENTS = new ArrayList<>();

    public static final String MAKESHIFT_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjkzNjE5MCwKICAicHJvZmlsZUlkIiA6ICIyMDA2NTVkMjMyYTE0MTc2OGIwNjQ0NWNkNTliNDg3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaWVzdHlCbHVlXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84Yjk1ZjgxOTlhZjViODFkMTcyZGU2NDg2NTE1MzAyMzJlNGNjYmNmYjY2OGQzMjljNmU3YTE1ODgyN2ZmOGUzIgogICAgfQogIH0KfQ==";
    public static final String REINFORCED_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjUyMzkyMSwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhmNGY0OGRlOWU1MmRjZmNmNTNhMmVkNTIyNGIwMTYzZjk1MzYwMGQ1MDhkMGE4YzExNGMyMzA2ZDEwNWNjMTUiCiAgICB9CiAgfQp9";
    public static final String GLISTENING_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjU0MzM0OSwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM1ZWE1YzJmMjk5MzI4OGM2OTUxZjU1YjBkMmE4NmI0YjQzMjA3M2U5NmJlYWYwY2E0NzA0OGU2MzExMGFmOTQiCiAgICB9CiAgfQp9";
    public static final String CRYSTAL_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjU3OTY3NCwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDlhZWQ2NzQ4MjFhNTYwMzE3NDUwODQyZDk0NjllNGU2NTZlZWFkMTJlNGNjYzEzMGNjOWJmYzQyZTNlODEwIgogICAgfQogIH0KfQ==";
    public static final String EMERADIC_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjU1ODkyNiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I5MWJkMWVjNGMyZjViNmJkODY0NmY0ZDJlZTkyYjllMDc5NDI5NzU5MjRlZGIwNjkwZmU1OTY1YjE0YTEwZGEiCiAgICB9CiAgfQp9";
    public static final String WITHERED_TEXTURE = "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk2NjQ4MjkwNSwKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJiNmNlOGE3NTU0YWY3YWNhZDQwODg1ZDFlMTZlNmNiOTFiN2FiOGYzMTUzM2U3OGUyZGI4YTI1OGQ0MTJiMCIKICAgIH0KICB9Cn0=";

    public static final Pair<ClaimAnchorBlock, Item> MAKESHIFT_CLAIM_ANCHOR = register("makeshift_claim_anchor", GetOffMyLawn.CONFIG.makeshiftRadius, 10, FabricToolTags.AXES, MAKESHIFT_TEXTURE);
    public static final Pair<ClaimAnchorBlock, Item> REINFORCED_CLAIM_ANCHOR = register("reinforced_claim_anchor", GetOffMyLawn.CONFIG.reinforcedRadius, 10, FabricToolTags.PICKAXES, REINFORCED_TEXTURE);
    public static final Pair<ClaimAnchorBlock, Item> GLISTENING_CLAIM_ANCHOR = register("glistening_claim_anchor", GetOffMyLawn.CONFIG.glisteningRadius, 15, FabricToolTags.PICKAXES, GLISTENING_TEXTURE);
    public static final Pair<ClaimAnchorBlock, Item> CRYSTAL_CLAIM_ANCHOR = register("crystal_claim_anchor", GetOffMyLawn.CONFIG.crystalRadius, 20, FabricToolTags.PICKAXES, CRYSTAL_TEXTURE);
    public static final Pair<ClaimAnchorBlock, Item> EMERADIC_CLAIM_ANCHOR = register("emeradic_claim_anchor", GetOffMyLawn.CONFIG.emeradicRadius, 20, FabricToolTags.PICKAXES, EMERADIC_TEXTURE);
    public static final Pair<ClaimAnchorBlock, Item> WITHERED_CLAIM_ANCHOR = register("withered_claim_anchor", GetOffMyLawn.CONFIG.witheredRadius, 25, FabricToolTags.PICKAXES, WITHERED_TEXTURE);

    public static final Pair<ClaimAugmentBlock, Item> ENDER_BINDING = register("ender_binding", new EnderBindingAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);
    public static final Pair<ClaimAugmentBlock, Item> LAKE_SPIRIT_GRACE = register("lake_spirit_grace", new LakeSpiritGraceAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);
    public static final Pair<ClaimAugmentBlock, Item> ANGELIC_AURA = register("angelic_aura", new AngelicAuraAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);
    public static final Pair<ClaimAugmentBlock, Item> HEAVEN_WINGS = register("heaven_wings", new HeavenWingsAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);
    public static final Pair<ClaimAugmentBlock, Item> VILLAGE_CORE = register("village_core", new ClaimAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES), ""), 2);
    public static final Pair<ClaimAugmentBlock, Item> WITHERING_SEAL = register("withering_seal", new WitheringSealAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);
    public static final Pair<ClaimAugmentBlock, Item> CHAOS_ZONE = register("chaos_zone", new ChaosZoneAugmentBlock(FabricBlockSettings.of(Material.STONE).hardness(10).resistance(3600000.0F).breakByTool(FabricToolTags.PICKAXES)), 2);

    private static Pair<ClaimAnchorBlock, Item> register(String name, int radius, float hardness, Tag<Item> toolTag, String texture) {
        ClaimAnchorBlock claimAnchorBlock;

        if(toolTag == null) {
            claimAnchorBlock = Registry.register(
                    Registry.BLOCK,
                    GetOffMyLawn.id(name),
                    new ClaimAnchorBlock(FabricBlockSettings.of(Material.STONE).strength(hardness, 3600000.0F), radius, texture)
            );
        } else {
            claimAnchorBlock = Registry.register(
                    Registry.BLOCK,
                    GetOffMyLawn.id(name),
                    new ClaimAnchorBlock(FabricBlockSettings.of(Material.STONE).breakByTool(toolTag).strength(hardness, 3600000.0F), radius, texture)
            );
        }

        Item registeredItem = Registry.register(Registry.ITEM, GetOffMyLawn.id(name), new VirtualHeadBlockItem(claimAnchorBlock, new Item.Settings().group(GetOffMyLawn.GROUP)));
        ANCHORS.add(claimAnchorBlock);
        return Pair.of(claimAnchorBlock, registeredItem);
    }

    private static Pair<ClaimAugmentBlock, Item> register(String name, ClaimAugmentBlock augment) {
        ClaimAugmentBlock registered = Registry.register(
                Registry.BLOCK,
                GetOffMyLawn.id(name),
                augment
        );

        Item registeredItem = Registry.register(Registry.ITEM, GetOffMyLawn.id(name), new BlockItem(augment, new Item.Settings().group(GetOffMyLawn.GROUP)));
        AUGMENTS.add(registered);
        return Pair.of(augment, registeredItem);
    }

    private static Pair<ClaimAugmentBlock, Item> register(String name, ClaimAugmentBlock augment, int tooltipLines) {
        ClaimAugmentBlock registered = Registry.register(
                Registry.BLOCK,
                GetOffMyLawn.id(name),
                augment
        );

        Item registeredItem = Registry.register(Registry.ITEM, GetOffMyLawn.id(name), new TooltippedBlockItem(augment, new Item.Settings().group(GetOffMyLawn.GROUP), tooltipLines));
        AUGMENTS.add(registered);
        return Pair.of(augment, registeredItem);
    }

    public static void init() {
        // NO-OP
    }

    private GOMLBlocks() {
        // NO-OP
    }
}
