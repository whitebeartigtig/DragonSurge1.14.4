
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dragonsurge.itemgroup.DragonSurgeStuffItemGroup;
import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class DarkDragonPickaxeItem extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:darkdragonpickaxe")
	public static final Item block = null;
	public DarkDragonPickaxeItem(DragonSurgeElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 525;
			}

			public float getEfficiency() {
				return 17.5f;
			}

			public float getAttackDamage() {
				return 15.6f;
			}

			public int getHarvestLevel() {
				return 17;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.4f, new Item.Properties().group(DragonSurgeStuffItemGroup.tab)) {
		}.setRegistryName("darkdragonpickaxe"));
	}
}
