package exercises;

import java.util.Arrays;

public class ArrayPractice {
   public static void main (String[] args) {

       Integer[] myNum = {1, 1, 2, 3, 5, 8};
       String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       String[] newString = {};
       for (Integer num: myNum) { //for num in myNum array
           if ((num%2) != 0) {
               System.out.println(num);
           }
       }

       //newString = myString.split(""); // split the myString with space
       newString = myString.split("\\."); //split the myString with period.
       System.out.println(Arrays.toString(newString));

   }
}

