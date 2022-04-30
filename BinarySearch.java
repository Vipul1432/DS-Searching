// Binary Search

class BinarySearch {
    int binarySearch(int array[], int x, int start, int end) {

        // Repeat until the pointers cross each other
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}