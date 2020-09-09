Xatkit Metamodels
=====

This repository contains the Ecore metamodels used by the Xatkit framework:
- `common`: the common language used in Xatkit. This metamodel contains transversal concepts such as *platform and library imports*, *runtime operations*, and *control flow operations*.
- `intent`: represents user *intents*, extracted *context parameters*, *training sentences*, and NLP *entities*.
- `platform`: contains a set of classes to define Xatkit *platforms*, *action* signatures, and *intent/event* provider definitions.
- `execution`: weaves concepts from `common`, `intent`, and `platform` into a bot specification. The metamodel offers constructs to specify *execution rules*.

These metamodels are used by the [*Xatkit Runtime*](https://github.com/xatkit-bot-platform/xatkit-runtime) component as a pivot representation to receive intents/events and trigger actions. 
