package ie.gmit.javalabs.lab7arrays;

public class SampleRunner {  
    public static void main(String[] args){
        System.out.println(args + "-->" + args.length);
        
        //for (int i = 0; i < args.length; i++){
        for (int i = args.length - 1; i >= 0; i-=2){    
            System.out.println(args[i]);
            
            if (args[i].equals("GMIT")){
                System.out.println("\tWish you were here....");
            }
        }      
    }
}