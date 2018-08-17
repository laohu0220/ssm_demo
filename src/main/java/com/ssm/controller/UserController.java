package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssm.entity.User;
import com.ssm.service.UserService;

/**
 * �û����Ʋ�
 * @author ������
 * 20180815
 */
@Controller
@SessionAttributes("user")
public class UserController {
	 @Autowired
	    private UserService userServivce;
	 //���ύ������·��
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
        //����service����
    	System.out.println("�����û����Ʋ���"+user.getUser_name());
        user = userServivce.checkLogin(user.getUser_name(), user.getUser_pass());
        //����user����ӵ�model�ﲢ����ת���ɹ�ҳ��
        System.out.println("�û�"+user);
        if(user!= null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }
}
