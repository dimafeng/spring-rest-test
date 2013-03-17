package ru.dimafeng.springresttest.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dimafeng.springresttest.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
}
