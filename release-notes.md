## Changes by Kind

### Feature

- Feat(trait): Add path-based Ingress options to ingress trait
  feat(cli): Support setting maps in traits API (#4090, @astefanutti)

### Bug or Regression

- Fix(builder): native from source should rebuild (#4161, @squakez)
- Fix(cmd): rebuild KameletBindings (#4215, @squakez)
- Fix(cmd): run does not expand camel properties (#4202, @squakez)
- Fix(e2e): TestLocalPlatform (#4459, @squakez)
- Fix(test): code refactoring (#4104, @squakez)

### Uncategorized

- Fix(ci): e2e native action name (#4095, @squakez)
- Fix(cmd): compatibility check when not a semver (#4140, @squakez)
- Fix(operator): do not panic if cannot set GOMAXPROCS (#4301, @squakez)
- Fix: Improve error reporting in case of knative is required but not installed (#4248, @claudio4j)
- Knative trait sets `bindings.knative.dev/include=true` label to the namespace when there is a SinkBinding. (#4141, @claudio4j)
- Remove custom labels from build time (#4184, @claudio4j)
- Secret managers parsing errors (#4110, @oscerd)

## Dependencies

### Added
_Nothing has changed._

### Changed
_Nothing has changed._

### Removed
_Nothing has changed._
