package com.example.hp.androidfirstapplication;

/**
 * Created by hp on 02-12-2017.
 */

public class DataModel {
    String name;
    String type;
    String version_number;
    String feature;
    public  DataModel(String name,String type,String version_number,String feature)
    {
        this.name=name;
        this.type=type;
        this.version_number=version_number;
        this.feature=feature;
    }

    public String getName() {
        return name;
    }

    public String getVersion_number() {
        return version_number;
    }

    public String getType() {
        return type;
    }

    public String getFeature() {
        return feature;
    }
}
