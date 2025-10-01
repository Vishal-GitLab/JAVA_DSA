package src.Practice.Challenge.Challenge_85;

public class Calculator {
    public int add(int first, int second){
        return first + second;
    }
    public int add(int first, int second, int third){
        return first + second +  third;
    }
    public double add(double first, double second){
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc =  new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(4,5,6));
        System.out.println(calc.add(6.76,7.98));
    }
}
