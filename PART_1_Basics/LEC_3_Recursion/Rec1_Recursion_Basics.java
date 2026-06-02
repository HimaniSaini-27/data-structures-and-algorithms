//TC:O(N)  SC:O(N)

package PART_1_Basics.LEC_3_Recursion;

public class Rec1_Recursion_Basics {
    public static void main(String[] arg){
        func3b(5,1);
    }

    static void func1(int n,int i){ 
        if(i>n){
            return;
        }
        System.out.println("Himani");
        func1(n, i+1);
    }

    static void func2(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        func2(n, i);
    }

    static void func2b(int n,int i){
        if(i<1){
            return;
        }
        func2b(n, i-1);
        System.out.println(i);
    }

    static void func3(int n,int i){
        if(i<=0){
            return;
        }
        System.out.println(i);
        func3(n,i-1);
    }

    static void func3b(int n,int i){
        if(i>n){
            return;
        }
        func3b(n,i+1);
        System.out.println(i);
    }
}
