package pattern.proxy;

/*
  대리인
 */
public class PrintProxy implements Printable {
  private String name;    // 이름설정
  private Printer real;   // 본인(Printer)

  public PrintProxy() {
  }

  public PrintProxy(String name) {
    this.name = name;
  }


  @Override
  public synchronized void setPrinterName(String name) {
    if (real != null) {
      real.setPrinterName(name);  // 같이 본인도 name 설정을 하도록 함
    }
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return name;
  }


  // 이 시점에서 실체만 할 수 있는 작업을 호출하도록 위임을 함
  @Override
  public void print(String string) {


    realize();  // 실체의 생성여부를 판단하고 생성하도록 먼저 호출

    real.print(string); // 실체만 할 수 있는 작업을 수행함 (위임) -> 본인이 실행되도록 함
  }

  // 본인 생성 -> 실체화
  private void realize() {
    if (real == null) {
      real = new Printer(name); // 실체가 생성됨 -> 무거운 작업!!
    }
  }
}
