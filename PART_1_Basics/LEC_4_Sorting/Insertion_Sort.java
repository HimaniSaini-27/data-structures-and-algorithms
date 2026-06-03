package PART_1_Basics.LEC_4_Sorting;

public class Insertion_Sort {
     public static void main(String[] arg){
        int[] arr = {4,8,3,7,5,1,6};
        int n=7;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Insertion(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Insertion(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
