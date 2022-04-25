package org.ouyushan.disruptor.starter.hooks;


import com.lmax.disruptor.dsl.Disruptor;
import org.ouyushan.disruptor.starter.event.DisruptorEvent;

public class DisruptorShutdownHook extends Thread{
	
	private final Disruptor<DisruptorEvent> disruptor;
	
	public DisruptorShutdownHook(Disruptor<DisruptorEvent> disruptor) {
		this.disruptor = disruptor;
	}
	
	@Override
	public void run() {
		disruptor.shutdown();
	}
	
}
