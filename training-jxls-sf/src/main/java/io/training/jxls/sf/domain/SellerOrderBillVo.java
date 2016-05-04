package io.training.jxls.sf.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 该对象用于卖家导出订单时对单据信息的封装
 * Created by huangning1 on 2016/5/3.
 */
public class SellerOrderBillVo {
    /** 店铺名称 */
    private String shopName;
    /** 店铺网址 */
    private String shopUrl;
    /** 收货人 */
    private String receiver;
    /** 手机号码 */
    private String mobilePhone;
    /** 收货地址 */
    private String address;
    /** 订单号 */
    private String orderNo;
    /** 下单时间 */
    private Date orderTime;
    /** 发票抬头 */
    private String invoiceTitle;
    /** 订单备注 */
    private String memo;
    /** 商品总数 */
    private int goodsTotalNumber;
    /** 商品总价 */
    private BigDecimal goodsTotalPrice;
    /** 运费 */
    private BigDecimal freightPrice;
    /** 优惠价格 */
    private BigDecimal discountPrice;
    /** 应付价格 */
    private BigDecimal paymentTotalPrice;
    /** 商品列表 */
    private List<SellerOrderGoodsBillVo> goodsList;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getGoodsTotalNumber() {
        return goodsTotalNumber;
    }

    public void setGoodsTotalNumber(int goodsTotalNumber) {
        this.goodsTotalNumber = goodsTotalNumber;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getPaymentTotalPrice() {
        return paymentTotalPrice;
    }

    public void setPaymentTotalPrice(BigDecimal paymentTotalPrice) {
        this.paymentTotalPrice = paymentTotalPrice;
    }

    public List<SellerOrderGoodsBillVo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<SellerOrderGoodsBillVo> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "SellerOrderBillVo{" +
                "shopName='" + shopName + '\'' +
                ", shopUrl='" + shopUrl + '\'' +
                ", receiver='" + receiver + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", address='" + address + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderTime=" + orderTime +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", memo='" + memo + '\'' +
                ", goodsTotalNumber=" + goodsTotalNumber +
                ", goodsTotalPrice=" + goodsTotalPrice +
                ", freightPrice=" + freightPrice +
                ", discountPrice=" + discountPrice +
                ", paymentTotalPrice=" + paymentTotalPrice +
                ", goodsList=" + goodsList +
                '}';
    }
}
