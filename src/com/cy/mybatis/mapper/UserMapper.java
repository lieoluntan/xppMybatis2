package com.cy.mybatis.mapper;

import java.util.List;

import com.cy.mybatis.beans.UserBean;

/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2018-4-5 下午3:37:55
 * 类说明
 */

public interface UserMapper {
  
  /**
   * 新增用戶
   * @param user
   * @return
   * @throws Exception
   */
  public int insertUser(UserBean user) throws Exception;
  /**
   * 修改用戶
   * @param user
   * @param id
   * @return
   * @throws Exception
   */
  public int updateUser (UserBean user,int id) throws Exception;
   /**
    * 刪除用戶
    * @param id
    * @return
    * @throws Exception
    */
  public int deleteUser(int id) throws Exception;
  /**
   * 根据id查询用户信息
   * @param id
   * @return
   * @throws Exception
   */
  public UserBean selectUserById(int id) throws Exception;
   /**
    * 查询所有的用户信息
    * @return
    * @throws Exception
    */
  public List<UserBean> selectAllUser() throws Exception;

}//end class
