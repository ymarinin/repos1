import java.io.*;

public class GetNewFile {
    public GetNewFile() {

    }

    public String getContent(File file1, File file2) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String[] arr1 = br1.readLine().split(" ");
            String[] arr2 = br2.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] != null && arr2[j] != null && arr1[i].equalsIgnoreCase(arr2[j])) {
                        sb.append(arr1[i] + " ");
                        sb.toString();
                    }
                }
            }
            System.out.println(sb);
            return sb.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    public void writeToNewFile(File file1, File file2, File file3) {
        String str = getContent(file1, file2);
        if (str != null) {
            try (PrintWriter pw = new PrintWriter(file3)) {
                pw.println(str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}


