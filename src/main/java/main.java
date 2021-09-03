/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the password? ");
        String p = sc.nextLine();
        if(Objects.equals(p,"abc$123"))
            System.out.printf("Welcome!");
        else
            System.out.printf("I don't know you.");
    }
}