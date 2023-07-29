package ToyShop;

class Toy {
    private int id;
    private String name;
    private int quantity;
    private int chance;

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public void changeFrequency(int newChance) {
        this.chance = newChance;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    public int getChance() {
        return chance;
    }

    @Override
    public String toString() {
        return "Игрушка " + id + ": " + name + ", кол-во: " + quantity + ", шанс: " + chance + "%";
    }
}