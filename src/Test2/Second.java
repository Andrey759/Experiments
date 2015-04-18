package Test2;

class Second extends First {
    //static методы не оверрайдятся
    public static void test1() {
        System.out.println("B.test1");
    }

    static void test2() {
        First.test2();
    }

    public static void main(String[] args) {
        First a = new Second();
        a.test2();
    }
}
