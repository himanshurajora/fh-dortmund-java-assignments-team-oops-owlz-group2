package self_assignment_1__group_2_team_oops_owlz;

import java.util.Arrays;import java.util.Arrays;

public class Problem3 {
	
	public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (Character.isLetter(ch)) {
                letters++; // count total letters

                // count vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            } else if (Character.isWhitespace(ch)) {
                spaces++; // count spaces
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n"
                + "spaces: " + spaces);
    }
}
