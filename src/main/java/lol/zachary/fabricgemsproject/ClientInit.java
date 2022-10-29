package lol.zachary.fabricgemsproject;

import lol.zachary.fabricgemsproject.item.Crossbows;
import lol.zachary.fabricgemsproject.renderer.PredicateRegistry;
import net.fabricmc.api.ClientModInitializer;

public class ClientInit implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    PredicateRegistry.registerCrossbow(Crossbows.TOPAZ_CROSSBOW);
  }

}
