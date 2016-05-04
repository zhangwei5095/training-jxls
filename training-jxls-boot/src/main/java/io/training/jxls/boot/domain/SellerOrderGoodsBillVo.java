package io.training.jxls.boot.domain;

import java.math.BigDecimal;

/**
 * 该对象用于卖家导出订单时对单据信息的封装 Created by huangning1 on 2016/5/3.
 */
public class SellerOrderGoodsBillVo {
	/** 商品名称 */
	private String goodsName;
	/** 商品品牌 */
	private String goodsBrand;
	/** 单价 */
	private BigDecimal unitPrice;
	/** 数量 */
	private String goodsTotalNumber;
	/** 总价 */
	private BigDecimal goodsTotalPrice;
	/** 销售属性 */
	private String salesAttr;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsBrand() {
		return goodsBrand;
	}

	public void setGoodsBrand(String goodsBrand) {
		this.goodsBrand = goodsBrand;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getGoodsTotalNumber() {
		return goodsTotalNumber;
	}

	public void setGoodsTotalNumber(String goodsTotalNumber) {
		this.goodsTotalNumber = goodsTotalNumber;
	}

	public BigDecimal getGoodsTotalPrice() {
		return goodsTotalPrice;
	}

	public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
		this.goodsTotalPrice = goodsTotalPrice;
	}

	public String getSalesAttr() {
		return salesAttr;
	}

	public void setSalesAttr(String salesAttr) {
		this.salesAttr = salesAttr;
	}

	@Override
	public String toString() {
		return "SellerOrderGoodsBillVo{" + "goodsName='" + goodsName + '\'' + ", goodsBrand='" + goodsBrand + '\''
				+ ", UnitPrice=" + unitPrice + ", goodsTotalNumber='" + goodsTotalNumber + '\'' + ", goodsTotalPrice="
				+ goodsTotalPrice + ", salesAttr='" + salesAttr + '\'' + '}';
	}
}
