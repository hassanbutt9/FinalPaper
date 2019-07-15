
public class CalClass {
	/**
	 * @author sp16-bse-036
	 * @para num1 is an integer value
	 *@para num2 is an integer value
	 * @para num2 is an integer value
	 * @return will give max value 
	 */
	
		public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
		/**
		 * @author sp16-bse-036
		 * @para num will b integer will
		 * @return square of a number
		 *
		 */
		public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
		/**
		 * @author sp16-bse-036
		 * @para num will b integer will
		 * @return cube of a number
		 *
		 */
		public int cube(int num) {
			return num*num*num;
		}
		
}
