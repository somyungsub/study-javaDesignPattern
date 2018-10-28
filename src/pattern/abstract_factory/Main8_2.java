package pattern.abstract_factory;

import pattern.abstract_factory.factory.Factory;
import pattern.abstract_factory.factory.Page;

import java.util.Scanner;

public class Main8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factory factory = Factory.getFactory(scanner.nextLine());
        if (factory == null) {
            System.exit(0);
        }

        // Page
        Page page = factory.createYahooPage();
        page.output();

    }

}
