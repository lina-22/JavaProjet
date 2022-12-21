package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //File dir = new File("C:/Users/Lina/Desktop/person");
        File dir = new File("person");
        dir.mkdir();

        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
    }
}
