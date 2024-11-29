package ru.mirea.it.java.work13;

public class Shirt {
    public final String id;
    public final String name;
    public final String color;
    public final String size;

    public Shirt(String data) {
        String[] split = data.split(",");
        this.id = split[0].trim();
        this.name = split[1].trim();
        this.color = split[2].trim();
        this.size = split[3].trim();
    }

    @Override
    public String toString() {
        return "Футболка с ID=" + this.id +
                "\nНазвание - " + this.name +
                "\nЦвет - " + this.color +
                "\nРазмер - " + this.size +
                "\n--------------------------";
    }
}
