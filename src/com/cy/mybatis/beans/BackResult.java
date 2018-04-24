package com.cy.mybatis.beans;

import java.util.ArrayList;

/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2017-10-13 下午7:42:55
 * 类说明
 */

public class BackResult {
  
  String message;
  String qingqiu;
  public String getQingqiu() {
    return qingqiu;
  }

  public void setQingqiu(String qingqiu) {
    this.qingqiu = qingqiu;
  }
  ArrayList<?> data;
  
  public BackResult(){}
  
  public BackResult(String message,String qingqiu,ArrayList<?> content){
    
    this.message = message;
    this.qingqiu = qingqiu;
    this.data = content;
  }
  
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  public ArrayList<?> getData() {
    return data;
  }

  public void setData(ArrayList<?> data) {
    this.data = data;
  }
}
