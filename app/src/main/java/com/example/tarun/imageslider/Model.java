package com.example.tarun.imageslider;

/**
 * Created by Tarun on 10-09-2016.
 */
public class Model
{
    private String name;
    private String desc;
    private int thumbnail;

    public Model()
    {

    }

    public Model(String name, String desc, int thumbnail) {
        this.name = name;
        this.desc = desc;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
