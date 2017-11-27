import java.util.Scanner;

public class CountingThreadConsole {

	static public void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		scanner.nextLine(); // 아무 키를 입력
		scanner.close();
	}
}

class CountingThread implements Runnable {
	@Override
	public void run() { // 오버라이딩 된 run 메소드
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=10; i++) //1 부터 10까지 출력
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}
