package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Application {
    public static void main(String[] args) {

//        Car[][] arrayOfCarRandom = {
//                {new Car("Ferrari", getRandomValueFromRange(100, 200), getRandomValueFromRange(1945, 1990), new Engine("Engine", 2), new Wheel("wheel", 50, "leather"))},
//                {new Car("Chevrolet", getRandomValueFromRange(200, 350), getRandomValueFromRange(1960, 1970), new Engine("Engine", 2), new Wheel("wheel", 50, "leather"))}};
//        System.out.println(Arrays.deepToString(arrayOfCarRandom));
//
//        Car arrayCar = new Car("Aston Martin Vanquish", 580, 2019, new Engine("Engine", 3), new Wheel("wheel", 45, "rubber"));
//        for (Car[] row : arrayOfCarRandom) {
//            Arrays.fill(row, arrayCar);
//        }
//        System.out.println("array = " + Arrays.deepToString(arrayOfCarRandom));


        List<List<Car>> carListContainer = new ArrayList<List<Car>>();
        List<Car> carList2 = new ArrayList<>();
        carListContainer.add(carList2);
        carList2.add(new Car("Ferrari", getRandomValueFromRange(100, 200), getRandomValueFromRange(1945, 1990), new Engine("Engine", 2), new Wheel("wheel", 50, "leather")));
        carList2.add(new Car("Chevrolet", getRandomValueFromRange(200, 350), getRandomValueFromRange(1960, 1970), new Engine("Engine", 2), new Wheel("wheel", 50, "leather")));
        carList2.add(new Car("Aston Martin Vanquish", 580, 2019, new Engine("Engine", 3), new Wheel("wheel", 45, "rubber")));


        Car car1 = new Car("Aston Martin Vanquish", 580, 2019, new Engine("Engine", 3), new Wheel("wheel", 45, "rubber"));
        for (int i = 0; i < carList2.size(); i++) {
            carList2.set(i, car1);
            System.out.println(carList2);
        }


    }


    public static int getRandomValueFromRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("min value must be smaller than max value");
        }

        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}

