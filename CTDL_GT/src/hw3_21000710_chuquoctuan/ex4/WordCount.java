package hw3_21000710_chuquoctuan.ex4;

import java.util.LinkedList;
import java.util.List;

public class WordCount {
    List<Word> words = new LinkedList<>();

    public void addWord(String string) {
        String[] array = handleString(string);
        for(String str : array){
            str = str.replaceAll("[.,-,|,/,*,-]", "");
            Word word = null;
            for (Word w : words){
                if(w.getWord().equals(str)){
                    word = w;
                    break;
                }
            }
            if(word != null){
                word.count();
            }else{
                words.add(new Word(str));
            }
        }
    }

    public String[] handleString(String string) {
        string = string.toLowerCase();
        String[] array = string.split("\\s++");
        return array;
    }
    public void stringWord(){
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

}
