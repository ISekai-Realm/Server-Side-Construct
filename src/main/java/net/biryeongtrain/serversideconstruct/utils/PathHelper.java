package net.biryeongtrain.serversideconstruct.utils;

import net.minecraft.util.Identifier;

import static net.biryeongtrain.serversideconstruct.ServerSideConstruct.MOD_ID;

public class PathHelper {
    public static Identifier getModId(String path) {
        return Identifier.of(MOD_ID, path);
    }

    public static Identifier getItemModelId(String path) {
        return getModId("item/" + path);
    }

    public static Identifier getBlockModelId(String path) {
        return getModId("block/" + path);
    }
    public static String getItemGroupTranslationKey(String path) {
        return "itemgroup." + MOD_ID + "." + path;
    }
    public static String getBlockTranslationKey(String path) {
        return "block." + MOD_ID + "." + path;
    }
}
