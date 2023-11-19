package com.aslinformationservices.calculator;

import java.util.Scanner;

public class CalculatorMain {
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Mean");
			System.out.println("Enter your choice");
			Calculator logic=new Calculator();
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:{ 
				}
				break;
				case 2:{System.out.println("Enter first number");
				int n=sc.nextInt();
				System.out.println("Enter Second number");
				int m=sc.nextInt();
				logic.subtract(n,m);//method call statement
				}
				break;
				case 3:{System.out.println("Enter first number");
				int n=sc.nextInt();
				System.out.println("Enter Second number");
				int m=sc.nextInt();
				logic.multiply(n,m);//method call statement
				}
				break;
				case 4:
					{System.out.println("Enter first number");
				int n=sc.nextInt();
				System.out.println("Enter Second number");
				int m=sc.nextInt();
				logic.divide(n,m);//method call statement
					}
				break;
				case 5:{
				System.out.println("Enter  a number");
				int n =sc.nextInt();
				double [] input =new double[n];
				System.out.println("enter "+n+" elements");
				double sum=0;
				for (int i=0;i<n;i++) {
					input[i]=sc.nextInt();
					}
				CustomFeature  cf=new CustomFeature();
			 
				System.out.println("Mean =" +cf.calculateMean(n,input));}
				break;
				 
				 
				
				default: System.out.println("wrong choice");
			}

		
	
 
			 
 
		}

	 
		}


