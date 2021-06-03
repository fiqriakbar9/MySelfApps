package com.apps.myselfapps;
/*

  TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
  NIM     : 10118020
  NAMA    : Fiqri Akbar Pratama
  KELAS   : IF1
  */
public class ItemModel {

    private String name;
    private String type;
    private int image;

    public ItemModel(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }

}
