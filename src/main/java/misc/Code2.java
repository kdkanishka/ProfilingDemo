package misc;

public class Code2 {
    void m1() {
        String fruit = "";
        switch (fruit) {
            case "APP":
                op("Apple");
                break;
            case "ORG":
                op("Orange");
                break;
            case "BNA":
                op("Banana");
                break;
            case "GRP":
                op("Grapes");
                break;
            default:
                op("Unknown");
        }
    }

    void m2() {
        int fruit = 0;

        final int APP = 1;
        final int ORG = 2;
        final int BNA = 3;
        final int GRP = 4;

        switch (fruit) {
            case APP:
                op("Apple");
                break;
            case ORG:
                op("Orange");
                break;
            case BNA:
                op("Banana");
                break;
            case GRP:
                op("Grapes");
                break;
            default:
                op("Unknown");
        }
    }


    private void op(String x) {
        System.out.println(x);
    }
}
