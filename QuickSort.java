class QuickSort{

    private static void sort(int arr[],int low,int high){

        if(low<high){
            int pi=partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    private static int partition(int arr[],int low,int high){

        int i=low-1;
        int temp;
        
        for(int j=low;j<high;j++){
            if(arr[j]<arr[high]){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;
    }
    public static void main(String[] args) {

        int arr[]=new int[]{311,54367,1,456,12,4};

        sort(arr, 0, arr.length-1);
        
        for (int i : arr) 
            System.out.print(i+" ");
    }
}