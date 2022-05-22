package com.pouchusage;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PouchUsageTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PouchUsagePlugin.class);
		RuneLite.main(args);
	}
}