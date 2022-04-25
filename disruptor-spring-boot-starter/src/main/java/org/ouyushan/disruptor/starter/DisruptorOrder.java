package org.ouyushan.disruptor.starter;

import org.springframework.core.Ordered;

/**
 * @description:
 * @author: ouyushan
 * @email: ouyushan@hotmail.com
 * @date: 2022/4/22 15:22
 */
public class DisruptorOrder implements Ordered {

    private int order = 0;

    public DisruptorOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }
}
