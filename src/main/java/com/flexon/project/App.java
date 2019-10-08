package com.flexon.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Please input the length of your array:");
		Scanner num = new Scanner(System.in);
		int length = num.nextInt();
		int[] array = new int[length];
		
		System.out.println("Please input the element of your array:");
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < length; i++) {
			array[i] = reader.nextInt();
		}
		
		//SortArray jay = new SortArray();
		//jay.getInteger(array);
		//jay.printArray(array);
		//jay.findMin(array);
		//jay.findMax(array);
		//jay.reverse(array);
		//jay.sortIntegers(array);
		// TODO Auto-generated method stub

	}
	public int getInteger(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public void printArray(int[] array) {
		System.out.println("The original array is:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		return;
	}
	
	public int findMin(int[] array) {
		Integer[] sortArray = sortIntegers(array);

		return sortArray[array.length - 1];
	}
	
	public int findMax(int[] array) {
		Integer[] sortArray = sortIntegers(array);

		return sortArray[0];
	}
	
	public int[] reverse(int[] array) {
		int[] copyArray = new int[array.length];
		for (int m = 0; m < array.length; m++) {
			copyArray[m] = array[m];
		}
		
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			swap(copyArray, i, j);
			i++;
			j--;
		}

		return copyArray;
	}
	
	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return;
		
	}
	
	public Integer[] sortIntegers(int[] array) {
		Integer[] sortArray = new Integer[array.length];
		for (int j = 0; j < array.length; j++) {
			sortArray[j] = array[j];
		}
		
		Arrays.sort(sortArray, Collections.reverseOrder());
		return sortArray;
	}
}

