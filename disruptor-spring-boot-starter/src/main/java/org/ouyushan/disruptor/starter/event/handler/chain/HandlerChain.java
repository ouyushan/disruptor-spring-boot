package org.ouyushan.disruptor.starter.event.handler.chain;

import org.ouyushan.disruptor.starter.event.DisruptorEvent;

public interface HandlerChain<T extends DisruptorEvent>{

	void doHandler(T event) throws Exception;
	
}
