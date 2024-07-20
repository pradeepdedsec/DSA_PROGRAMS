public class BinarySearch {

    private static int search(int arr[],int target){

        int left=0;
        int right=arr.length-1;

        int mid=(left+right)/2;

        while (left<=right) {
            
            if (target==arr[mid])
                return mid;
            else if(target<arr[mid])
                right=mid-1;
            else
                left=mid+1;

            mid=(left+right)/2;
        }
            
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
