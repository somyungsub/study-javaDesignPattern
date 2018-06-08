package pattern.builder.sample;

/**
 * Created by User on 2017-03-28.
 */
public class TextBuilder extends Builder{
    private StringBuffer buffer=new StringBuffer();//필드의 문서 구축

    @Override
    public void makeTitle(String title) {
        buffer.append("=============================");
        buffer.append("<"+title+">\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('O'+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i=0; i<items.length;i++){
            buffer.append("-"+items[i]+"\n");
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("=============================");
    }

    public String getResult(){
        return buffer.toString();
    }
}
