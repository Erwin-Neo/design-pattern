package com.kyle.design.strategy.pay.port;

import com.kyle.design.strategy.pay.MsgResult;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public interface PaymentService {

    /**
     * @return 支付服务名称
     */
    String getServiceName();

    /**
     *
     * @param accountID 账户ID
     * @param amount 金额
     * @return 支付结果
     */
    default MsgResult pay(String accountID, double amount) {
        // 账户余额校验
        if (queryBalance(accountID) < amount) {
            return new MsgResult(500, "订单支付失败!", "账户余额不足!....");
        }
        return new MsgResult(200, "订单支付成功!","支付金额为: " + amount);
    }

    double queryBalance(String accountID);

}
