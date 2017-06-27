package org.dongzhixiao.day08;

import java.util.HashMap;
import java.util.Map;

/**
 * �û�ҵ���߼���
 * @author Administrator
 *
 */
public class UserService {
    private Map<String,User> users = new HashMap<String,User>();
    /**
     * ��¼����
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        /**
         * �����û�������û�����ѯusers
         */
        User user = users.get(username);
        if(user == null){
            throw new RuntimeException("û�и��û���");
        }
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("�����������");
        }
        return user;
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.users.put("xiloer", new User("xiloer","1234"));
        service.users.put("Tom", new User("Tom","1234567"));
        service.users.put("Killer", new User("Killer","002255"));
        
        User user = service.login("ABC", "1234");
        System.out.println(user.getUsername()+"��¼�ɹ�");
    }
}
