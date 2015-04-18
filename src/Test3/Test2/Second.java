package Test3.Test2;

class Second extends First {
    String str = "abc";

    void printLength() {
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        new Second().printLength();
    }
}
