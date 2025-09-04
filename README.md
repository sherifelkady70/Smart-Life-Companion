# Smart Life Companion

Smart Life Companion is a modern Android application designed to simplify daily tasks and enhance productivity.  
It is built with Clean Architecture, MVI, and the latest Android technologies, following a modular, scalable, and testable structure.  

---

## Project Architecture

- Multi-Module Setup  
  - Each feature is developed as an independent Gradle module (e.g., `:feature-payments`, `:feature-profile`, `:feature-reminders`).  
  - This ensures separation of concerns, faster build times, and scalability.  

- Clean Architecture  
  - Organized into Domain, Data, and Presentation layers.  
  - Business logic is independent of frameworks, ensuring reusability and testability.  

- MVI (Model–View–Intent)  
  - Unidirectional data flow for predictable and maintainable UI state.  
  - State management powered by Kotlin Flow.  

---

## Technology Stack

- Language: Kotlin (2.x)  
- UI: Jetpack Compose  
- Architecture: Clean Architecture + MVI  
- Dependency Injection: Hilt / Koin  
- Networking: Ktor / Retrofit with Kotlin Serialization  
- Concurrency: Coroutines & Flow  
- Persistence: Room Database, DataStore  
- Build System: Gradle with Convention Plugins (MainGradle)  
- CI/CD: GitLab CI (build, test, sign, and distribute)  

---

## Key Features

- Feature-Based Modularity – Each feature lives in its own module, enabling easy addition or removal.  
- Scalable Architecture – Long-term maintainability with clean boundaries.  
- Reactive UI with MVI – State-driven UI powered by Flow and Compose.  
- Optimized Build Times – Modular Gradle setup with convention plugins.   

---

## Project Vision

Smart Life Companion is envisioned as a personal digital assistant.  
With its modular and scalable foundation, new features can be integrated seamlessly over time without compromising performance or stability.  

---

## Module Structure

