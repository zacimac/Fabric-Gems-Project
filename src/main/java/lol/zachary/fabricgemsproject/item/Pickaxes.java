package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.MainInit;
import lol.zachary.fabricgemsproject.ToolMaterials;
import lol.zachary.fabricgemsproject.item.variants.ModPickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Pickaxes {

  public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
    new ModPickaxeItem(ToolMaterials.TOPAZ, 0, 0,
      new ModPickaxeItem.Settings().group(ModItemGroup.MOD_GROUP)));

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MainInit.MOD_ID, name), item);
  }

  public static void registerItems() {
    MainInit.LOGGER.debug("Registering Pickaxe Items for " + MainInit.MOD_ID);
  }

}
