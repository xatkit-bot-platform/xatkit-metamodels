package com.xatkit.metamodels.utils;

import com.xatkit.intent.EventInstance;
import com.xatkit.intent.RecognizedIntent;

import java.util.Collections;
import java.util.Map;

/**
 * The parent class of the class inferred by Xtext from an execution model.
 * <p>
 * This class is dynamically extended by the JvmModelInferrer, and provides a set of attributes that can be accessed
 * as keywords from execution models ({@code context}, {@code session}, and {@code config}). These attributes can be
 * manipulated as {@link Map}s from the execution model.
 */
public class RuntimeModel {

    /**
     * The {@link Map} containing the context information.
     * <p>
     * The {@code context} {@link Map} is immutable: execution models are not allowed to put/remove information from it
     * (it is filled by the intent recognition provider and should provide consistent information to all the actions).
     */
    protected Map<String, Map<String, Object>> context;

    /**
     * The {@link Map} containing the session information for the current user session.
     */
    protected Map<String, Object> session;

    /**
     * The {@link Map} containing the Xatkit configuration information.
     * <p>
     * The configuration is represented as a {@link Map} tp uniformize attribute accesses in execution model: all the
     * attributes are {@link Map}s providing a {@link Map#get(Object)} method.
     * <p>
     * The {@code config} {@link Map} is immutable: execution models are not allowed to put/remove information from it.
     */
    protected Map<Object, Object> config;

    /**
     * The {@link RecognizedIntent} that triggered the executed execution rule.
     * <p>
     * This field is set to {@code null} if the execution rule has been triggered by an event.
     */
    protected RecognizedIntent intent = null;

    /**
     * The {@link EventInstance} that triggered the executed execution rule.
     * <p>
     * This field is never {@code null}: if the rule has been triggered by a {@link RecognizedIntent} the {@code
     * event} field will be equal to the {@code intent} one.
     */
    protected EventInstance event;

    /**
     * Constructs an empty {@link RuntimeModel}.
     */
    public RuntimeModel() {
        this(Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), null);
    }

    /**
     * Constructs a {@link RuntimeModel} from the provided {@code context}, {@code session}, and {@code config}.
     *
     * @param context       the {@link Map} containing the context information
     * @param session       the {@link Map} containing the session information for the current user session
     * @param config        the {@link Map} containing the Xatkit configuration information
     * @param eventInstance the {@link EventInstance} that triggered the execution rule
     */
    public RuntimeModel(Map<String, Map<String, Object>> context, Map<String, Object> session,
                        Map<Object, Object> config, EventInstance eventInstance) {
        this.context = Collections.unmodifiableMap(context);
        this.session = session;
        this.config = Collections.unmodifiableMap(config);
        if (eventInstance instanceof RecognizedIntent) {
            intent = (RecognizedIntent) eventInstance;
        }
        event = eventInstance;
    }
}