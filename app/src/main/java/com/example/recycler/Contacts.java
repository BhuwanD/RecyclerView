package com.example.recycler;

public class Contacts {
    private String Name;
    private String phonenumber;
    private int Imageid;

    public Contacts(String name, String phonenumber, int imageid) {
        Name = name;
        this.phonenumber = phonenumber;
        Imageid = imageid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getImageid() {
        return Imageid;
    }

    public void setImageid(int imageid) {
        Imageid = imageid;
    }
}
