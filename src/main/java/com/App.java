package com;

import java.util.Date;
import java.util.Iterator;

import org.hibernate.Session;

public class App {
  public static void main(String[] args) throws InterruptedException {
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();
    Iterator<Patient> iter = session.createQuery("FROM Patient").iterate();
    while(iter.hasNext())   {
      System.out.println(iter.next());
    }
    session.getTransaction().commit();
    session.close();
  }
}