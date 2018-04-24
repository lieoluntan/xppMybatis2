package com.cy.mybatis.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 树袋老师
 * 
 * @author 作者 xpp
 * @version 创建时间：2017-10-26 下午4:54:35 类说明 工具类， 用于从浏览器前台接收的json字符串数据处理成map或实体类
 */

public class T_DataControl {

  public String getRequestPayload(HttpServletRequest req) {

    StringBuilder sb = new StringBuilder();

    try {

      BufferedReader reader = req.getReader();

      char[] buff = new char[1024];

      int len;

      while ((len = reader.read(buff)) != -1) {

        sb.append(buff, 0, len);

      }

    } catch (IOException e) {

      e.printStackTrace();

    }

    System.out.println("传进control的json数据：" + sb.toString());
    return sb.toString();

  }// end method getRequestPayload 自己写的方法重构

  public Map<String, Object> JsonStrToMap(String jsonStr) {

    try {
      Map<String, Object> map = new Gson().fromJson(jsonStr,
          new TypeToken<HashMap<String, Object>>() {}.getType());

      return map;
    } catch (Exception e) {
      System.out.println("^^JsonStrToMap方法出现异常，请检查请求体的json字符串数据");
      return new HashMap();
    }
    

  }// end method JsonStrToMap 用于转化成单条对象

}// end class T_DataControl
