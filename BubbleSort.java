public class BubbleSort {

    private static void sort(int arr[]){

        int temp,left,right;

        for (int i = 0; i < arr.length; i++) {

            left=0;
            right=1;

            while (right<arr.length) {
                if(arr[left]>arr[right]){
                    temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                }
                left++;
                right++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{12,21,39,14,35,62,17,18,19,110,1};

        for (int i : arr) {
            System.out.print(i+" ");
        }

        sort(arr);
        System.out.println();

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
