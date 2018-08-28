package com.rodtwo.udemy.spring.springin5steps;

public class BinarySearchImpl {
	
	public int badSearch(int[] collection, int num) {
		/* Sort implementation tightly coupled
		 */
		BubbleSortAlg sortAlg = new BubbleSortAlg();
		int[] sortedColl = sortAlg.sort(collection);
		
		// todo search logic
		
		return num;
	}
	
	/* 
	 * Structure above is coded to use BubbleSort algorithm. 
	 * And if we wanted to change implementation above, to use QuickSort?
	 */
	
	// create interface attribute + constructor
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm alg) {
		this.sortAlgorithm = alg;
	}
	
	public int goodSearch(int[] collection, int num) {
	
		/* Sort implementation using loose coupling
		 */
		int[] sortedColl = sortAlgorithm.sort(collection);
		
		// which implementation is being used?
		System.out.println(this.sortAlgorithm);
		
		// todo search logic
		
		return num;
	}
	
}
