package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 协会会员情况
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public class MemberInfomationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//年份
	private Integer year;
	//协会基本情况表id
	private Integer organInfoId;
	//会员名称
	private String memberName;
	//地址
	private String address;
	//负责人姓名
	private String dirctorName;
	//电话
	private String phoneNumber;
	//从业人数
	private Integer employeesNumber;
	//机构类型
	private String organType;
	//填表人
	private String preparer;
	//填写日期
	private Date createTime;
	//更改日期
	private Date updateTime;
	//删除标记
	private Boolean isDelete;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：年份
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 获取：年份
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * 设置：协会基本情况表id
	 */
	public void setOrganInfoId(Integer organInfoId) {
		this.organInfoId = organInfoId;
	}
	/**
	 * 获取：协会基本情况表id
	 */
	public Integer getOrganInfoId() {
		return organInfoId;
	}
	/**
	 * 设置：会员名称
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * 获取：会员名称
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：负责人姓名
	 */
	public void setDirctorName(String dirctorName) {
		this.dirctorName = dirctorName;
	}
	/**
	 * 获取：负责人姓名
	 */
	public String getDirctorName() {
		return dirctorName;
	}
	/**
	 * 设置：电话
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 获取：电话
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 设置：从业人数
	 */
	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	/**
	 * 获取：从业人数
	 */
	public Integer getEmployeesNumber() {
		return employeesNumber;
	}
	/**
	 * 设置：机构类型
	 */
	public void setOrganType(String organType) {
		this.organType = organType;
	}
	/**
	 * 获取：机构类型
	 */
	public String getOrganType() {
		return organType;
	}
	/**
	 * 设置：填表人
	 */
	public void setPreparer(String preparer) {
		this.preparer = preparer;
	}
	/**
	 * 获取：填表人
	 */
	public String getPreparer() {
		return preparer;
	}
	/**
	 * 设置：填写日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：填写日期
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更改日期
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更改日期
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：删除标记
	 */
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：删除标记
	 */
	public Boolean getIsDelete() {
		return isDelete;
	}
}
