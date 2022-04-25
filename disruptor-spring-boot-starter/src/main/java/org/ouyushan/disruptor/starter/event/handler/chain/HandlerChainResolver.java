package org.ouyushan.disruptor.starter.event.handler.chain;


import org.ouyushan.disruptor.starter.event.DisruptorEvent;

public interface HandlerChainResolver<T extends DisruptorEvent> {

    HandlerChain<T> getChain(T event, HandlerChain<T> originalChain);

}
