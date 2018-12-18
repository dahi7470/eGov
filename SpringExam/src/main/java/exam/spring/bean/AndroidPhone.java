package exam.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AndroidPhone {
	 
	 @Autowired
	 @Qualifier("instagram")
	 private App app;
	 
	 @Autowired
	 @Qualifier("ap1")
	 private String name;
	 
	 @Autowired
	 @Qualifier("ap2")
	 private String name2;

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AndroidPhone(App app, String name) {
		super();
		this.app = app;
		this.name = name;
	}
	
	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

	public AndroidPhone(){
		
	}
	
	public void run() {
	 System.out.println(name);
	 System.out.println(name2);
	 app.execute();
	 }
}