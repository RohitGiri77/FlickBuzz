package com.example.hotstarapp.util;

import com.example.hotstarapp.activity.Item;
import com.example.hotstarapp.activity.Title;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private static final Gson gson = new Gson();

    public String getJSON() {
        return gson.toJson(this);
    }

    public <T> T getObject(String json) {
        return (T) gson.fromJson(json, this.getClass());
    }


    public Converter() {
    }

    public static String convertItemToJson(Item item) {
        return gson.toJson(item);
    }

    public static Item convertJsonToItem(String json) {
        return (Item) gson.fromJson(json, Item.class);
    }

    public static String convertItemsToJson(ArrayList<Item> items) {
        return gson.toJson(items);
    }  //

    public static ArrayList<Item> convertJsonToItems(String json) {
        Type collectionType = new TypeToken<List<Item>>() {
        }.getType();
        return gson.fromJson(json, collectionType);
    }

    public static String convertTitleToJson(Title title) {
        return gson.toJson(title);
    }

    public static Title convertJsonToTitle(String json) {
        return (Title) gson.fromJson(json, Title.class);
    }

    public static String convertTitlesToJson(ArrayList<Title> titles) {
        return gson.toJson(titles);
    }

    public static ArrayList<Title> convertJsonToTitles(String json) {
        Type collectionType = new TypeToken<List<Title>>() {
        }.getType();
        return gson.fromJson(json, collectionType);
    }


}
