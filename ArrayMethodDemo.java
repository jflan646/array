// introductory comment
public class ArrayMethodDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,};
		display(numbers);
		displayReverse(numbers);
		int sum = displaySum(numbers);
		displayLessThan(6,numbers);
		displayHigherThanAverage(sum, numbers);
	}

	private static void displayHigherThanAverage(int sum, int[] numbers) {
		double average = sum/numbers.length;
		for(int num : numbers) {
			if(num > average) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		
	}

	private static void displayLessThan (int i, int[] numbers) {
		for(int num : numbers) {
			if(num < i) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	private static int displaySum(int[] numbers) {
		int total = 0;
		for(int num : numbers) {
			total= total + num;
		}
		System.out.println("total "+total);
		return total;
	}

	private static void displayReverse(int[] numbers) {
		for(int i = numbers.length-1; i >=0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

	private static void display(int[] numbers) {
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
