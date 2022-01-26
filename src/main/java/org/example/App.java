package org.example;

import org.example.dao.WorkerDaoImpl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static Scanner scanner=new Scanner(System.in);
    static int number;
    public static void main(String[] args) {

        WorkerDaoImpl dao = new WorkerDaoImpl();

        while (true){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("press --1--  to create a table and populate it");
            System.out.println("press --2--  to get all employees whose name is Aza and over 20 years old ");
            System.out.println("press --3-- to make the workers change to rise 12 from the names of Aza ");
            System.out.println("press --4-- to remove workers in  name is Azamat  ");
            System.out.println("press --5-- to drop the table ");

            number=scanner.nextInt();
            if (number == 1){
                dao.create();
                dao.saveUser("Kutubek", "Gaparov", (byte) 17);
                dao.saveUser("Asan", "Alijanov", (byte) 16);
                dao.saveUser("Aza", "Muratov", (byte) 18);
                dao.saveUser("Aza", "Mapaev", (byte) 28);
                dao.saveUser("Aza", "Asanov", (byte) 12);
                dao.saveUser("Aza", "Alisherov", (byte) 23);
                dao.saveUser("Maksat", "Azizov", (byte) 15);
                dao.saveUser("Aza", "Sulaymanov", (byte) 32);
            }else if(number==2){
                System.out.println(dao.getAllStudent());
            }else if(number==3){
                 dao.updateUser();
            }else if(number==4){
                dao.delateWorkerByName();
            }else if (number == 5){
                dao.delateUsersTable();
            } else {
                break;
            }

        }
    }
}
