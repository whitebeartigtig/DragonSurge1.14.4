
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class YellowGemItem extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:yellowgem")
	public static final Item block = null;
	public YellowGemItem(DragonSurgeElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("yellowgem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
