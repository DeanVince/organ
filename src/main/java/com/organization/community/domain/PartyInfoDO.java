package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 协会党建情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:43
 */
public class PartyInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//年份
	private Integer year;
	//协会基本情况表id
	private Integer organInfoId;
	//工作人员中党员总数
	private Integer partyMembersNumber;
	//专职人员党员数
	private Integer fullTimePartyMembersNumber;
	//党组织关第在本社会组织的党员数
	private Integer organizationNumber;
	//本年新发展新党员人数
	private Integer thisYearAddNumber;
	//党建形式
	private String partyType;
	//党组织（党建联络员）隶属关系
	private String partyRelationship;
	//党组建负责人（党建联络员）
	private String partyBuildingLiaison;
	//共青团员人数量
	private Integer leagueOrganizationNumber;
	//工会成员数量
	private Integer tradeUnionNumber;
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
	 * 设置：工作人员中党员总数
	 */
	public void setPartyMembersNumber(Integer partyMembersNumber) {
		this.partyMembersNumber = partyMembersNumber;
	}
	/**
	 * 获取：工作人员中党员总数
	 */
	public Integer getPartyMembersNumber() {
		return partyMembersNumber;
	}
	/**
	 * 设置：专职人员党员数
	 */
	public void setFullTimePartyMembersNumber(Integer fullTimePartyMembersNumber) {
		this.fullTimePartyMembersNumber = fullTimePartyMembersNumber;
	}
	/**
	 * 获取：专职人员党员数
	 */
	public Integer getFullTimePartyMembersNumber() {
		return fullTimePartyMembersNumber;
	}
	/**
	 * 设置：党组织关第在本社会组织的党员数	social
	 */
	public void setOrganizationNumber(Integer organizationNumber) {
		this.organizationNumber = organizationNumber;
	}
	/**
	 * 获取：党组织关第在本社会组织的党员数	social
	 */
	public Integer getOrganizationNumber() {
		return organizationNumber;
	}
	/**
	 * 设置：本年新发展新党员人数
	 */
	public void setThisYearAddNumber(Integer thisYearAddNumber) {
		this.thisYearAddNumber = thisYearAddNumber;
	}
	/**
	 * 获取：本年新发展新党员人数
	 */
	public Integer getThisYearAddNumber() {
		return thisYearAddNumber;
	}
	/**
	 * 设置：党建形式
	 */
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	/**
	 * 获取：党建形式
	 */
	public String getPartyType() {
		return partyType;
	}
	/**
	 * 设置：党组织（党建联络员）隶属关系
	 */
	public void setPartyRelationship(String partyRelationship) {
		this.partyRelationship = partyRelationship;
	}
	/**
	 * 获取：党组织（党建联络员）隶属关系
	 */
	public String getPartyRelationship() {
		return partyRelationship;
	}
	/**
	 * 设置：党组建负责人（党建联络员）
	 */
	public void setPartyBuildingLiaison(String partyBuildingLiaison) {
		this.partyBuildingLiaison = partyBuildingLiaison;
	}
	/**
	 * 获取：党组建负责人（党建联络员）
	 */
	public String getPartyBuildingLiaison() {
		return partyBuildingLiaison;
	}
	/**
	 * 设置：共青团员人数量
	 */
	public void setLeagueOrganizationNumber(Integer leagueOrganizationNumber) {
		this.leagueOrganizationNumber = leagueOrganizationNumber;
	}
	/**
	 * 获取：共青团员人数量
	 */
	public Integer getLeagueOrganizationNumber() {
		return leagueOrganizationNumber;
	}
	/**
	 * 设置：工会成员数量
	 */
	public void setTradeUnionNumber(Integer tradeUnionNumber) {
		this.tradeUnionNumber = tradeUnionNumber;
	}
	/**
	 * 获取：工会成员数量
	 */
	public Integer getTradeUnionNumber() {
		return tradeUnionNumber;
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
