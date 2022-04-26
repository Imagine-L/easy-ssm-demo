package top.liubaiblog.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.liubaiblog.pojo.User;

import java.util.List;

/**
 * @author 刘佳俊
 */
public interface UserMapper {

    User selectById(@Param("id") long id);

    @Select("select * from user")
    List<User> selectAll();

}
