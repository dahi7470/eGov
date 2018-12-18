package exam.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class KakaoTalk implements App {
	@Override
	public void execute() {
		System.out.println("KakaoTalk execute!!");
	}
}
