package com.psl.q1;

import java.util.Scanner;

public class Test {

	public float totalCost(Service user[]) {
		float totalCst = 0f;
		for (int i = 0; i < user.length; i++) {
			totalCst = totalCst + user[i].charges;
		}
		totalCst = totalCst + totalCst * (15 / 100);
		return totalCst;
	}

	private int maxCost(float user[]) {
		// TODO Auto-generated method stub
		float maxCost = user[0];
		int index = 0;
		for (int i = 1; i < user.length; i++) {
			if (user[i] > maxCost) {
				maxCost = user[i];
				index = i;
			}
		}
		System.out.println("Services with maximum cost is availed by user"
				+ (index + 1));
		System.out.println(" Cost is :" + user[index]);
		return index + 1;

	}

	public void getServices(Service user[], int noOfServices,Scanner s) {
		
		Service sv = new Service();
		for (int i = 0; i < noOfServices; i++) {
			user[i] = new Service();
			System.out.print("Enter the service " + (i + 1) + " :");
			user[i].serviceName = (s.next()).toUpperCase();
			user[i].charges = sv.getData(user[i].serviceName);
		}
	}

	public void getInput() {
		Scanner s = new Scanner(System.in);

		System.out.print("Available Services are:TALKTIME/SMS/2G/3G/4G");

		int noOfServices;
		System.out.print("\nNumber of services availed by user1 :");
		noOfServices = s.nextInt();
		Service user1[] = new Service[noOfServices];
		getServices(user1, noOfServices,s);
		
		System.out.print("\nNumber of services availed by user2 :");
		noOfServices = s.nextInt();
		Service user2[] = new Service[noOfServices];
		getServices(user2, noOfServices,s);

		System.out.print("\nNumber of services availed by user3 :");
		noOfServices = s.nextInt();
		Service user3[] = new Service[noOfServices];
		getServices(user3, noOfServices,s);

		s.close();
		float totalCst[] = new float[3];
		totalCst[0] = totalCost(user1);
		totalCst[1] = totalCost(user2);
		totalCst[2] = totalCost(user3);

		for (int i = 0; i < totalCst.length; i++) {
			System.out.println("The total cost of user" + (i + 1) + " : "
					+ totalCst[i]);
		}
		int index = maxCost(totalCst);
		System.out.print("The services are : ");
		if (index == 1) {
			for (int i = 0; i < user1.length; i++) {
				System.out.print(user1[i].serviceName + "  ");
			}
		} else if (index == 2) {
			for (int i = 0; i < user2.length; i++) {
				System.out.print(user2[i].serviceName + "  ");
			}
		} else if (index == 3) {
			for (int i = 0; i < user3.length; i++) {
				System.out.print(user3[i].serviceName + "  ");
			}
		}

	}

	public static void main(String[] args) {

		Test t = new Test();

		t.getInput();

	}

}
