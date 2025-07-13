public class b_selectionSort {
    public static void selectionSort(int arr[]) {
        // Selection sort concept says that find the minimum element in the array and
        // place it at the beginning
        // here we can do this as , first find index of the element which is smallest of all.Swap this element with 0th element of array.Then find the next smallest element in the array.Swap it with 1st index of array then find index of  3rd smallest and swap it with 2nd index's value of array and keep doing this at last our array will be in sorted form.
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 5, 2, 7 };
        selectionSort(arr);
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Time complexity O(n^2) 
    }
}