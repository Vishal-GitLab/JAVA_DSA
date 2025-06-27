package src.WhileLoopMethodAndArray;

public class Parameter {
    public static void main(String[] args) {

        System.out.println( sumTwoNumbers (6 , 7 ));  //    jab actual value pass ki jati hai usko arguments kahte hai
        System.out.println( sumTwoNumbers (15 , 16 ));
    }


        public static int sumTwoNumbers(int firstNum, int secondNum ) {           // jab difinition define ki jati hai to uske bolte hai paramete
            System.out.println("First Number received: " + firstNum);
            System.out.println("Second Number received: " + secondNum);
            //int sum = first + second;
            return firstNum + secondNum;
        }

        // return ak chez ham kar sakte  hai multiple cheezo ko return nahi kar sakte hai   ( function ak cheez ko retun kar sakta hai )
    }

