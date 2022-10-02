public class InsertionSort {
    public static void main(String[] args)
    {
        int[][] tests = {{1}, {1, 1}, {1, 2, 4, 3}, {4, 3, 2, 5, 6}, null};
        for (int[] test : tests){
            insertionSort(test);
            for (int member : test){
                System.out.print(member + " ");
            }
            System.out.println();
        }

    }

    public static void insertionSort(int[] arr) throws NullPointerException {
        if (arr == null) throw new NullPointerException("arr cannot be null");
        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            for (;j >= 0 && arr[j] > arr[i];--j);
            ++j;
            if (i != j){
                int buf = arr[i];
                split(arr, j, i);
                arr[j] = buf;
            }
        }
    }

    private static void split(int[] arr, int from, int to){
        for (;to > from;--to){
            arr[to] = arr[to-1];
        }
    }


}
