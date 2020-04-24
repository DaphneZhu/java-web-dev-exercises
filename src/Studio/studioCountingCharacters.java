package Studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studioCountingCharacters {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); //create an input
        System.out.println("Enter the string: ");
        String quote = input.nextLine(); //input the next string

        //String hiddenQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterMap = new HashMap<>();
        //char[] characterString = hiddenQuote.toCharArray();
        char[] characterString = quote.toCharArray();
        for (char c : characterString) {
            if (characterMap.containsKey(c)) {
                characterMap.put(c, characterMap.get(c) + 1);
            } else {
                characterMap.put(c, 1); //create a new character
            }
        }
        for (Map.Entry <Character, Integer> oneC : characterMap.entrySet()) { // each entry in that entry set
            System.out.println(oneC.getKey() + ": " + oneC.getValue());
        }

    }
}

