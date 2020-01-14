package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 社团信息人员情况表
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public class EmployDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//年份
	private Integer year;
	//会员基本情况表id
	private Integer organInfoId;
	//工作人员总数
	private Integer staffNumber;
	//专职人员人数
	private Integer fullTimeStaffNumber;
	//兼职人员人数
	private Integer partTimeStaffNumber;
	//国家机关在职人数
	private Integer organsServiceNumber;
	//企事业单位人数
	private Integer companyNumber;
	//离退休返聘人数
	private Integer retirementNumber;
	//其他人数
	private Integer elseStaffNumber;
	//30岁及以下人数
	private Integer belowThirtyNumber;
	//30-40岁人数
	private Integer thirtysNumber;
	//40-50岁人数
	private Integer fourtysNumber;
	//50-60岁人数
	private Integer fiftysNumber;
	//60岁以上人数
	private Integer sixtysNumber;
	//高中及以下人数
	private Integer highSchoolNumber;
	//大专人数
	private Integer collegeNumber;
	//本科人数
	private Integer degreeNumber;
	//硕士人数
	private Integer masterNumber;
	//博士人数
	private Integer doctorNumber;
	//出国留学人数
	private Integer studyingAbroadNumber;
	//持有社会工作者资格证书人数
	private Integer workerCertificatesNumber;
	//持有从事岗位相应专业技术证书人数
	private Integer technicalCertificatesNumber;
	//党代表人数
	private Integer partyDeputiesNumber;
	//人大代表人数
	private Integer peopleDeputiesNumber;
	//政协委员人数
	private Integer cppccMemberNumber;
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
	 * 设置：工作人员总数
	 */
	public void setStaffNumber(Integer staffNumber) {
		this.staffNumber = staffNumber;
	}
	/**
	 * 获取：工作人员总数
	 */
	public Integer getStaffNumber() {
		return staffNumber;
	}
	/**
	 * 设置：专职人员人数
	 */
	public void setFullTimeStaffNumber(Integer fullTimeStaffNumber) {
		this.fullTimeStaffNumber = fullTimeStaffNumber;
	}
	/**
	 * 获取：专职人员人数
	 */
	public Integer getFullTimeStaffNumber() {
		return fullTimeStaffNumber;
	}
	/**
	 * 设置：兼职人员人数
	 */
	public void setPartTimeStaffNumber(Integer partTimeStaffNumber) {
		this.partTimeStaffNumber = partTimeStaffNumber;
	}
	/**
	 * 获取：兼职人员人数
	 */
	public Integer getPartTimeStaffNumber() {
		return partTimeStaffNumber;
	}
	/**
	 * 设置：国家机关在职人数
	 */
	public void setOrgansServiceNumber(Integer organsServiceNumber) {
		this.organsServiceNumber = organsServiceNumber;
	}
	/**
	 * 获取：国家机关在职人数
	 */
	public Integer getOrgansServiceNumber() {
		return organsServiceNumber;
	}
	/**
	 * 设置：企事业单位人数
	 */
	public void setCompanyNumber(Integer companyNumber) {
		this.companyNumber = companyNumber;
	}
	/**
	 * 获取：企事业单位人数
	 */
	public Integer getCompanyNumber() {
		return companyNumber;
	}
	/**
	 * 设置：离退休返聘人数
	 */
	public void setRetirementNumber(Integer retirementNumber) {
		this.retirementNumber = retirementNumber;
	}
	/**
	 * 获取：离退休返聘人数
	 */
	public Integer getRetirementNumber() {
		return retirementNumber;
	}
	/**
	 * 设置：其他人数
	 */
	public void setElseStaffNumber(Integer elseStaffNumber) {
		this.elseStaffNumber = elseStaffNumber;
	}
	/**
	 * 获取：其他人数
	 */
	public Integer getElseStaffNumber() {
		return elseStaffNumber;
	}
	/**
	 * 设置：30岁及以下人数
	 */
	public void setBelowThirtyNumber(Integer belowThirtyNumber) {
		this.belowThirtyNumber = belowThirtyNumber;
	}
	/**
	 * 获取：30岁及以下人数
	 */
	public Integer getBelowThirtyNumber() {
		return belowThirtyNumber;
	}
	/**
	 * 设置：30-40岁人数
	 */
	public void setThirtysNumber(Integer thirtysNumber) {
		this.thirtysNumber = thirtysNumber;
	}
	/**
	 * 获取：30-40岁人数
	 */
	public Integer getThirtysNumber() {
		return thirtysNumber;
	}
	/**
	 * 设置：40-50岁人数
	 */
	public void setFourtysNumber(Integer fourtysNumber) {
		this.fourtysNumber = fourtysNumber;
	}
	/**
	 * 获取：40-50岁人数
	 */
	public Integer getFourtysNumber() {
		return fourtysNumber;
	}
	/**
	 * 设置：50-60岁人数
	 */
	public void setFiftysNumber(Integer fiftysNumber) {
		this.fiftysNumber = fiftysNumber;
	}
	/**
	 * 获取：50-60岁人数
	 */
	public Integer getFiftysNumber() {
		return fiftysNumber;
	}
	/**
	 * 设置：60岁以上人数
	 */
	public void setSixtysNumber(Integer sixtysNumber) {
		this.sixtysNumber = sixtysNumber;
	}
	/**
	 * 获取：60岁以上人数
	 */
	public Integer getSixtysNumber() {
		return sixtysNumber;
	}
	/**
	 * 设置：高中及以下人数
	 */
	public void setHighSchoolNumber(Integer highSchoolNumber) {
		this.highSchoolNumber = highSchoolNumber;
	}
	/**
	 * 获取：高中及以下人数
	 */
	public Integer getHighSchoolNumber() {
		return highSchoolNumber;
	}
	/**
	 * 设置：大专人数
	 */
	public void setCollegeNumber(Integer collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	/**
	 * 获取：大专人数
	 */
	public Integer getCollegeNumber() {
		return collegeNumber;
	}
	/**
	 * 设置：本科人数
	 */
	public void setDegreeNumber(Integer degreeNumber) {
		this.degreeNumber = degreeNumber;
	}
	/**
	 * 获取：本科人数
	 */
	public Integer getDegreeNumber() {
		return degreeNumber;
	}
	/**
	 * 设置：硕士人数
	 */
	public void setMasterNumber(Integer masterNumber) {
		this.masterNumber = masterNumber;
	}
	/**
	 * 获取：硕士人数
	 */
	public Integer getMasterNumber() {
		return masterNumber;
	}
	/**
	 * 设置：博士人数
	 */
	public void setDoctorNumber(Integer doctorNumber) {
		this.doctorNumber = doctorNumber;
	}
	/**
	 * 获取：博士人数
	 */
	public Integer getDoctorNumber() {
		return doctorNumber;
	}
	/**
	 * 设置：出国留学人数
	 */
	public void setStudyingAbroadNumber(Integer studyingAbroadNumber) {
		this.studyingAbroadNumber = studyingAbroadNumber;
	}
	/**
	 * 获取：出国留学人数
	 */
	public Integer getStudyingAbroadNumber() {
		return studyingAbroadNumber;
	}
	/**
	 * 设置：持有社会工作者资格证书人数
	 */
	public void setWorkerCertificatesNumber(Integer workerCertificatesNumber) {
		this.workerCertificatesNumber = workerCertificatesNumber;
	}
	/**
	 * 获取：持有社会工作者资格证书人数
	 */
	public Integer getWorkerCertificatesNumber() {
		return workerCertificatesNumber;
	}
	/**
	 * 设置：持有从事岗位相应专业技术证书人数
	 */
	public void setTechnicalCertificatesNumber(Integer technicalCertificatesNumber) {
		this.technicalCertificatesNumber = technicalCertificatesNumber;
	}
	/**
	 * 获取：持有从事岗位相应专业技术证书人数
	 */
	public Integer getTechnicalCertificatesNumber() {
		return technicalCertificatesNumber;
	}
	/**
	 * 设置：党代表人数
	 */
	public void setPartyDeputiesNumber(Integer partyDeputiesNumber) {
		this.partyDeputiesNumber = partyDeputiesNumber;
	}
	/**
	 * 获取：党代表人数
	 */
	public Integer getPartyDeputiesNumber() {
		return partyDeputiesNumber;
	}
	/**
	 * 设置：人大代表人数
	 */
	public void setPeopleDeputiesNumber(Integer peopleDeputiesNumber) {
		this.peopleDeputiesNumber = peopleDeputiesNumber;
	}
	/**
	 * 获取：人大代表人数
	 */
	public Integer getPeopleDeputiesNumber() {
		return peopleDeputiesNumber;
	}
	/**
	 * 设置：政协委员人数
	 */
	public void setCppccMemberNumber(Integer cppccMemberNumber) {
		this.cppccMemberNumber = cppccMemberNumber;
	}
	/**
	 * 获取：政协委员人数
	 */
	public Integer getCppccMemberNumber() {
		return cppccMemberNumber;
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
