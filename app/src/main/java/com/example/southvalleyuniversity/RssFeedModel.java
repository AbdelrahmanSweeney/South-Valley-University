package com.example.southvalleyuniversity;


public class RssFeedModel {
    public String title;
    public String link;
    public String description;
    public String pubDate;

    public RssFeedModel(String title, String link, String description, String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
    }
}
