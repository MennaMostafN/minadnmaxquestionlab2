public class minandmaxlab2 {
    private int[] arr;

    public minandmaxlab2() {
        this.arr = arr;
    }

    public int findmin(int arr[]) {
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        return min;
    }

    public int findmax(int arr[]) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < max) {
                max = arr[j];
            }
        }
        return max;
    }
}
