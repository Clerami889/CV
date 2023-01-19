package Udem;

public class ad {
   
        // write code here
        public static void main(String[]args){
            int a = 10;
            checkNumber(a);
            
        }
        
        public static void checkNumber(int a){
            if(a>0){
               System.out.println("positive");
                
            }
            else if (a<0) {
                System.out.println("negative");
                
            }
            else if(a == 0){
                System.out.println("zero");
            }
        }
        
    
    
}
