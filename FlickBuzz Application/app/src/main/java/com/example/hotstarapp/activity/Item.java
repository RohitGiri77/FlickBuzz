package com.example.hotstarapp.activity;

import java.util.ArrayList;

public class Item {


    private String category_name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Item() {
    }


    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = titles;
    }

    public Item(String category_name, ArrayList<Title> titles) {
        this.category_name = category_name;
        this.titles = titles;
    }
}
