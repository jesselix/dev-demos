package li.jesse.javadevintegration.dao;

import li.jesse.javadevintegration.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User queryByUserId(Long userId);

    int checkUserName(String userName);
}
