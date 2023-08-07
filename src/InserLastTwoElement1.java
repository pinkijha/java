import java.util.Arrays;

public class InserLastTwoElement1 {
    public static void main(String args[]) {
        int originalArray[] = {10, 20, 30, 40, 50, 60, 70};
        int lastElement1 = 80;
        int lastElement2 = 90;

        int newLength = originalArray.length + 2;
        int[] newArrays = new int[newLength];

        System.arraycopy(originalArray, 0, newArrays, 0, originalArray.length);
        newArrays[newLength - 2] = lastElement1;
        newArrays[newLength - 1] = lastElement2;

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Latest Array: " + Arrays.toString(newArrays));
    }
}
