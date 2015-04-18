package MemorySize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemorySize {

    public static void main(String... args) throws IOException {
        int size = 10 * 1024 * 1024;
        C[] a = new C[size];
        //boolean[] a = new boolean[size];
        for(int i = 0; i < size; i++)
            a[i] = new C();
        System.out.println("Array successfully created...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine());
    }

}
