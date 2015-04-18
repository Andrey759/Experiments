package Overriding;

public class First {

    public int i = 3;

    public First() {
        show();
    }

    public void echo() {
        this.show();
    }

    public void show() {
        System.out.println("Hello!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
