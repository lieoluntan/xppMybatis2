package com.cy.mybatis.beans;

/**
 * 树袋老师
 * 
 * @author 作者 xpp
 * @version 创建时间：2018-4-5 下午3:33:45 类说明
 */

public class UserBean {

  private static final long serialVersionUID = 1L;
  private String id;
  private String username;
  private String password;
  private String account;

  public UserBean() {
    super();
  }

  public UserBean(String username, String password, String account) {
    super();
    this.username = username;
    this.password = password;
    this.account = account;
  }

  public UserBean(String id, String username, String password, String account) {
    super();
    this.id = id;
    this.username = username;
    this.password = password;
    this.account = account;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "UserBean [id=" + id + ", username=" + username + ", password=" + password
        + ", account=" + account + "]";
  }

}// end class
