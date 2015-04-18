
public class A {

    public static String ipIntToStr(int ip) {
        return (ip >>> 24) + "." + (ip << 8 >>> 24) + "." + (ip << 16 >>> 24) + "." + (ip << 24 >>> 24);
    }

}
