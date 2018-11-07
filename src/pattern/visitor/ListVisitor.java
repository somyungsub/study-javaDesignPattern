package pattern.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = ""; // 현재 주목하고 있는 디렉터리 이름

    // 파일 경우 처리
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    // 디렉터리 경우 처리
    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();

        while (it.hasNext()) {
            it.next().accept(this);
        }
        currentDir = saveDir;
    }
}
