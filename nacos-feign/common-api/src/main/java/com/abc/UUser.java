package com.abc;

public class UUser {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;
}
