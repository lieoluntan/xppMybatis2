package com.cy.mybatis.tools;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2018-4-5 下午3:43:41
 * 类说明
 */

public class DBTools {
  
  public static SqlSessionFactory sessionFactory;
  
  static{
      try {
          //使用MyBatis提供的Resources类加载mybatis的配置文件
          Reader reader = Resources.getResourceAsReader("myBcfg.xml");
          //构建sqlSession的工厂
          sessionFactory = new SqlSessionFactoryBuilder().build(reader);
      } catch (Exception e) {
        System.out.println("加载DBTools中的myBcfg.xml失败");
          e.printStackTrace();
      }
      
  }
  //创建能执行映射文件中sql的sqlSession
  public static SqlSession getSession(){
      return sessionFactory.openSession();
  }

}//end class
