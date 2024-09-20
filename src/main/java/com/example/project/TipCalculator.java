package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        //I learned how to round from https://coreui.io/blog/how-to-round-a-number-to-two-decimal-places-in-javascript/#:~:text=Another%20method%20to%20round%20to,then%20dividing%20back%20by%20100.&text=This%20method%20ensures%20the%20result,the%20essence%20of%20mathematical%20operations.
        /*double tip = (Math.round(cost*(percent/100.0)*100.0))/100.0;
        double billWithTip = cost + tip;
        double costPerPerson = (Math.round(cost/people * 100.0))/100.0;
        double tipPerPerson =  (Math.round(tip/people * 100.0))/100.0;
        double totalPerPerson = (Math.round((billWithTip/people) * 100.0))/100.0;*/
        double tip = cost*(percent/100.0);
        double tipRounded = (Math.round(tip*100.0))/100.0;
        double billWithTip = cost + tipRounded;
        double costPerPerson = cost/people;
        costPerPerson = (Math.round(costPerPerson*100.0))/100.0;
        double tipPerPerson = tip/people;
        tipPerPerson = (Math.round(tipPerPerson*100.0))/100.0;
        double totalPerPerson = (cost + tip)/people;
        totalPerPerson = (Math.round(totalPerPerson*100.0))/100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tipRounded + "\n");
        result.append("Total Bill with tip: " + "$" + billWithTip + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPerson +"\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;            
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
