package javastandard.Chapter06;

public class ChapterMain6 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}
