package javastandard.Chapter06;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}
public class ConstructorTest {
    Data1 d1 = new Data1();
    //Data2 d2 = new Data2(); //에러 발생
}
