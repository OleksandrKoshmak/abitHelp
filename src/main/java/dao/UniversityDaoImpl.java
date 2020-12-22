package dao;

import hibernateUtil.HibernateUtil;
import models.University;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UniversityDaoImpl implements UniversityDao {


    @Override
    public void createdUniversity(University university) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.save(university);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG. Can't creat model!");
            e.printStackTrace();
            tx1.rollback();
        }

    }

    @Override
    public University readUniversity(int id) {
        Transaction tx1 = null;
        University university = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            university = session.get(University.class, id);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG! Can't get model");
            e.printStackTrace();
            tx1.rollback();
        }

        return university;
    }

    @Override
    public void updateUniversity(University university) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.update(university);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG! Can't update model");
            e.printStackTrace();
            tx1.rollback();
        }

    }

    @Override
    public List getAllUniversity() {
        List universityList = null;
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            universityList = session.createQuery("From models.University").list();
            tx1.commit();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG, Can't get all models");
            tx1.rollback();
        }
        return universityList;
    }

    public UniversityDaoImpl() {
    }

    @Override
    public void deleteUniversity(University university) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.delete(university);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG! Can't delete model");
            e.printStackTrace();
            tx1.rollback();
        }


    }
}
