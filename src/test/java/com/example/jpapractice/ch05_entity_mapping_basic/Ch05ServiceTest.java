package com.example.jpapractice.ch05_entity_mapping_basic;

import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestConstructor;


@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
<<<<<<<< HEAD:src/test/java/com/example/jpapractice/ch05_entity_mapping_basic/Ch05ServiceTest.java
class Ch05ServiceTest {
    private Ch05Service ch05ServiceClass;
========
class Ch04ServiceTest {
    private Ch04Service ch04ServiceClass;
>>>>>>>> d680acf0008fe977ce602bfddeb1ff9f116c20ad:src/test/java/com/example/jpapractice/ch04_entity_mapping/Ch04ServiceTest.java

    @Autowired
    EntityManagerFactory emf;

    @BeforeEach
    public void setUp(){
<<<<<<<< HEAD:src/test/java/com/example/jpapractice/ch05_entity_mapping_basic/Ch05ServiceTest.java
        ch05ServiceClass = new Ch05Service(emf);
    }
    @Test
    public void transactionRunTest(){
        ch05ServiceClass.transactionRunTest();
========
        ch04ServiceClass = new Ch04Service(emf);
    }
    @Test
    public void transactionRunTest(){
        ch04ServiceClass.transactionRunTest();
>>>>>>>> d680acf0008fe977ce602bfddeb1ff9f116c20ad:src/test/java/com/example/jpapractice/ch04_entity_mapping/Ch04ServiceTest.java
    }
}