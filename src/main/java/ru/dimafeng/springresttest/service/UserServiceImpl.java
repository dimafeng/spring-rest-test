package ru.dimafeng.springresttest.service;

import org.springframework.stereotype.Service;
import ru.dimafeng.springresttest.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<Long, User> user = new HashMap<Long, User>() {{
        put(1l, new User(1l, "test", "test"));
        put(2l, new User(2l, "admin", "admin"));
    }};

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(user.values());
    }
}
