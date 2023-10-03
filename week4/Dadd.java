package array2;

public class Dadd{
    public static void main(String[] args){
        int sum = 0;
        double ave = 0;
        
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            ave = (double)sum/args.length;
        System.out.println(ave);
        }
        
    }
}