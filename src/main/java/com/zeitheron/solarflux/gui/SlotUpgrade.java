package com.zeitheron.solarflux.gui;

import com.zeitheron.solarflux.block.tile.TileBaseSolar;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotUpgrade extends Slot
{
	TileBaseSolar tile;
	
	public SlotUpgrade(TileBaseSolar inventoryIn, int index, int xPosition, int yPosition)
	{
		super(inventoryIn.items, index, xPosition, yPosition);
		this.tile = inventoryIn;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return tile.items.isItemValidForSlot(getSlotIndex(), stack);
	}
}