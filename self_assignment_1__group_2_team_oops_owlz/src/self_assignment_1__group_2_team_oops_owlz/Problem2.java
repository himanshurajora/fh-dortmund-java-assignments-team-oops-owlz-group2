package self_assignment_1__group_2_team_oops_owlz;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("  Printing Prime numbers up to 50");

        int nValues = 50;

        outer: // This is the label for the outer loop
        for (int a = 2; a <= nValues; a++) {
            // Check divisibility only up to the square root of i
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    continue outer; // Skip to the next i
                }
            }
            // If no divisor found, print the number
            System.out.println(a);
        }
		

	}

}