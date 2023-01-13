package com.immersiveobjects;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ImmersiveObjectsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ImmersiveObjectsPlugin.class);
		RuneLite.main(args);
	}
}