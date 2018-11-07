package pattern.visitor;


public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());


        System.out.println();
        System.out.println("Making usr entries...");
        Directory kim = new Directory("kim");
        Directory lee = new Directory("lee");
        Directory park = new Directory("park");
        usrDir.add(kim);
        usrDir.add(lee);
        usrDir.add(park);

        kim.add(new File("diary.html", 100));
        lee.add(new File("composite.java", 200));
        park.add(new File("memo.txt", 300));
        park.add(new File("game.doc", 400));
        park.add(new File("junk.mail", 500));

        rootDir.accept(new ListVisitor());
    }
}
