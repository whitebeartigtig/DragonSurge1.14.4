
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.dragonsurge.itemgroup.DragonSurgeStuffItemGroup;
import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class Musictest2Item extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:musictest2")
	public static final Item block = null;
	public Musictest2Item(DragonSurgeElements instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DragonSurgeElements.sounds.get(new ResourceLocation("dragonsurge:s")),
					new Item.Properties().group(DragonSurgeStuffItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("musictest2");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
