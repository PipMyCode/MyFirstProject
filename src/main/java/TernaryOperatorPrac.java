import java.sql.SQLOutput;

public class TernaryOperatorPrac {
    public static void main(String[] args) {

        // Variable = (condition) ? ifTrue : ifFalse;


       // int score = 100;
       // String PassorFail = (score >= 70) ? "PASS" : "FAIL";
/*
        if ( score >= 70 ) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }



        String result = (score >= 70) ? "Passed" : "Failed";
        System.out.println(result);
 */
       // System.out.println((score >= 70)) ? "Passed" : "Failed";
        //System.out.println(PassorFail);



      //  int number = 10;
      //  String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

       // System.out.println(evenOrOdd);

       // int hours = 9;

       // System.out.println(hours < 12);
     //   String timeOfDay = ( hours < 12 ) ? "A.M" : "P.M";

       // System.out.println(timeOfDay);

        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
