package com.organization.community.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 社团新闻表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public class NewsDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//标题
	private String title;
	//作者
	private String author;
	//内容
	private String content;
	//发布日期
	private Date publicTime;
	//标签
	private String tags;
	//类型
	private String newsType;
	//状态
	private Integer status;
	//是否允许评论
	private Boolean allowComment;
	//是否色许评星
	private Boolean allowEvaluationStar;
	//修改日期
	private Date updateTime;
	//删除标记
	private Boolean isDelete;
	//单位名称
	private String companyName;

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
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：作者
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * 获取：作者
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：发布日期
	 */
	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getPublicTime() {
		return publicTime;
	}
	/**
	 * 设置：标签
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}
	/**
	 * 获取：标签
	 */
	public String getTags() {
		return tags;
	}
	/**
	 * 设置：类型
	 */
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	/**
	 * 获取：类型
	 */
	public String getNewsType() {
		return newsType;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：是否允许评论
	 */
	public void setAllowComment(Boolean allowComment) {
		this.allowComment = allowComment;
	}
	/**
	 * 获取：是否允许评论
	 */
	public Boolean getAllowComment() {
		return allowComment;
	}
	/**
	 * 设置：是否色许评星
	 */
	public void setAllowEvaluationStar(Boolean allowEvaluationStar) {
		this.allowEvaluationStar = allowEvaluationStar;
	}
	/**
	 * 获取：是否色许评星
	 */
	public Boolean getAllowEvaluationStar() {
		return allowEvaluationStar;
	}
	/**
	 * 设置：修改日期
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改日期
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
