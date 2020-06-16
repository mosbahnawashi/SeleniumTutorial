package seleniumTutorial0;
public class Testme {

	public static int methodname(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int no1 = 9;
		int no2 = 1;

		int v = methodname(no1, no2);
		System.out.println(v);
	}
}