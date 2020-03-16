package com.organization.community.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 社团基本情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public class InfoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//单位名称
	private String companyName;
	//统一社会信用代码
	private String companyCode;
	//管理类别
	private String manageType;
	//社团类型
	private String unitType;
	//业务主管单位
	private String businessUnit;
	//登记日期
	private Date registrationDate;
	//证书有效期
	private Date certificateEndTime;
	//发起人情况
	private String sponsorInformation;
	//注册资金
	private BigDecimal egisteredCapital;
	//注册资金来源
	private String sourceCapital;
	//注册地址
	private String registeredAddress;
	//联系地址
	private String contactAddress;
	//住所用房情况
	private String residentialOccupancy;
	//联系人
	private String contactName;
	//职务
	private String contactPosition;
	//手机号码
	private String contactPhone;
	//电子邮件
	private String contactEmail;
	//联系电话
	private String contactNumber;
	//单位传真
	private String contactFax;
	//网站网址
	private String webSiteAddress;
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
	 * 设置：单位名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：单位名称
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：统一社会信用代码
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * 获取：统一社会信用代码
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * 设置：管理类别
	 */
	public void setManageType(String manageType) {
		this.manageType = manageType;
	}
	/**
	 * 获取：管理类别
	 */
	public String getManageType() {
		return manageType;
	}
	/**
	 * 设置：社团类型
	 */
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	/**
	 * 获取：社团类型
	 */
	public String getUnitType() {
		return unitType;
	}
	/**
	 * 设置：业务主管单位
	 */
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	/**
	 * 获取：业务主管单位
	 */
	public String getBusinessUnit() {
		return businessUnit;
	}
	/**
	 * 设置：登记日期
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * 设置：证书有效期
	 */
	public void setCertificateEndTime(Date certificateEndTime) {
		this.certificateEndTime = certificateEndTime;
	}
	/**
	 * 获取：证书有效期
	 */
	public Date getCertificateEndTime() {
		return certificateEndTime;
	}
	/**
	 * 设置：发起人情况
	 */
	public void setSponsorInformation(String sponsorInformation) {
		this.sponsorInformation = sponsorInformation;
	}
	/**
	 * 获取：发起人情况
	 */
	public String getSponsorInformation() {
		return sponsorInformation;
	}
	/**
	 * 设置：注册资金
	 */
	public void setEgisteredCapital(BigDecimal egisteredCapital) {
		this.egisteredCapital = egisteredCapital;
	}
	/**
	 * 获取：注册资金
	 */
	public BigDecimal getEgisteredCapital() {
		return egisteredCapital;
	}
	/**
	 * 设置：注册资金来源
	 */
	public void setSourceCapital(String sourceCapital) {
		this.sourceCapital = sourceCapital;
	}
	/**
	 * 获取：注册资金来源
	 */
	public String getSourceCapital() {
		return sourceCapital;
	}
	/**
	 * 设置：注册地址
	 */
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	/**
	 * 获取：注册地址
	 */
	public String getRegisteredAddress() {
		return registeredAddress;
	}
	/**
	 * 设置：联系地址
	 */
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	/**
	 * 获取：联系地址
	 */
	public String getContactAddress() {
		return contactAddress;
	}
	/**
	 * 设置：住所用房情况
	 */
	public void setResidentialOccupancy(String residentialOccupancy) {
		this.residentialOccupancy = residentialOccupancy;
	}
	/**
	 * 获取：住所用房情况
	 */
	public String getResidentialOccupancy() {
		return residentialOccupancy;
	}
	/**
	 * 设置：联系人
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * 获取：联系人
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * 设置：职务
	 */
	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}
	/**
	 * 获取：职务
	 */
	public String getContactPosition() {
		return contactPosition;
	}
	/**
	 * 设置：手机号码
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * 设置：电子邮件
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	/**
	 * 获取：电子邮件
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	/**
	 * 设置：联系电话
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * 获取：联系电话
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * 设置：单位传真
	 */
	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}
	/**
	 * 获取：单位传真
	 */
	public String getContactFax() {
		return contactFax;
	}
	/**
	 * 设置：网站网址
	 */
	public void setWebSiteAddress(String webSiteAddress) {
		this.webSiteAddress = webSiteAddress;
	}
	/**
	 * 获取：网站网址
	 */
	public String getWebSiteAddress() {
		return webSiteAddress;
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
