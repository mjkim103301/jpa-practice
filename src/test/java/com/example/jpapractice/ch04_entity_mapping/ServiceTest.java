package com.example.jpapractice.ch04_entity_mapping;

import com.example.jpapractice.ch04_entity_mapping.Service;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestConstructor;

import static org.mockito.Mockito.mock;

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class ServiceTest {
    private Service serviceClass;

    @Autowired
    EntityManagerFactory emf;

    @BeforeEach
    public void setUp(){
        serviceClass = new Service(emf);
    }
    @Test
    public void transactionRunTest(){
        serviceClass.transactionRunTest();
    }
}