
package exercise3;


public class Exercise3 {

  
    public static void main(String[] args) {
        int [] ar={0,1,3,2,3,0,1};
        int [] ne=new int [ar.length];
        ne=remove(3,ar);
         for(int i=0;i<ne.length;i++){
            System.out.print(ne[i]+" ");
        }
    }
    
    public static int[] remove(int pos,int[]in){
         int [] ne  = new int[5];
        boolean is=false;
        int s=0;
        for(int i=0;i<in.length;i++){
            if(in[i]==pos){
               is=true;
            }
            if(is==false){
                ne[s]=in[i];
                s++;
            }
            is=false;
            
        }
        return ne;
    }
    
}
