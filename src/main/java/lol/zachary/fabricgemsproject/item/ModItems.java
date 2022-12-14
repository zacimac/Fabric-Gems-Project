package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.MainInit;
import lol.zachary.fabricgemsproject.ToolMaterials;
import lol.zachary.fabricgemsproject.item.variants.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

  // Items
  public static final Item TOPAZ_SHARDS = registerItem("topaz_shards",
    new Item(new Item.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ = registerItem("topaz",
    new Item(new Item.Settings().group(ModItemGroup.MOD_GROUP)));

  // Tools/Weapons
  public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
    new ModShovelItem(ToolMaterials.TOPAZ, 0, 0,
      new ModShovelItem.Settings().group(ModItemGroup.MOD_GROUP)));

  // Item registration methods
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MainInit.MOD_ID, name), item);
  }

  public static void registerModItems() {
    MainInit.LOGGER.debug("Registering Mod Items for " + MainInit.MOD_ID);
  }

}
