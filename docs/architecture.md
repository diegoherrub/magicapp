# 📖 MagicApp Architecture

This document describes the architecture of **MagicApp**, which follows **Clean Architecture** and **MVVM (Model-View-ViewModel)** to ensure a modular, scalable, and maintainable structure.

## 📌 High-Level Overview
The project is divided into two main layers:
- **`app/`** → Contains global configurations and reusable components.
- **`features/`** → Contains the core functionalities of the application, structured independently for better modularity.

---

## 🏗️ **Project Structure**

```
📂 magicapp/
 ├── MainActivity.kt         # Main Activity
 │
 ├── 📂 app/                 # Global configuration and shared resources
 │   ├── MagicApp.kt         # Application class for Koin
 │   ├── 📂 common/          # Reusable components
 │   │   ├── 📂 views/       # Global Custom Views
 │   │   ├── 📂 adapters/    # Global adapters
 │   │   ├── 📂 extensions/  # Kotlin extensions
 │   │   ├── 📂 utils/       # Helper functions and utilities
 │   │   ├── 📂 constants/   # Static values (API keys, routes, etc.)
 │   ├── 📂 data/            # Global data (not tied to features)
 │   ├── 📂 di/              # Global dependency injection configuration
 │   ├── 📂 domain/          # Global business logic and models
 │
 ├── 📂 features/            # Feature-specific modules
 │   ├── 📂 data/            # Data layer (Room, API, Repositories)
 │   │   ├── 📂 local/       # Room (DAO, Entity, Database)
 │   │   ├── 📂 remote/      # API Calls (Retrofit, DTOs, Network)
 │   │   ├── 📂 models/      # DTOs and Entities
 │   ├── 📂 domain/          # Domain layer (Models, Use Cases)
 │   │   ├── 📂 repository/  # Repository interfaces (abstraction)
 │   │   ├── 📂 usecase/     # Business logic (Use Cases)
 │   │   ├── 📂 mappers/     # DTO ↔ Entity ↔ Domain Model conversion
 │   ├── 📂 presentation/    # Presentation layer (UI + ViewModels)
 │   │   ├── 📂 ui/          # Fragments, Activities, Composables
 │   │   ├── 📂 adapter/     # Feature-specific adapters
 │   │   ├── 📂 navigation/  # Navigation (Safe Args)
 │   │   ├── 📂 viewmodel/   # ViewModels
 │   ├── 📂 di/              # Feature-specific dependency injection
```

---

## 🛠️ **Key Design Principles**

### **1️⃣ Clean Architecture**
Each layer follows the **Separation of Concerns** principle:
- **Data Layer (`data/`)**: Responsible for fetching and persisting data (Room, Retrofit).
- **Domain Layer (`domain/`)**: Contains business rules and logic (Use Cases, Models, Repositories).
- **Presentation Layer (`presentation/`)**: Handles UI logic with ViewModels and Fragments/Activities.

### **2️⃣ MVVM Pattern**
Each **feature module** follows the MVVM pattern:
- **Model** → Business logic and data handling (Located in `domain/`).
- **View** → UI components (Located in `presentation/ui/`).
- **ViewModel** → Connects UI with the business logic (Located in `presentation/viewmodel/`).

### **3️⃣ Dependency Injection with Koin**
- **Global dependencies** → Defined in `app/di/`
- **Feature-specific dependencies** → Defined in `features/di/`

### **4️⃣ Modularity and Scalability**
- Features are **independent and modular**, making the app scalable.
- Common utilities and components are centralized in `app/common/`.
- Repositories provide an **abstraction** layer between `data/` and `domain/`.

---

## 🔍 **Next Steps**
- [ ] Implement the directory structure in the project.
- [ ] Set up the initial packages based on this architecture.
- [ ] Define the first feature module (`collection/`, `deck/`, etc.).

This architecture ensures a **scalable, maintainable, and testable** structure for MagicApp. 🚀
