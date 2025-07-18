public class test6 {
    public static int binary(int arr[] , int terget){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(terget < arr[mid]){
                end = mid-1;

            }
            else if(terget > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binary(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
