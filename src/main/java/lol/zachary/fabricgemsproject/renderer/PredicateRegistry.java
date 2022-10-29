package lol.zachary.fabricgemsproject.renderer;

import lol.zachary.fabricgemsproject.GemsProject;
import lol.zachary.fabricgemsproject.item.custom.ModCrossbowItem;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class PredicateRegistry {

  public static void registerCrossbow(ModCrossbowItem crossbowItem) {
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier("pull"), (itemStack, clientWorld, livingEntity, seed) -> {
      if (livingEntity == null) {
        return 0;
      } else
        return CrossbowItem.isCharged(itemStack) ? 0.0F : (float) (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) /
          (float) CrossbowItem.getPullTime(itemStack);
    });
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier("pulling"), (itemStack, clientWorld1, livingEntity, seed)
      -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack && !CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier("charged"), (itemStack, clientWorld, livingEntity, seed)
      -> livingEntity != null && CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
    ModelPredicateProviderRegistry.register(crossbowItem, new Identifier("firework"), (itemStack, clientWorld, livingEntity, seed)
      -> livingEntity != null && CrossbowItem.isCharged(itemStack) && CrossbowItem.hasProjectile(itemStack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
  }

}
