package out_of_memory;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Random;

public class Main {
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private LinkedList<Cake> listCake = new LinkedList<>();

	public static String generate(int length) {
		Random random = new SecureRandom();
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			builder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
		}
		return builder.toString();
	}

	public void createCake() {
		Cake cake;
		String nameCake;
		Random random = new SecureRandom();
		nameCake =  Main.generate(random.nextInt(25));
		cake = new Cake(nameCake);
		listCake.add(cake);
	}

	public static void main(String[] args) {
		while (true) {
			Main main = new Main();
			main.createCake();
		}

//		String str = "A";
//		LinkedList<String> linkedList = new LinkedList<String>();
//		while (true) {
//			str = str + "A";
//			linkedList.add(str);
//			System.out.println(linkedList);
//		}
	}

}
