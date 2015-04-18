package Exceptions;

public class ClassWithException1 implements AutoCloseable {

    public ClassWithException1() throws Exception {
        //throw new Exception("1");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("1-close");
    }
}
