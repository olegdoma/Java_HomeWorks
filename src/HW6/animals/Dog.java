package animals;

public class Dog extends animals.Animals {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int RunDist) {
        if (RunDist < 500){
            System.out.printf("%s пробежал %d метров \n", name, RunDist);
        }
        else {
            System.out.printf("%s столько не пробежит \n", name);
        }

    }

    @Override
    public void swim(int SwimDist) {
        if (SwimDist < 10){
            System.out.printf("%s проплыл %d метров \n", name, SwimDist);
        }
        else {
            System.out.printf("%s столько не проплывет \n", name);
        }

    }

}
