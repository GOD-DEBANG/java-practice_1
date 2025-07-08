public class test3 {
    public static void swapvaluescheck(int arr[] ,int swap ){
        boolean found = false;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == swap){
               found = true;
               break;
            }
        }
        if(found){
            System.out.println("It can be Swapped");
        }
        else{
            System.out.println("It cannot be  swaped");
        }

    }
    public static void swaping(int arr[] , int last , int first ){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        swapvaluescheck(arr , 8);
        swapvaluescheck(arr , 2);
        swaping(arr , 0 ,9);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
