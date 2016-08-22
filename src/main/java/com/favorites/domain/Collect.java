package com.favorites.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Collect  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private Long userId;
	@Column(nullable = false)
	private Long favoritesId;
	@Column(nullable = false)
	private String url;
	@Column(nullable = false)
	private String title;
	@Column(nullable = true, length = 65535, columnDefinition = "Text")
	private String description;
	@Column(nullable = true)
	private String logoUrl;
	@Column(nullable = true)
	private String charset;
	@Column(nullable = true)
	private String type;
	@Column(nullable = true)
	private String remark;
	@Column(nullable = false)
	private String isDelete;
	@Column(nullable = false)
	private Long createTime;
	@Column(nullable = false)
	private Long lastModifyTime;
	@Transient
	private String collectTime;
	@Transient
	private String newFavorites;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collect")
	private Set<Praise> praises;

	public Collect() {
		super();
	}

	
	public Collect(Long userId, Long favoritesId, String url, String title, String description, String logoUrl,
			String charset, String type, String remark, String isDelete, Long createTime, Long lastModifyTime) {
		super();
		this.userId = userId;
		this.favoritesId = favoritesId;
		this.url = url;
		this.title = title;
		this.description = description;
		this.logoUrl = logoUrl;
		this.charset = charset;
		this.type = type;
		this.remark = remark;
		this.isDelete = isDelete;
		this.createTime = createTime;
		this.lastModifyTime = lastModifyTime;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getFavoritesId() {
		return favoritesId;
	}

	public void setFavoritesId(Long favoritesId) {
		this.favoritesId = favoritesId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getCollectTime() {
		return collectTime;
	}

	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}

	public String getNewFavorites() {
		return newFavorites;
	}

	public void setNewFavorites(String newFavorites) {
		this.newFavorites = newFavorites;
	}

}