package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 会员机构人数情况表
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public class MemberStaffDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//年份
	private Integer year;
	//会员基本情况表id
	private Integer organInfoId;
	//单位会员数
	private Integer unitMemberNumber;
	//个人会员数
	private Integer individualMemberNumber;
	//起始日期
	private Date startDate;
	//任期
	private Integer termTime;
	//理事人数
	private Integer directorNumber;
	//常务理事人数
	private Integer standingDirectorNumber;
	//监事会监事人数
	private Integer supervisorNumber;
	//秘书处工作人员数
	private Integer secretariatNumber;
	//分支机构数
	private Integer branchesNumber;
	//代表机构数
	private Integer representativeNumber;
	//实体机构数
	private Integer mechanismsNumber;
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
	 * 设置：会员基本情况表id
	 */
	public void setOrganInfoId(Integer organInfoId) {
		this.organInfoId = organInfoId;
	}
	/**
	 * 获取：会员基本情况表id
	 */
	public Integer getOrganInfoId() {
		return organInfoId;
	}
	/**
	 * 设置：单位会员数
	 */
	public void setUnitMemberNumber(Integer unitMemberNumber) {
		this.unitMemberNumber = unitMemberNumber;
	}
	/**
	 * 获取：单位会员数
	 */
	public Integer getUnitMemberNumber() {
		return unitMemberNumber;
	}
	/**
	 * 设置：个人会员数
	 */
	public void setIndividualMemberNumber(Integer individualMemberNumber) {
		this.individualMemberNumber = individualMemberNumber;
	}
	/**
	 * 获取：个人会员数
	 */
	public Integer getIndividualMemberNumber() {
		return individualMemberNumber;
	}
	/**
	 * 设置：起始日期
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：起始日期
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：任期
	 */
	public void setTermTime(Integer termTime) {
		this.termTime = termTime;
	}
	/**
	 * 获取：任期
	 */
	public Integer getTermTime() {
		return termTime;
	}
	/**
	 * 设置：理事人数
	 */
	public void setDirectorNumber(Integer directorNumber) {
		this.directorNumber = directorNumber;
	}
	/**
	 * 获取：理事人数
	 */
	public Integer getDirectorNumber() {
		return directorNumber;
	}
	/**
	 * 设置：常务理事人数
	 */
	public void setStandingDirectorNumber(Integer standingDirectorNumber) {
		this.standingDirectorNumber = standingDirectorNumber;
	}
	/**
	 * 获取：常务理事人数
	 */
	public Integer getStandingDirectorNumber() {
		return standingDirectorNumber;
	}
	/**
	 * 设置：监事会监事人数
	 */
	public void setSupervisorNumber(Integer supervisorNumber) {
		this.supervisorNumber = supervisorNumber;
	}
	/**
	 * 获取：监事会监事人数
	 */
	public Integer getSupervisorNumber() {
		return supervisorNumber;
	}
	/**
	 * 设置：秘书处工作人员数
	 */
	public void setSecretariatNumber(Integer secretariatNumber) {
		this.secretariatNumber = secretariatNumber;
	}
	/**
	 * 获取：秘书处工作人员数
	 */
	public Integer getSecretariatNumber() {
		return secretariatNumber;
	}
	/**
	 * 设置：分支机构数
	 */
	public void setBranchesNumber(Integer branchesNumber) {
		this.branchesNumber = branchesNumber;
	}
	/**
	 * 获取：分支机构数
	 */
	public Integer getBranchesNumber() {
		return branchesNumber;
	}
	/**
	 * 设置：代表机构数
	 */
	public void setRepresentativeNumber(Integer representativeNumber) {
		this.representativeNumber = representativeNumber;
	}
	/**
	 * 获取：代表机构数
	 */
	public Integer getRepresentativeNumber() {
		return representativeNumber;
	}
	/**
	 * 设置：实体机构数
	 */
	public void setMechanismsNumber(Integer mechanismsNumber) {
		this.mechanismsNumber = mechanismsNumber;
	}
	/**
	 * 获取：实体机构数
	 */
	public Integer getMechanismsNumber() {
		return mechanismsNumber;
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
