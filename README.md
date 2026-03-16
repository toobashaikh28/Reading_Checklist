# 📚 Reading Checklist – Todo App

<p align="center">
  <img src="https://user-images.githubusercontent.com/yourusername/reading-checklist-demo.gif" alt="Reading Checklist Demo" width="600">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1.2-brightgreen?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/Thymeleaf-HTML5-orange?style=for-the-badge&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white">
</p>

## **📖 Overview**

**Reading Checklist** is a **lightweight web application** built with **Spring Boot** and **Thymeleaf**, allowing users to **track and manage their reading list**.  

### ✨ **What You Can Do:**
| Action | Description | Icon |
|--------|-------------|------|
| **Add books** | Add new titles to your reading list | 📚 |
| **Edit book titles** | Update book names on the fly | ✏️ |
| **Mark as read** | Track your reading progress | ✔️ |
| **Delete books** | Remove books you don't want to track | 🗑️ |

> 💡 **All operations happen on a single page** – no page reloads, no database required! Data is stored **in-memory**, making it perfect for learning and experimentation.

---

## **🚀 Features**

| Feature | Description | Interaction |
|---------|-------------|-------------|
| **➕ Add Book** | Instantly add new books to your checklist | Input field + Add button |
| **✅ Mark as Read** | Toggle completion status with one click | Checkbox ✔️ |
| **✏️ Edit Book** | Update titles using an inline prompt | Edit icon (hover: *green*) |
| **🗑️ Delete Book** | Remove books permanently | Delete icon (hover: *red*) |
| **🎨 Single Page UI** | Seamless interactions without reloads | AJAX-style updates |
| **💾 In-Memory Storage** | No database setup required | `List<Todo>` collection |

---

## **🛠️ Tech Stack**

```yaml
Backend:
  - Java 17
  - Spring Boot 3.1.2
  - Maven

Frontend:
  - Thymeleaf
  - HTML5
  - CSS3
  - Font Awesome Icons

Data Layer:
  - In-memory storage (ArrayList)
  - No database required
  
```

## **📁 Project Structure**

```yaml
text
📦 reading-checklist
├── 📂 src
│   └── 📂 main
│       ├── 📂 java/com/example/todo
│       │   ├── 📄 controller/TodoController.java      # Handles HTTP requests
│       │   ├── 📄 service/TodoService.java            # Business logic
│       │   ├── 📄 repository/TodoRepository.java      # In-memory data operations
│       │   └── 📄 model/Todo.java                     # Book entity
│       └── 📂 resources
│           ├── 📄 templates/todo.html                  # Main UI template
│           └── 📄 static/todo.css                       # Styling
└── 📄 pom.xml                                           # Maven configuration

```

## **⚡ Quick Start**

**Prerequisites**
Java 17 or higher
Maven 3.6+

**Installation**
1️⃣ Clone the repository
```yml
bash
git clone https://github.com/toobashaikh28/Reading_Checklist.git
cd reading-checklist
```
2️⃣ Run with Maven
```yml
bash
mvn spring-boot:run
```
3️⃣ Open in browser
http://localhost:8080/


## **🎯 How to Use**

**📝 Adding a Book**

1. Type the book title in the input field
2. Click the "Add" button
3. Watch it appear instantly in your list!

**💡 Pro Tips:**
Hover over icons to see visual feedback
All changes are immediate – no save button needed!
Your list persists until you restart the application


## **🔮 Future Enhancements**
- Database Integration – Add MySQL/PostgreSQL support
- User Authentication – Multiple user support
- Progress Tracking – Reading stats and progress bars
- Modal Editor – Replace browser prompt with styled modal
- Search & Filter – Find books by title or genre
- Categories – Organize books by genre or priority