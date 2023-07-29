package ToyShop;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Медведь", 10, 20));
        toys.add(new Toy(2, "Кукла", 12, 30));
        toys.add(new Toy(3, "Машинка", 15, 50));
        toys.add(new Toy(4, "Мячик", 20, 30));
        toys.add(new Toy(5, "Конструктор", 5, 5));

        Lottery lottery = new Lottery(toys);

        lottery.addToy(new Toy(6, "Самолёт", 10, 15));
        lottery.addToy(new Toy(7, "Вертолёт", 10, 15));
        lottery.addToy(new Toy(8, "Котик", 15, 40));
        lottery.addToy(new Toy(9, "Собачка", 15, 40));
        lottery.addToy(new Toy(10, "Телефон", 10, 20));

        for (int i = 0; i < 10; i++) {
            Toy prize = lottery.drawToy();
            System.out.println("Призовая игрушка " + (i + 1) + ": \n" + prize + "\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            Toy prize = lottery.getPrize();
            System.out.println("Полученная игрушка " + (i + 1) + ": \n" + prize);
        }
    }
}