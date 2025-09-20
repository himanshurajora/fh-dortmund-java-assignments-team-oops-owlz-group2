package self_assignment_1__group_2_team_oops_owlz;

public class Problem4 {
	
    public static void main(String[] args) {
        // Hamlet's soliloquy (shortened example)
        String soliloquy = "To be, or not to be, that is the question" +
                "Whether 'tis nobler in the mind to suffer" +
                "The slings and arrows of outrageous fortune," +
                "Or to take arms against a sea of troubles," +
                "And by opposing end them.";

        //lowercase, remove punctuation
        soliloquy = soliloquy.toLowerCase().replaceAll("[^a-z\\s]", "");

        //Split into words
        String[] words = soliloquy.split("\\s+");

        //Selection sort (manual, no built-in sorting)
        for (int i = 0; i < words.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }

        // Step 4: Print sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
