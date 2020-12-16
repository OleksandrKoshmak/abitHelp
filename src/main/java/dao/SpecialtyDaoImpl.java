package dao;

import hibernateUtil.HibernateUtil;
import models.Specialty;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SpecialtyDaoImpl implements SpecialtyDao {

    @Override
    public void createdSpecialty(Specialty specialty) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.save(specialty);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG. Can't creat model!");
            e.printStackTrace();
            tx1.rollback();
        }
    }

    @Override
    public Specialty readSpecialty(int id) {
        Transaction tx1 = null;
        Specialty specialty = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            specialty = session.get(Specialty.class, id);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG! Can't get model");
            e.printStackTrace();
            tx1.rollback();
        }

        return specialty;
    }

    @Override
    public void updateSpecialty(Specialty specialty) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.update(specialty);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG. Can't update model!");
            e.printStackTrace();
            tx1.rollback();
        }
    }

    @Override
    public List getlAllSpecialty() {
        List specialtyList = null;
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            specialtyList = session.createQuery("From models.Specialty").list();
            tx1.commit();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG, Can't get all models");
            tx1.rollback();
        }
        return  specialtyList;
    }

    @Override
    public void deleteSpecialty(Specialty specialty) {
        Transaction tx1 = null;
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            tx1 = session.beginTransaction();
            session.update(specialty);
            tx1.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG. Can't delete model!");
            e.printStackTrace();
            tx1.rollback();
        }



    }
}
