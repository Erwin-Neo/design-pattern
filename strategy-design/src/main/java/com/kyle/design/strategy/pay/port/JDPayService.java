package com.kyle.design.strategy.pay.port;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class JDPayService implements PaymentService {

    @Override
    public String getServiceName() {
        return "支付方式选择: 京东支付....";
    }

    @Override
    public double queryBalance(String accountID) {
        return 2000;
    }
}
