package misc;

public class Code1 {

    void m1() {
        int i = 10;
        if (i == 1) {
            op("one");
        } else if (i == 2) {
            op("two");
        } else if (i == 3) {
            op("three");
        } else if (i == 4) {
            op("four");
        } else if (i == 5) {
            op("five");
        } else if (i == 6) {
            op("six");
        } else {
            op("oops!");
        }
    }

    void m2() {
        int i = 10;
        switch (i) {
            case 1:
                op("one");
                break;
            case 2:
                op("two");
                break;
            case 3:
                op("three");
                break;
            case 4:             //try changing this to -1 
                op("three");
                break;
            case 5:
                op("three");
                break;
            case 6:             //try changing this -100
                op("three");
                break;
            default:
                op("oops!");
        }
    }

    private void op(String x) {
        op(x);
    }
}
