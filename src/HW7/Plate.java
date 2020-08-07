package HW7;

public class Plate {

    private static  int food;
    public Plate(int food) {
        Plate.food = food;
    }


    public static int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
        int portion = Cat.getPortionCat();
        if (food < portion){
            System.out.printf("Еда закончилась\n");
        }
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
