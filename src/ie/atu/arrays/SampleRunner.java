package ie.atu.arrays;

public class SampleRunner {  
    public static void main(String[] args){
        // 
        System.out.println(args.length);
        
        for (int i = 0; i < args.length; i++){  
            System.out.println(args[i]);
            
            if (args[i].equals("ATU")){
                System.out.println("\tWish you were here....");
            }
        }      

    } // end of main
} // end of class
