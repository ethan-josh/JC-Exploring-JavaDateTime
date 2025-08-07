package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.time.LocalTime;

public class DateTimeLab{
	public static void main(String[] args){

		// Exercise #1 ******************************
		LocalDate today = LocalDate.of(2025, 8, 21);
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        // System.out.println("Default format: " + today);
        // System.out.println("Custom format 1: " + today.format(dtf1));
        // System.out.println("Custom format 2: " + today.format(dtf2));
		// ******************************************

		// Exercise #2 ******************************
	    LocalTime now = LocalTime.of(16, 45, 30);
        
        DateTimeFormatter dtf1ex2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2ex2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf1ex2));
        System.out.println("12-hour format with AM/PM: " + now.format(dtf2ex2));	
        // ******************************************

        // Exercise #3 ******************************
		
        // ******************************************

        // Exercise #4 ******************************
		
        // ******************************************

        // Exercise #5 ******************************
		
        // ******************************************
	}
}