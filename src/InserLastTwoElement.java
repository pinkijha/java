import java.util.Arrays;

public class InserLastTwoElement {
    public static void main(String args[]) {
        int originalArray[] = {10, 20, 30, 40, 50, 60, 70};
        int lastElement1 = 80;
        int lastElement2 = 90;

        int[] insertElement1 = Arrays.copyOf(originalArray, originalArray.length + 1);
        insertElement1[insertElement1.length - 1] = lastElement1;
        System.out.println("original Array:" + Arrays.toString(originalArray));
        System.out.println("new Array:" +Arrays.toString(insertElement1));
        int[] newArrays=insertElement1;


        int[] insertElement2 = Arrays.copyOf(newArrays, newArrays.length + 1);


        insertElement2[insertElement2.length - 1] = lastElement2;
        System.out.println("original Array:" + Arrays.toString(newArrays));
        System.out.println("Latest Array:" +Arrays.toString(insertElement2));

    }
}
