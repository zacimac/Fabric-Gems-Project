package lol.zachary.fabricgemsproject.item;

import lol.zachary.fabricgemsproject.GemsProject;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
  public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(
    new Identifier(GemsProject.MOD_ID, "gemsproject"),
    () -> new ItemStack(ModItems.TOPAZ));
}
