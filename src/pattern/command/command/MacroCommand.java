package pattern.command.command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {

  private Stack commands = new Stack();


  // 실행
  @Override
  public void execute() {
    Iterator<Command> it = commands.iterator();
    while (it.hasNext()) {
      it.next().execute();
    }
  }

  // 추가
  public void append(Command command) {
    if (command != this) {
      commands.push(command);
    }
  }

  // 마지막 명령 삭제
  public void undo() {
    if (!commands.isEmpty()) {
      commands.pop();
    }
  }

  // 명령 전체 삭제
  public void clear() {
    commands.clear();
  }
}
