package springLogin.app.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import springLogin.app.model.User;

public interface UserDao {


    // Userテーブルの全データを取得.
    public List<User> selectMany() throws DataAccessException;



}
