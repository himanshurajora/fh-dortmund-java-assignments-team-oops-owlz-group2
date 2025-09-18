package self_assignment_1__group_2_team_oops_owlz;

public class Problem_1 {

	public static void main(String[] args) {
		System.out.println("Problem 1 is running. Solar System Volumes");

		int sunDiameter = 865000;
		int earthDiameter = 7600;

		double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunDiameter / 2.0, 3);
		double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthDiameter / 2.0, 3);

		double ratio = sunVolume / earthVolume;

		System.out.println("The volume of the Earth is "
				+ earthVolume + " cubic miles, the volume of the sun is "
				+ sunVolume + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "
				+ ratio + ".");
	}
}
