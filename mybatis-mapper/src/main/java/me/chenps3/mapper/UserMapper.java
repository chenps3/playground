package me.chenps3.mapper;

import me.chenps3.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author chenguanhong
 * @Date 2021/12/17
 */
public interface UserMapper {

    @Select("select * from `user`")
    List<User> selectAll();
}
