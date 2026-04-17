# Mini Search Engine — Java

## Overview

This is a lightweight, in-memory search engine I built in Java to understand how real search engines work under the hood. It's nothing enterprise-scale, but it covers the core ideas — document indexing, tokenization, and fast keyword lookup — all running from the command line without any external dependencies.

---

## What It Does

- Keyword search powered by an inverted index
- Automatically indexes all .txt files from a local folder
- Tracks how often each word appears across documents
- Supports adding new words to documents dynamically
- Shows per-document word occurrence stats
- Built around HashMaps and Sets for efficient retrieval

---

## Architecture

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

## How It Works

1. Reads every .txt file from the documents/ folder
2. Tokenizes the content — strips punctuation, lowercases everything
3. Builds an inverted index mapping each word to the documents it appears in
4. Takes search queries through the console
5. Returns matching document IDs instantly

---

## Data Structures Behind It

- HashMap — maps words to document IDs
- HashSet — stores unique documents per word
- Nested HashMap — tracks word frequency within each document
- Arrays and Strings — used for tokenization and processing

---

## Quick Example

Documents:
  doc1: "Java is powerful"
  doc2: "Java is widely used"

Search: java
Result: [doc1, doc2]

---

## How to Run

1. Clone the repository
2. Open in IntelliJ or Eclipse
3. Drop some .txt files into the documents/ folder
4. Run Main.java
5. Use the console menu to search words, add words, or check occurrences

---

## What I'd Add Next

- TF-IDF scoring for better result ranking
- Trie-based autocomplete
- Basic spell correction
- Multi-word query support
- A simple React frontend

---

## What I Learned Building This

Going through this project gave me a much clearer picture of how inverted indexes actually work, not just theoretically but in practice. It also pushed me to think carefully about which data structures to reach for and why — HashMaps and Sets feel obvious in hindsight, but getting the nesting right for frequency tracking took some iteration. Overall it was a solid exercise in writing clean, modular Java with a real use case driving the design decisions.
