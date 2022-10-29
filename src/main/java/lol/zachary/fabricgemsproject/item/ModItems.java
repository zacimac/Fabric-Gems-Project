package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.GemsProject;
import lol.zachary.fabricgemsproject.item.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

  // Items
  public static final Item TOPAZ_SHARDS = registerItem("topaz_shards",
    new Item(new Item.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ = registerItem("topaz",
    new Item(new Item.Settings().group(ModItemGroup.MOD_GROUP)));

  // Tools/Weapons
  public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
    new ModSwordItem(ModToolMaterials.TOPAZ, 0, 0,
      new ModSwordItem.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
    new ModPickaxeItem(ModToolMaterials.TOPAZ, 0, 0,
      new ModPickaxeItem.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ_AXE = registerItem("topaz_axe",
    new ModAxeItem(ModToolMaterials.TOPAZ, 0, 0,
      new ModAxeItem.Settings().group(ModItemGroup.MOD_GROUP)));
  public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
    new ModShovelItem(ModToolMaterials.TOPAZ, 0, 0,
      new ModShovelItem.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
    new ModHoeItem(ModToolMaterials.TOPAZ, 0, 0,
      new ModHoeItem.Settings().group(ModItemGroup.MOD_GROUP)));

  public static final Item TOPAZ_CROSSBOW = registerItem("topaz_crossbow",
    new ModCrossbowItem(new ModCrossbowItem.Settings().group(ModItemGroup.MOD_GROUP)));

  private static void registerCrossbowModelPredicates(Item crossbowItem) {
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier(GemsProject.MOD_ID,"pull"), (itemStack, clientWorld, livingEntity, seed) -> {
      if (livingEntity == null) {
        return 0;
      } else
        return CrossbowItem.isCharged(itemStack) ? 0.0F : (float) (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) /
          (float) CrossbowItem.getPullTime(itemStack);
    });
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier(GemsProject.MOD_ID,"pulling"), (itemStack, clientWorld1, livingEntity, seed)
      -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack && !CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier(GemsProject.MOD_ID,"charged"), (itemStack, clientWorld, livingEntity, seed)
      -> livingEntity != null && CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier(GemsProject.MOD_ID,"firework"), (itemStack, clientWorld, livingEntity, seed)
      -> livingEntity != null && CrossbowItem.isCharged(itemStack) && CrossbowItem.hasProjectile(itemStack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
  }


  // Item registration methods  
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(GemsProject.MOD_ID, name), item);
  }

  public static void registerModItems() {
    GemsProject.LOGGER.debug("Registering Mod Items for " + GemsProject.MOD_ID);

    // Register model predicates
    registerCrossbowModelPredicates(TOPAZ_CROSSBOW);
  }

}
