package com.after10years.blog.console.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TemplateInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerMethod hm = (HandlerMethod) handler;
        //以controller前缀作为模板文件夹名
        if ("".equals(modelAndView.getViewName()) || null == modelAndView.getViewName()){
            String controllerName = hm.getBeanType().getSimpleName().replace("Controller","").toLowerCase();
            //如果modelAndView对象里边没有viewName则以action名作为模板名
            String actionName = hm.getMethod().getName();
            modelAndView.setViewName(controllerName+"/"+actionName);
        }

        super.postHandle(request, response, handler, modelAndView);
    }
}
