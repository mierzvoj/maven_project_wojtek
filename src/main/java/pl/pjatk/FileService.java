package pl.pjatk;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileService {

    public File getFile(){
        File file = FileUtils.getFile("testFile.txt");
        try {
            String data = FileUtils.readFileToString(file, Charset.defaultCharset());
        }
        catch(Exception e){}
        return file;
    }

    public void createFile(String name, String data) {
        File file = new File(String.format("%s.txt", name));
        try {
            FileUtils.write(file, data, Charset.defaultCharset());
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
