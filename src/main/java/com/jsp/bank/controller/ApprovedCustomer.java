package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.service.BankManagerService;

public class ApprovedCustomer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your BankManager id :");
		int bankManagerid= sc.nextInt();
		System.out.println("Enter your Customer id :");
		int Customerid= sc.nextInt();
		
		
		BankManagerService bankManagerService= new BankManagerService();
		bankManagerService.approvedCustomer(Customerid, bankManagerid);
	}
}
