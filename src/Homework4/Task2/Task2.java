package Homework4.Task2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to start: ");
        CustomStringBuilder builder = new CustomStringBuilder(sc.next());
        StringDirector director = new StringDirector(builder);
        director.work();
    }
}
