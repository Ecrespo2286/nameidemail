
package exercise2;
public class Exercise2 {

    
    public static void main(String[] args) {
    char [] arr={'b', 'd', 'a', 'b', 'f','a','g','a','a'};
    char [] ne=new char[20];
    ne=removeDuplicates(arr);
     for(int i=0;i<ne.length;i++)
     {
         System.out.print(ne[i]+"  ");   
     }
    }
     
    public static char[] removeDuplicates(char[] in){
     char [] ne=new char[10];
     boolean is=false;
     boolean is1=false;
        for(int i=0;i<in.length;i++){
            is=false;
           for(int j=i+1;j<in.length;j++){
               if(in[i]==in[j]){
                  is=true;
               }
           } 
           if(is==true){
            
             
           }
           else{
               ne[i]=in[i];
              
           }
           
       } 
        
        return ne;
    }   
}
