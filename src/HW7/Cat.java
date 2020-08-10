package HW7;

public class Cat {
    private static final int portionCat = 10;
    private final String name;
    private boolean appetiteCat = false;
//    private final int fullCat;


    public Cat(String name) {
        this.name = name;
//        this.fullCat = fullCat;
    }

    public String getName() {
        return name;
    }

    public static int getPortionCat() {
        return portionCat;
    }

//    public void increaseFood(int amount){
//        volumeCat += amount;
//        if (volumeCat == fullCat){
//            System.out.printf("%s сытый\n", name);
//        }
//    }

    public boolean eat(Plate plate) {
        int food = Plate.getFood();
        if ( food < portionCat){
            System.out.printf("Мало еды\n");
            return false;
        }
        else {

            System.out.println(name + " ест");
            plate.decreaseFood(portionCat);
//        increaseFood(portionCat);
            return appetiteCat = true;
        }

    }
    public void hungryCat(){
        if (appetiteCat == true){
            System.out.printf("%s сытый\n", name);
        }
        else{
            System.out.printf("%s голодный\n", name);
        }
    }

}
