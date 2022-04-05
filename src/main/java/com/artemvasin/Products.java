package com.artemvasin;

public class Products {
    private String name;
    private int weight;

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", category='" + category + '\'' +
                '}';
    }

    private String category;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public Products() {
    }


}
