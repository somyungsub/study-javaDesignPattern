package pattern.proxy;


/*
    본인
    - 생성이 무거운 작업을 가지고 있음
 */
public class Printer implements Printable {
  private String name;

  public Printer() {
    heavyJob("Printer의 인스턴스 생성중");
  }

  public Printer(String name) {
    this.name = name;
    heavyJob("Printer의 인스턴스 (" + this.name + ")을 생성중");
  }

  @Override
  public void setPrinterName(String name) {
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return this.name;
  }

  @Override
  public void print(String string) {
    System.out.println("=== " + this.name + " ===");
    System.out.println(string);
  }

  // 일부로 무거운 작업 실행하기 위한 메서드
  private void heavyJob(String string) {
    System.out.println(string);
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
      System.out.println(".");
    }
    System.out.println("완료");
  }
}
