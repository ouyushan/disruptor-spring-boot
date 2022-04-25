package org.ouyushan.disruptor.starter.event.handler;


import org.ouyushan.disruptor.starter.event.DisruptorEvent;
import org.ouyushan.disruptor.starter.event.handler.chain.HandlerChain;

public interface DisruptorHandler<T extends DisruptorEvent> {

    public void doHandler(T event, HandlerChain<T> handlerChain) throws Exception;

}
