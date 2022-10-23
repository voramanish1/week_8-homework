package week_8;

//reading 10 number from console and print sum of these number

import  java.util.Scanner;

public class ReadingUserInputChallenge {

    public boolean method1() {
        Scanner obj = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("enter number #" + count);
            //check if enter number is int or not
            boolean number = obj.hasNext();
            //if int then sum of value
            if (number) {
                int a = obj.nextInt();
                sum = sum + a;
                count++;
            } else{
                System.out.println("invalid number");
        }

    }
    System.out.println("sum of all number=" + sum);
    return false;
}
public static void main(String[] args) {
        ReadingUserInputChallenge obj1 = new ReadingUserInputChallenge();
        obj1.method1();
}



}
