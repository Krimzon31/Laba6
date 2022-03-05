package com.company;
import java.util.Scanner;

class Formyl{
    int x;
    int y;
    Formyl(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void PodSch(){
        if((y+1)!= 0){
            double z = (double) (x + y)/(y + 1);
            System.out.println("(x+y)/(y+1) = " + z);
        }
        else{
            System.out.println("На ноль нельзя делить!!!");
        }
    }
}
public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        System.out.println("Введите число y");
        int y = in.nextInt();
        Formyl result = new Formyl(x , y);
        result.PodSch();
    }
}
