package memoryleak;

public class Element implements Comparable{
    private byte[] data = new byte[1024 * 1024 ];
    private int ref;

    public Element(int i) {
        this.ref = i;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
