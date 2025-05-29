package fun.golinks.ai.calendar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.golinks.ai.calendar.entity.UserDO;
import fun.golinks.ai.calendar.mapper.UserMapper;
import fun.golinks.ai.calendar.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
}
