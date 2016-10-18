import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Напишете програма, която създава масив с 10 елемента от целочислен
		// тип и
		// инициализира елементите със стойност индекса умножен по 10.

		int massive[] = new int[10];

		for (int i =0; i < massive.length; i++) {
			massive[i] = i * 10;
		}
		System.out.println(Arrays.toString(massive));
	}

}
