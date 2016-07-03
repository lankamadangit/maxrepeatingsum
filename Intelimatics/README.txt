High level flow of the application 
1) The application starts execution with the invocation of "main" function.
2) Input for the application should be provided from the console using standard console input
3) The application is implemented using Approach 1 which is optimized for time but not optimized for space


Alogorith explanation
Approach 1 (Implemented in Java)
1) The Pseudo code is explained in simple steps below
	
	a) Create an int [] with size of array equal to max value in the input sequence
		Complexity of step a : O (1)
	b) Iterate though input array inputArray, for every element inputArray[i], increment the element in the duplicated array finalArray[inputArray[i]%k] by 1.
		- Step b performs 2 things in one step. Firstly a number identified is inserted into the proper index of finalArray and increment the value by 1 each time the value is encountered. 
		Complexity of step b : O (n)
	c) Find the index holding the maximum value in the final array by iterating through the array. Index of the maximum value is the maximum repeating element (index of 29 is 3).
		Complexity of step c : O (n)
	d) Finally the index holding maximum repeated value is the maximum number and the number of repititions are captured by taking the value at the identified index.
		Complexity of step d : O (1)
		
	Final complexity = O(1) + O(n) + O(n) + O(1) = 2*O(n) + 2*O(1) = Worst case complexity is O(n)
2) The worst case time complexity of Approach 1 is O (n)
	The worst case space complexity of Approach 1 is O (2)


Approach 2 (Not implemented)
1) The Pseudo code is explained in simple steps below

	a) Create an int[] with size of array equal to the number of input elements provided which is of size n
		Complexity of step a : O(1)
	b) Iterate from i equals 1 to n in an outer for loop and pick an element from the array during each iteration
		Complexity of step b : O(n)
	c) Run an inner for loop to iterate over all the array elements and use the element picked in step b to find the number of times an element is repeated
		Complexity of step c : O(n)
	d) Store the number and number of times a number is repeated. 
		Complexity of step d : O(1)
	e) At the end of each inner loop iterations are completed and just before next outer for loop iteration, check if the repitition of the current number is greater than the previously stored numbers repition count. If it is greater, replace the maximum value and repitition count with the current number and the repitition count.
		Complexity of step a : O(1)
	f) Finally the multiplication of the number and the repition count provides the answer.
		Complexity of step a : O(1)
		
	Final complexity = O(1) + O(n) * O(n) * O(1) * O(1) + O(1) = O(n power 2) + 2*O(1) = Worst case complexity is O(n power 2)
2) The worst case time complexity of Approach 2 is O (n power 2)
	The worst case space complexity of Approach 2 is O (1)
	