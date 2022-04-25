package org.ouyushan.disruptor.starter.event.handler;

import com.lmax.disruptor.EventHandler;
import org.ouyushan.disruptor.starter.event.DisruptorEvent;
import org.ouyushan.disruptor.starter.event.handler.chain.HandlerChain;
import org.ouyushan.disruptor.starter.event.handler.chain.HandlerChainResolver;
import org.ouyushan.disruptor.starter.event.handler.chain.ProxiedHandlerChain;
import org.springframework.core.Ordered;

/**
 * Disruptor 事件分发实现
 */
public class DisruptorEventDispatcher extends AbstractRouteableEventHandler<DisruptorEvent> implements EventHandler<DisruptorEvent>, Ordered {

    private int order = 0;

    public DisruptorEventDispatcher(HandlerChainResolver<DisruptorEvent> filterChainResolver, int order) {
        super(filterChainResolver);
        this.order = order;
    }

    /*
     * 责任链入口
     */
    @Override
    public void onEvent(DisruptorEvent event, long sequence, boolean endOfBatch) throws Exception {

        //构造原始链对象
        HandlerChain<DisruptorEvent> originalChain = new ProxiedHandlerChain();
        //执行事件处理链
        this.doHandler(event, originalChain);

    }

    @Override
    public int getOrder() {
        return order;
    }

}

