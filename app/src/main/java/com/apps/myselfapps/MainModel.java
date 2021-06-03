package com.apps.myselfapps;
/*

  TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
  NIM     : 10118020
  NAMA    : Fiqri Akbar Pratama
  KELAS   : IF1
  */
class MainModel {
    Integer langLogo;
    String langTxt;
    public MainModel(Integer langLogo, String langTxt){
        this.langLogo = langLogo;
        this.langTxt = langTxt;
    }

    public Integer getLangLogo(){
        return langLogo;
    }

    public String getLangTxt() {
        return langTxt;
    }

}
