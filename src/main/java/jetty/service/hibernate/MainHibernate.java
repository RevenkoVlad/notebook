package jetty.service.hibernate;


import jetty.service.hibernate.datasets.UsersDataSet;
import jetty.service.jdbc.DBException;

public class MainHibernate {

        public static void main(String[] args) {
            HDBService dbService = new HDBService();
            dbService.printConnectInfo();

            try {
                long userId = dbService.addUser("tully");
                System.out.println("Added user id: " + userId);

                UsersDataSet dataSet = dbService.getUser(userId);
                System.out.println("User data set: " + dataSet);

            } catch (DBException e) {
                e.printStackTrace();
            }
        }
    }