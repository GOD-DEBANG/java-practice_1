public class test4 {
    public static void bubblesort(int arr[]){
        for(int i =0; i<arr.length; i++){
            boolean swaped = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] <arr[j-1]){
                    swap(arr,j-1,j);
                    swaped = true;
                }

            }
            if(swaped == false){
                System.out.println("It is a sorted array");
                break;
            }
            else{
                System.out.println("Continuing your process");
            }

        }
    }
    public static void swap(int arr[] , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static int binarysearch(int arr[] , int terget){
        int first = 0 ;
        int last = arr.length-1;
        while(first <= last){
            int mid = first+(last-first)/2;
            if(terget < arr[mid]){
               last = mid - 1;
            } else if (terget > arr[mid]) {
                first = mid+1;
            }
            else{
                  return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {5,7,9,4,1,2,10,3,6};
        int terget = 2;
        bubblesort(arr);
        int result = binarysearch(arr , terget);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
        System.out.println();
        if(result != -1){
            System.out.println("Terget"  +   terget   +  "found at index"  +  result);
        }
        else{
            System.out.println("Terget not found");
        }
    }
}
