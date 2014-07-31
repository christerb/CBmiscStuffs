package com.christerb.cbmiscstuffs.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        configuration = new Configuration(configFile);

        boolean configValue = false;

        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example config value!.").getBoolean(true);
            //configValue = configuration.get("Custom Config Category", "configValue", true, "Example config value.").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the configuration file
            if (configuration.hasChanged())
            {
                configuration.save();
            }
        }

        //System.out.println("Configuration Test: " + configValue);
    }
}
