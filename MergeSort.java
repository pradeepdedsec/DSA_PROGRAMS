public class MergeSort {
    private static void sort(int arr[],int l,int r){

        if(l<r){
            int mid=(l+r)/2;

            sort(arr, l, mid);
            sort(arr, mid+1, r);

            merge(arr, l,r, mid);
        }
    }

    private static void merge(int arr[],int l,int r,int mid){

        int n1=mid-l+1;
        int n2=(r-(mid+1))+1;

        int lArr[]=new int[n1];
        int rArr[]=new int[n2];

        int t1=l,t2=0;

        for (; t2 <n1; t1++,t2++)
            lArr[t2]=arr[t1];

        t2=0;

        for (; t2 <n2; t1++,t2++)
            rArr[t2]=arr[t1];

        
        int i=0,j=0,k=l;


        while (i<n1 && j<n2) {
            if(lArr[i]<rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {

        int arr[]=new int[]{311,54367,1,456,12,4};

        sort(arr, 0, arr.length-1);
        
        for (int i : arr) 
            System.out.print(i+" ");
    }
}
