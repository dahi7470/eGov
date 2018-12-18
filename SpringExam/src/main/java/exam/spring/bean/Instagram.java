package exam.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Instagram implements App {
	@Override
	public void execute() {
		System.out.println("Instagram execute!!");
	}
}