package src.DataTypeVariableandInput;

public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5f;   // ye hai implicit convarsion hai
        System.out.println(myFloat);
        int myInt= (int) 5.0f;   // jisme karna hai usko breaket andar rakhte hai  ----> explicit conversion hai
        System.out.println(myInt);
    }
}
