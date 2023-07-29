package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Lottery {
    private List<Toy> toys;
    private List<Toy> prizes; 

    public Lottery(List<Toy> toys) {
        this.toys = toys;
        this.prizes = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy drawToy() {
        List<Integer> weights = new ArrayList<>();
        for (Toy toy : toys) {
            weights.add(toy.getChance());
        }

        Random random = new Random();
        Toy prize = toys.get(random.nextInt(toys.size()));
        prizes.add(prize);
        return prize;
    }

    public Toy getPrize() {
        if (!prizes.isEmpty()) {
            Toy prize = prizes.remove(0);
            prizes.add(prize);
            prize.decreaseQuantity();
            try (FileWriter writer = new FileWriter("prizes.txt", true)) {
                writer.write(prize.toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prize;
        } else {
            return null;
        }
    }
}