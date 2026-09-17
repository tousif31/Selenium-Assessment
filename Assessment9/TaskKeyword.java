package Assessment9;

public class TaskKeyword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TaskExecutor e=new TaskExecutor();
		e.executor("LAUNCH_BROWSER");
		e.executor("OPEN_URL");
		e.executor("user_pass");
		e.executor("login");
		Thread.sleep(2000);
		e.executor("CLOSE_BROWSER");

	}

}
