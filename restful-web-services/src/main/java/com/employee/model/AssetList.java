package com.employee.model;

import java.io.Serializable;
import java.util.ArrayList;

public class AssetList extends ArrayList<Asset> implements Serializable {

    //ArrayList<Asset> list;
    Asset as;
    Asset asTest;
    int index;

    // public AssetList(){
    //     this.list = new ArrayList<Asset>();
    //     this.as = null;
    // }

    // public ArrayList<Asset> getList() {
    //     return list;
    // }

    // public void setList(ArrayList<Asset> list) {
    //     this.list = list;
    // }

    public Asset getAs() {
        return as;
    }

    public void setAs(Asset as) {
        this.as = as;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    
}
