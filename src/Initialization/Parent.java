package Initialization;

public class Parent {

    static Alert message1 = new Alert("1  Parent:\tstatic Alert message1");
    Alert message2 = new Alert("9  Parent:\tAlert message2");

    {
        System.out.println("10 Parent:\tinstance initializer");
    }

    static {
        System.out.println("2  Parent:\tstatic initializer");
    }

    public Parent() {
        System.out.println("12 Parent:\tconstructor");
    }

    Alert message3 = new Alert("11 Parent:\tAlert message3");
    static Alert message4 = new Alert("3  Parent:\tstatic Alert message4");

}
