package misc;

public class Code3 {
    void m1() {
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += i;
        }
    }

    void m2() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result.append(i);
        }
    }
}
