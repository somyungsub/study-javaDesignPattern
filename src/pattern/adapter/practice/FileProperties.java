package pattern.adapter.practice;

import pattern.adapter.sample2.Print;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileOutputStream fos = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(fos);
        Enumeration enu = properties.elements();
        while (enu.hasMoreElements()) {
            String s = (String)enu.nextElement();
            pw.write(s);
//            System.out.println(s);
//            fos.write(Byte.decode(s));
        }
        pw.flush();



    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
