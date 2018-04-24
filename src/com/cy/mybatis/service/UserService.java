package com.cy.mybatis.service;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.cy.mybatis.beans.UserBean;
import com.cy.mybatis.mapper.UserMapper;
import com.cy.mybatis.tools.DBTools;

/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2018-4-5 下午3:46:52
 * 类说明
 */

public class UserService {
  
  public static void main(String[] args) {
    System.out.println("开始执行insert----");
    insertUser();
    
//  deleteUser();
//  selectUserById();
    
//  selectAllUser();
    System.out.println("结束执行insert****");
}


/**
* 新增用户
*/
private static void insertUser() {
  SqlSession session = DBTools.getSession();
  UserMapper mapper = session.getMapper(UserMapper.class);
  UserBean user = new UserBean("懿", "1314520", "a");
  user.setId(UUID.randomUUID().toString());
  try {
      mapper.insertUser(user);
      System.out.println(user.toString());
       session.commit();
  } catch (Exception e) {
    System.out.println("抛出insertUser 方法执行异常.");
      e.printStackTrace();
      session.rollback();
  }
}


/**
* 删除用户
*/
private static void deleteUser(){
  SqlSession session=DBTools.getSession();
  UserMapper mapper=session.getMapper(UserMapper.class);
  try {
      mapper.deleteUser(1);
      session.commit();
  } catch (Exception e) {
      e.printStackTrace();
      session.rollback();
  }
}


/**
* 根据id查询用户
*/
private static void selectUserById(){
  SqlSession session=DBTools.getSession();
  UserMapper mapper=session.getMapper(UserMapper.class);
  try {
  UserBean user=    mapper.selectUserById(2);
  System.out.println(user.toString());
      
      session.commit();
  } catch (Exception e) {
      e.printStackTrace();
      session.rollback();
  }
}

/**
* 查询所有的用户
*/
private static void selectAllUser(){
  SqlSession session=DBTools.getSession();
  UserMapper mapper=session.getMapper(UserMapper.class);
  try {
  List<UserBean> user=mapper.selectAllUser();
  System.out.println(user.toString());
  session.commit();
  } catch (Exception e) {
      e.printStackTrace();
      session.rollback();
  }
}

}//end class
