package javaclass;
import java.util.Scanner;
public class CountInterval {

	public static void main(String[] args) {
		
		countInterval ci = new countInterval();
		
		ci.prepare();
		ci.inputValues();
		ci.compute();
		ci.showResult();
		ci.close();
		
		
	}
	
	public static class countInterval {
		
		private Scanner scanner;
		private int v1;
		private int v2;
		private int interval;
		
		
		public void prepare() {
			this.scanner = new Scanner(System.in);
		}
		
		
		public void inputValues() {
			System.out.println("두 정수의 차이를 구하는 프로그램입니다.");
			System.out.println("");
			System.out.println("첫번째 수를 입력하세요 : ");
			v1 = scanner.nextInt();
			System.out.println("두번째 수를 입력하세요 : ");
			v2 = scanner.nextInt();
			
		}
		
		public void compute() {
			interval = v1 - v2;
			if(interval < 0) {
				interval = interval * -1;
			}
		}
		
		public void showResult() {
			System.out.printf("입력하신 두 수의 차이는 %d입니다.", interval);
		}
		
		public void close() {
			scanner.close();
		}
	}

}
