package com.xatkit.metamodels.utils;

import com.xatkit.intent.ContextInstance;
import com.xatkit.intent.ContextParameterValue;
import com.xatkit.intent.EventInstance;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EventWrapper {

    protected EventInstance eventInstance;

    public EventWrapper(EventInstance eventInstance) {
        this.eventInstance = eventInstance;
    }

    public EventInstance getEventInstance() {
        return this.eventInstance;
    }

    public String fromPlatform() {
        return this.eventInstance.getTriggeredBy();
    }

    public Map<String, Map<String, Object>> getContext() {
        Map<String, Map<String, Object>> result = new HashMap<>();
        for(ContextInstance c : this.eventInstance.getOutContextInstances()) {
            Map<String, Object> contextValues = new HashMap<>();
            if(result.containsKey(c.getDefinition().getName())) {
                contextValues = result.get(c.getDefinition().getName());
            }
            for(ContextParameterValue v : c.getValues()) {
                contextValues.put(v.getContextParameter().getName(), v.getValue());
            }
            result.put(c.getDefinition().getName(), contextValues);
        }
        return Collections.unmodifiableMap(result);
    }
}
