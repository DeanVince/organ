package com.organization.pre.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 机构类别
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */
public class TypeDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer id;
	//类别名称
	private String name;
	//创建时间
	private Date createName;
	//删除标记
	private Boolean isDelete;


	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：类别名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：类别名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateName(Date createName) {
		this.createName = createName;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateName() {
		return createName;
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
