package pattern.facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀출력
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "<p>");
    }

    // 링크출력
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href +"\">" + caption + "</a>");
    }

    // 메일주소 출력
    public void mailto(String mailAddr, String userName) throws IOException {
        link("mailto:"+mailAddr, userName);
    }

    // 닫기
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
