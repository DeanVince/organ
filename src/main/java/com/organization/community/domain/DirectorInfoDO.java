package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 社团组织理事信息表
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:41
 */
public class DirectorInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//年份
	private Integer year;
	//会员基本情况表id
	private Integer organInfoId;
	//职务名称
	private String directorPositon;
	//姓名
	private String directorName;
	//政治面貌
	private String politicalLandscape;
	//性别 男0 女1
	private Boolean gender;
	//文化程度
	private String educationLevel;
	//离退体否 0是未退休 1 退休
	private Boolean isFormer;
	//身份证号
	private String idCard;
	//电话
	private String phoneNumber;
	//手机
	private String mobilePhone;
	//专职/兼职 0专职1兼职
	private Boolean isFullTime;
	//工作单位
	private String workUnit;
	//单位职务
	private String unitPosition;
	//单位地址
	private String unitAddress;
	//其它社会职务
	private String otherSocialDuties;
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
	 * 设置：职务名称
	 */
	public void setDirectorPositon(String directorPositon) {
		this.directorPositon = directorPositon;
	}
	/**
	 * 获取：职务名称
	 */
	public String getDirectorPositon() {
		return directorPositon;
	}
	/**
	 * 设置：姓名
	 */
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	/**
	 * 获取：姓名
	 */
	public String getDirectorName() {
		return directorName;
	}
	/**
	 * 设置：政治面貌
	 */
	public void setPoliticalLandscape(String politicalLandscape) {
		this.politicalLandscape = politicalLandscape;
	}
	/**
	 * 获取：政治面貌
	 */
	public String getPoliticalLandscape() {
		return politicalLandscape;
	}
	/**
	 * 设置：性别 男0 女1
	 */
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别 男0 女1
	 */
	public Boolean getGender() {
		return gender;
	}
	/**
	 * 设置：文化程度
	 */
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	/**
	 * 获取：文化程度
	 */
	public String getEducationLevel() {
		return educationLevel;
	}
	/**
	 * 设置：离退体否 0是未退休 1 退休
	 */
	public void setIsFormer(Boolean isFormer) {
		this.isFormer = isFormer;
	}
	/**
	 * 获取：离退体否 0是未退休 1 退休
	 */
	public Boolean getIsFormer() {
		return isFormer;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdCard() {
		return idCard;
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
	 * 设置：手机
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 获取：手机
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 设置：专职/兼职 0专职1兼职
	 */
	public void setIsFullTime(Boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	/**
	 * 获取：专职/兼职 0专职1兼职
	 */
	public Boolean getIsFullTime() {
		return isFullTime;
	}
	/**
	 * 设置：工作单位
	 */
	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}
	/**
	 * 获取：工作单位
	 */
	public String getWorkUnit() {
		return workUnit;
	}
	/**
	 * 设置：单位职务
	 */
	public void setUnitPosition(String unitPosition) {
		this.unitPosition = unitPosition;
	}
	/**
	 * 获取：单位职务
	 */
	public String getUnitPosition() {
		return unitPosition;
	}
	/**
	 * 设置：单位地址
	 */
	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}
	/**
	 * 获取：单位地址
	 */
	public String getUnitAddress() {
		return unitAddress;
	}
	/**
	 * 设置：其它社会职务
	 */
	public void setOtherSocialDuties(String otherSocialDuties) {
		this.otherSocialDuties = otherSocialDuties;
	}
	/**
	 * 获取：其它社会职务
	 */
	public String getOtherSocialDuties() {
		return otherSocialDuties;
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
