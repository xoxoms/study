package com.study.entity;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created by ms on 2018. 1. 21..
 */
public class MemberTest {
    private EntityManagerFactory emf;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("jpa");
    }

    @Test
    public void testFind() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Member member =  em.find(Member.class, 1L);
            System.out.println(member.toString());
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
    }
}