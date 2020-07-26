package GenaricLab;

public class Deadlock {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static class  ThreadOne extends  Thread{
		public void run() {
			System.out.println("extends thred1");
			
			
		}
		
	}
	static class  ThreadTwo extends  Thread{
		
	}

}
