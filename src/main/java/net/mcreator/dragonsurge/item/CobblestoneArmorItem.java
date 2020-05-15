
package net.mcreator.dragonsurge.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.dragonsurge.itemgroup.DragonSurgeStuffItemGroup;
import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class CobblestoneArmorItem extends DragonSurgeElements.ModElement {
	@ObjectHolder("dragonsurge:cobblestonearmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("dragonsurge:cobblestonearmorbody")
	public static final Item body = null;
	@ObjectHolder("dragonsurge:cobblestonearmorlegs")
	public static final Item legs = null;
	@ObjectHolder("dragonsurge:cobblestonearmorboots")
	public static final Item boots = null;
	public CobblestoneArmorItem(DragonSurgeElements instance) {
		super(instance, 142);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 8;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 3, 3, 1}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 5;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "cobblestonearmor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(DragonSurgeStuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "dragonsurge:textures/models/armor/cobblestone_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestonearmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(DragonSurgeStuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "dragonsurge:textures/models/armor/cobblestone_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestonearmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(DragonSurgeStuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "dragonsurge:textures/models/armor/cobblestone_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestonearmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(DragonSurgeStuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "dragonsurge:textures/models/armor/cobblestone_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("cobblestonearmorboots"));
	}
}
