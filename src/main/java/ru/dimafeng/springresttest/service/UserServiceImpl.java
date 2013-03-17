package ru.dimafeng.springresttest.service;

import org.springframework.stereotype.Service;
import ru.dimafeng.springresttest.model.User;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    Map<Long, User> users = new HashMap<Long, User>() {{
        put(1l, new User(1l, "test", "test"));
        put(2l, new User(2l, "admin", "admin"));
    }};

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public User addUser(User newUser) {
        long id = Collections.max(users.keySet()) + 1;
        newUser.setId(id);
        users.put(id, newUser);
        return newUser;
    }

}
