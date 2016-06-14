package sokratis12GR.ArmorPlus.resources;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    /**
     * Settings
     */
    public static boolean enableCoalArmorRecipes;
    public static boolean enableLapisArmorRecipes;
    public static boolean enableRedstoneArmorRecipes;
    public static boolean enableEmeraldArmorRecipes;
    public static boolean enableObsidianArmorRecipes;
    public static boolean enableLavaArmorRecipes;
    public static boolean enableSuperStarArmorRecipes;
    public static boolean enableEnderDragonArmorRecipes;
    public static boolean enableGuardianArmorRecipes;
    public static boolean enableTheUltimateArmorRecipes;
    public static boolean enableReinforcedArmorsRecipes;
    public static boolean enableCustomArmorRecipes;

    /** Special Effects*/
    /**
     * Coal Armor
     */
    public static boolean enableCoalHNightVision;
    public static boolean enableCoalCNightVision;
    public static boolean enableCoalLNightVision;
    public static boolean enableCoalBNightVision;

    public static boolean enableCharcoalCoalArmorRecipe;
    /**
     * Lapis Armor
     */
    public static boolean enableLapisHBreathing;
    public static boolean enableLapisCBreathing;
    public static boolean enableLapisLBreathing;
    public static boolean enableLapisBBreathing;
    public static boolean expensiveLapisRecipe;
    public static boolean cheapLapisRecipe;
    /**
     * Redstone Armor
     */
    public static boolean enableRedstoneHSpeed;
    public static boolean enableRedstoneCSpeed;
    public static boolean enableRedstoneLSpeed;
    public static boolean enableRedstoneBSpeed;
    /**
     * Emerald Armor
     */
    public static boolean enableEmeraldHHaste;
    public static boolean enableEmeraldCHaste;
    public static boolean enableEmeraldLHaste;
    public static boolean enableEmeraldBHaste;
    /**
     * Obsidian Armor
     */
    public static boolean enableObsidianHResistance;
    public static boolean enableObsidianCResistance;
    public static boolean enableObsidianLResistance;
    public static boolean enableObsidianBResistance;
    /**
     * Lava Armor
     */
    public static boolean enableLavaHResistance;
    public static boolean enableLavaHFireResistance;
    public static boolean enableLavaCResistance;
    public static boolean enableLavaCFireResistance;
    public static boolean enableLavaLResistance;
    public static boolean enableLavaLFireResistance;
    public static boolean enableLavaBResistance;
    public static boolean enableLavaBFireResistance;

    public static boolean enableOldLavaArmorRecipes;
    /**
     * Super Star Armor
     */
    public static boolean enableSuperStarHRegen;
    public static boolean enableSuperStarCRegen;
    public static boolean enableSuperStarLRegen;
    public static boolean enableSuperStarBRegen;
    /**
     * Flight Ability
     */
    public static boolean enableFlightAbility;
    /**
     * Guardian Armor
     */
    public static boolean enableGuardianHEffects;
    public static boolean enableGuardianCEffects;
    public static boolean enableGuardianLEffects;
    public static boolean enableGuardianBEffects;

    /**
     * Full Armor Effects
     */
    public static boolean enableFullSuperStarArmorEffect;
    public static boolean enableFullGuardianArmorEffect;
    public static boolean enableFullRedstoneArmorEffect;
    public static boolean enableFullObsidianArmorEffect;
    public static boolean enableFullLavaArmorEffect;
    public static boolean enableFullEmeraldArmorEffect;
    public static boolean enableFullLapisArmorEffect;
    public static boolean enableFullCoalArmorEffect;

    /**
     * Origin Armors Effect Level
     */
    public static int emeraldArmorEffectlevel;
    public static int lavaArmorEffectlevel;
    public static int obsidianArmorEffectlevel;
    public static int redstoneArmorEffectlevel;

    /**
     * Special Armors Effect Level
     */
    public static int superstarArmorEffectlevel;
    public static int ultimateArmorEffectlevel;

    /**
     * Tinkers' Construct Armors
     */
    public static boolean enableArditeArmorRecipes;
    public static boolean enableCobaltArmorRecipes;
    public static boolean enableManyullynArmorRecipes;
    public static boolean enablePigIronArmorRecipes;
    public static boolean enableKnightSlimeArmorRecipes;
    //Their Effects
    public static boolean enableArditeArmorEffects;
    public static boolean enableCobaltArmorEffects;
    public static boolean enableManyullynArmorEffects;
    public static boolean enablePigIronArmorEffects;
    public static boolean enableKnightSlimeArmorEffects;

    /**
     * Special - Mob
     */
    public static boolean enableChickenArmorRecipes;
    public static boolean enableSlimeArmorRecipes;

    /**
     * Armor Game Mods
     */
    public static boolean easyMode;
    public static boolean expertMode;

    public static void init(File file) {
        config = new Configuration(file);

        syncConfig();
    }

    public static void syncConfig() {
        String category;
        category = "Recipes".toLowerCase();
        enableCoalArmorRecipes = config.getBoolean("enableCoalArmorRecipes", category, true,
                "Enable/Disable The Coal Armor Recipes");
        enableCharcoalCoalArmorRecipe = config.getBoolean("enableCharcoalCoalArmorRecipe", category, false,
                "Enable/Disable The Charcoal Coal Armor Recipes");
        enableLapisArmorRecipes = config.getBoolean("enableLapisArmorRecipes", category, true,
                "Enable/Disable The Lapis Armor Recipes");
        enableRedstoneArmorRecipes = config.getBoolean("enableRedstoneArmorRecipes", category, true,
                "Enable/Disable The Redstone Armor Recipes");
        enableEmeraldArmorRecipes = config.getBoolean("enableEmeraldArmorRecipes", category, true,
                "Enable/Disable The Emerald Armor Recipes");
        enableObsidianArmorRecipes = config.getBoolean("enableObsidianArmorRecipes", category, true,
                "Enable/Disable The Obsidian Armor Recipes");
        enableLavaArmorRecipes = config.getBoolean("enableLavaArmorRecipes", category, true,
                "Enable/Disable The Lava Armor Recipes");
        enableSuperStarArmorRecipes = config.getBoolean("enableSuperStarArmorRecipes", category, true,
                "Enable/Disable The Super Star Armor Recipes");
        enableEnderDragonArmorRecipes = config.getBoolean("enableEnderDragonArmorRecipes", category, true,
                "Enable/Disable The Ender Dragon Armor Recipes");
        enableGuardianArmorRecipes = config.getBoolean("enableGuardianArmorRecipes", category, true,
                "Enable/Disable The Guardian Armor Recipes");
        enableTheUltimateArmorRecipes = config.getBoolean("enableTheUltimateArmorRecipes", category, true,
                "Enable/Disable The Ultimate Armor Recipes");
        enableReinforcedArmorsRecipes = config.getBoolean("enableReinforcedArmorsRecipes", category, true,
                "Enable/Disable The Reinforced Armors Recipes");
        enableCustomArmorRecipes = config.getBoolean("enableCustomArmorRecipes", category, true,
                "Enable/Disable The Custom Armors Recipes");
        enableArditeArmorRecipes = config.getBoolean("enableArditeArmorRecipes", category, true,
                "Enable/Disable The Ardite Armors Recipes");
        enableCobaltArmorRecipes = config.getBoolean("enableCobaltArmorRecipes", category, true,
                "Enable/Disable The Cobalt Armors Recipes");
        enableManyullynArmorRecipes = config.getBoolean("enableManyullynArmorRecipes", category, true,
                "Enable/Disable The Manyullyn Armors Recipes");
        enablePigIronArmorRecipes = config.getBoolean("enablePigIronArmorRecipes", category, true,
                "Enable/Disable The Pig Iron Armors Recipes");
        enableKnightSlimeArmorRecipes = config.getBoolean("enableKnightSlimeArmorRecipes", category, true,
                "Enable/Disable The Knight Slime Armors Recipes");
        enableChickenArmorRecipes = config.getBoolean("enableChickenArmorRecipes", category, true, "Enable/Disable The Chicken Armors Recipes");
        enableSlimeArmorRecipes = config.getBoolean("enableSlimeArmorRecipes", category, true, "Enable/Disable The Slime Armors Recipes");
        enableOldLavaArmorRecipes = config.getBoolean("enableOldLavaArmorRecipes", category, false, "Enable/Disable The Old Lava Armors Recipes");

        /** Coal Armor*/
        category = "CoalArmor".toLowerCase();
        config.isChild = true;
        enableCoalHNightVision = config.getBoolean("enableCoalHNightVision", category, true,
                "Enable/Disable The Coal Helmet NightVision");
        enableCoalCNightVision = config.getBoolean("enableCoalCNightVision", category, true,
                "Enable/Disable The Coal Chestplate NightVision");
        enableCoalLNightVision = config.getBoolean("enableCoalLNightVision", category, true,
                "Enable/Disable The Coal Leggings NightVision");
        enableCoalBNightVision = config.getBoolean("enableCoalBNightVision", category, true,
                "Enable/Disable The Coal Boots NightVision");
        /**Full Coal Armor Effect*/
        enableFullCoalArmorEffect = config.getBoolean("enableFullCoalArmorEffect", category, false,
                "Enable/Disable The Full Coal Armor Effect");

        /** Lapis Armor*/
        category = "LapisArmor".toLowerCase();
        config.isChild = true;
        enableLapisHBreathing = config.getBoolean("enableLapisHBreathing", category, true,
                "Enable/Disable The Lapis Helmet Water Breathing");
        enableLapisCBreathing = config.getBoolean("enableLapisCBreathing", category, true,
                "Enable/Disable The Lapis Chestplate Water Breathing");
        enableLapisLBreathing = config.getBoolean("enableLapisLBreathing", category, true,
                "Enable/Disable The Lapis Leggings Water Breathing");
        enableLapisBBreathing = config.getBoolean("enableLapisBBreathing", category, true,
                "Enable/Disable The Lapis Boots Water Breathing");
        /**Full Lapis Armor Effect*/
        enableFullLapisArmorEffect = config.getBoolean("enableFullLapisArmorEffect", category, false,
                "Enable/Disable The Full Lapis Armor Effect");
        /**Lapis Armor Recipe Cost */
        expensiveLapisRecipe = config.getBoolean("expensiveLapisRecipe", category, true,
                "Sets the Lapis Armor Recipe to require Lapis Lazuli (Blocks)");
        cheapLapisRecipe = config.getBoolean("cheapLapisRecipe", category, false,
                "Sets the Lapis Armor Recipe to require Lapis Lazuli (Items)");

        /** Redstone Armor*/
        category = "RedstoneArmor".toLowerCase();
        config.isChild = true;
        enableRedstoneHSpeed = config.getBoolean("enableRedstoneHSpeed", category, true,
                "Enable/Disable The Redstone Helmet Speed");
        enableRedstoneCSpeed = config.getBoolean("enableRedstoneCeSpeed", category, true,
                "Enable/Disable Redstone Chestplate Speed");
        enableRedstoneLSpeed = config.getBoolean("enableRedstoneLSpeed", category, true,
                "Enable/Disable The Redstone Leggings Speed");
        enableRedstoneBSpeed = config.getBoolean("enableRedstoneBSpeed", category, true,
                "Enable/Disable The Redstone Boots Speed");
        /**Full Redstone Armor Effect*/
        enableFullRedstoneArmorEffect = config.getBoolean("enableFullRedstoneArmorEffect", category, false,
                "Enable/Disable The Full Redstone Armor Effect");


        /** Emerald Armor*/
        category = "EmeraldArmor".toLowerCase();
        config.isChild = true;
        enableEmeraldHHaste = config.getBoolean("enableEmeraldHHaste", category, true,
                "Enable/Disable The Emerald Helmet Haste");
        enableEmeraldCHaste = config.getBoolean("enableEmeraldCHaste", category, true,
                "Enable/Disable Emerald Chestplate Haste");
        enableEmeraldLHaste = config.getBoolean("enableEmeraldLHaste", category, true,
                "Enable/Disable The Emerald Leggings Haste");
        enableEmeraldBHaste = config.getBoolean("enableEmeraldBHaste", category, true,
                "Enable/Disable The Emerald Boots Haste");
        /**Full Emerald Armor Effect*/
        enableFullEmeraldArmorEffect = config.getBoolean("enableFullEmeraldArmorEffect", category, false,
                "Enable/Disable The Full Emerald Armor Effect");


        /** Obsidian Armor*/
        category = "ObsidianArmor".toLowerCase();
        config.isChild = true;
        enableObsidianHResistance = config.getBoolean("enableObsidianHResistance", category, true,
                "Enable/Disable The Obsidian Helmet Resistance");
        enableObsidianCResistance = config.getBoolean("enableObsidianCResistance", category, true,
                "Enable/Disable Obsidian Chestplate Resistance");
        enableObsidianLResistance = config.getBoolean("enableObsidianLResistance", category, true,
                "Enable/Disable The Obsidian Leggings Resistance");
        enableObsidianBResistance = config.getBoolean("enableObsidianBResistance", category, true,
                "Enable/Disable The Obsidian Boots Resistance");
        /**Full Obsidian Armor Effect*/
        enableFullObsidianArmorEffect = config.getBoolean("enableFullObsidianArmorEffect", category, false,
                "Enable/Disable The Full Obsidian Armor Effect");

        /** Lava Armor*/
        category = "LavaArmor".toLowerCase();
        config.isChild = true;
        /** Lava Armor Resistance*/
        enableLavaHResistance = config.getBoolean("enableLavaHResistance", category, true,
                "Enable/Disable The Lava Helmet Resistance");
        enableLavaCResistance = config.getBoolean("enableLavaCResistance", category, true,
                "Enable/Disable Lava Chestplate Resistance");
        enableLavaLResistance = config.getBoolean("enableLavaLResistance", category, true,
                "Enable/Disable The Lava Leggings Resistance");
        enableLavaBResistance = config.getBoolean("enableLavaBResistance", category, true,
                "Enable/Disable The Lava Boots Resistance");
        /** Lava Armor FireResistance*/
        enableLavaHFireResistance = config.getBoolean("enableLavaHFireResistance", category, true,
                "Enable/Disable The Lava Helmet FireResistance");
        enableLavaCFireResistance = config.getBoolean("enableLavaCFireResistance", category, true,
                "Enable/Disable Lava Chestplate FireResistance");
        enableLavaLFireResistance = config.getBoolean("enableLavaLFireResistance", category, true,
                "Enable/Disable The Lava Leggings FireResistance");
        enableLavaBFireResistance = config.getBoolean("enableLavaBFireResistance", category, true,
                "Enable/Disable The Lava Boots FireResistance");
        /**Full Lava Armor Effect*/
        enableFullLavaArmorEffect = config.getBoolean("enableFullLavaArmorEffect", category, false,
                "Enable/Disable The Full Lava Armor Effect");

        /** Super Star Armor*/
        category = "SuperStarArmor".toLowerCase();
        config.isChild = true;
        enableSuperStarHRegen = config.getBoolean("enableSuperStarHRegen", category, true,
                "Enable/Disable The Super Star Helmet Regeneration");
        enableSuperStarCRegen = config.getBoolean("enableSuperStarCRegen", category, true,
                "Enable/Disable The Super Star Chestplate Regeneration");
        enableSuperStarLRegen = config.getBoolean("enableSuperStarLRegen", category, true,
                "Enable/Disable The Super Star Leggings Regeneration");
        enableSuperStarBRegen = config.getBoolean("enableSuperStarBRegen", category, true,
                "Enable/Disable The Super Star Boots Regeneration");
        /**Full Super Star Armor Effect*/
        enableFullSuperStarArmorEffect = config.getBoolean("enableFullSuperStarArmorEffect", category, false,
                "Enable/Disable The Full Super Star Armor Effect");

        category = "GuardianArmor".toLowerCase();
        config.isChild = true;
        enableGuardianHEffects = config.getBoolean("enableGuardianHEffects", category, true,
                "Enable/Disable Guardian Helmet Effects");
        enableGuardianCEffects = config.getBoolean("enableGuardianCEffects", category, true,
                "Enable/Disable Guardian Chestplate Effects ");
        enableGuardianLEffects = config.getBoolean("enableGuardianLEffects", category, true,
                "Enable/Disable Guardian Leggings Effects");
        enableGuardianBEffects = config.getBoolean("enableGuardianBEffects", category, true,
                "Enable/Disable Guardian Boots Effects");
        /**Full Guardian Armor Effect*/
        enableFullGuardianArmorEffect = config.getBoolean("enableFullGuardianArmorEffect", category, false,
                "Enable/Disable The Full Guardian Armor Effect");


        /** Flight Ability*/
        category = "FlightAbility".toLowerCase();
        enableFlightAbility = config.getBoolean("enableFlightAbility", category, true, "Enable/Disable The Armors Flight");

        category = "EffectLevel".toLowerCase();
        emeraldArmorEffectlevel = config.getInt("emeraldArmorEffectlevel", category, 1, 0, 10, "Set the level of the Haste effect by the Emerald Armor.");
        obsidianArmorEffectlevel = config.getInt("obsidianArmorEffectlevel", category, 0, 0, 10, "Set the level of the Resistance effect by the Obsidian Armor.");
        redstoneArmorEffectlevel = config.getInt("redstoneArmorEffectlevel", category, 1, 0, 10, "Set the level of the Swiftness effect by the Redstone Armor.");
        /** Lava Armor Effects */
        lavaArmorEffectlevel = config.getInt("lavaArmorEffectlevel", category, 0, 0, 10, "Set the level of the Resistance effect by the Lava Armor.");
        /** Super Star Armor */
        superstarArmorEffectlevel = config.getInt("superstarArmorEffectlevel", category, 1, 0, 10, "Set the level of the Regeneration effect by the Super Star Armor.");
        /** The Ultimate Armor Effects */
        ultimateArmorEffectlevel = config.getInt("ultimateArmorEffectlevel", category, 1, 0, 10, "Set the level of the Regeneration effect by The Ultimate Armor.");

        /** Game Modes */
        category = "GameModes".toLowerCase();
        easyMode = config.getBoolean("easyMode", category, true, "Sets the Recipe Difficulty to easy");
        expertMode = config.getBoolean("expertMode", category, false, "Sets the Recipe Difficulty to Expert");

        /** Tinkers' Armors Effects */
        category = "TinkersEffects".toLowerCase();
        enableArditeArmorEffects = config.getBoolean("enableArditeArmorEffects", category, true,
                "Enable/Disable Ardite Armor Effects");
        enableCobaltArmorEffects = config.getBoolean("enableCobaltArmorEffects", category, true,
                "Enable/Disable Cobalt Armor Effects ");
        enableManyullynArmorEffects = config.getBoolean("enableManyullynArmorEffects", category, true,
                "Enable/Disable Manyullym Armor Effects");
        enablePigIronArmorEffects = config.getBoolean("enablePigIronArmorEffects", category, true,
                "Enable/Disable Pig Iron Armor Effects");
        enableKnightSlimeArmorEffects = config.getBoolean("enableKnightSlimeArmorEffects", category, true,
                "Enable/Disable Knight Slime Armor Effects");

        //config.getFloat(String name, String category, float defaultValue, float minValue, float maxValue, String comment)
        //config.get(String category, String key, int[] defaultValues, String comment, int minValue, int maxValue)
        //config.getString(String name, String category, String defaultValue, String comment, String[] validValues, String langKey);

        if (config.hasChanged())
            config.save();
    }
}
