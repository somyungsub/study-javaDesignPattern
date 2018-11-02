package pattern.composite;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("root entries");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            // root 하위로 3개의 디렉터리 연결
            rootDir.add(binDir).add(tmpDir).add(usrDir);
//            rootDir.add(tmpDir);
//            rootDir.add(usrDir);

            // binDir에 파일연결
            binDir.add(new File("vi", 10000)).add(new File("latex", 20000));
//            binDir.add(new File("latex", 20000));
            rootDir.printList();
            System.out.println("");

            System.out.println("usr entries");
            Directory Kim = new Directory("Kim");
            Directory Lee = new Directory("Lee");
            Directory Park = new Directory("Park");

            // usr에 디렉터리 연결
            usrDir.add(Kim);
            usrDir.add(Lee);
            usrDir.add(Park);

            // usr 하위디렉터리의 하위연결
            Kim.add(new File("diary.html", 100));
            Kim.add(new File("composite.java", 200));
            Lee.add(new File("memo.txt", 300));
            Park.add(new File("game.doc", 400));
            Park.add(new File("junk.mail", 500));
            rootDir.printList();

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
