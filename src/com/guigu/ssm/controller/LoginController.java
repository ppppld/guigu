package com.guigu.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**       
 * <p>project_name:SpringMVCSpringMyBatis</p>
 * <p>package_name:com.guigu.ssm.controller.LoginController</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��20������3:26:49 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */
@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String login(HttpSession session,String username,String password) {
        //����UserService ������ݵ�У�� ....
        //User findUser=userService.findUserByUsernameAndPassoword(username,password);
        //..�����û��Ƿ����ִ����صĲ���... 
        //if(findUser!=null){ ....}
        //����û����� ���浽Session��������
        session.setAttribute("username", username);
        //�ض�����Ʒ��ѯ�б�ҳ��
        return "redirect:/items/queryItems.action";
        
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); //����session
        //�ض�����Ʒ��ѯ�б�ҳ��
        return "redirect:/items/queryItems.action";
        
    }
    
}


