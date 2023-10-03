package array2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bacc{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.print("곱하고자 하는 두 수 입력 >> ");
            try{
                int i = scn.nextInt();
                int j = scn.nextInt();
                System.out.print(i+"x"+j+"="+i*j);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scn.nextLine();
            }
        }

        scn.close();
    }
}