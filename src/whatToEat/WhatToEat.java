package whatToEat;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		String eventType = "error";
		int partySize = 0;
		String result;
		String mealSug = "error";
		String prepSug = "error";
		Scanner scnr = new Scanner(System.in);

		System.out.println("Hello! Welcome to What to Eat!");

		do {
			System.out.println("Please enter your event type. Your options are: causal, semi-formal, and formal");
			eventType = scnr.nextLine();
			if (eventType.equalsIgnoreCase("casual")) {
				mealSug = "sandwiches";
			} else if (eventType.equalsIgnoreCase("semi-formal")) {
				mealSug = "fried chicken";
			} else if (eventType.equalsIgnoreCase("formal")) {
				mealSug = "chicken parmesan";
			} else {
				System.out.println("You entered an invalid event type.");

			}
		} while (!(eventType.equalsIgnoreCase("casual")) && !(eventType.equalsIgnoreCase("formal"))
				&& !(eventType.equalsIgnoreCase("semi-formal")));

		do {
			System.out.println("Next, please enter your party size.");
			if (scnr.hasNextInt()) {
				partySize = scnr.nextInt();
				if (partySize == 1) {
					prepSug = "in the microwave";
				} else if ((partySize < 13) && (partySize > 1)) {
					prepSug = "in your kitchen";
				} else if (partySize >= 13) {
					prepSug = "by a caterer";
				} else {
					System.out.println("You entered an invalid party size.");
				}
			} else {
				System.out.println("You entered an invalid party size.");
				scnr.nextLine();
			}
		} while (partySize <= 0);
		scnr.close();

		result = "Since you're hosting a " + eventType + " event for " + partySize + " people, you should serve "
				+ mealSug + " prepared " + prepSug + ". Thank you for using What to Eat!";
		System.out.println(result);

	}

}
