package pattern.bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private String fileName;
    private BufferedReader br;
    private final int MAX_READAHEAD_LIMIT = 4096; // 반복 표시할 수 있는 상한 (버퍼사이즈)

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void rawOpen() {
        try{
            br = new BufferedReader(new FileReader(fileName));
            br.mark(MAX_READAHEAD_LIMIT);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-=-=-= " + fileName + " =-=-=-=-=-=-=-="); // 장식선
    }

    @Override
    public void rawPrint() {
        try{
            String line;
            br.reset(); //mark한 위치까지 되돌린다
            while ((line = br.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=-=-=-= " + fileName + " END =-=-=-=-=-=-=-="); // 장식선
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
