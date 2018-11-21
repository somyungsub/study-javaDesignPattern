package pattern.proxy;

public class Main {
  public static void main(String[] args) {
    Printable printable = new PrintProxy("Alice");
    System.out.println("이름은 현재 " + printable.getPrinterName() + " 입니다.");
    printable.setPrinterName("Bob");
    System.out.println("이름은 현재 " + printable.getPrinterName() + " 입니다.");

    printable.print("Hello, World");  // 본인 Printer 생성되는 시점
  }
}
