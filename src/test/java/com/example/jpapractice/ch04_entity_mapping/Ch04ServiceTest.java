package com.example.jpapractice.ch04_entity_mapping;

import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;

@ActiveProfiles(profiles = "test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class Ch04ServiceTest {
    private Ch04Service ch04ServiceClass;

    @Autowired
    EntityManagerFactory emf;

    @BeforeEach
    public void setUp(){
        ch04ServiceClass = new Ch04Service(emf);
    }
    @Test
    public void transactionRunTest(){
        ch04ServiceClass.transactionRunTest();
    }
}