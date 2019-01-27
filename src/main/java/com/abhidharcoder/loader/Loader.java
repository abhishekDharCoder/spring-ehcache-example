package com.abhidharcoder.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhidharcoder.model.Users;
import com.abhidharcoder.repository.UsersRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.save(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("abhi", "java",12L));
        usersList.add(new Users("dhar", "Tech",13L));
        return usersList;
    }
}
