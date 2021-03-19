public class FindMax {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String args[]) {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 1, 2, 3, maximum(1, 2, 3));
    }
}
