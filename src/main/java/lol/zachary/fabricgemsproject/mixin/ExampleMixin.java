package lol.zachary.fabricgemsproject.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import lol.zachary.fabricgemsproject.GemsProject;

@Mixin(TitleScreen.class)
public class ExampleMixin {

  @Inject(at = @At("HEAD"), method = "init()V")
  private void init(CallbackInfo info) {
    GemsProject.LOGGER.info("This line is printed by an example mod mixin!");
  }

}
