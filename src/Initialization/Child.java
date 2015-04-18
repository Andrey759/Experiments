package Initialization;;

public class Child extends Parent {

    public static Child getInstance() {
        System.out.println("6  Child:\tstatic Child getInstance()");
        return Inner.instance;
    }

    static Alert message1 = new Alert("4  Child:\tstatic Alert message1");
    Alert message2 = new Alert("13 Child:\tAlert message2");

    static class Inner {

        static {
            System.out.println("7  Inner:\tstatic initializer1");
        }

        static Alert message1 = new Alert("8  Inner:\tstatic Alert message1");

        Alert message2 = new Alert("0");

        static Child instance = new Child();

        {
            System.out.println("0");
        }

        public Inner() {
            System.out.println("0");
        }

        static { //It's unbelievable like magic
            System.out.println("16 Inner:\tstatic initializer2");
        }

    }

    {
        System.out.println("14 Child:\tinstance initializer");
    }

    static {
        System.out.println("5  Child:\tstatic initializer");
    }

    public Child() {
        System.out.println("15 Child:\tconstructor");
    }

}
