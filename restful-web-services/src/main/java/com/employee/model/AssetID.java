package com.employee.model;

import java.io.Serializable;

public class AssetID implements Serializable {
    protected String assetID;

    public AssetID() {
    }

    public AssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getAssetID() {
        return assetID;
    }

    public void createAssetID(String id) {
        this.assetID = id;
    }

    public void updateAssestID(String id) {
        this.assetID = id;
    } 

    @Override
    public String toString() {
        return "Asset ID = " + assetID; 
    }

}