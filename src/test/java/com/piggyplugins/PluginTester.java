package com.piggyplugins;

import com.example.EthanApiPlugin.EthanApiPlugin;
import com.example.PacketUtils.PacketUtilsPlugin;
import com.example.PrayerFlicker.EthanPrayerFlickerPlugin;
import com.piggyplugins.ItemCombiner.ItemCombinerPlugin;
import com.piggyplugins.LeftClickBlackJack.LeftClickBlackJackPlugin;
import com.piggyplugins.PiggyUtils.PiggyUtilsPlugin;
import com.polyplugins.AutoBoner.AutoBonerPlugin;
import com.polyplugins.Trapper.AutoTrapperPlugin;
import main.com.piggyplugins.StepTheTemplate.StepTheTemplatePlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.ChinBreakHandler.ChinBreakHandlerPlugin;
import net.runelite.client.plugins.betterprofiles.BetterProfilesPlugin;

public class PluginTester {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(EthanApiPlugin.class, PacketUtilsPlugin.class,
                PiggyUtilsPlugin.class// Don't remove these
        /* Add your plugins in this method when running from the IDE.
           Make sure to include them as a dependency in the build.gradle via `testImplementation` */,
                 EthanPrayerFlickerPlugin.class, LeftClickBlackJackPlugin.class,
                ItemCombinerPlugin.class, StepTheTemplatePlugin.class
        /*
        okay so what ever is being pulled into this class like for example the AUTOBONER
        if we want to remove that we just simple remove that from this list
        same goes for adding plugins if they're here n built then they can be added e.g autoTrapper
         */
        );
        RuneLite.main(args);
    }
}