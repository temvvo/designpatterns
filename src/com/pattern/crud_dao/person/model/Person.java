package com.pattern.crud_dao.person.model;

public class Person {
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
        return "Person [id=" + getId() + ", names=" + getNames() + "]";
    }


    }
