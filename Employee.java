package trofimova.java1.lesson5;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Фамилия: " + surname + "; Имя: " + name + "; Отчество: " + patronymic + "; Должность: " + position + "; Адрес электронной почты: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст " + age);
    }

    public static void main (String[] args){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Петров", "Сергей", "Сергеевич", "Инженер", "petrov@mail.ru", "89264441111", 50000, 32);
        employees[1] = new Employee("Иванов", "Андрей", "Андреевич", "Водитель", "ivanov@mail.ru", "89264441122", 42000, 43);
        employees[2] = new Employee("Капустин", "Валерий", "Валерьевич", "Начальник отдела", "kapustin@mail.ru", "89264441133", 80000, 45);
        employees[3] = new Employee("Кузнецов", "Владимир", "Владимирович", "Токарь", "kuznetsov@mail.ru", "89264441144", 45000, 35);
        employees[4] = new Employee("Сидоров", "Семен", "Семенович", "Слесарь", "sidorov@mail.ru", "89264441155", 48000, 40);

        for (int i = 0; i < employees.length; i++){
            if(employees[i].age >= 40){
                employees[i].info();
            }
        }
    }



}
