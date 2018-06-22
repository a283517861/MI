package com.zdx.service;

import com.zdx.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.13 22:58
 * @Modified
 */
@Service(value = "userService")
public interface UserService {

	int addUser(User user);

	List<User> findAllUser(int pageNum, int pageSize);
}
