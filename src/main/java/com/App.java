package com;

import java.util.Date;
import org.hibernate.Session;

public class App {
  public static void main(String[] args) throws InterruptedException {
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();

    session.getTransaction().commit();
    session.close();
  }
}