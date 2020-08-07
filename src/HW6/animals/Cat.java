package animals;

public class Cat extends animals.Animals {
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void run(int RunDist) {
        if (RunDist < 200){
            System.out.printf("%s пробежал %d метров \n", name, RunDist);
        }
        else {
            System.out.printf("%s столько не пробежит \n", name);
        }

    }

    @Override
    public void swim(int SwimDist) {
        System.out.printf("Кошки не плавают");
    }

}

