
package exercise1;

public class Exercise1 {

    public static void main(String[] args) {
     double arr[]={4,2};
     boolean res=isStrinctlyIncreasing(arr);
      if(res==true){
          System.out.println("The number of the array is greater than the value before"); 
      }else{
          System.out.println("The number of the array is less than the value before");
      }
    }
    
    public static boolean isStrinctlyIncreasing(double arr[]){
        for(int i=0;i<=2;i++){
            if(arr[i+1]>arr[i]){
                return true;
              
            }else{
                return false;
            }
        }
        return false;
    }
    
}
