package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;
/**
 * �û����Ʋ�
 * @author ������
 *20180815
 */
public interface UserDao {

	/**
     * �����û���������
     * @param username ��¼�û��� 
     * @param password ����
     * @return
     */
    User findByUsername(@Param("username")String username,@Param("password")String password);
}
