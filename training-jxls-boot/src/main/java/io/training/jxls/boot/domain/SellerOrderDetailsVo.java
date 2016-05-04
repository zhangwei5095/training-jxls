package io.training.jxls.boot.domain;

import java.util.Date;

public class SellerOrderDetailsVo {	
	
	/* 商品信息 后期需要改为一个独立的对象：包括图片、名称、数量等信息 */
	private String itemInfos;
	
	/* 订单编号 */
	private long orderId;
	
	/* 订单金额 */
	private double orderPrice;
	
	/* 订单状态 */
	private int orderState;
	
	/* 配送物流 */
	private String deliveryCompany;
	
	/* 买家用户名 */
	private String customerName;
	
	/* 买家备注 */
	private String customerRemarks;
	
	/* 下单时间 */
	private Date orderTime;
	
	/* 付款时间 */
	private Date paymentTime;
	
	/* 订单操作 */
	private int operationType;
	
	/* 收货人*/
	private String name;
	
	/*收货电话*/
	private String mobile;
	
	public String getItemInfos() {
		return itemInfos;
	}

	public void setItemInfos(String itemInfos) {
		this.itemInfos = itemInfos;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getOrderState() {
		return orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	public String getDeliveryCompany() {
		return deliveryCompany;
	}

	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRemarks() {
		return customerRemarks;
	}

	public void setCustomerRemarks(String customerRemarks) {
		this.customerRemarks = customerRemarks;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public int getOperationType() {
		return operationType;
	}

	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "SellerOrderDetailsVo [itemInfos=" + itemInfos + ", orderId="
				+ orderId + ", orderPrice=" + orderPrice + ", orderState="
				+ orderState + ", deliveryCompany=" + deliveryCompany
				+ ", customerName=" + customerName + ", customerRemarks="
				+ customerRemarks + ", orderTime=" + orderTime
				+ ", paymentTime=" + paymentTime + ", operationType="
				+ operationType + ",name=" + name + ", mobile=" + mobile +",]";
	}
}
