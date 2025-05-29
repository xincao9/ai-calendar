package fun.golinks.ai.calendar.service;

import fun.golinks.ai.calendar.entity.UserDO;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTests {

    @Resource
    private UserService userService;

    @Test
    public void testInsert() {
        String name = RandomStringUtils.secure().nextAlphanumeric(10);
        UserDO user = new UserDO();
        user.setName(name);
        user.setAge(18);
        user.setEmail(String.format("%s@golinks.fun", name));
        boolean r = userService.save(user);
        Assertions.assertTrue(r, "执行失败");
    }
}
