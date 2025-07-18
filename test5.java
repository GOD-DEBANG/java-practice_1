public class test5 {
    public static int linear(int terget , int arr[]){
        if(arr.length == terget){
            return -1;
        }
        else{
        for(int i=0; i<=arr.length; i++){
            int element = arr[i];
            if(terget == arr[i]){
                return i;
            }

        }
        

    }
    return -1;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int terget = 6;
    int result =  linear(terget, arr);
    System.out.println(result);
}
}

