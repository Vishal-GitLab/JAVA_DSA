package src.ControlsStatementMathAndString;

public class BreakAndContinue {
    public static void main(String[] args) {
//        System.out.println("before loop");
//        for (int i = 1; i < 1000; i++) {
//            if (i == 101) {
//                break;                                       // break ka use --> jab kisi condition ke pure pure loop se bahar aana ho ,, jab current iteration se bahr niklna ho
//            }
//            System.out.println(i);
//        }
//        System.out.println("Out of loop");
        System.out.println("before loop");
        for (int i = 1; i < 100; i++) {
            if (i == 11) {
                continue;                  // jab hame single iteraton skip karna ho
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
