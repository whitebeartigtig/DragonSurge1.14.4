
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class BluePickaxeItem extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:bluepickaxe")
	public static final Item block = null;
	public BluePickaxeItem(DragonSurgeElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 902;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bluepickaxe"));
	}
}
