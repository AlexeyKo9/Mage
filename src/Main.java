public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Lexa", 12, 150, "ice");
        Mage mage2 = new Mage("Chich", 10, 100, "fire");
        Mage mage3 = new Mage("Alena", 12, 150, "ice");
        System.out.println(mage1.fight(mage2));
    }
}