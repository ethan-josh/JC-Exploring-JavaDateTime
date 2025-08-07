package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.time.LocalTime;

import java.time.LocalDateTime;

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

        // System.out.println("Default format: " + now);
        // System.out.println("24-hour format: " + now.format(dtf1ex2));
        // System.out.println("12-hour format with AM/PM: " + now.format(dtf2ex2));	
        // ******************************************

        // Exercise #3 ******************************
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);
        
        DateTimeFormatter dtfex3 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        // System.out.println("Default format: " + event);
        // System.out.println("Custom format: " + event.format(dtfex3));
        // ******************************************

        // Exercise #4 ******************************
		LocalDate startDate = LocalDate.of(2025, 9, 1);
        
        startDate.plusDays(10);
        System.out.println("Start date after trying to modify it: " + startDate);
    
        LocalDate endDate = startDate.plusDays(10);
        
        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);
        // ******************************************

        // Exercise #5 ******************************
		
        // ******************************************
	}
}