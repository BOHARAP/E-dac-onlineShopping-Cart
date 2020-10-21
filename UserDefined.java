package com.EcommerceWebsite;

import java.util.Scanner;

public class UserDefined {
	
	public String userid;
	public String password;
	public String loginStatus;
	
	UserDefined()
	{
		this.userid=userid;
		this.password=password;
		this.loginStatus=loginStatus;
	}
	
	void Setlogin()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user_id :");
		userid =sc.nextLine();
		System.out.println("Enter the password");
		password=sc.nextLine();
		
	}
	void verifylogin()
	{
		if(userid.equals("user") && password.equals("password"))
		{
			System.out.println("Login Successful:");
		}
		else
		{
			System.out.println("invalid user Id and Password:");
		}
		
	}
	
	
	sc.close();

}
