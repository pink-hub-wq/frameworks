import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void query() {
        List<User> users = userService.queryAllUser();
        System.out.println(users);
    }
    @Test
    public void add() {
    	User user = new User(10, "1010", "1010");
    	userService.add(user);
    }
    @Test
    public void deleteById() {
         userService.deleteById(5);
    }
    @Test
    public void update() {
    	User user = new User(7, "666", "666");
        userService.update(user);
    }
    @Test
    public void queryByName() {
        List<User> list = userService.queryByName("222");
        System.out.println(list);
    }
}
