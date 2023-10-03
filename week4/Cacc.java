package array2;

public class Cacc{
    public static void main(String[] args){

    	for(int i = 1; i< 100; i++){
            int j = i % 10;
            int t = i / 10;
            if((j == 3 || j == 6 || j == 9) && (t == 3 || t == 6 || t == 9)){
                System.out.println(i + " 박수 짝짝");
            }
            else if(j == 3 || j == 6 || j == 9 || t == 3 || t == 6 || t == 9){
                System.out.println((i + " 박수 짝"));
            }
        }
    }
}
