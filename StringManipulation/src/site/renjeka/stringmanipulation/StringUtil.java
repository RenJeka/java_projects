package site.renjeka.stringmanipulation;

import java.util.Arrays;
import java.util.Scanner;


public class StringUtil {

	public static void main(String[] args) {
		// ������ ��� ����� ������  (����� ���������������� ������ ���������� "String myString")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���-������");
		String myString = scanner.nextLine();
		System.out.println("�� ����� " +  myString);
		scanner.close();
		
		// ------------------------------------------------------
//		String myString = "some other loooong text!";
		String[] words = myString.split(" ");
		System.out.println("���������� ���� � ������: " + words.length);
		
		// ������ �����
		System.out.println("����� �� ������� [0]: " + words[0]);
		char[] letters1 = words[0].toCharArray();
		System.out.println("���������� �������� � ����� �� ������� [0]: " + letters1.length);
		
		// ������ �����
		System.out.println("����� �� ������� [1]: " + words[1]);
		char[] letters2 = words[1].toCharArray();
		System.out.println("���������� �������� � ����� �� ������� [1]: " + letters2.length);
		
		// ��������� ������
//		String[] wordsForLetters = myString.split(" ");
//		System.out.println(Arrays.toString(wordsForLetters));
//		char[][] myChars = new char[10][];
//		myChars[0] = wordsForLetters[0].toCharArray();
//		myChars[1] = wordsForLetters[1].toCharArray();
//		myChars[2] = wordsForLetters[2].toCharArray();
//		System.out.println(Arrays.deepToString(myChars));
		
		// ������ � ������� �������
		System.out.println("---------------------------------------------");
		System.out.println("������ ������ ���� � ������� �������: \n");
		for (int i = 0; i < words.length; i++) {
			System.out.println("����� �� ������� [" + i + "]: "+ words[i]);
		}
	}

}
