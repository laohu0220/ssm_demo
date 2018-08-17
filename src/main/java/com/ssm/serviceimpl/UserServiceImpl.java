package com.ssm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;

/**
 * �û�ҵ���
 * @author ������
 *20180815
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    /* 
     * �����û���¼ҵ��
     * 
     */
    public User checkLogin(String username, String password){

        User user = userDao.findByUsername(username,password);
        if(user != null){
         
           return user;
        }
        return null;
    }
}
