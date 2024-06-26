package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoHibernateImpl = new UserDaoHibernateImpl();

    public UserDao getUserDaoHibernateImpl() {
        return userDaoHibernateImpl;
    }

    public void setUserDaoHibernateImpl(UserDao userDaoHibernateImpl) {
        this.userDaoHibernateImpl = userDaoHibernateImpl;
    }

    public void createUsersTable() {
        userDaoHibernateImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernateImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernateImpl.saveUser(name,lastName,age);
        System.out.println("User с именем — " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoHibernateImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoHibernateImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernateImpl.cleanUsersTable();
    }
}
