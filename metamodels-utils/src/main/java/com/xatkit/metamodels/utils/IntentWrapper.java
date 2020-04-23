package com.xatkit.metamodels.utils;

import com.xatkit.intent.RecognizedIntent;

public class IntentWrapper extends EventWrapper {

    public IntentWrapper(RecognizedIntent intent) {
        super(intent);
    }

    public RecognizedIntent getRecognizedIntent() {
        return (RecognizedIntent) this.eventInstance;
    }

    public String getMatchedInput() {
        return getRecognizedIntent().getMatchedInput();
    }

    public float getRecognitionConfidence() {
        return getRecognizedIntent().getRecognitionConfidence();
    }
}
