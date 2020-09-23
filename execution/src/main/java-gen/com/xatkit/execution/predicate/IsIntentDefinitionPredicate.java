package com.xatkit.execution.predicate;

import static java.util.Objects.nonNull;

import java.text.MessageFormat;
import java.util.function.Predicate;

import com.xatkit.execution.StateContext;
import com.xatkit.intent.IntentDefinition;
import com.xatkit.intent.RecognizedIntent;

public class IsIntentDefinitionPredicate implements Predicate<StateContext> {

    private IntentDefinition intentDefinition;

    public IsIntentDefinitionPredicate(IntentDefinition intentDefinition) {
        this.intentDefinition = intentDefinition;
    }
    
    public IntentDefinition getIntentDefinition() {
    	return this.intentDefinition;
    }

    @Override
    public boolean test(StateContext stateContext) {
        RecognizedIntent recognizedIntent = stateContext.getIntent();
        if(nonNull(recognizedIntent)) {
            if(nonNull(recognizedIntent.getDefinition())) {
                /*
                 * TODO check equals works fine for IntentDefinition.
                 */
                return recognizedIntent.getDefinition().equals(this.intentDefinition);
            } else {
                throw new IllegalStateException(MessageFormat.format("The current {0}'s definition is null",
                        RecognizedIntent.class.getSimpleName()));
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
