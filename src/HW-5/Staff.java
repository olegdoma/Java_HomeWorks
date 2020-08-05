public class Staff {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public void printInfo(){
        System.out.printf(" Имя: %s\n Должность: %s\n e-mail: %s\n Телефон:  %s\n Зарплата(руб.): %d\n Возраст: %d\n",
                name, position, email, phone, salary, age);
    }

    public Staff(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

