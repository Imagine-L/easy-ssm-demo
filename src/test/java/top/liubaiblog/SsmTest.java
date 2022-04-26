package top.liubaiblog;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.liubaiblog.pojo.User;
import top.liubaiblog.service.UserService;

/**
 * @author 刘佳俊
 */
@SpringJUnitConfig(locations = "classpath:application.xml")
public class SsmTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        // 1. 加载Spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//
//        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
//        User user = userService.getById(1);
//        System.out.println(user);

    }

}
