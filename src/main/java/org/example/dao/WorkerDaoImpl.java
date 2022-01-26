package org.example.dao;

import org.example.model.Worker;
import org.example.util.HibernatiUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class WorkerDaoImpl implements WorkerDao {
    @Override
    public void create() {
        Worker worker = new Worker();
        Session session = HibernatiUtil.getSession().openSession();
        session.beginTransaction();

        session.save(worker);

        session.getTransaction().commit();
        session.close();
        System.out.println("The table was created" + worker);
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = HibernatiUtil.getSession().openSession();
        session.beginTransaction();

        Worker worker = new Worker(name, lastName, age);
        session.save(worker);

        session.getTransaction().commit();
        session.close();
        System.out.println("The table is completed");
    }

    @Override
    public List<Worker> getAllStudent() {
        Session session = HibernatiUtil.getSession().openSession();
        session.beginTransaction();
        List<Worker> workers = session.createQuery("from Worker where age > 20 and name like 'Aza'").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("-----1------\n The mentioned workers were taken: " + workers.size());
        return workers;
    }

    @Override
    public void updateUser() {
        Session session = HibernatiUtil.getSession().openSession();
        session.beginTransaction();


        int s= session.createQuery("update Worker set  age=18 where name = 'Aza'").executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("---------2---------"+s+"\nUpdate Done: ");
    }

    @Override
    public void delateWorkerByName() {
        Session session = HibernatiUtil.getSession().openSession();
        session.beginTransaction();

        Query query = session.createQuery("DELETE FROM Worker where name = 'Aza'");
        query.executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("---------3---------\nThe said Workers were removed");
    }

    @Override
    public void delateUsersTable() {
        try {
            Session session = HibernatiUtil.getSession().openSession();
            session.beginTransaction();

            session.createQuery("delete Worker ").executeUpdate();

            session.getTransaction().commit();
            session.close();
            System.out.println("delate done");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
