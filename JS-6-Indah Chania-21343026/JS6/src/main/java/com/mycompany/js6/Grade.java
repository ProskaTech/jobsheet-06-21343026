package com.mycompany.js6;
/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class Grade {
    public static void main (String[]args){
        double grade = 92.0;
        
        if(grade >= 90) {
            System.out.println("Excellent");
        }
        else if ((grade < 90) && (grade >=80)){
            System.out.println("Good Job!");
        }
        else {
            System.out.println("Sorry, you failed");
        }
    }
}
