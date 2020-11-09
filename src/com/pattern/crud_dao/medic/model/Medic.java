package com.pattern.crud_dao.medic.model;

public class Medic {
    private int id;
    private String names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Medic [id=" + getId() + ", names=" + getNames() + "]";
    }
    }
