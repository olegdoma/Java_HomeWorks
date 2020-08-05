import animals.Animals;
import animals.Cat;
import animals.Dog;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Барсик", 5 );
        Animals dog = new Dog("Тузик", 4);

        dog.run(400);
        cat.run(200);
        dog.swim(300);
        cat.swim(200);
        System.out.println();
        Animals[] animals = {
                new Cat("Барсик", 5 ),
                new Dog("Тузик", 4)
        };          int d = 0;
        int c = 0;
        for (int i = 0; i < animals.length ; i++) {

            if (animals[i] instanceof Dog){
                d = d + i;
            }

            for (Animals animal : animals) {

                if (animal instanceof Cat) {
                    c = c + i;
                }
            }

        }
        System.out.printf("Собак - %d штук \n", d );
        System.out.printf("Кошек - %d штук \n", c );


    }


}
