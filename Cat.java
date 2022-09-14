package trofimova.java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p){
        satiety = p.decreaseFood(appetite);
    }
}


