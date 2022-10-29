package lol.zachary.fabricgemsproject.item.variants;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class ModCrossbowItem extends CrossbowItem {

    private final int durability;

    public ModCrossbowItem(Settings settings, int durability) {
        super(settings);
        this.durability = durability;
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.getItem() instanceof ModCrossbowItem;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

}
