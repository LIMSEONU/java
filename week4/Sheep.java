package array2;

import java.util.Scanner;

public class Sheep{
    public static void main(String[] args){
        int arr[] = new int [10];
        Scanner scn = new Scanner(System.in);
        
        System.out.print("양의 정수 10개를 입력하세요 >> ");
        for(int i = 0; i < 10; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("3의 배수는 ");
        for(int i = 0; i < 10; i++){
            if(arr[i] % 3 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        scn.close();
    }
}