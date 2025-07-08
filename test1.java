

public class test1 {
    public static int reverse(int arr[] ){

        for(int i = arr.length-1; i >= 0; i--){
            int first = i;
            int last = arr.length-1-i;

                if(first <= last){
                    break;

                }
            swap(first , last , arr);
            }


        return -1;
    }
    public static void swap(int last , int first , int arr[]){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public  static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result = reverse(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(result);

    }
}
