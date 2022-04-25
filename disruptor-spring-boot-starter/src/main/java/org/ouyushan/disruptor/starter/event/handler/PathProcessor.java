package org.ouyushan.disruptor.starter.event.handler;

import org.ouyushan.disruptor.starter.event.DisruptorEvent;

/**
 * 给Handler设置路径
 */
public interface PathProcessor<T extends DisruptorEvent> {
	
	DisruptorHandler<T> processPath(String path);

}
