package com.nag.linearsearch;

public class LinearSearch {

	/**
	 * It will search the given element in the list and return position if found , -1 otherwise.
	 * @param elementToBeSearched
	 * @return
	 */
	public int linearSearch(int[] array,int elementToBeSearched) {
		for(int i=0;i<array.length;i++) {
			if(elementToBeSearched == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
