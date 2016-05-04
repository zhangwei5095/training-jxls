package io.training.jxls.boot;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jxls.common.Context;
import org.jxls.template.SimpleExporter;
import org.jxls.transform.poi.PoiContext;
import org.jxls.util.JxlsHelper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import io.training.jxls.boot.domain.SellerOrderBillVo;
import io.training.jxls.boot.domain.SellerOrderGoodsBillVo;
import io.training.jxls.boot.domain.User;

@Service
public class ExportService {

    public void simpleExporter () throws IOException {

        //Resource r = new ClassPathResource("1.xlsx");
        OutputStream o = new FileOutputStream("2.xls");

//		File file = r.getFile();
//		r.getInputStream();
        Context context = new Context();

        User user = new User();
        user.setId(1L);
        user.setName("Hello");
        List<User> users = new ArrayList<User>();
        users.add(user);
        context.putVar("users", users);
//        JxlsHelper.getInstance().processTemplate(r.getInputStream(), o, context);
        SimpleExporter exporter = new SimpleExporter();
        List<String> headers = Arrays.asList("Id", "Name");
        exporter.gridExport(headers, users, "id, name", o);
    }

    public void export2 () throws IOException {

        Resource r = new ClassPathResource("simple3.xls");
        OutputStream o = new FileOutputStream("3.xls");

//		File file = r.getFile();
//		r.getInputStream();
        Context context = new PoiContext();

        User user = new User();
        user.setId(1L);
        user.setName("Hello");
        List<User> users = new ArrayList<User>();
        users.add(user);
        context.putVar("users", users);
        JxlsHelper.getInstance().processTemplate(r.getInputStream(), o, context);
    }

    /**
     * 标准示例导出，如果做的是Java Web项目，需要把输出流重定向到HttpServletResponse的输出流即可<br>
     * 通知浏览器，需要修改媒体类型Content-Type
     */
    public void standardExport() throws IOException {
        Context context = new PoiContext();
        Resource r = new ClassPathResource("order.xlsx");
        OutputStream o = new FileOutputStream("result.xlsx");
        List<SellerOrderBillVo> orders = generateData();
        context.putVar("orders", orders);

        JxlsHelper.getInstance().processTemplate(r.getInputStream(), o, context);
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
