package com.example.jpapractice.ch05_entity_mapping_basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Ch05Service {
    private final EntityManagerFactory emf;

    public void transactionRunTest() {
        //엔티티 매니저 팩토리 생성
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성
        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득
        try {
            tx.begin(); //트랜잭션 시작
            //TODO 비즈니스 로직
            tx.commit();//트랜잭션 커밋

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }
    }
}
