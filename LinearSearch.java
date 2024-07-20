public class LinearSearch {

    private static int search(int arr[],int target){

        for (int i = 0; i < arr.length; i++)
            if(arr[i]==target) return i;
            
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int target=7;

        int result=search(arr, target);


        if(result != -1)
            System.out.println("The target element was found in index :"+result);
        else
            System.out.println("The target element was not found");
    }
}
