package com.organization.pre.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 机构基本信息
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */
public class InfoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//机构名称
	private String name;
	//成立日期
	private Date setupDate;
	//登记机关
	private String registrstionAuthority;
	//创间时间
	private Date createTime;
	//删除标记
	private Boolean isDelete;
	//类型主键 organ_type
//	private Integer typeId;

	private TypeDO typeDo;


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
	 * 设置：机构名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：机构名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：成立日期
	 */
	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}
	/**
	 * 获取：成立日期
	 */
	public Date getSetupDate() {
		return setupDate;
	}
	/**
	 * 设置：登记机关
	 */
	public void setRegistrstionAuthority(String registrstionAuthority) {
		this.registrstionAuthority = registrstionAuthority;
	}
	/**
	 * 获取：登记机关
	 */
	public String getRegistrstionAuthority() {
		return registrstionAuthority;
	}
	/**
	 * 设置：创间时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创间时间
	 */
	public Date getCreateTime() {
		return createTime;
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

	public TypeDO getTypeDo() {
		return typeDo;
	}

	public void setTypeDo(TypeDO typeDo) {
		this.typeDo = typeDo;
	}

//	/**
//	 * 设置：类型主键 organ_type
//	 */
//	public void setTypeId(Integer typeId) {
//		this.typeId = typeId;
//	}
//	/**
//	 * 获取：类型主键 organ_type
//	 */
//	public Integer getTypeId() {
//		return typeId;
//	}
}
