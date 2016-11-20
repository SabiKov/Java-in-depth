package lambda.thread;

public class ThreadLambda {

	public static void main(String[] args) {
		
		//Before Java 7
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread ran the old way...");
				
			}
		}).start();
		
		//new Lambda way
		new Thread(() -> System.out.println("Thread ran the new way...")).start();
	}
}
