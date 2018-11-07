package pattern.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String userName = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + userName + "'s Page!!");
            writer.paragraph(userName + "의 페이지에 오신걸 환영합니다!!");
            writer.paragraph("메일을 기다리고 있습니다!!");
            writer.mailto(mailaddr, userName);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + userName + ")");
        } catch (IOException e) {

        }
    }
}
