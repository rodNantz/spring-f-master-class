package com.rodtwo.udemy.spring.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		/*
			
		// Here, searching needs a sorted array. How is the sort algorithm implemented? 
		 
		// Using tight coupling - the sort implementation is defined inside the BinarySearch implementation:
		
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		System.out.println(
				binarySearch.badSearch(new int[]{2, 4, 8, 16}, 7)
				);
		
		 */
		
		
		/* 
		 * Using loose coupling - the sort implementation is defined inside the BinarySearch implementation:
		 */
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlg());	// only change here to choose sort implementation
		System.out.println(
				binarySearch.goodSearch(new int[]{2, 4, 8, 16}, 7)
				);
		
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}
