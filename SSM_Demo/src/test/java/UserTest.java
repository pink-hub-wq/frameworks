import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		UserService userService = (UserService) applicationContext.getBean("userServiceImp");
		List<User> list = userService.queryAllUser();
		System.out.println(list);
	}
}
