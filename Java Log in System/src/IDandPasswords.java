import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		
		logininfo.put("admin", "password");
		logininfo.put("samuel", "123");
		logininfo.put("asd", "asd");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}

}
