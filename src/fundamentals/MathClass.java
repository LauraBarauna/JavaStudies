package fundamentals;

public class MathClass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        // Find the maximum or minimum value
        double max = Math.max(x, y);
        double min = Math.min(x, y);

        double absolute = Math.abs(min);
        double sqrt = Math.sqrt(absolute);

        double round = Math.round(x);

        // Round up or down
        double floor = Math.floor(x);
        double ceil = Math.ceil(x);

        System.out.println(floor);

    }

}


