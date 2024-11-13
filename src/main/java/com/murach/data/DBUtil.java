/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murach.data;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author DELL
 */
public class DBUtil {
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("useremailchapter13");


    public static EntityManagerFactory getEmFactory(){
        return emf;
    }
}
