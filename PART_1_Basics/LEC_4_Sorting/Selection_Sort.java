package PART_1_Basics.LEC_4_Sorting;

public class Selection_Sort {
    public static void main(String[] arg){
        int[] arr = {4,8,3,7,5,1,6};
        int n=7;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Selection(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Selection(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            } 
            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
