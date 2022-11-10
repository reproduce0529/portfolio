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
			System.out.println("�� ������ ���̸� ���ϴ� ���α׷��Դϴ�.");
			System.out.println("");
			System.out.println("ù��° ���� �Է��ϼ��� : ");
			v1 = scanner.nextInt();
			System.out.println("�ι�° ���� �Է��ϼ��� : ");
			v2 = scanner.nextInt();
			
		}
		
		public void compute() {
			interval = v1 - v2;
			if(interval < 0) {
				interval = interval * -1;
			}
		}
		
		public void showResult() {
			System.out.printf("�Է��Ͻ� �� ���� ���̴� %d�Դϴ�.", interval);
		}
		
		public void close() {
			scanner.close();
		}
	}

}
