package Loop_07;

public class Multiple5And7 {
    public static void main(String[] args) {
         int num = 1;

         while(true){
             if(num % 5 == 0 && num % 7 == 0 ){
                 System.out.println(num);
                 break;
             }
             num++;
         }
    }
}
