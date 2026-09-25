package javastandard.Chapter06;

class Data {int x;}

public class ChapterMain6 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);


        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 : " + t1.channel);
        System.out.println("t2 : " + t2.channel);

        t1.channel = 7;
        System.out.println("t1 : " + t1.channel);
        System.out.println("t2 : " + t2.channel);

        System.out.println("============");

        Tv t3 = new Tv();
        Tv t4 = new Tv();
        System.out.println("t3 : " + t3.channel);
        System.out.println("t4 : " + t4.channel);

        t4 = t3;
        t3.channel = 7;
        System.out.println("t3 : " + t3.channel);
        System.out.println("t4 : " + t4.channel);

        System.out.println("============");

        Tv[] tvArr = new Tv[3];

        for(int i =0; i < tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }

        for(int i = 0;i < tvArr.length;i++) {
            tvArr[i].channelUp();
            System.out.println(tvArr[i].channel);
        }
        System.out.println("============ 다음다음");

        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("============ 메서드");
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4= mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("============");
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x" + d.x);
        change(d.x);
        System.out.println("main() : x" + d.x);

        System.out.println("============");
        Data d1 = new Data();
        d1.x = 10;
        System.out.println("main() : x" + d1.x);
        change(d1);
        System.out.println("main() : x" + d1.x);

        System.out.println("============");
        int[] x = {10};

        System.out.println("main() : x = " + x[0]);
        change(x);
        System.out.println("main() : x = " + x[0]);

        System.out.println("============");
        Data d2 = new Data();
        d2.x = 10;
        Data d3 = copy(d2);
        System.out.println("d2.x = " + d2.x);
        System.out.println("d3.x = " + d3.x);
    }


    static void firstMethod() {
        secondMethod();
    }
    static void secondMethod() {
        System.out.println("secondMethod()");
    }
    static void change(int x) {
        x = 1000;
        System.out.println("change : x = " + x);
    }

    static void change(Data d){
        d.x = 1000;
        System.out.println("change : x = " + d.x);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }

    static void printArr(int[] arr) {
        System.out.println("{");

        for(int i : arr){
            System.out.println(i + " ");
        }
        System.out.println("}");
    }

    static int sumArr(int[] arr) {
        int sum = 0;

        for(int i =0; i <arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static void sortArr(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j <arr.length; j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    int add(int a, int b){
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
    static long factorial(int n) {
        int result = 0;
        if(n <= 0 || n > 20) return -1;
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

}
