package trofimova.java1.lesson7;

public class Plate {
    private int food;
    private int foodInitial;

    public Plate(int food){
        this.food = food;
        this.foodInitial = food;
    }

    public boolean decreaseFood (int n) {
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }
    public void addFood (){
        food = foodInitial;
        System.out.println("Тарелка пополнена!");
    }

    public void info(){
        System.out.println("в тарелке: " + food);
    }
}
