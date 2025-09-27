package src.Practice.Challenge.Challenge_82;

public class TestArr {
    public static void main(String[] args) {
        ArrOperation opr =  new ArrOperation(new int[] {2,3,4,5});        // Yaha ek class ArrOperation ka object banaya ja raha hai


                 // Statistics ek inner class hai jo ArrOperation ke andar define ki gayi hogi
                // Inner class ka object banane ke liye hume parent class ka object (opr) use karna padta hai
        ArrOperation.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
