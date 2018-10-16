package pattern.abstract_factory.sample;

import pattern.abstract_factory.sample.factory.Link;
import pattern.abstract_factory.sample.factory.Page;
import pattern.abstract_factory.sample.factory.Tray;
import pattern.abstract_factory.sample.factory.Factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factory factory = Factory.getFactory(scanner.nextLine());
        if (factory == null) {
            System.exit(0);
        }

        // Link
        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.joins.com/");

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link krYahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        // Tray
        Tray trayNews = factory.createTray("신문");
        trayNews.add(joins);
        trayNews.add(chosun);


        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(krYahoo);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);


        // Page
        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(trayNews);
        page.add(traySearch);
        page.output();

    }
}
