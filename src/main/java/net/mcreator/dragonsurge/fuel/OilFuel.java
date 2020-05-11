
package net.mcreator.dragonsurge.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.dragonsurge.block.CrudeOilBlock;
import net.mcreator.dragonsurge.DragonSurgeElements;

@DragonSurgeElements.ModElement.Tag
public class OilFuel extends DragonSurgeElements.ModElement {
	public OilFuel(DragonSurgeElements instance) {
		super(instance, 31);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CrudeOilBlock.block, (int) (1)).getItem())
			event.setBurnTime(21625);
	}
}
