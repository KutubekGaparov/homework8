package org.example;

import org.example.dao.WorkerDaoImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        WorkerDaoImpl dao = new WorkerDaoImpl();

        dao.create();

        dao.saveUser("Kutubek", "Gaparov", (byte) 17);
        dao.saveUser("Asan", "Alijanov", (byte) 16);
        dao.saveUser("Aza", "Muratov", (byte) 18);
        dao.saveUser("Aza", "Mapaev", (byte) 28);
        dao.saveUser("Aza", "Asanov", (byte) 12);
        dao.saveUser("Aza", "Alisherov", (byte) 23);
        dao.saveUser("Maksat", "Azizov", (byte) 15);
        dao.saveUser("Aza", "Sulaymanov", (byte) 32);

        System.out.println(dao.getAllStudent());

        dao.updateUser();

        dao.delateWorkerByName();

    }
}
