package org.example.dao;

import org.example.model.Worker;

import java.util.List;

public interface WorkerDao {

    void create();

    void saveUser(String name, String lastName, byte age);

    List<Worker> getAllStudent();

    void updateUser();

    void delateWorkerByName();
}
