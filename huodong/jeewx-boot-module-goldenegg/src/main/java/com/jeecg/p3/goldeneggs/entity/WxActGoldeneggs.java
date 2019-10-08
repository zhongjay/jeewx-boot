package com.jeecg.p3.goldeneggs.entity;

import java.util.Date;
import java.util.List;

import org.jeecgframework.p3.core.utils.persistence.Entity;



/**
 * 描述：</b>WxActGoldeneggs:h5页面彩蛋<br>
 * @author junfeng.zhou
 * @since：2016年06月07日 18时00分24秒 星期二 
 * @version:1.0
 */
public class WxActGoldeneggs implements Entity<String> {
	private static final long serialVersionUID = 1L;
	private List<WxActGoldeneggsRelation> awarsList;
		return awarsList;
	}
	public void setAwarsList(List<WxActGoldeneggsRelation> awarsList) {
		this.awarsList = awarsList;
	}
	/**
	/**
	 * 模板编码
	 */
	private String templateCode;
	/**
	 * 短链接
	 */
	private String shortUrl;
	//update-begin--Author:lsq  Date: 20181010 for：分享得额外次数
	/**
	 *是否有额外的抽奖机会
	 */
	private String extraLuckyDraw;
	
	public String getExtraLuckyDraw() {
		return extraLuckyDraw;
	}
	public void setExtraLuckyDraw(String extraLuckyDraw) {
		this.extraLuckyDraw = extraLuckyDraw;
	}
	//update-end--Author:lsq  Date: 20181010 for：分享得额外次数	
	private Date createTime;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getId() {
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
}
