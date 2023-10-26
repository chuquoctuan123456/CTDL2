package hw3_21000710_chuquoctuan.ex4;

import java.io.*;

public class TestEx4 {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        String str = read("C:\\Users\\Public\\Code\\Java\\CTDL_GT\\src\\hw3_21000710_chuquoctuan\\ex4\\data\\data.txt");
        wordCount.addWord(str);
        wordCount.stringWord();
    }
    public static String read(String file) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader f = new FileReader(file);
            BufferedReader reader = new BufferedReader(f);
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}
