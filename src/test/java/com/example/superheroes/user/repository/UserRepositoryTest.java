package com.example.superheroes.user.repository;

import com.example.superheroes.user.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    public void itShouldCheckWhenUserEmailExists(){
        String email = "samolonzy19@gmail.com";

        UserEntity user = new UserEntity(email,"23345678910");
        underTest.save(user);

        boolean expected = underTest.existsByEmail(email);

        assertThat(expected).isTrue();
    }

    @Test
    public void itShouldFindUserWhenEmailExits(){
        String email = "dennis@gmail.com";

        UserEntity user = new UserEntity(email,"23324419419");
        underTest.save(user);

        UserEntity expected = underTest.findByEmail(email);

        assertThat(expected).isEqualTo(user);

    }
}
