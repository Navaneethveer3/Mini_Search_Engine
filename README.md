# 🚀 Mini Search Engine (Java)

## 📌 Overview

Mini Search Engine is a lightweight, in-memory search engine built using **Java**, designed to simulate how real-world search engines work at a fundamental level.

It processes a collection of text documents, builds an **inverted index**, and allows users to perform fast and efficient keyword-based searches through a command-line interface.

---

## 🎯 Key Features

* 🔍 Fast keyword search using inverted index
* 📂 Automatic document indexing from local folder
* 🧠 Word frequency tracking for relevance
* ➕ Dynamic word insertion into documents
* 📊 Word occurrence analysis per document
* ⚡ Efficient retrieval using HashMap & Set

---

## 🏗️ Architecture

```
app/
 └── Main.java

index/
 ├── IndexBuilder.java
 └── InvertedIndex.java

util/
 ├── FileReaderUtil.java
 └── Tokenizer.java

documents/
 ├── doc1.txt
 ├── doc2.txt
 └── doc3.txt
```

---

## ⚙️ How It Works

1. Reads all `.txt` files from the `documents/` folder
2. Tokenizes text (removes punctuation, converts to lowercase)
3. Builds an inverted index:

   ```
   word → list of document IDs
   ```
4. Accepts user queries via console
5. Returns matching documents instantly

---

## 🧠 Data Structures Used

* HashMap → Word to document mapping
* HashSet → Unique document storage
* Nested HashMap → Word frequency per document
* Arrays / Strings → Token processing

---

## 💡 Example

### Documents:

```
doc1: "Java is powerful"
doc2: "Java is widely used"
```

### Search:

```
Input: java
Output: [1, 2]
```

---

## ▶️ How to Run

1. Clone the repository
2. Open in Eclipse or IntelliJ
3. Add `.txt` files inside `documents/` folder
4. Run `Main.java`
5. Use the console menu to:

   * Search words
   * Add words
   * Check occurrences

---

## 🚀 Future Improvements

* Ranking using TF-IDF
* Auto-complete using Trie
* Spell correction
* Web UI (React)
* Multi-word query support

---

## 🎯 Learning Outcomes

* Understanding of inverted index
* Practical use of DSA (HashMaps, Sets)
* Hands-on Java OOP design
* Basics of search engine internals

---

## ⭐ Why This Project?

This project demonstrates:

* Core search engine design concepts
* Efficient use of data structures
* Clean and modular object-oriented architecture

Perfect for showcasing SDE-level problem-solving skills.
