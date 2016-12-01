/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.TbFkUserRole;
import com.javaweb.model.TbUsers;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author CuongNP
 * @since 28/11/2016
 */
public class UserServices {
    public static boolean InsertOrUpdate(TbUsers user){
        
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Transaction tx = null;
        
        try {
            tx = session.getTransaction();
            tx.begin();
            
            session.saveOrUpdate(user);
            tx.commit();            
            
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
                
            }else{
                System.out.println("ERRORMSG: " + e.getMessage());
            }
            return false;
        }finally{
            session.close();
        }
        return true;
    }
    
    public static boolean CheckLogin(String loginInfo, String pwd) {
        
        TbUsers user = GetUserByEmailOrUserid(loginInfo);
        
        if (user != null) {
            if(user.getPassword().equals(pwd)){
                return true;
            }else
            {
                return false;
            }
        } else {
            return false;
        }

    }
    
    public static TbUsers GetUserByEmailOrUserid(String strInput) {
        TbUsers user = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            tx = session.getTransaction();
            tx.begin();
            String str = "from  TbUsers where email = '" + strInput + "' or username='" + strInput + "'";
            Query query = session.createQuery(str);
            user = (TbUsers) query.uniqueResult();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

        return user;
    }
    
    public static int GetUserRole(int userID) {
        TbFkUserRole userrole = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            tx = session.getTransaction();
            tx.begin();
            String str = "from  TbFkUserRole where userid = " + userID ;
            Query query = session.createQuery(str);
            userrole = (TbFkUserRole) query.uniqueResult();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

        return userrole.getRoleid();
    }
    
    
}
