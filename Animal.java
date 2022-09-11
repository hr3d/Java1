package trofimova.java1.lesson6;

public class Animal {
    private String name;
    private static int number;

    public Animal(String name){
        this.name = name;
        number++;
    }

    public String getName(){
        return name;
    }

    public static int getNumber(){
        return number;
    }

    public void run(int runningDistance){
        System.out.println("Животное " + name + " пробежало " + runningDistance + " метров.");
    }

    public void swim(int swimmingDistance){
        System.out.println("Животное " + name + " проплыло " + swimmingDistance + " метров.");
    }

    public static void main (String[] args){
        Animal animal1 = new Animal("Фрося");
        animal1.run(1000);
        animal1.swim(1000);
        Animal animal2 = new Animal("Дуня");
        animal2.run(520);
        animal2.swim(700);
        Animal cat1 = new Cat("Барсик");
        cat1.run(60);
        cat1.swim(50);
        Animal cat2 = new Cat("Мурзик");
        cat2.run(210);
        cat2.swim(40);
        Animal dog1 = new Dog("Чаппи");
        dog1.run(600);
        dog1.swim(8);
        Animal dog2 = new Dog("Бруно");
        dog2.run(300);
        dog2.swim(20);

        System.out.println("Всего создано " + Animal.getNumber() + " животных.");
        System.out.println("Всего создано " + Cat.getNumberCats() + " кота(-ов).");
        System.out.println("Всего создано " + Dog.getNumberDogs() + " собак(-и).");
    }
}
