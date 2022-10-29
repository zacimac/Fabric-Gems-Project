package lol.zachary.fabricgemsproject;

import lol.zachary.fabricgemsproject.item.ModItems;
import lol.zachary.fabricgemsproject.renderer.PredicateRegistry;
import net.fabricmc.api.ClientModInitializer;

public class ClientInit implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    PredicateRegistry.registerCrossbow(ModItems.TOPAZ_CROSSBOW);
  }

}
