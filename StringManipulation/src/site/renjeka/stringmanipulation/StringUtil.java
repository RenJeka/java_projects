package site.renjeka.stringmanipulation;

import java.util.Arrays;
import java.util.Scanner;


public class StringUtil {

	public static void main(String[] args) {
		// Логика для ввода текста  (нужно закомментировать второе объявление "String myString")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите что-нибудь");
		String myString = scanner.nextLine();
		System.out.println("Вы ввели " +  myString);
		scanner.close();
		
		// ------------------------------------------------------
//		String myString = "some other loooong text!";
		String[] words = myString.split(" ");
		System.out.println("Количество слов в тексте: " + words.length);
		
		// Первое слово
		System.out.println("Слово по индексу [0]: " + words[0]);
		char[] letters1 = words[0].toCharArray();
		System.out.println("Количество символов в слове по индексу [0]: " + letters1.length);
		
		// Второе слово
		System.out.println("Слово по индексу [1]: " + words[1]);
		char[] letters2 = words[1].toCharArray();
		System.out.println("Количество символов в слове по индексу [1]: " + letters2.length);
		
		// Двумерный массив
//		String[] wordsForLetters = myString.split(" ");
//		System.out.println(Arrays.toString(wordsForLetters));
//		char[][] myChars = new char[10][];
//		myChars[0] = wordsForLetters[0].toCharArray();
//		myChars[1] = wordsForLetters[1].toCharArray();
//		myChars[2] = wordsForLetters[2].toCharArray();
//		System.out.println(Arrays.deepToString(myChars));
		
		// Логика с помощью массива
		System.out.println("---------------------------------------------");
		System.out.println("Логика вывода слов с помощью массива: \n");
		for (int i = 0; i < words.length; i++) {
			System.out.println("Слово по индексу [" + i + "]: "+ words[i]);
		}
	}

}
