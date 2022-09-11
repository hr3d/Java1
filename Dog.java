package trofimova.java1.lesson6;

public class Dog extends Animal{

    static int numberDogs;
    public Dog(String name) {
        super(name);
        numberDogs++;
    }

    public static int getNumberDogs(){
        return numberDogs;
    }

    public void run(int runningDistance){
        if(runningDistance <= 500){
            System.out.println("Собака " + getName() + " пробежала " + runningDistance + " метров.");
        } else {
            System.out.println("Собака " + getName() + " устала и не смогла пробежать " + runningDistance + " метров.");
        }
    }

    public void swim(int swimmingDistance) {
        if (swimmingDistance <= 10) {
            System.out.println("Собака " + getName() + " проплыла " + swimmingDistance + " метров.");
        } else {
            System.out.println("Собака " + getName() + " устала и не смогла проплыть " + swimmingDistance + " метров.");
        }
    }
}
