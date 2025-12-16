package src.PracticeExp;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <20; i++) {
            if (i == 13) {
                continue;
            }
            System.out.println(i);
        }
    }
}
