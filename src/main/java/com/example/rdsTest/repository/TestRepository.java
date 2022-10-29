package com.example.rdsTest.repository;

import com.example.rdsTest.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TestRepository {
    @PersistenceContext
    private EntityManager em;
    public User createUser(String name){
        User user = new User();
        user.setName(name);
        em.persist(user);
        return em.find(User.class,user.getId());
    }
}
