package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户业务逻辑类
 * @author Administrator
 *
 */
public class UserService {
    private Map<String,User> users = new HashMap<String,User>();
    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        /**
         * 根据用户输入的用户名查询users
         */
        User user = users.get(username);
        if(user == null){
            throw new RuntimeException("没有该用户！");
        }
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("密码输入错误！");
        }
        return user;
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.users.put("xiloer", new User("xiloer","1234"));
        service.users.put("Tom", new User("Tom","1234567"));
        service.users.put("Killer", new User("Killer","002255"));
        
        User user = service.login("ABC", "1234");
        System.out.println(user.getUsername()+"登录成功");
    }
}
