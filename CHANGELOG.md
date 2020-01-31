# Changelog

All notable changes for the Xatkit metamodels will be documented in this file.

Note that there is no changelog available for the initial release of the platform (1.0.0), you can find the release notes [here](https://github.com/xatkit-bot-platform/xatkit-metamodels/releases).

The changelog format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/v2.0.0.html)

## Unreleased

### Changed

- Changed type of `ContextParameterValue#value` to `Object` (previously `String`). This allows to store complex values returned by the *Intent Recognition Provider* (e.g. DialogFlow's nested *structs* for composite entities). **This change breaks the public API**.

## [2.0.0] - 2019-12-01

### Added

- *Platform* metamodel now support types for *Action* parameters and *Action* return types. Types are optional, and must refer to a JVM type (e.g. a type loaded from the classpath).
- Added class *RuntimeModel* in *metamodels-utils*, that represents a runtime-level instance of an execution rule. This class is used by the languages' JVM inferrers to compute accessible attributes (*context*, *session*, ...), and should not be instantiated by client code.
- Add attribute `EventInstance#triggeredFrom`  in intent metamodel to store the trace of the platform that triggered an event. This attribute is a *String*, reference to the platform metamodel are not possible in the intent one.
- Add attribute `ExecutionRule#fromPlatform` in execution metamodel to store the *PlatformDefinition clause* (i.e. the platform that have created the event). This attribute allows to filter intents/events based on their provenance, allowing to match the same event from different platforms in multi-messaging platform bots.

### Changed

- *Execution* metamodel now integrates *Xbase* expressions. **This change breaks the public API**: the metamodel doesn't contain *ActionInstance* elements anymore, and major structural changes have been performed to integrate Xbase. 

### Removed

- The ad hoc expression language defined in the *Common* metamodel has been removed, and replaced by the Xbase integration in the *Execution* and *Platform* metamodels. **This change breaks the public API**: execution models integrating the *common expression language* won't work properly anymore.

## [1.0.0] - 2019-10-10 

See the release notes [here](https://github.com/xatkit-bot-platform/xatkit-metamodels/releases).

