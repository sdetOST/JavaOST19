package akbar;

import java.util.Scanner;

public class SymetricPoints {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String wantToContinue = "yes";    
        int pointNumber = 0;        
        
        // the array size is 100 so you can enter up to 100 points
        // the pointXValues holds the X values of all points
        // the pointYValues holds the Y values of all points
        //  so the first point's x value is in pointXValues[0] and y value is in pointYValues[0]
        int [] pointXValues = new int[100];
        int [] pointYValues = new int[100];
        
        
        // while loop will continue and more points will be entered until user says sth other than Yes 
        // this while loop is where we enter our values for each point
        while(wantToContinue.toUpperCase().equals("YES") ) {
            pointNumber++;
            System.out.print("Please Enter X value of point " + pointNumber + " : ");
            pointXValues[pointNumber-1] = input.nextInt();
            System.out.print("Please Enter Y value of point " + pointNumber + " : ");
            pointYValues[pointNumber-1] = input.nextInt();          
            System.out.print("You have entered " + pointNumber + " points, Do you want to continue?: ");
            wantToContinue = input.next();  
            
        } //    while(wantToContinue.toUpperCase().equals("YES") ) {
        
        // if the user only enters 1 or less point just say it's not enough
        if (pointNumber < 2 ) {
            System.out.println("You haven't entered enough points for symmetric check");
        }else {
            
            // if 2 or more points are given 
            // Check point 1 and point2 , check point 1 and point 3, check point 1 and point 4 ......
            // When finished
            // Check point 2 and point 3, check point 2 and point 4, check point 2 and point 5, .....
            // Do this till we check last point -1 with last point
            // the outer loop is the first point
            // the inner loop is the second point
            // to be symmetric either X or Y value will be the same and the other will be just the opposite like 5 and -5
            for (int i=0; i < pointNumber-1;i++) { 
                for (int j=i+1; j < pointNumber;j++) { 
                    
                    if   (( pointXValues[i]== pointXValues[j] && pointYValues[i] == -pointYValues[j])   ||  ( pointXValues[i]== -pointXValues[j] && pointYValues[i] == pointYValues[j]))  {
                        System.out.println("Point " + (i+1) + " is symmetric of Point " + (j+1));
                    }
    
                } //for (int j=i; j < pointNumber;j++) {
            
            
            } // for (int i=0; i < pointNumber;i++) {
        } // if (pointNumber < 2 ) {
        
        
        System.out.println("The END");
        input.close();
    } // public static void main(String[] args) {
} // public class InterviewSymmetric {
