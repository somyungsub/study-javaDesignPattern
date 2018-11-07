package pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);

        d1.show();  // 장식없이 내용물만 출력
        d2.show();  // d1의 내용물에 #장식을 추가해서 출력
        d3.show();  // d2를 전체 내용물로 하고 정해진 상하좌우 장식을 추가해서 출력

        Display d4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("Hello,world")), '*'))), '/');
        d4.show();

        System.out.println("");

    }
}
