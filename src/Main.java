import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// �������� ��������, ����� ������� ����� � 10 �������� �� ����������
		// ��� �
		// ������������ ���������� ��� �������� ������� ������� �� 10.

		int massive[] = new int[10];

		for (int i =0; i < massive.length; i++) {
			massive[i] = i * 10;
		}
		System.out.println(Arrays.toString(massive));
	}

}
