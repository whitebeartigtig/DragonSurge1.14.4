
package net.mcreator.dragonsurge.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dragonsurge.item.RifleItem;
import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class DragonSurgeStuffItemGroup extends DragonSurgeElements.ModElement {
	public DragonSurgeStuffItemGroup(DragonSurgeElements instance) {
		super(instance, 139);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdragonsurgestuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RifleItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
