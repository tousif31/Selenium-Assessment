package Assessment9;

public class TaskExecutor {
	
	Task1implementation t=new Task1implementation();
	
	public void executor(String keyword) {
		if(keyword.equals("LAUNCH_BROWSER")) {
			t.lanchBrowser();
		}
		else if(keyword.equals("OPEN_URL")) {
			t.OpenUrl();
		}
		else if(keyword.equals("user_pass")){
			t.userpass();
		}
		else if(keyword.equals("login")) {
			t.login();
		}
		else if(keyword.equals("CLOSE_BROWSER")) {
			t.closeBrowser();
		}
	}
	
}
