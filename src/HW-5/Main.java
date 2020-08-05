public class Main {
    public static void main(String[] args) {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Иванов Иван Иванович", "Директор", "ivanov@ivanov.ru", "89151234567", 100000, 50);
        staffArray[1] = new Staff("Сидоров Сидор Сидорович", "Бухгалтер", "sidorov@ivanov.ru", "89151234589", 80000, 45);
        staffArray[2] = new Staff("Петров Петр Петрович", "Экономист", "petrov@ivanov.ru", "89151234598", 70000, 43);
        staffArray[3] = new Staff("Кузнецов Кузьма Кузьмич", "Кладовщик", "kuznetcov@ivanov.ru", "89151234555", 50000, 35);
        staffArray[4] = new Staff("Васильев Василий Васильевич", "Водитель", "vasilyev@ivanov.ru", "89151234533", 30000, 30);

        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].getAge() > 40)
            {
                staffArray[i].printInfo();
            }


        }
    }
}
