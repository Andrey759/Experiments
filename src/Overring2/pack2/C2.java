package Overring2.pack2;

import Overring2.pack2.pack3.I1;

import java.io.IOException;

public abstract class C2 implements I1 {

    public void aaa() throws IOException{
        System.out.println("C2");
        throw new IOException();
    }

    @Override
    public abstract String toString();
}
