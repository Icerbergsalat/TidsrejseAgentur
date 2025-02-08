package com.example.tidsrejseagentur;

public class Kunde {
    private int id;
    private String name;
    private int familySize;

    public Kunde(int familySize, String name, int id) {
        this.familySize = familySize;
        this.name = name;
        this.id = id;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
