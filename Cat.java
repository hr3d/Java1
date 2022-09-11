package trofimova.java1.lesson6;

public class Cat extends Animal {

    static int numberCats;
    public Cat(String name) {
        super(name);
        numberCats++;
    }
    public static int getNumberCats(){
        return numberCats;
    }
    public void run(int runningDistance){
        if(runningDistance <= 200){
            System.out.println("Кот " + getName() + " пробежал " + runningDistance + " метров.");
        } else {
            System.out.println("Кот " + getName() + " устал и не смог пробежать " + runningDistance + " метров.");
        }
    }

    public void swim(int swimmingDistance){
        System.out.println("Кот " + getName() + " не умеет плавать");
    }
}

