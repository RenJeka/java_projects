package site.renjeka.helloworld;

public class HelloWorld {

	public static void main(String[] args) {

		double i = 6;
		double j = 7;
		double answer = i / j;
		
		String stringAnswer;
		String message1 = "Hello world!";
		
		boolean isMoreThanOne;

		stringAnswer = message1 + " " + answer;
		
//		isMoreThanOne = answer > 1 ? true : false;

		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		System.out.println(message1);

		System.out.println(i);

		System.out.println(answer);
		
		System.out.println(stringAnswer + " " + isMoreThanOne);
		

	}

}
