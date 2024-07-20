public class InsertionSort {

    private static void sort(int arr[]){

        int key,j;

        for (int i=1; i < arr.length; i++) {
            
            key=arr[i];
            j=i-1;
            
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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
