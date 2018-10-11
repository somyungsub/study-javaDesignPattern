package pattern.builder.sample;

import java.util.Scanner;

/**
 * Created by User on 2017-03-29.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Builder builder = getBuilder(scanner.nextLine());
        if (builder == null) {
            usage();
            System.exit(0);
            return;
        }

        new Director(builder).construct();
        System.out.println("result = " + builder.getResult());
    }

    public static void usage() {
        System.out.println("Usage : java Main plain 일반텍스트로 문서작성");
        System.out.println("Usage : java Main html HTML로 문서작성");
    }

    private static Builder getBuilder(String builderName) {
        switch (builderName) {
            case "plain":
                return new TextBuilder();
            case "html":
                return new HTMLBuilder();
            default:
                return null;

        }
    }
}
