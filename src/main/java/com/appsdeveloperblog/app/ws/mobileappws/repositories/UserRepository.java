package com.appsdeveloperblog.app.ws.mobileappws.repositories;

import com.appsdeveloperblog.app.ws.mobileappws.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
