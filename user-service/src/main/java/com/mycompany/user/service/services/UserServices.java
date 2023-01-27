package com.mycompany.user.service.services;

import com.mycompany.user.service.entities.Department;
import com.mycompany.user.service.entities.User;
import com.mycompany.user.service.repositories.UserRepository;
import com.mycompany.user.service.templates.TemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServices {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public TemplateVO findUserById(Long userId) {
        User user = userRepository.findUserByUserId(userId);

//        String url = "http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId();
        String url = "http://API-GATEWAY/departments/" + user.getDepartmentId();
        Department department = restTemplate.getForObject(url, Department.class);

        TemplateVO resp = new TemplateVO();

        resp.user = user;
        resp.department = department;

        return resp;
    }
}
