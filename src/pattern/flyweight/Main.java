package pattern.flyweight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();

        if (inputData.length() == 0) {
            System.out.println("에러!");
        }

        BigString bigString = new BigString(inputData);
        bigString.print();
    }
}
