package com.mtest.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Nopu70 on 2017/4/16.
 */

public class FileM {
    public static final int FILE = 0;
    public static final int FILES = 1;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<FileM> getChild() {
        return child;
    }

    public void setChild(List<FileM> child) {
        this.child = child;
    }

    private int name;
    private int type;
    private List<FileM> child;

    FileM(@NonNull int name, @NonNull int type, List child){
        this.name = name;
        this.type = type;
        this.child = child;
    }


}
