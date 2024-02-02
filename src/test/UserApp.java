package test;

import java.util.Scanner;

public class UserApp {
	
	public static void main(String[] args) {
		
		UserDao dao=new UserDao();
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("id:");
		String a=sc.nextLine();
		System.out.println(a);
		
		System.out.print("pw:");
		String b=sc.nextLine();
		System.out.println(b);
		
		dao.login(a, b);
		System.out.println(dao.login(a, b));
		
	}
}
