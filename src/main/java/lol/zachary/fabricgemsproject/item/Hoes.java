package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.MainInit;
import lol.zachary.fabricgemsproject.ToolMaterials;
import lol.zachary.fabricgemsproject.item.variants.ModHoeItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Hoes {

  public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
    new ModHoeItem(ToolMaterials.TOPAZ, 0, 0,
      new ModHoeItem.Settings().group(ModItemGroup.MOD_GROUP)));

  // Item registration methods
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MainInit.MOD_ID, name), item);
  }

  public static void registerItems() {
    MainInit.LOGGER.debug("Registering Hoe Items for " + MainInit.MOD_ID);
  }

}
