package java21.features.recordpattern;

public class RecordPatternDemo {

    public static void main(String[] args) {
        beforeJava16();
        System.out.println();
        asOfJava16();
        System.out.println();
        recordAsOfJava16();
        System.out.println();
        recordAsOfJava21();
    }

    private static void beforeJava16() {
        String test = "beforeJava16";

        if (test instanceof String) {
            String s = (String) test;
            System.out.println(s);
        }
    }

    private static void asOfJava16() {
        String test = "asOfJava16";

        if (test instanceof String s) {
            System.out.println(s);
        }
    }

    record Point(int x,int y) {}

    private static void recordAsOfJava16() {

        Point point = new Point(1,2);

        if (point instanceof Point p) {
            System.out.println("x -> " + p.x);
            System.out.println("y -> " + p.x);
        }
    }

    private static void recordAsOfJava21() {
        Point point = new Point(1,2);
        if (point instanceof Point(int x, int y)) {
            System.out.println("x -> " + x);
            System.out.println("y -> " + y);
        }
    }

}

