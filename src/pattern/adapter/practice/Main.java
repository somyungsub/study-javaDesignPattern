package pattern.adapter.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileProperties();
        fileIO.setValue("abc","55555555555");
        fileIO.setValue("abc2","55555555555");
        System.out.println(fileIO.getValue("abc"));
        fileIO.readFromFile("src/pattern/adapter/practice/test.txt");
        fileIO.writeToFile("src/pattern/adapter/practice/save.txt");
    }
}
