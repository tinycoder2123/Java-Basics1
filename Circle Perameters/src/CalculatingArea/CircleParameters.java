/***********************************************
 * Module 1
 * Project 1
 * Program Circle Perameters
 * By Karolina Szulczyk
 * 
 ***********************************************/


package CalculatingArea;

import java.util.Scanner;

public class CircleParameters 
{

	public static void main(String[] args) 
	{
	double radius;
	double diameter;
	double circumference;
	double area;
	
	// User input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a radius value: ");
	radius =  input.nextDouble();
	input.close();
	
	// Diameter of circle
	diameter = 2 * radius;
	System.out.println("Diameter of the Circle is " + diameter );
	
	// Circumference of circle
	circumference = 2 * Math.PI * radius;
	System.out.println("circumference of the Circle is " + circumference );
	
	//Area of circle
	area = Math.PI * radius * radius;
	System.out.println("Area of the Circle is " + area );
	
	
	}

}
