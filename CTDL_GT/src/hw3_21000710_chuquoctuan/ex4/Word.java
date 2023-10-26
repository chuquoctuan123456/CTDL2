package hw3_21000710_chuquoctuan.ex4;

public class Word {
    private String word;
    private int count;

    public Word(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }
    public void count(){
        count++;
    }

    @Override
    public String toString() {
        return word + " : " + count;
    }
}
