package lol.zachary.fabricgemsproject.block;

import lol.zachary.fabricgemsproject.GemsProject;
import lol.zachary.fabricgemsproject.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

  // Ore Blocks
  public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
    new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).requiresTool(),
      UniformIntProvider.create(3, 7)), ModItemGroup.MOD_GROUP);
    
  public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
    new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2, 2).requiresTool(),
      UniformIntProvider.create(3, 7)), ModItemGroup.MOD_GROUP);

  // Material Blocks
  public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
    new Block(FabricBlockSettings.of(Material.METAL).strength(3, 3).requiresTool()),
      ModItemGroup.MOD_GROUP);
  

  // # Block registration methods
  private static Block registerBlock(String name, Block block, ItemGroup group) {
    registerBlockItem(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier(GemsProject.MOD_ID, name), block);
  }

  private static Item registerBlockItem(String name, Block block, ItemGroup group) {
    return Registry.register(Registry.ITEM, new Identifier(GemsProject.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(group)));
  }

  public static void registerModBlocks() {
    GemsProject.LOGGER.info("Registering ModBlocks for " + GemsProject.MOD_ID);
  }
}
