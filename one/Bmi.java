package one;

public class Bmi {
    private String name;
    private int age;
    private float height;
    private int weight;

    public Bmi(String name, int age, float height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String dane(){
        return "Name: " + this.name + ", age: " + this.age + ", height: " + this.height + ", weight: " + this.weight;
    }
    public float bmi(){
        return this.weight/(this.height*this.height);
    }
}
