package com.xatkit.execution.predicate;

import static java.util.Objects.nonNull;

import java.text.MessageFormat;
import java.util.function.Predicate;

import com.xatkit.execution.StateContext;
import com.xatkit.intent.EventDefinition;
import com.xatkit.intent.EventInstance;

public class IsEventDefinitionPredicate implements Predicate<StateContext> {

    private EventDefinition eventDefinition;

    public IsEventDefinitionPredicate(EventDefinition eventDefinition) {
        this.eventDefinition = eventDefinition;
    }
    
    public EventDefinition getEventDefinition() {
    	return this.eventDefinition;
    }

    @Override
    public boolean test(StateContext stateContext) {
        EventInstance eventInstance = stateContext.getEventInstance();
        if(nonNull(eventInstance)) {
            if(nonNull(eventInstance.getDefinition())) {
                /*
                 * TODO check equals works fine for EventDefinitions.
                 */
                return eventInstance.getDefinition().equals(this.eventDefinition);
            } else {
                throw new IllegalStateException(MessageFormat.format("The current {0}'s definition is null",
                        EventInstance.class.getSimpleName()));
            }
        }
        return false;
    }

    @Override
    public Predicate<StateContext> and(Predicate<? super StateContext> other) {
        return new AndPredicate<>(this, other);
    }

    @Override
    public Predicate<StateContext> or(Predicate<? super StateContext> other) {
        return new OrPredicate<>(this, other);
    }

    @Override
    public Predicate<StateContext> negate() {
        return new NegatePredicate<>(this);
    }
}
