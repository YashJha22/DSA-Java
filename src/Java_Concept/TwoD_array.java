package Java_Concept;

public class TwoD_array {

    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        int value = 1;

        // Fill the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}