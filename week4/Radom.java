package array2;

import java.util.Random;

public class Radom {
    public static void main(String[] args) {
        Random r = new Random();
        int num = 0;
        int t = 0;
        int i = 0;
        int j = 0;

        int array[][] = new int[4][4];
        int ran[] = new int[10];

        for (i = 0; i < ran.length; i++) {
            num = r.nextInt(16) + 1;
            t = i;
            for (j = 0; j < t; j++)
                if (ran[j] == num) {
                    i--;
                    break;
                }
            if (j == t)
                ran[i] = num;
        }
        
        for(i=0; i<ran.length; i++) {
        	int fir=ran[i]/4;
        	int sec=ran[i]%4;
        	array[fir][sec]=(int)(Math.random()*10+1);
        }
        
        for (i=0; i < array.length; i++) {
        	for (j=0; j < array[i].length; j++)
        		System.out.print(array[i][j]+"\t");
        	System.out.println();
        }
    }
}
