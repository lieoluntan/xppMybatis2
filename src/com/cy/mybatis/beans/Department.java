package com.cy.mybatis.beans;
/**
 *树袋老师
 * @author 作者 xpp
 * @version 创建时间：2018-1-28 上午10:50:36
 * 类说明
 */

public class Department {
  
  private String uuid;
  private String createDate;
  private String modifyDate;
  private String createPeople;
  private String modifyPeople;
  
  private String name;
  private String remark;
  
  private String openAndclose;    //open打开，close关闭

  public Department() {
    super();
  }

  public Department(String uuid, String name, String remark) {
    super();
    this.uuid = uuid;
    this.name = name;
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "Department 部门[uuid=" + uuid + ", name=" + name + ", remark=" + remark + ", openAndclose="
        + openAndclose + "]结束";
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public String getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
  }

  public String getCreatePeople() {
    return createPeople;
  }

  public void setCreatePeople(String createPeople) {
    this.createPeople = createPeople;
  }

  public String getModifyPeople() {
    return modifyPeople;
  }

  public void setModifyPeople(String modifyPeople) {
    this.modifyPeople = modifyPeople;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getOpenAndclose() {
    return openAndclose;
  }

  public void setOpenAndclose(String openAndclose) {
    this.openAndclose = openAndclose;
  }
  
  
  
  
  
  

}//end class
