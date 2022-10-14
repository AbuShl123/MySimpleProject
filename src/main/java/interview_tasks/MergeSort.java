package interview_tasks;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {70, 50, 30, 10, 20, 60, 40};

    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
        int[] sorted = new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                sorted[k] = one[i++];
            } else {
                sorted[k] = two[j++];
            }
            k++;
        }

        return null;
    }
}
