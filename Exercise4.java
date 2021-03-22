
package exercise4;

import java.util.Scanner;


public class Exercise4 {

    
    public static void main(String[] args) {
     int a[]=new int[5];
     int b[]=new int[5];
     int res[]=new int[5];
     Scanner entrance=new Scanner(System.in);
        for(int i=0;i<5;i++){
               System.out.println("Insert amount");
               a[i]=entrance.nextInt();      
        }
         for(int t=0;t<5;t++){
               System.out.println("Insert amount for the other order");
               b[t]=entrance.nextInt();      
        }
         res=CombineOrder(a,b);
         for(int r=0;r<5;r++){
             System.out.print(res[r]+" , ");
         }
    }
    
    public static int[] CombineOrder(int a[],int b[]){
     int res[]=new int[5];
         for(int i=0;i<5;i++){
             res[i]=a[i]+b[i];
         }
        return res;
    }
}
