package thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodReadWrite {
    public static void main(String[] args) throws IOException {
        String pathName = "src/thuchanh/testFile.txt";
        File file = new File(pathName);
        if (!file.exists()) {
            createNewFile(pathName);
        }
        Scanner scanner = new Scanner(System.in);
        String addString = scanner.nextLine();

        ArrayList<String> strings = readFile(file);
        strings.add(addString);
        strings.forEach(System.out::println);
        writeFile(file, strings);
    }

    public static File createNewFile(String pathName) throws IOException {
        File newFile = new File(pathName);
        newFile.createNewFile();
        return newFile;
    }

    public static void writeFile(File file, ArrayList<String> strings) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String string : strings) {
            bufferedWriter.write(string + "\n");
        }
        bufferedWriter.close();
    }

    public static ArrayList<String> readFile(File file) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }
}
