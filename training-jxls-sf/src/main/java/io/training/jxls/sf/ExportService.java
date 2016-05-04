package io.training.jxls.sf;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.training.jxls.sf.domain.SellerOrderBillVo;
import io.training.jxls.sf.domain.SellerOrderGoodsBillVo;
import net.sf.jxls.transformer.XLSTransformer;

public class ExportService {

	/**
	 * 标准示例导出，如果做的是Java Web项目，需要把输出流重定向到HttpServletResponse的输出流即可<br>
	 * 通知浏览器，需要修改媒体类型Content-Type
	 */
	public void standardExport() {
		try {
			Map<String, Object> beanParams = new HashMap<String, Object>();

			List<SellerOrderBillVo> orders = generateData();
			beanParams.put("orders", orders);
			URL url = this.getClass().getResource("/");
			String srcFilePath = url.getPath() + "order.xlsx";
			String destFilePath = url.getPath() + "result.xlsx";
			XLSTransformer transformer = new XLSTransformer();
			transformer.transformXLS(srcFilePath, beanParams, destFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private List<SellerOrderBillVo> generateData() {
		List<SellerOrderBillVo> sellerOrderBillVos = new ArrayList<SellerOrderBillVo>();
		SellerOrderBillVo one = new SellerOrderBillVo();
		one.setShopName("测试鞋城店铺");
		one.setAddress("北京市海淀区北辰世纪中心A座");
		one.setDiscountPrice(new BigDecimal(0.00));
		one.setFreightPrice(new BigDecimal(1.00));
		one.setGoodsTotalNumber(10);
		one.setGoodsTotalPrice(new BigDecimal(100.00));
		one.setInvoiceTitle("XXX科技有限公司");
		one.setMemo("测试导出鞋单");
		one.setOrderNo("100001");
		one.setMobilePhone("13522290680");
		one.setOrderTime(new Date());
		one.setReceiver("Percy");
		one.setShopUrl("shop.b2btest.com/shop/ceshixiecheng");

		SellerOrderBillVo two = new SellerOrderBillVo();
		two.setShopName("测试鞋城店铺2");
		two.setAddress("北京市海淀区北辰世纪中心A座2");
		two.setDiscountPrice(new BigDecimal(0.00));
		two.setFreightPrice(new BigDecimal(2.00));
		two.setGoodsTotalNumber(12);
		two.setGoodsTotalPrice(new BigDecimal(102.00));
		two.setInvoiceTitle("XXX科技有限公司2");
		two.setMemo("测试导出鞋单2");
		two.setOrderNo("100002");
		two.setMobilePhone("13522290680");
		two.setOrderTime(new Date());
		two.setReceiver("Percy2");
		two.setShopUrl("shop.b2btest.com/shop/ceshixiecheng2");

		sellerOrderBillVos.add(one);
		sellerOrderBillVos.add(two);

		List<SellerOrderGoodsBillVo> goodsList = new ArrayList<SellerOrderGoodsBillVo>();
		SellerOrderGoodsBillVo sellerOrderGoodsBillVo1 = new SellerOrderGoodsBillVo();
		sellerOrderGoodsBillVo1.setGoodsBrand("特步");
		sellerOrderGoodsBillVo1.setGoodsName("特步001XXS");
		sellerOrderGoodsBillVo1.setGoodsTotalNumber("7");
		sellerOrderGoodsBillVo1.setSalesAttr("白色 40#");
		sellerOrderGoodsBillVo1.setUnitPrice(new BigDecimal(120.00));
		sellerOrderGoodsBillVo1.setGoodsTotalPrice(new BigDecimal(840.00));

		SellerOrderGoodsBillVo sellerOrderGoodsBillVo2 = new SellerOrderGoodsBillVo();
		sellerOrderGoodsBillVo2.setGoodsBrand("耐克2");
		sellerOrderGoodsBillVo2.setGoodsName("特步001XXS2");
		sellerOrderGoodsBillVo2.setGoodsTotalNumber("3");
		sellerOrderGoodsBillVo2.setSalesAttr("白色 40#");
		sellerOrderGoodsBillVo2.setUnitPrice(new BigDecimal(120.00));
		sellerOrderGoodsBillVo2.setGoodsTotalPrice(new BigDecimal(840.00));

		goodsList.add(sellerOrderGoodsBillVo1);
		goodsList.add(sellerOrderGoodsBillVo2);

		one.setGoodsList(goodsList);
		two.setGoodsList(goodsList);

		return sellerOrderBillVos;
	}

}
