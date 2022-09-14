package trofimova.java1.lesson7;

public class FeedingApp {
    public static void main (String[] args){
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик", 15);
        cats[1] = new Cat("Барсик", 20);
        cats[2] = new Cat("Фруктик", 18);
        Plate plate1 =new Plate(50);
        System.out.print("Изначально было ");
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            if (!cats[i].isSatiety()) {
                System.out.println("Котик " + cats[i].getName() + " не поел.");
                plate1.addFood();
                cats[i].eat(plate1);
            }
            System.out.println("Котик " + cats[i].getName() + " поел.");
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].isSatiety() ? "Котик " + cats[i].getName() + " сыт." : "Котик " + cats[i].getName() + " не поел.");
        }

        System.out.print("Осталось ");
        plate1.info();
    }
}
