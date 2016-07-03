/*
 * (C) Copyright 2016 Madan Kanth Lanka.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Madan Kanth Lanka
 */
package Intelematics.UnitTest.com;

import java.util.Scanner;
import MaxSum.Intelematics.com.*;
/**
 * @author lankamadan
 *
 */
public class TestApp {
	/*
	 * @brief input Takes input from stdin and 
	 * wraps into an Scanner object and provides convenience 
	 * methods for reading the input from console.
	 */
	static Scanner input;
	
	/*
	 * @brief inputString Uses Scanner provided @input object for 
	 * reading input from console into a String object.
	 * Assumption: Input is provided in the java console  in the following format
	 * Console input : 1, 2, 3, 4, 5, 1, 8.
	 */
	static String inputString;
	
	/*
	 * @brief inputStringArray Input String is tokenized using "," and 
	 * all the tokens are stored in this array. 
	 */
	static String [] inputStringArray;
	
	/*
	 * @brief inputIntArray All the values from the String Array are 
	 * converted to integer values and stored in this array. 
	 */
	static int [] inputIntArray;
	
	/*
	 * @brief finalIntArray All the values from the String Array are 
	 * converted to integer values and stored in this array. 
	 */
	static int [] finalIntArray;
	
	/*
	 * @brief inputLength The number of integers in the input is 
	 * stored inside this variable. 
	 */
	static int inputLength;
	
	/*
	 * @brief maxValue The maximum number from the integers in the input is 
	 * stored inside this variable. 
	 */
	static int maxValue;
	
	/*
	 * @brief HandleInput The function performs operations like read from 
	 * console and store the values in the respective data structures. 
	 */
	static void HandleInput ()
	{
		// Read from standard input and wrap into Scanner object.
		input = new Scanner (System.in);
		
		// Use Scanner provided wrapper apis for getting the bytes into the String object
		// Assumption: Input is provided in the java console  in the following format
		// 1, 2, 3, 4, 5, 1, 8.
		inputString = input.nextLine();
		
		// Tokenise the Strings into String Array by using "," delimiter.
		inputStringArray = inputString.split(",");
		
		// Calculate the number of the integers provided in the input using the 
		// length of the String tokenized array.
		inputLength = inputStringArray.length;
		System.out.println("Number of integers in the input are : "+inputLength);

		// Create an integer array with size equal to number of integers provided in
		// the input.
		inputIntArray = new int [inputLength];

		maxValue = 0;
		// Iterate and store the input values in integer array.
		// Also find the maximum value in the input integers.
		for (int i = 0; i < inputLength; i++)
		{
			inputIntArray[i] = Integer.parseInt(inputStringArray[i].trim());
			System.out.println("Array["+i+"] :"+inputIntArray[i]);
			if(inputIntArray[i] > maxValue)
			{
				maxValue = inputIntArray[i];
			}
		}
	}
	
	/*
	 * @brief TestFunctionToBeInvoked performs following operations
	 * 1. Taking input from the console
	 * 2. Performing sum of the maximum repeating number in the integer array.
	 * 
	 * This function can be invoked any number of times by the user to provide inputs
	 * and find the result.
	 */
	static int TestFunctionToBeInvoked ()
	{
		System.out.println("Please provide the integers in the console below");
		HandleInput();
		finalIntArray = new int [maxValue+1];

		MaxRepeatedSum maxRepeatingSumObject  = new MaxRepeatedSum();
		return maxRepeatingSumObject.MaxRepeatingSum(inputIntArray, finalIntArray, maxValue+1);
	}

	/**
	 * The entry point to the application.
	 * @param args
	 */
	public static void main(String[] args) {

		int indexOfMaxValue;

		// The while loop with true ideally should not be used.
		// This is used only to make sure that console application can be used for multiple
		// number of iterations.
		while (true)
		{
			//Test the functionality
			indexOfMaxValue = TestFunctionToBeInvoked();
	
			//Computation of the result using the index and the values of finalIntArray.
			int Answer = finalIntArray[indexOfMaxValue]*indexOfMaxValue;
			System.out.println("Repeated value sum : "+Answer);
		}
	}
}
