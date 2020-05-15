
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class DONTPLAYTHISItem extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:dontplaythis")
	public static final Item block = null;
	public DONTPLAYTHISItem(DragonSurgeElements instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DragonSurgeElements.sounds.get(new ResourceLocation("dragonsurge:garycomeplz")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dontplaythis");
		}
	}
}
