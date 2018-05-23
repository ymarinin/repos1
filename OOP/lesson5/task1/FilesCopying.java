import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class FilesCopying {
    public static void main(String[] args) {
        File folderOut = new File("Out");
        folderOut.mkdirs();
        File folderIn = new File("In");
        folderIn.mkdirs();
        File[] fileListOut = folderOut.listFiles();

        MyFileFilter mFF = new MyFileFilter();
        File[] fileListSotr = folderOut.listFiles(mFF);
        for (File file : fileListSotr) {
            System.out.println(file.getName());
        }

        for (File file : fileListSotr) {
            try {
                Files.copy(file.toPath(), new File(folderIn + File.separator + file.getName()).toPath());
            }

            catch (IOException e) {
                System.out.println(e);
            }

        }
   }
}
