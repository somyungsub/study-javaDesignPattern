package pattern.visitor;

/*
    방문자를 받아들이는부분
 */
public interface Element {
    void accept(Visitor visitor);

}
