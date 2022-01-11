package baitap.BT_Copy_File;

import java.io.*;

public class CopyFile {
    public void copyFile(String input, String target) {
        try {
            File file_input = new File(input);
            File file_target = new File(target);
            checkFile(file_input, file_target);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file_input));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_target));
            int line;
            int count = 0;
            while ((line = bufferedReader.read()) != -1) {
                bufferedWriter.write((char) line);
                count++;
            }
            bufferedWriter.close();
            System.err.println("Số ký tự là: " + count);
        } catch (IOException e) {
            System.err.println("Lỗi IO");
        } catch (Exception e) {
            System.err.println("Lỗi");
        }
    }

    private void checkFile(File file_input, File file_target) throws FileNotFoundException {
        if (!file_input.exists() || !file_target.exists()) {
            throw new FileNotFoundException();
        }
    }
}
