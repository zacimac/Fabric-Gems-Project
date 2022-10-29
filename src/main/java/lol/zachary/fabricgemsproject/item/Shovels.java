package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.MainInit;
import lol.zachary.fabricgemsproject.ToolMaterials;
import lol.zachary.fabricgemsproject.item.variants.ModShovelItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Shovels {

  public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
    new ModShovelItem(ToolMaterials.TOPAZ, 0, 0,
      new ModShovelItem.Settings().group(ModItemGroup.MOD_GROUP)));

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MainInit.MOD_ID, name), item);
  }

  public static void registerItems() {
    MainInit.LOGGER.debug("Registering Shovel Items for " + MainInit.MOD_ID);
  }

}
