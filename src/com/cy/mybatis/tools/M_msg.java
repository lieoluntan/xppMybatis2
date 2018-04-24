package com.cy.mybatis.tools;
/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2017-11-10 上午10:23:33
 * 类说明
 * 用于在dao层，service层，control层传输反馈消息
 */

public class M_msg {
  
  private String testMsg;
  private String addMsg;
  private String deleteMsg;
  private String editMsg;
  private String getOneMsg;
  private String listMsg;
  
  
  public M_msg() {
    this.testMsg = "测试成功了!";
    this.addMsg = "新增成功了!";
    this.deleteMsg = "删除成功了!";
    this.editMsg = "编辑成功了!";
    this.getOneMsg = "原始值：操作成功了";
    this.listMsg = "原始值：操作成功了";
  }
  public M_msg(String addMsg, String deleteMsg, String editMsg) {
    super();
    this.addMsg = addMsg;
    this.deleteMsg = deleteMsg;
    this.editMsg = editMsg;
  }
  @Override
  public String toString() {
    return "M_msg 开始[testMsg=" + testMsg + ", addMsg=" + addMsg + ", deleteMsg=" + deleteMsg
        + ", editMsg=" + editMsg + ", getOneMsg=" + getOneMsg + ", listMsg=" + listMsg + "]结束";
  }
  
  public void cleanMsg(){
    this.testMsg = "测试成功了!";
    this.addMsg = "新增成功了!";
    this.deleteMsg = "删除成功了!";
    this.editMsg = "编辑成功了!";
    this.getOneMsg = "原始值：操作成功了";
    this.listMsg = "原始值：操作成功了";
  }
  
  public String getTestMsg() {
    return testMsg;
  }
  public void setTestMsg(String testMsg) {
    this.testMsg = testMsg;
  }
  public String getAddMsg() {
    return addMsg;
  }
  public void setAddMsg(String addMsg) {
    this.addMsg = addMsg;
  }
  public String getDeleteMsg() {
    return deleteMsg;
  }
  public void setDeleteMsg(String deleteMsg) {
    this.deleteMsg = deleteMsg;
  }
  public String getEditMsg() {
    return editMsg;
  }
  public void setEditMsg(String editMsg) {
    this.editMsg = editMsg;
  }
  public String getGetOneMsg() {
    return getOneMsg;
  }
  public void setGetOneMsg(String getOneMsg) {
    this.getOneMsg = getOneMsg;
  }
  public String getListMsg() {
    return listMsg;
  }
  public void setListMsg(String listMsg) {
    this.listMsg = listMsg;
  }
}//end class 
