package main;

class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printBasicInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
    }
}

class Eagle extends Animal {
    private double wingspan;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void animalDetails() {
        super.printBasicInfo();
        System.out.println("Wingspan : " + wingspan);
    }

    public Eagle(String name, int age, double weight, double wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }
}

class Snake extends Animal {
    private boolean venomous;

    public boolean getVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    public void animalDetails() {
        super.printBasicInfo();
        System.out.println("Venomous : " + venomous);
    }

    public Snake(String name, int age, double weight, boolean venomous) {
        super(name, age, weight);
        this.venomous = venomous;
    }
}

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle1", 5, 6.5, 2.1);
        Snake snake = new Snake("Snake1", 3, 1.5, true);

        eagle.animalDetails();
        snake.animalDetails();
    }
}