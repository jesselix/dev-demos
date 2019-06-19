package li.jesse.javadevintegration.service.impl;

import li.jesse.javadevintegration.dao.UserDao;
import li.jesse.javadevintegration.pojo.User;
import li.jesse.javadevintegration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void getInformation(Long userId) {
        User user = userDao.queryByUserId(userId);
        System.out.println(user.getUserName());
    }
}
