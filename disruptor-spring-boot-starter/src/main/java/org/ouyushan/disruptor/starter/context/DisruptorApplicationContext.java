/*
 * Copyright (c) 2017, ouyushan (https://github.com/ouyushan).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ouyushan.disruptor.starter.context;

import org.ouyushan.disruptor.starter.context.event.DisruptorEventPublisher;
import org.ouyushan.disruptor.starter.event.DisruptorApplicationEvent;
import org.ouyushan.disruptor.starter.event.DisruptorEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DisruptorApplicationContext implements ApplicationContextAware, DisruptorEventPublisher {

    protected ApplicationContext applicationContext;

    @Override
    public void publishEvent(DisruptorEvent event) {
        applicationContext.publishEvent(new DisruptorApplicationEvent(event));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
	

