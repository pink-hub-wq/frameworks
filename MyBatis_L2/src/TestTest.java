import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserMapperAnnotationService;
import com.edu.seiryo.service.UserMapperService;
import com.edu.seiryo.service.imp.UserMapperAnnotationServiceImp;
import com.edu.seiryo.service.imp.UserMapperServiceImp;

public class TestTest {
	public static void main(String[] args) {
		UserMapperService userMapperService = new UserMapperServiceImp();
		
//		int i = userMapperService.add(new User("小八", "123"));
//		System.out.println(i);
		List<User> list = userMapperService.query("desc");
		for (User user : list) {
			System.out.println(user);
		}
//		User user = userMapperService.queryById(2);
//		System.out.println(user);
//		int i = userMapperService.update("小八", "123");
//		System.out.println(i);
//		int i = userMapperService.delete(5);
//		System.out.println(i);
		UserMapperAnnotationService userMapperAnnotationService = new UserMapperAnnotationServiceImp();
		
//		int i = userMapperAnnotationService.add(new User("小九", "123"));
//		System.out.println(i);
//		List<User> list = userMapperAnnotationService.query("desc");
//		for (User user : list) {
//			System.out.println(user);
//		}
//		User user = userMapperAnnotationService.queryById(2);
//		System.out.println(user);
//		int i = userMapperAnnotationService.update("小九", "456");
//		System.out.println(i);
//		int i = userMapperAnnotationService.delete(7);
//		System.out.println(i);
	}
}
