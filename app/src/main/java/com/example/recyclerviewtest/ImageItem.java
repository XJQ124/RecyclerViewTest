package com.example.recyclerviewtest;

public class ImageItem {
    private int imageResId;
    private String name;

    public ImageItem(int imageResId, String name) {
        this.imageResId = imageResId;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }
}
