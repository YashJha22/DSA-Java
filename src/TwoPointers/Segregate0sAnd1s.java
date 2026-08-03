import java.util.Arrays;

public class Segregate0sAnd1s {

    void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0 && arr[right] == 1) {
                left++;
                right--;
            } else if (arr[left] == 0 && arr[right] == 0) {
                left++;
            } else if (arr[left] == 1 && arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        Segregate0sAnd1s obj = new Segregate0sAnd1s();
        obj.segregate0and1(arr);

        System.out.println(Arrays.toString(arr));
    }
}