package sa.edu.yuc;

import java.util.Scanner;

public class HotelTest {

	public static void main(String[] args) {
		Hotel guests = new Hotel();

		guests.addGuest(new Account("Ahmed1", 2, true, 1, 123));
		/*
		guests.addGuest(new Account("Ahmed2", 2, false, 2, 435));
		guests.addGuest(new Account("Ahmed3", 2, false, 2, 155));
		guests.addGuest(new Account("Ahmed4", 3, true, 3, 953));
		guests.addGuest(new Account("Ahmed5", 2, false, 2, 141));
		 */	
		int i = menu();
		while (i != 5 && i < 5 && i !=0) {
				switch (i) {
					case 1: {
						guests.addGuest(Account.getAccount());
						guests.save();
						break;
					}
					case 2:{
						guests.printId(Account.findAccount());
						break;
					}
					case 3:{
						guests.removeGuestById(Account.findAccount());
						break;
					}
					case 4:{
						guests.display();
						guests.save();
						break;
					}
					
				}
				i = menu();
		}
		System.out.println("End of program");
	}

	private static Scanner input() {
		return new Scanner(System.in);
	}

	private static int menu() {

		System.out.printf("1- for add \n2- for search \n"
							+ "3- for delete \n4- for print\n Enter any number to terminate  \n ::");
		return input().nextInt();
	}

	}

