package com.itheima.Constants;

public interface Constants {
    /**
     * 商品热门
     */
    int PRODUCT_IS_HOT = 1;

    /**
     * 商品非热门
     */
    int PRODUCT_NOT_HOT = 0;

    /**
     * 订单状态:未付款
     */
    int ORDER_STATE_WEIFUKUAN = 0;

    /**
     * 订单状态:已付款
     */
    int ORDER_STATE_YIFUKUAN = 1;

    /**
     * 订单状态:已发货
     */
    int ORDER_STATE_YIFAHUO = 2;

    /**
     * 订单状态:已完成
     */
    int ORDER_STATE_YIWANCHENG = 3;
}
