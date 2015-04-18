package Overriding;

public class Second extends First {

    public int i = 4;
    
    public Second() {
        super();
        super.echo();
    }

    public void show() {
        System.out.println("Dont worry!");
    }

    public void trololo() {
        super.echo();
    }
}
