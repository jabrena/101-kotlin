# 101-Kotlin (parent)

This parent module aggregates all learning modules and centralizes shared configuration:

- Dependency and plugin versions (Kotlin, JUnit, Enforcer, Spotless, Dokka).
- Quality gates and build plugin setup.
- Submodules: `core`, `fp`.

Run the full build and tests:

```bash
./mvnw clean verify
```
