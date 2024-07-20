public class SelectionSort {
    private static void sort(int arr[]){

        int temp,min;

        for (int i = 0; i < arr.length-1; i++) {

            min=i;

            for (int j = i; j < arr.length; j++) {
                if(arr[min]>arr[j])
                    min=j;
            }
            if(min!=i){
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{12,21,39,14,35,62,17,18,19,110,1};

        for (int i : arr) 
            System.out.print(i+" ");

        sort(arr);
        System.out.println();

        for (int i : arr) 
            System.out.print(i+" ");
    }
}
