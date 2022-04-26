package top.liubaiblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.liubaiblog.mapper.UserMapper;
import top.liubaiblog.pojo.User;

import java.util.List;

/**
 * @author 刘佳俊
 */
public interface UserService {

    User getById(long id);

    List<User> list();

}
