package entities;

public class Athletes {
    //Atributes
    private String name;
    private Character gender;
    private Double height;
    private Double weight;


    //Constructor
    public Athletes() {
    }

    public Athletes(String name, Character gender, Double height, Double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    //getter

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}