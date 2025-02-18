package dao;

import hibernateUtil.HibernateUtil;
import models.Subject;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SubjectDaoImpl implements SubjectDao {

    @Override
    public void createdSubject(Subject subject) {
        Transaction tx1 = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.save(subject);
            tx1.commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Something went wrong. Can't creat model");
            e.printStackTrace();
            tx1.rollback();
        }
    }

    @Override
    public Subject readSubject(int id) {
        Transaction tx1 = null;
        Subject subject = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            subject = session.get(Subject.class, id);
            tx1.commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println( "Something went wrong. Cant get subject");
            e.printStackTrace();
            tx1.rollback();
        }
        return subject;
    }

    @Override
    public void updateSubject(Subject subject) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.update(subject);
            tx1.commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Something went wrong. Cant update subject");
            e.printStackTrace();
            tx1.rollback();
        }


    }

    @Override
    public List getAllSubject() {
        Transaction tx1 = null;
        List subjectList = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            subjectList = session.createQuery("from models.Subject").list();
            tx1.commit();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG, Can't get all models");
            tx1.rollback();
        }
        return  subjectList;
    }

    @Override
    public void deleteSubject(Subject subject) {
        Transaction tx1 = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession() ) {
            tx1 = session.beginTransaction();
            session.delete(subject);
            tx1.commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Something went wrong, Cant delete subject");
        }


    }
}
