package com.ssm.service;

import com.ssm.entity.User;

/**
 * �û�ҵ���ӿ�
 * @author ������
 * 20180815
 */
//Service��ӿ�
public interface UserService {

  //�����û���¼
  User checkLogin(String username,String password);

}
