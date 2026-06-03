package PART_1_Basics.LEC_4_Sorting;

public class Merge_Sort {
    public static void main(String[] arg){
        int[] arr = {4,8,3,7,5,1,6};
        int n=7;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Sort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            Sort(arr, low, mid);
            Sort(arr, mid+1, high);
            Merge(arr,low, mid, high);
        }
    }

    static void Merge(int[] arr, int low, int mid ,int high){
        int n = high-low+1;
        int i = low, j = mid+1, k = 0;
        int[] b = new int[n];
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                b[k++] = arr[i++];
            }
            else{
                b[k++] = arr[j++];
            }
        }

        while(i<=mid){
            b[k++] = arr[i++];
        }
        while(j<=high){
            b[k++] = arr[j++];
        }

        for(k=0;k<n;k++){
            arr[k+low] = b[k];
        }
    }
}
