package com.laser5mw.Cabal.init;

import java.util.ArrayList;
import java.util.List;

import com.laser5mw.Cabal.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CABALWALL = new BlockBase("CabalWall", Material.CLOTH);
}
