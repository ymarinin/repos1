import java.io.*;

public class MainClass {
    public static void main(String[] args) {

    GetNewFile gf =new GetNewFile();
    File file1 = new File("Test/File1.txt");
    File file2 = new File("Test/File2.txt");
    File file3 = new File("Test/File3.txt");
    gf.writeToNewFile(file1, file2, file3);

    }

}

