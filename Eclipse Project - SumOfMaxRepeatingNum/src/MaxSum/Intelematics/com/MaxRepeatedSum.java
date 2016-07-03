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
package MaxSum.Intelematics.com;

/**
 * @author lankamadan
 *
 */
public class MaxRepeatedSum {
	/**
	 * @brief Function finds the maximum repeating number from the 
	 * input integers provided.
	 *
	 */
	public int MaxRepeatingSum (int [] inputIntArray, int [] finalIntArray, int maxValue)
	{
		// Iterate though input array, for every element
		// inputIntArray[i], increment inputIntArray[inputIntArray[i]%maxValue] by 1
		for (int i = 0; i< inputIntArray.length; i++)
		{
			finalIntArray[(inputIntArray[i]%maxValue)] += 1;
		}

		// Find index of the maximum repeating element
		int max = 0, result = 0;
		for (int i = 1; i < finalIntArray.length; i++)
		{
			if (finalIntArray[i] > max)
			{
				max = finalIntArray[i];
				result = i;
			}
		}

		// Return index of the maximum element
		return result;
	}
}
