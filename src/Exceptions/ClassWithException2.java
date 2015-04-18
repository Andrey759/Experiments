package Exceptions;

public class ClassWithException2 implements AutoCloseable {

    public ClassWithException2() throws Exception {
        //throw new Exception("2");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("2-close");
    }
}
