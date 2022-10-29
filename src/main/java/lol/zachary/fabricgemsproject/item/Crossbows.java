package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.MainInit;
import lol.zachary.fabricgemsproject.item.variants.ModCrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Crossbows {
  public static final ModCrossbowItem TOPAZ_CROSSBOW = (ModCrossbowItem) registerItem("topaz_crossbow",
    new ModCrossbowItem(new ModCrossbowItem.Settings().group(ModItemGroup.MOD_GROUP), 1));


  // Item registration methods
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MainInit.MOD_ID, name), item);
  }

  public static void registerItems() {
    MainInit.LOGGER.debug("Registering Crossbow Items for " + MainInit.MOD_ID);
  }

}
