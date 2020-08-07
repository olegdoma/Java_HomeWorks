package HW7;

public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Барсик");
        catArray[1] = new Cat("Мурзик");
        catArray[2] = new Cat("Пушок");
        Plate plate = new Plate(25);
        for (int i = 0; i < catArray.length ; i++) {
            catArray[i].eat(plate);
        }
        for (int j = 0; j < catArray.length; j++) {
            catArray[j].hungryCat();
        }




        System.out.println(plate);
        plate.addFood(100);
        System.out.println(plate);

    }
}