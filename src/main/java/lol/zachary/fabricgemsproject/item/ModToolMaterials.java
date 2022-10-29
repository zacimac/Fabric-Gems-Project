package lol.zachary.fabricgemsproject.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum ModToolMaterials implements ToolMaterial {
  TOPAZ(MiningLevels.IRON, 200, 6.0F, 2.0F, 14, Ingredient.ofItems(ModItems.TOPAZ));

  private final int miningLevel;
  private final int itemDurability;
  private final float miningSpeed;
  private final float attackDamage;
  private final int enchantability;
  private final Ingredient repairIngredient;

  private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient) {
    this.miningLevel = miningLevel;
    this.itemDurability = itemDurability;
    this.miningSpeed = miningSpeed;
    this.attackDamage = attackDamage;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public int getDurability() {
    return itemDurability;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return miningSpeed;
  }

  @Override
  public float getAttackDamage() {
    return attackDamage;
  }

  @Override
  public int getMiningLevel() {
    return miningLevel;
  }

  @Override
  public int getEnchantability() {
    return enchantability;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return repairIngredient;
  }
  
}
