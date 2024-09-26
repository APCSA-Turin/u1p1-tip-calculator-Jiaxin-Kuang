package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      

        StringBuilder result = new StringBuilder();

        //your code here
        //Calculations for tip, total bill before tip, cost per person, tip per person, and total per person
        //I learned how to round from https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round
        /*Math.round() rounds decimals to the nearest whole number 
        How I used Math.round() to round tip, cost per person, tip per person, and total per person to the nearest hundredth:
        1. I multipled the numbers by 100.0 to shift two decimal places to the right
        2. Then, I rounded the numbers using Math.round() to leave only my non-decimal places left
        3. Lastly, I divided the numbers by 100.0 to shift back two decimal places to the left, giving me a decimal rounded to the nearest hundredth
        */

        double tip = cost*(percent/100.0);
        double tipRounded = (Math.round(tip*100.0))/100.0;
        double billWithTip = cost + tipRounded;
        double costPerPerson = cost/people;
        double costPerPersonRounded = (Math.round(costPerPerson*100.0))/100.0;
        double tipPerPerson = tip/people;
        double tipPerPersonRounded = (Math.round(tipPerPerson*100.0))/100.0;
        double totalPerPerson = (cost + tip)/people;
        double totalPerPersonRounded = (Math.round(totalPerPerson*100.0))/100.0;


        //Prints out tip, total bill before tip, cost per person, tip per person, and total per person
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tipRounded + "\n");
        result.append("Total Bill with tip: " + "$" + billWithTip + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPersonRounded +"\n");
        result.append("Tip per person: " + "$" + tipPerPersonRounded + "\n");
        result.append("Total cost per person: " + "$" + totalPerPersonRounded + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 15;
        int percent = 5;
        double cost = 578.34;            
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
