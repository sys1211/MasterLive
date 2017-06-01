package com.example.tf.masterlive.beans;

import java.util.ArrayList;

/**
 * Created by TF on 2017/6/1.
 */

public class LiveRecyclerBean extends BaseBean{
    private ArrayList<String> namelist;
    private ArrayList<String> avatarlist;
    private ArrayList<String> num;

    public ArrayList<String> getNamelist() {
        return namelist;
    }

    public void setNamelist(ArrayList<String> namelist) {
        this.namelist = namelist;
    }

    public ArrayList<String> getAvatarlist() {
        return avatarlist;
    }

    public void setAvatarlist(ArrayList<String> avatarlist) {
        this.avatarlist = avatarlist;
    }

    public ArrayList<String> getNum() {
        return num;
    }

    public void setNum(ArrayList<String> num) {
        this.num = num;
    }
}
