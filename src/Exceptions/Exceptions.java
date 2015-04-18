package Exceptions;

public class Exceptions {

    public static void main(String[] args) throws Exception {
        func();
    }

    private static void func() throws Exception {
        try (
                //ClassWithException1 class1 = new ClassWithException1();
                ClassWithException2 class2 = new ClassWithException2()
        ) {
            ClassWithException3 class3 = new ClassWithException3();
            ClassWithException4 class4 = new ClassWithException4();
        }
    }
}
