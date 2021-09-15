package com.example.hotstarapp.activity;

public class Title {
    private String title;
    private String slug;
    private String thumbnail_image;

    public Title() {
    }

    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }

    public String getThumbnail_image() {
        return thumbnail_image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setThumbnail_image(String thumbnail_image) {
        this.thumbnail_image = thumbnail_image;
    }

    public Title(String title, String slug, String thumbnail_image) {
        this.title = title;
        this.slug = slug;
        this.thumbnail_image = thumbnail_image;
    }
}
