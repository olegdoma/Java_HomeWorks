package HW7;

public class Cat {
    private static final int portionCat = 10;
    private final String name;
    private int volumeCat;
    private final int fullCat;


    public Cat(String name, int fullCat) {
        this.name = name;
        this.fullCat = fullCat;
    }

    public String getName() {
        return name;
    }

    public static int getPortionCat() {
        return portionCat;
    }

    public void increaseFood(int amount){
        volumeCat += amount;
        if (volumeCat == fullCat){
            System.out.printf("%s сытый\n", name);
        }
    }

    public void eat(Plate plate) {
        int food = Plate.getFood();
        if ( food < portionCat){
            System.out.printf("Мало еды\n");
            return;
        }
        System.out.println(name + " eat");
        plate.decreaseFood(portionCat);
        increaseFood(portionCat);

    }

}
