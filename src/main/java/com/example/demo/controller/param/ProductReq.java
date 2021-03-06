package com.example.demo.controller.param;

import lombok.Data;

import java.util.Date;

@Data
public class ProductReq {
    private String productName;
    private Integer productPrice;
    private Date putawayDate; //商品上架日期
    private Integer stock; //商品库存量
    private Integer sending; //商品出货数量

}
