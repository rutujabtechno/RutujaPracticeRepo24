package OopsPractice;

public class class1 {
	
	void printNumber(int startRange ,int endRange ) {
		for(int i = startRange; i <= endRange; i++) {
			if(i%5 == 0 && i%3 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		class1 a = new class1();
		a.printNumber(5,40);
    }
}
