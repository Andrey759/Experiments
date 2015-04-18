package Overring2.pack1;

import Overring2.pack2.C2;

public class C1 extends C2 {

    @Override
    public void aaa() throws RuntimeException {
        System.out.println("C1");
    }

    @Override
    public String toString() {
        return "!!!";
    }

    //    public T meth() {
//        return null;
//    }
/*

    public static <T extends pack2.C2<? super pack2.C2>> void meth(T var) {
        System.out.println(var.getClass().getInterfaces());
    }
*/

}
