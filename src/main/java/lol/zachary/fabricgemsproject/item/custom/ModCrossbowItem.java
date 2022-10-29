package lol.zachary.fabricgemsproject.item.custom;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class ModCrossbowItem extends CrossbowItem {

    public ModCrossbowItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.getItem() instanceof ModCrossbowItem;
    }

}
