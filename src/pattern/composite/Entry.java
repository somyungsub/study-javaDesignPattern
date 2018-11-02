package pattern.composite;


/*
    추상클래스
    - 디렉터리 엔트리표현

 */
public abstract class Entry {


    public abstract String getName();
    public abstract int getSize();
    protected abstract void printList(String string);

    public void printList(){
        printList(" ");
    }

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
