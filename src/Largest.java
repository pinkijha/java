public class Largest {

    public static void main(String args[]) {

        int numbers[] = {1000, 30, 100, 500, 22, 29};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("the largest number of arrays is::" + largest);
    }
}
