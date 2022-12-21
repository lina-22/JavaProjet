package file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file1 = new File("D:/Workload/JavaProjet/JavaWithAn/person/student.txt");
        File file2 = new File("D:/Workload/JavaProjet/JavaWithAn/person/teacher.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
