package src.Practice.Challenge.Challenge_82;

public class ArrOperation {
    private int[] num;

    public ArrOperation(int[] num) {
       this.num =  num;
    }



    public class  Statistics{

        // Method jo array ka mean (average) nikalta hai
        double mean() {
            double sum  = 0;

            //  num array ke har element ko 'number' variable me store karke loop chalega
            for (int number:  num) {
                sum += number;
            }
            return sum/num.length;
        }
        double median() {
            return 0;
        }
    }
}
