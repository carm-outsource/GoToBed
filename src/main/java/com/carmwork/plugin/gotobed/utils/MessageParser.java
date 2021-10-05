package com.carmwork.plugin.gotobed.utils;

public class MessageParser {

    public static String parseColor(String text) {
        return text.replaceAll("&", "§").replace("§§", "&");
    }


}
