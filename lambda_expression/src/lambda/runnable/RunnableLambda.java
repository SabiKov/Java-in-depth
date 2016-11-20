package lambda.runnable;

public class RunnableLambda implements Runnable {

	Runnable close = () -> System.exit(0);
	
	@Override
	public void run() {
		System.out.println("Hello world");
		
	}
	
	
	public static void main(String[] args) {
		
		//Before Java 8 
		Runnable r = new RunnableLambda();
		
		r.run();
		
		//Lambda way
		Runnable r2 = () -> System.out.println("Hello world (lambda way)");
		r2.run();
		
		
		RunnableLambda run = new RunnableLambda();
		System.out.println("exiting... ");
		run.close.run();
	}


}
