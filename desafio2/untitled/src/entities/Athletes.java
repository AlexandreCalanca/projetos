package entities;

public class Athletes {
    private String name;
    private Character gender;
    private Double height;
    private Double weigth;

    //constructor
    public Athletes(){
    }
    public Athletes(String name, Character gender, Double height, Double weight){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weigth = weight;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    //methods

}
