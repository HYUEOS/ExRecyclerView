package com.jyoung.exrecyclerview.model;

/**
 * Created by Jyoung on 2018. 8. 30..
 */

public class ListData extends ListItem {
    private String title, message;
    private int iconResource;

    public ListData(String title, String message, int iconResource) {
        this.title = title;
        this.message = message;
        this.iconResource = iconResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }
}
