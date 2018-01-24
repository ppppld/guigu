package com.guigu.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**       
 * <p>project_name:SpringMVCSpringMyBatis</p>
 * <p>package_name:com.guigu.ssm.interceptor.HandlerInterceptor1</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��20������3:10:07 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class HandlerInterceptor1 implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        /**
         * ����Handler����֮ǰִ�� ����˵Controllerִ��֮ǰ�ȵ��ô˷���
         * ���������֤�������Ȩ��Ȩ������
         */
        System.out.println("Handler......preHandler1...");
        return true;
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        /**
         * controller����ִ�� ����δ���ؽ��֮ǰ ���ô˷���
         * ����һ�������ڰѹ���ģ�����ݱ���˵������� �����ﴫ�ݵ���ͼȻ�������ʾ
         */
        System.out.println("information..... post ..over11");
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        /**
         * ��Controllerִ�з��غ�  ���ô˷��� 
         *  ���� ͳһ���쳣���� ͳһ����־����������Դ��
         */
        System.out.println("HandlerInterceptor1...afterCompletion");
    }
    
}


