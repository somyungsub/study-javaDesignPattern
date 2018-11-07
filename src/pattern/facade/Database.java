package pattern.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

    // new로 인스턴스 생성을 금함
    private Database() {
    }

    public static Properties getProperties(String dname) {
        String fileName = "src/pattern/facade/"+dname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName)); // 파일 내용 로딩
        } catch (IOException e) {
            System.out.println("Warning : " + fileName + " is not found.");
        }
        return prop;
    }
}
