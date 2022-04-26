package top.liubaiblog.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.liubaiblog.mapper.UserMapper;
import top.liubaiblog.pojo.User;
import top.liubaiblog.service.UserService;

import java.util.List;

/**
 * @author 刘佳俊
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> list() {
        PageHelper.startPage(1, 2);
        return userMapper.selectAll();
    }
}
