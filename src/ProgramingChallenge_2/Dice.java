package src.ProgramingChallenge_2;

public class Dice {

    int roll() {
        double random = Math.random() * 6;
        return  (int) Math.ceil(random);                  // upar ki trf rolll karta  hai   ,, decimal se integer karne ke liye (int) ka use karte hai


    }
    public static void main(String[] args) {
        Dice dice =  new Dice();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
