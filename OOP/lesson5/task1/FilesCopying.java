import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class FilesCopying {
    public static void main(String[] args) {
        File folder_out = new File("Out");
        folder_out.mkdirs();
        File folder_in = new File("In");
        folder_in.mkdirs();
        File[] fileListOut = folder_out.listFiles();

        MyFileFilter mFF = new MyFileFilter();
        File[] fileListSotr = folder_out.listFiles(mFF);
        for (File file : fileListSotr) {
            System.out.println(file.getName());
        }

        for (File file : fileListSotr) {
            try {
                Files.copy(file.toPath(), new File(folder_in + File.separator + file.getName()).toPath());
            }

            catch (IOException e) {
                System.out.println(e);
            }

        }
   }
}
