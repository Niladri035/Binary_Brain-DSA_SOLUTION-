<div align="center">

<!-- Animated Header Banner -->
<svg width="900" height="160" viewBox="0 0 900 160" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="bgGrad" x1="0%" y1="0%" x2="100%" y2="100%">
      <stop offset="0%" style="stop-color:#0f0c29"/>
      <stop offset="50%" style="stop-color:#302b63"/>
      <stop offset="100%" style="stop-color:#24243e"/>
    </linearGradient>
    <linearGradient id="nodeGrad" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#a78bfa"/>
      <stop offset="100%" style="stop-color:#7c3aed"/>
    </linearGradient>
    <filter id="glow">
      <feGaussianBlur stdDeviation="3" result="coloredBlur"/>
      <feMerge><feMergeNode in="coloredBlur"/><feMergeNode in="SourceGraphic"/></feMerge>
    </filter>
    <marker id="arr" markerWidth="8" markerHeight="8" refX="6" refY="3" orient="auto">
      <path d="M0,0 L0,6 L8,3 z" fill="#a78bfa"/>
    </marker>
    <style>
      .node-box { animation: pulse 2s ease-in-out infinite alternate; }
      .arrow { animation: slideIn 1.5s ease-out forwards; }
      .title-text { animation: fadeIn 1s ease-in forwards; }
      @keyframes pulse { from { opacity:0.7; } to { opacity:1; } }
      @keyframes fadeIn { from { opacity:0; transform: translateY(-10px); } to { opacity:1; transform: translateY(0); } }
      .chain-node { animation: chainPop 0.4s ease-out forwards; }
      .chain-node:nth-child(1) { animation-delay: 0.1s; }
      .chain-node:nth-child(2) { animation-delay: 0.3s; }
      .chain-node:nth-child(3) { animation-delay: 0.5s; }
      .chain-node:nth-child(4) { animation-delay: 0.7s; }
      .chain-node:nth-child(5) { animation-delay: 0.9s; }
      @keyframes chainPop { from { opacity:1; transform: scale(0.5); } to { opacity:1; transform: scale(1); } }
    </style>
  </defs>
  <!-- Background -->
  <rect width="900" height="160" fill="url(#bgGrad)" rx="16"/>
  <!-- Decorative grid lines -->
  <line x1="0" y1="40" x2="900" y2="40" stroke="#ffffff08" stroke-width="1"/>
  <line x1="0" y1="80" x2="900" y2="80" stroke="#ffffff08" stroke-width="1"/>
  <line x1="0" y1="120" x2="900" y2="120" stroke="#ffffff08" stroke-width="1"/>
  <!-- Animated chain of nodes -->
  <g class="chain-node" transform="translate(60, 95)">
    <rect x="-30" y="-20" width="60" height="40" rx="8" fill="url(#nodeGrad)" filter="url(#glow)"/>
    <text x="0" y="5" text-anchor="middle" fill="white" font-family="monospace" font-size="14" font-weight="bold">10</text>
  </g>
  <g class="chain-node" transform="translate(160, 95)">
    <line x1="-70" y1="0" x2="-40" y2="0" stroke="#a78bfa" stroke-width="2.5" marker-end="url(#arr)"/>
    <rect x="-30" y="-20" width="60" height="40" rx="8" fill="url(#nodeGrad)" filter="url(#glow)"/>
    <text x="0" y="5" text-anchor="middle" fill="white" font-family="monospace" font-size="14" font-weight="bold">20</text>
  </g>
  <g class="chain-node" transform="translate(260, 95)">
    <line x1="-70" y1="0" x2="-40" y2="0" stroke="#a78bfa" stroke-width="2.5" marker-end="url(#arr)"/>
    <rect x="-30" y="-20" width="60" height="40" rx="8" fill="url(#nodeGrad)" filter="url(#glow)"/>
    <text x="0" y="5" text-anchor="middle" fill="white" font-family="monospace" font-size="14" font-weight="bold">30</text>
  </g>
  <g class="chain-node" transform="translate(360, 95)">
    <line x1="-70" y1="0" x2="-40" y2="0" stroke="#a78bfa" stroke-width="2.5" marker-end="url(#arr)"/>
    <rect x="-30" y="-20" width="60" height="40" rx="8" fill="url(#nodeGrad)" filter="url(#glow)"/>
    <text x="0" y="5" text-anchor="middle" fill="white" font-family="monospace" font-size="14" font-weight="bold">40</text>
  </g>

  <!-- Title -->
  <text x="540" y="65" text-anchor="middle" fill="#a78bfa" font-family="Georgia, serif" font-size="38" font-weight="bold" filter="url(#glow)" class="title-text">LinkedList</text>
  <text x="540" y="100" text-anchor="middle" fill="#e2e8f0" font-family="Georgia, serif" font-size="18" class="title-text">Data Structures in Java</text>
  <text x="540" y="130" text-anchor="middle" fill="#7c3aed" font-family="monospace" font-size="13" class="title-text">▸ Complete Visual Guide with Animations</text>
</svg>

<br/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-LinkedList-7c3aed?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)

</div>

---

## 📋 Table of Contents

| # | Operation | Complexity |
|---|-----------|-----------|
| 01 | [🔨 Create LinkedList & Node](#-1-create-linkedlist--node) | O(1) |
| 02 | [⬅️ Prepend — Add to Front](#-2-prepend--add-to-front) | O(1) |
| 03 | [🗑️ Remove Last Node](#-3-remove-last-node) | O(n) |
| 04 | [✂️ Remove First Node](#-4-remove-first-node) | O(1) |
| 05 | [🔍 Get — Value by Index](#-5-get--value-by-index) | O(n) |
| 06 | [✏️ Set — Update by Index](#-6-set--update-by-index) | O(n) |
| 07 | [📌 Insert at Index](#-7-insert-at-index) | O(n) |
| 08 | [🧹 Remove at Index](#-8-remove-at-index) | O(n) |
| 09 | [🔄 Reverse the List](#-9-reverse-the-list) | O(n) |
| 10 | [🎯 Find Middle Node](#-10-find-middle-node) | O(n) |
| 11 | [🔁 Detect Loop (Floyd's)](#-11-detect-loop--floyds-algorithm) | O(n) |

---

## 🧠 What is a LinkedList?

> A **LinkedList** is a linear data structure where each element (called a **Node**) contains **data** and a **pointer** to the next node, forming a chain.

<div align="center">

<!-- LinkedList Structure SVG -->
<svg width="820" height="120" viewBox="0 0 820 120" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="nodeG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <marker id="arrowB" markerWidth="10" markerHeight="7" refX="9" refY="3.5" orient="auto">
      <polygon points="0 0, 10 3.5, 0 7" fill="#818cf8"/>
    </marker>
    <style>
      .ll-node { animation: popIn 0.5s cubic-bezier(0.34,1.56,0.64,1) both; }
      .ll-node:nth-child(1){animation-delay:0s}
      .ll-node:nth-child(2){animation-delay:0.15s}
      .ll-node:nth-child(3){animation-delay:0.3s}
      .ll-node:nth-child(4){animation-delay:0.45s}
      @keyframes popIn{from{opacity:0;transform:scale(0.3)}to{opacity:1;transform:scale(1)}}
      .ll-arrow{animation:slideArrow 0.4s ease-out both;}
      .ll-arrow:nth-child(1){animation-delay:0.25s}
      .ll-arrow:nth-child(2){animation-delay:0.4s}
      .ll-arrow:nth-child(3){animation-delay:0.55s}
      @keyframes slideArrow{from{opacity:0;stroke-dashoffset:60}to{opacity:1;stroke-dashoffset:0}}
    </style>
  </defs>
  <rect width="820" height="120" fill="#0f0a1e" rx="14"/>
  <!-- HEAD label -->
  <text x="75" y="22" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">HEAD</text>
  <line x1="75" y1="26" x2="75" y2="38" stroke="#a5b4fc" stroke-width="1.5" marker-end="url(#arrowB)"/>
  <!-- Node 1 -->
  <g class="ll-node">
    <rect x="20" y="40" width="110" height="55" rx="10" fill="url(#nodeG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="75" y1="40" x2="75" y2="95" stroke="#4f46e5" stroke-width="1"/>
    <text x="47" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="47" y="78" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">10</text>
    <text x="97" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="97" y="78" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <!-- Arrow 1 -->
  <line class="ll-arrow" x1="130" y1="67" x2="160" y2="67" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowB)" stroke-dasharray="30" stroke-dashoffset="0"/>
  <!-- Node 2 -->
  <g class="ll-node">
    <rect x="160" y="40" width="110" height="55" rx="10" fill="url(#nodeG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="215" y1="40" x2="215" y2="95" stroke="#4f46e5" stroke-width="1"/>
    <text x="187" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="187" y="78" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
    <text x="237" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="237" y="78" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <!-- Arrow 2 -->
  <line class="ll-arrow" x1="270" y1="67" x2="300" y2="67" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowB)" stroke-dasharray="30" stroke-dashoffset="0"/>
  <!-- Node 3 -->
  <g class="ll-node">
    <rect x="300" y="40" width="110" height="55" rx="10" fill="url(#nodeG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="355" y1="40" x2="355" y2="95" stroke="#4f46e5" stroke-width="1"/>
    <text x="327" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="327" y="78" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">30</text>
    <text x="377" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="377" y="78" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <!-- Arrow 3 -->
  <line class="ll-arrow" x1="410" y1="67" x2="440" y2="67" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowB)" stroke-dasharray="30" stroke-dashoffset="0"/>
  <!-- Node 4 -->
  <g class="ll-node">
    <rect x="440" y="40" width="110" height="55" rx="10" fill="url(#nodeG)" stroke="#7c3aed" stroke-width="2"/>
    <line x1="495" y1="40" x2="495" y2="95" stroke="#7c3aed" stroke-width="1"/>
    <text x="467" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="467" y="78" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">40</text>
    <text x="517" y="60" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="517" y="78" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="11">null</text>
  </g>
  <!-- TAIL label -->
  <text x="495" y="22" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">TAIL</text>
  <line x1="495" y1="26" x2="495" y2="38" stroke="#a5b4fc" stroke-width="1.5" marker-end="url(#arrowB)"/>
  <!-- null box -->
  <rect x="580" y="53" width="60" height="28" rx="6" fill="#1e1e2e" stroke="#374151" stroke-width="1" stroke-dasharray="4"/>
  <text x="610" y="72" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="12">null</text>
  <line x1="550" y1="67" x2="578" y2="67" stroke="#4b5563" stroke-width="1.5" marker-end="url(#arrowB)" stroke-dasharray="4"/>
  <!-- size label -->
  <text x="700" y="60" fill="#64748b" font-family="monospace" font-size="11">size = 4</text>
  <text x="700" y="80" fill="#64748b" font-family="monospace" font-size="11">length = O(n)</text>
</svg>

</div>

---

## 🔨 1. Create LinkedList & Node

A LinkedList is built from **Node** objects. Each node holds a value and a reference to the next node.

<div align="center">

<!-- Node anatomy SVG -->
<svg width="600" height="180" viewBox="0 0 600 180" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="anatomyGrad" x1="0%" y1="0%" x2="100%" y2="100%">
      <stop offset="0%" style="stop-color:#1a1a2e"/>
      <stop offset="100%" style="stop-color:#16213e"/>
    </linearGradient>
    <style>
      .label-line{stroke-dasharray:5;animation:dash 1s linear infinite;}
      @keyframes dash{to{stroke-dashoffset:-10}}
    </style>
  </defs>
  <rect width="600" height="180" fill="url(#anatomyGrad)" rx="14"/>
  <text x="300" y="30" text-anchor="middle" fill="#a78bfa" font-family="monospace" font-size="14" font-weight="bold">Node Anatomy</text>
  <!-- Node box -->
  <rect x="160" y="50" width="280" height="90" rx="12" fill="#1e1b4b" stroke="#6d28d9" stroke-width="2"/>
  <line x1="300" y1="50" x2="300" y2="140" stroke="#6d28d9" stroke-width="2"/>
  <!-- Labels inside -->
  <text x="230" y="90" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">DATA</text>
  <text x="230" y="112" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="24" font-weight="bold">42</text>
  <text x="370" y="90" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">NEXT</text>
  <text x="370" y="112" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="14">0x2a4f →</text>
  <!-- Annotation arrows -->
  <line class="label-line" x1="100" y1="95" x2="158" y2="95" stroke="#34d399" stroke-width="1.5"/>
  <text x="95" y="91" text-anchor="end" fill="#34d399" font-family="monospace" font-size="10">int value</text>
  <text x="95" y="103" text-anchor="end" fill="#34d399" font-family="monospace" font-size="10">or Object</text>
  <line class="label-line" x1="500" y1="95" x2="442" y2="95" stroke="#f472b6" stroke-width="1.5"/>
  <text x="505" y="91" fill="#f472b6" font-family="monospace" font-size="10">Node next</text>
  <text x="505" y="103" fill="#f472b6" font-family="monospace" font-size="10">pointer</text>
  <!-- Bottom note -->
  <text x="300" y="165" text-anchor="middle" fill="#475569" font-family="monospace" font-size="10">Each node stores value + reference to next node in memory</text>
</svg>

</div>

```java
// 🔷 Node class — the building block
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

// 🔷 LinkedList class
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Constructor — creates list with first node
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
```

> 💡 **Key Idea:** `head` points to the **first** node. `tail` points to the **last** node. `length` tracks count — no need to traverse!

---

## ⬅️ 2. Prepend — Add to Front

Insert a new node **before** the current head. The new node becomes the new head.

<div align="center">

<!-- Prepend Animation SVG -->
<svg width="720" height="160" viewBox="0 0 720 160" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="newNodeG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#059669"/>
      <stop offset="100%" style="stop-color:#047857"/>
    </linearGradient>
    <linearGradient id="existG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <marker id="arrowG" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#10b981"/>
    </marker>
    <marker id="arrowP" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <style>
      .newN{animation:slideFromLeft 0.8s cubic-bezier(0.34,1.56,0.64,1) both}
      @keyframes slideFromLeft{from{opacity:0;transform:translateX(-80px)}to{opacity:1;transform:translateX(0)}}
      .newArr{animation:fadeArr 0.5s 0.9s ease both}
      @keyframes fadeArr{from{opacity:0}to{opacity:1}}
    </style>
  </defs>
  <rect width="720" height="160" fill="#080d1a" rx="14"/>
  <text x="360" y="22" text-anchor="middle" fill="#6ee7b7" font-family="monospace" font-size="12" font-weight="bold">PREPEND(5) — New node inserted at front</text>
  <!-- NEW Node (green) -->
  <g class="newN">
    <text x="75" y="48" text-anchor="middle" fill="#10b981" font-family="monospace" font-size="10" font-weight="bold">NEW HEAD</text>
    <rect x="20" y="55" width="110" height="55" rx="10" fill="url(#newNodeG)" stroke="#10b981" stroke-width="2"/>
    <line x1="75" y1="55" x2="75" y2="110" stroke="#10b981" stroke-width="1"/>
    <text x="47" y="80" text-anchor="middle" fill="#d1fae5" font-family="monospace" font-size="10">data</text>
    <text x="47" y="98" text-anchor="middle" fill="white" font-family="monospace" font-size="18" font-weight="bold">5</text>
    <text x="97" y="80" text-anchor="middle" fill="#d1fae5" font-family="monospace" font-size="10">next</text>
    <text x="97" y="98" text-anchor="middle" fill="#6ee7b7" font-family="monospace" font-size="11">→</text>
  </g>
  <!-- New arrow -->
  <line class="newArr" x1="130" y1="82" x2="158" y2="82" stroke="#10b981" stroke-width="2.5" marker-end="url(#arrowG)" stroke-dasharray="28"/>
  <!-- Old nodes -->
  <g>
    <rect x="160" y="55" width="110" height="55" rx="10" fill="url(#existG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="215" y1="55" x2="215" y2="110" stroke="#4f46e5" stroke-width="1"/>
    <text x="187" y="80" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">data</text>
    <text x="187" y="98" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">10</text>
    <text x="237" y="80" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">next</text>
    <text x="237" y="98" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <line x1="270" y1="82" x2="298" y2="82" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowP)"/>
  <g>
    <rect x="300" y="55" width="110" height="55" rx="10" fill="url(#existG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="355" y1="55" x2="355" y2="110" stroke="#4f46e5" stroke-width="1"/>
    <text x="327" y="80" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">data</text>
    <text x="327" y="98" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
    <text x="377" y="80" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">next</text>
    <text x="377" y="98" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <line x1="410" y1="82" x2="438" y2="82" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowP)"/>
  <g>
    <rect x="440" y="55" width="110" height="55" rx="10" fill="url(#existG)" stroke="#7c3aed" stroke-width="2"/>
    <line x1="495" y1="55" x2="495" y2="110" stroke="#7c3aed" stroke-width="1"/>
    <text x="467" y="80" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">data</text>
    <text x="467" y="98" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">30</text>
    <text x="517" y="80" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="10">null</text>
  </g>
  <text x="590" y="75" fill="#6b7280" font-family="monospace" font-size="10">← TAIL</text>
  <!-- Step labels -->
  <text x="75" y="130" text-anchor="middle" fill="#10b981" font-family="monospace" font-size="9">① newNode</text>
  <text x="215" y="130" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="9">② old head</text>
  <text x="360" y="148" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">newNode.next = head → head = newNode → length++</text>
</svg>

</div>

```java
public void prepend(int value) {
    Node newNode = new Node(value);   // ① create new node
    if (length == 0) {
        head = newNode;
        tail = newNode;
    } else {
        newNode.next = head;          // ② new node points to old head
        head = newNode;              // ③ head moves to new node
    }
    length++;                        // ④ increment length
}
```

| Step | Action | Time |
|------|--------|------|
| Create node | `new Node(value)` | O(1) |
| Link | `newNode.next = head` | O(1) |
| Update head | `head = newNode` | O(1) |
| **Total** | **Constant time** | **O(1)** ✅ |

---

## 🗑️ 3. Remove Last Node

Traverse to the second-to-last node and set its `next` to `null`.

<div align="center">

<!-- Remove Last SVG -->
<svg width="720" height="175" viewBox="0 0 720 175" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="remG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <linearGradient id="removeRed" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#7f1d1d"/>
      <stop offset="100%" style="stop-color:#991b1b"/>
    </linearGradient>
    <marker id="arrowR" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <style>
      .remove-node{animation:fadeRed 1s 0.5s ease both}
      @keyframes fadeRed{from{opacity:1}to{opacity:0.3;filter:saturate(0)}}
      .cross-line{animation:drawCross 0.4s 1s ease both;stroke-dasharray:60;stroke-dashoffset:60}
      @keyframes drawCross{to{stroke-dashoffset:0}}
    </style>
  </defs>
  <rect width="720" height="175" fill="#080d1a" rx="14"/>
  <text x="360" y="22" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="12" font-weight="bold">REMOVE LAST — Traverse to 2nd-to-last, set next = null</text>
  <!-- Nodes -->
  <g>
    <rect x="20" y="45" width="110" height="55" rx="10" fill="url(#remG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="75" y1="45" x2="75" y2="100" stroke="#4f46e5" stroke-width="1"/>
    <text x="47" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="47" y="90" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">10</text>
    <text x="97" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="97" y="90" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <text x="75" y="38" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="9">HEAD</text>
  <line x1="130" y1="72" x2="158" y2="72" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowR)"/>
  <g>
    <rect x="160" y="45" width="110" height="55" rx="10" fill="url(#remG)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="215" y1="45" x2="215" y2="100" stroke="#4f46e5" stroke-width="1"/>
    <text x="187" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="187" y="90" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
    <text x="237" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">next</text>
    <text x="237" y="90" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <line x1="270" y1="72" x2="298" y2="72" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowR)"/>
  <!-- New tail -->
  <g>
    <rect x="300" y="45" width="110" height="55" rx="10" fill="url(#remG)" stroke="#10b981" stroke-width="2.5"/>
    <line x1="355" y1="45" x2="355" y2="100" stroke="#10b981" stroke-width="1"/>
    <text x="327" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="327" y="90" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">30</text>
    <text x="377" y="70" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="9">next=null</text>
  </g>
  <text x="355" y="38" text-anchor="middle" fill="#10b981" font-family="monospace" font-size="9">NEW TAIL</text>
  <line x1="410" y1="72" x2="438" y2="72" stroke="#ef4444" stroke-width="2" stroke-dasharray="5" marker-end="url(#arrowR)"/>
  <!-- Removed node -->
  <g class="remove-node">
    <rect x="440" y="45" width="110" height="55" rx="10" fill="url(#removeRed)" stroke="#ef4444" stroke-width="2"/>
    <line x1="495" y1="45" x2="495" y2="100" stroke="#ef4444" stroke-width="1"/>
    <text x="467" y="70" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="9">data</text>
    <text x="467" y="90" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="18" font-weight="bold">40</text>
    <text x="517" y="70" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="9">null</text>
  </g>
  <!-- X cross -->
  <line class="cross-line" x1="448" y1="53" x2="542" y2="95" stroke="#ef4444" stroke-width="3"/>
  <line class="cross-line" x1="542" y1="53" x2="448" y2="95" stroke="#ef4444" stroke-width="3"/>
  <text x="495" y="38" text-anchor="middle" fill="#ef4444" font-family="monospace" font-size="9">REMOVED</text>
  <!-- Traversal label -->
  <text x="200" y="130" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">Traverse with temp →</text>
  <text x="360" y="148" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">prev.next = null → tail = prev → length-- → O(n)</text>
</svg>

</div>

```java
public Node removeLast() {
    if (length == 0) return null;

    Node temp = head;
    Node pre = head;

    while (temp.next != null) {   // traverse to last node
        pre = temp;
        temp = temp.next;
    }

    tail = pre;          // update tail to previous node
    tail.next = null;    // disconnect the last node
    length--;

    if (length == 0) {   // edge case: list becomes empty
        head = null;
        tail = null;
    }
    return temp;         // return removed node
}
```

---

## ✂️ 4. Remove First Node

Simply move `head` to the next node. Super fast — **O(1)**!

<div align="center">

<!-- Remove First SVG -->
<svg width="680" height="150" viewBox="0 0 680 150" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="rf1" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#7f1d1d"/>
      <stop offset="100%" style="stop-color:#991b1b"/>
    </linearGradient>
    <linearGradient id="rf2" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <marker id="arrowH" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#10b981"/>
    </marker>
    <style>
      .head-move{animation:moveHead 1s 0.5s cubic-bezier(0.34,1.56,0.64,1) both}
      @keyframes moveHead{from{transform:translateX(-140px)}to{transform:translateX(0)}}
    </style>
  </defs>
  <rect width="680" height="150" fill="#080d1a" rx="14"/>
  <text x="340" y="22" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="12" font-weight="bold">REMOVE FIRST — Head moves to next node</text>
  <!-- Removed first node -->
  <g>
    <rect x="20" y="45" width="110" height="55" rx="10" fill="url(#rf1)" stroke="#ef4444" stroke-width="2"/>
    <line x1="75" y1="45" x2="75" y2="100" stroke="#ef4444" stroke-width="1"/>
    <text x="47" y="70" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="9">data</text>
    <text x="47" y="90" text-anchor="middle" fill="#fca5a5" font-family="monospace" font-size="18" font-weight="bold">10</text>
    <text x="97" y="82" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="10">→</text>
  </g>
  <text x="75" y="38" text-anchor="middle" fill="#ef4444" font-family="monospace" font-size="9">REMOVED</text>
  <line x1="130" y1="72" x2="158" y2="72" stroke="#ef4444" stroke-width="1.5" stroke-dasharray="5"/>
  <!-- New head node -->
  <g>
    <rect x="160" y="45" width="110" height="55" rx="10" fill="url(#rf2)" stroke="#10b981" stroke-width="2.5"/>
    <line x1="215" y1="45" x2="215" y2="100" stroke="#10b981" stroke-width="1"/>
    <text x="187" y="70" text-anchor="middle" fill="#d1fae5" font-family="monospace" font-size="9">data</text>
    <text x="187" y="90" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
    <text x="237" y="82" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  </g>
  <g class="head-move">
    <text x="215" y="38" text-anchor="middle" fill="#10b981" font-family="monospace" font-size="9" font-weight="bold">NEW HEAD ↑</text>
  </g>
  <line x1="270" y1="72" x2="298" y2="72" stroke="#818cf8" stroke-width="2"/>
  <g>
    <rect x="300" y="45" width="110" height="55" rx="10" fill="url(#rf2)" stroke="#4f46e5" stroke-width="1.5"/>
    <line x1="355" y1="45" x2="355" y2="100" stroke="#4f46e5" stroke-width="1"/>
    <text x="327" y="70" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="9">data</text>
    <text x="327" y="90" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">30</text>
    <text x="377" y="82" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="10">null</text>
  </g>
  <text x="340" y="130" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">temp = head → head = head.next → temp.next = null → O(1) ✅</text>
</svg>

</div>

```java
public Node removeFirst() {
    if (length == 0) return null;

    Node temp = head;     // save reference to current head
    head = head.next;     // move head forward
    temp.next = null;     // detach removed node
    length--;

    if (length == 0) tail = null;  // list is now empty

    return temp;
}
```

---

## 🔍 5. Get — Value by Index

Traverse from `head`, counting until you reach the target index.

<div align="center">

<!-- Get SVG -->
<svg width="680" height="160" viewBox="0 0 680 160" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="getG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <linearGradient id="foundG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1c4532"/>
      <stop offset="100%" style="stop-color:#064e3b"/>
    </linearGradient>
    <marker id="arrowGet" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#fbbf24"/>
    </marker>
    <style>
      .pointer-anim{animation:movePointer 1.5s ease-in-out both}
      @keyframes movePointer{0%{transform:translateX(0)}33%{transform:translateX(140px)}66%{transform:translateX(280px)}100%{transform:translateX(280px)}}
    </style>
  </defs>
  <rect width="680" height="160" fill="#080d1a" rx="14"/>
  <text x="340" y="22" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="12" font-weight="bold">GET(index=2) — Traverse from head, count steps</text>
  <!-- index labels -->
  <text x="75" y="38" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="10">[0]</text>
  <text x="215" y="38" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="10">[1]</text>
  <text x="355" y="38" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">[2] ← TARGET</text>
  <text x="495" y="38" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="10">[3]</text>
  <!-- Nodes -->
  <rect x="20" y="45" width="110" height="55" rx="10" fill="url(#getG)" stroke="#4f46e5" stroke-width="1.5"/>
  <line x1="75" y1="45" x2="75" y2="100" stroke="#4f46e5" stroke-width="1"/>
  <text x="47" y="75" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">10</text>
  <text x="97" y="75" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <line x1="130" y1="72" x2="158" y2="72" stroke="#818cf8" stroke-width="2"/>
  <rect x="160" y="45" width="110" height="55" rx="10" fill="url(#getG)" stroke="#4f46e5" stroke-width="1.5"/>
  <line x1="215" y1="45" x2="215" y2="100" stroke="#4f46e5" stroke-width="1"/>
  <text x="187" y="75" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
  <text x="237" y="75" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <line x1="270" y1="72" x2="298" y2="72" stroke="#818cf8" stroke-width="2"/>
  <!-- Target node (green highlight) -->
  <rect x="300" y="45" width="110" height="55" rx="10" fill="url(#foundG)" stroke="#10b981" stroke-width="2.5"/>
  <line x1="355" y1="45" x2="355" y2="100" stroke="#10b981" stroke-width="1"/>
  <text x="327" y="70" text-anchor="middle" fill="#6ee7b7" font-family="monospace" font-size="9">FOUND!</text>
  <text x="327" y="90" text-anchor="middle" fill="#6ee7b7" font-family="monospace" font-size="18" font-weight="bold">30</text>
  <text x="377" y="75" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <line x1="410" y1="72" x2="438" y2="72" stroke="#818cf8" stroke-width="2"/>
  <rect x="440" y="45" width="110" height="55" rx="10" fill="url(#getG)" stroke="#4f46e5" stroke-width="1.5"/>
  <line x1="495" y1="45" x2="495" y2="100" stroke="#4f46e5" stroke-width="1"/>
  <text x="467" y="75" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">40</text>
  <text x="517" y="75" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="10">null</text>
  <!-- Traversal arrow -->
  <text x="200" y="135" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="10">→ temp=head → step 1 → step 2 → return temp (value=30)</text>
  <text x="340" y="150" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">Time Complexity: O(n)</text>
</svg>

</div>

```java
public Node get(int index) {
    if (index < 0 || index >= length) return null;

    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;   // walk forward
    }
    return temp;
}
```

---

## ✏️ 6. Set — Update by Index

Find the node at index using `get()`, then update its value.

```java
public boolean set(int index, int value) {
    Node temp = get(index);   // reuse get() to find node

    if (temp != null) {
        temp.value = value;   // update in place
        return true;
    }
    return false;
}
```

> 🔁 **Reuse `get()`** — No need to rewrite traversal logic!

---

## 📌 7. Insert at Index

Insert a node at any position. Handle head/tail as edge cases.

<div align="center">

<!-- Insert SVG -->
<svg width="720" height="190" viewBox="0 0 720 190" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="insN" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e3a5f"/>
      <stop offset="100%" style="stop-color:#1e40af"/>
    </linearGradient>
    <linearGradient id="insE" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <marker id="arrowIns" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <marker id="arrowInsB" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#38bdf8"/>
    </marker>
    <style>
      .ins-node{animation:dropDown 0.7s cubic-bezier(0.34,1.56,0.64,1) both}
      @keyframes dropDown{from{opacity:0;transform:translateY(-50px)}to{opacity:1;transform:translateY(0)}}
    </style>
  </defs>
  <rect width="720" height="190" fill="#080d1a" rx="14"/>
  <text x="360" y="22" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="12" font-weight="bold">INSERT(index=2, value=25) — Wire new node between prev and next</text>
  <text x="75" y="40" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">[0]</text>
  <text x="215" y="40" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">[1]←prev</text>
  <text x="355" y="40" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="9" font-weight="bold">[2] NEW</text>
  <text x="495" y="40" text-anchor="middle" fill="#64748b" font-family="monospace" font-size="9">[3]→next</text>
  <!-- Existing nodes -->
  <rect x="20" y="50" width="110" height="55" rx="10" fill="url(#insE)" stroke="#4f46e5" stroke-width="1.5"/>
  <line x1="75" y1="50" x2="75" y2="105" stroke="#4f46e5" stroke-width="1"/>
  <text x="47" y="82" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">10</text>
  <text x="97" y="82" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <line x1="130" y1="77" x2="158" y2="77" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowIns)"/>
  <rect x="160" y="50" width="110" height="55" rx="10" fill="url(#insE)" stroke="#38bdf8" stroke-width="2.5"/>
  <line x1="215" y1="50" x2="215" y2="105" stroke="#38bdf8" stroke-width="1"/>
  <text x="187" y="82" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">20</text>
  <text x="237" y="82" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <!-- New node drops in -->
  <g class="ins-node">
    <rect x="300" y="50" width="110" height="55" rx="10" fill="url(#insN)" stroke="#38bdf8" stroke-width="2.5"/>
    <line x1="355" y1="50" x2="355" y2="105" stroke="#38bdf8" stroke-width="1"/>
    <text x="327" y="72" text-anchor="middle" fill="#bae6fd" font-family="monospace" font-size="9">NEW</text>
    <text x="327" y="92" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">25</text>
    <text x="377" y="82" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="11">→</text>
  </g>
  <line x1="410" y1="77" x2="438" y2="77" stroke="#38bdf8" stroke-width="2.5" marker-end="url(#arrowInsB)"/>
  <rect x="440" y="50" width="110" height="55" rx="10" fill="url(#insE)" stroke="#4f46e5" stroke-width="1.5"/>
  <line x1="495" y1="50" x2="495" y2="105" stroke="#4f46e5" stroke-width="1"/>
  <text x="467" y="82" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="18" font-weight="bold">30</text>
  <text x="517" y="82" text-anchor="middle" fill="#818cf8" font-family="monospace" font-size="11">→</text>
  <!-- Curved arrow from prev to new -->
  <path d="M 215 105 Q 285 150 355 107" stroke="#38bdf8" stroke-width="2" fill="none" stroke-dasharray="6" marker-end="url(#arrowInsB)"/>
  <text x="285" y="148" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="9">prev.next = newNode</text>
  <text x="360" y="175" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">newNode.next = next → prev.next = newNode → length++</text>
</svg>

</div>

```java
public boolean insert(int index, int value) {
    if (index < 0 || index > length) return false;
    if (index == 0) { prepend(value); return true; }    // front
    if (index == length) { append(value); return true; } // end

    Node newNode = new Node(value);
    Node prev = get(index - 1);       // node BEFORE insertion point
    Node next = prev.next;            // node AFTER insertion point

    newNode.next = next;              // ① link new → next
    prev.next = newNode;             // ② link prev → new
    length++;
    return true;
}
```

---

## 🧹 8. Remove at Index

Redirect the previous node's pointer to skip the target node.

```java
public Node remove(int index) {
    if (index < 0 || index >= length) return null;
    if (index == 0) return removeFirst();        // edge: head
    if (index == length - 1) return removeLast(); // edge: tail

    Node prev = get(index - 1);
    Node temp = prev.next;   // node to remove

    prev.next = temp.next;   // skip over temp
    temp.next = null;        // isolate removed node
    length--;
    return temp;
}
```

---

## 🔄 9. Reverse the List

Reverse all pointers in a single O(n) pass — pure pointer magic!

<div align="center">

<!-- Reverse SVG Animation -->
<svg width="720" height="230" viewBox="0 0 720 230" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="revG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <marker id="arrowFwd" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <marker id="arrowBwd" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#f472b6"/>
    </marker>
    <style>
      .rev-arrow{animation:reverseFlow 0.5s ease both}
      .rev-arrow:nth-child(1){animation-delay:0.3s}
      .rev-arrow:nth-child(2){animation-delay:0.6s}
      .rev-arrow:nth-child(3){animation-delay:0.9s}
      @keyframes reverseFlow{from{opacity:0;stroke-dashoffset:50}to{opacity:1;stroke-dashoffset:0}}
    </style>
  </defs>
  <rect width="720" height="230" fill="#080d1a" rx="14"/>
  <!-- BEFORE label -->
  <text x="360" y="22" text-anchor="middle" fill="#a78bfa" font-family="monospace" font-size="12" font-weight="bold">REVERSE — Flip all next pointers</text>
  <text x="50" y="45" fill="#64748b" font-family="monospace" font-size="10">BEFORE:</text>
  <!-- Before row -->
  <rect x="90" y="50" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="125" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">10</text>
  <line x1="160" y1="70" x2="185" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowFwd)"/>
  <rect x="185" y="50" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="220" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">20</text>
  <line x1="255" y1="70" x2="280" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowFwd)"/>
  <rect x="280" y="50" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="315" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">30</text>
  <line x1="350" y1="70" x2="375" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowFwd)"/>
  <rect x="375" y="50" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="410" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">40</text>
  <text x="445" y="74" fill="#6b7280" font-family="monospace" font-size="11"> null</text>
  <text x="90" y="48" fill="#a5b4fc" font-family="monospace" font-size="8">HEAD</text>
  <!-- Arrow pointing down (transformation) -->
  <text x="360" y="115" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="18">⟳ reversing...</text>
  <!-- After row -->
  <text x="50" y="148" fill="#64748b" font-family="monospace" font-size="10">AFTER:</text>
  <rect x="90" y="152" width="70" height="40" rx="8" fill="url(#revG)" stroke="#7c3aed" stroke-width="2"/>
  <text x="125" y="176" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">40</text>
  <line class="rev-arrow" x1="160" y1="172" x2="185" y2="172" stroke="#f472b6" stroke-width="2.5" marker-end="url(#arrowBwd)" stroke-dasharray="25"/>
  <rect x="185" y="152" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="220" y="176" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">30</text>
  <line class="rev-arrow" x1="255" y1="172" x2="280" y2="172" stroke="#f472b6" stroke-width="2.5" marker-end="url(#arrowBwd)" stroke-dasharray="25"/>
  <rect x="280" y="152" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="315" y="176" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">20</text>
  <line class="rev-arrow" x1="350" y1="172" x2="375" y2="172" stroke="#f472b6" stroke-width="2.5" marker-end="url(#arrowBwd)" stroke-dasharray="25"/>
  <rect x="375" y="152" width="70" height="40" rx="8" fill="url(#revG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="410" y="176" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">10</text>
  <text x="445" y="176" fill="#6b7280" font-family="monospace" font-size="11"> null</text>
  <text x="90" y="150" fill="#f472b6" font-family="monospace" font-size="8">NEW HEAD</text>
  <text x="360" y="215" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">3 pointers: prev=null, curr=head, next → iterate → swap head↔tail</text>
</svg>

</div>

```java
public void reverse() {
    // Swap head and tail
    Node temp = head;
    head = tail;
    tail = temp;

    Node after;
    Node before = null;
    Node current = tail;   // start from old head (now tail)

    for (int i = 0; i < length; i++) {
        after = current.next;    // save next
        current.next = before;   // flip pointer ←
        before = current;        // advance before
        current = after;         // advance current
    }
}
```

> 🧠 **Three-pointer technique:** `before`, `current`, `after` — each step flips one arrow!

---

## 🎯 10. Find Middle Node

**Floyd's Tortoise & Hare** — Two pointers at different speeds meet at the middle!

<div align="center">

<!-- Middle Node SVG -->
<svg width="720" height="185" viewBox="0 0 720 185" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="midG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <linearGradient id="midFound" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#14532d"/>
      <stop offset="100%" style="stop-color:#15803d"/>
    </linearGradient>
    <marker id="arrowMid" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <style>
      .slow-ptr{animation:slowMove 2s 0.5s cubic-bezier(0.4,0,0.6,1) both}
      .fast-ptr{animation:fastMove 2s 0.5s cubic-bezier(0.4,0,0.6,1) both}
      @keyframes slowMove{0%{transform:translateX(0)}100%{transform:translateX(220px)}}
      @keyframes fastMove{0%{transform:translateX(0)}100%{transform:translateX(440px)}}
    </style>
  </defs>
  <rect width="720" height="185" fill="#080d1a" rx="14"/>
  <text x="360" y="22" text-anchor="middle" fill="#34d399" font-family="monospace" font-size="12" font-weight="bold">FIND MIDDLE — Slow moves 1 step, Fast moves 2 steps</text>
  <!-- Nodes row -->
  <rect x="20" y="45" width="100" height="50" rx="9" fill="url(#midG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="70" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">10</text>
  <line x1="120" y1="70" x2="143" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowMid)"/>
  <rect x="143" y="45" width="100" height="50" rx="9" fill="url(#midG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="193" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">20</text>
  <line x1="243" y1="70" x2="266" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowMid)"/>
  <!-- Middle node highlighted -->
  <rect x="266" y="45" width="100" height="50" rx="9" fill="url(#midFound)" stroke="#34d399" stroke-width="3"/>
  <text x="316" y="66" text-anchor="middle" fill="#6ee7b7" font-family="monospace" font-size="9">MID!</text>
  <text x="316" y="82" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">30</text>
  <line x1="366" y1="70" x2="389" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowMid)"/>
  <rect x="389" y="45" width="100" height="50" rx="9" fill="url(#midG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="439" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">40</text>
  <line x1="489" y1="70" x2="512" y2="70" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowMid)"/>
  <rect x="512" y="45" width="100" height="50" rx="9" fill="url(#midG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="562" y="74" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">50</text>
  <text x="615" y="74" fill="#6b7280" font-family="monospace" font-size="11">null</text>
  <!-- Pointer indicators -->
  <text x="70" y="112" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="9">🐢 slow</text>
  <text x="70" y="124" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="9">🐇 fast</text>
  <text x="316" y="112" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="9">🐢 slow stops here</text>
  <text x="562" y="112" text-anchor="middle" fill="#38bdf8" font-family="monospace" font-size="9">🐇 fast=null</text>
  <!-- Steps table -->
  <text x="180" y="145" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">Step 1: slow→20, fast→30</text>
  <text x="360" y="145" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">Step 2: slow→30, fast→50</text>
  <text x="540" y="145" text-anchor="middle" fill="#475569" font-family="monospace" font-size="9">Step 3: fast.next=null → STOP!</text>
  <text x="360" y="165" text-anchor="middle" fill="#34d399" font-family="monospace" font-size="10">slow = middle node (30) ✅</text>
</svg>

</div>

```java
public Node findMiddleNode() {
    Node slow = head;   // 🐢 moves 1 step
    Node fast = head;   // 🐇 moves 2 steps

    while (fast != null && fast.next != null) {
        slow = slow.next;        // 1 hop
        fast = fast.next.next;   // 2 hops
    }

    return slow;   // when fast reaches end, slow is at middle!
}
```

> 🎯 **Why it works:** Fast pointer covers 2x distance. When fast hits the end, slow is exactly at the midpoint. No need to know the length!

---

## 🔁 11. Detect Loop — Floyd's Algorithm

Detect if the list contains a cycle. The classic **Tortoise & Hare** algorithm!

<div align="center">

<!-- Loop Detection SVG -->
<svg width="720" height="260" viewBox="0 0 720 260" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="loopG" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#1e1b4b"/>
      <stop offset="100%" style="stop-color:#312e81"/>
    </linearGradient>
    <linearGradient id="loopN" x1="0%" y1="0%" x2="0%" y2="100%">
      <stop offset="0%" style="stop-color:#7c2d12"/>
      <stop offset="100%" style="stop-color:#9a3412"/>
    </linearGradient>
    <marker id="arrowLoop" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#818cf8"/>
    </marker>
    <marker id="arrowLoopR" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto">
      <polygon points="0 0, 8 4, 0 8" fill="#f97316"/>
    </marker>
    <style>
      .loop-arc{animation:dash 3s linear infinite}
      @keyframes dash{to{stroke-dashoffset:-100}}
      .meet-flash{animation:flash 1s 1.5s ease infinite alternate}
      @keyframes flash{from{opacity:0.5}to{opacity:1;filter:drop-shadow(0 0 8px #f97316)}}
    </style>
  </defs>
  <rect width="720" height="260" fill="#080d1a" rx="14"/>
  <text x="360" y="22" text-anchor="middle" fill="#fb923c" font-family="monospace" font-size="12" font-weight="bold">HAS LOOP — Floyd's Tortoise &amp; Hare Detection</text>
  <!-- Linear nodes -->
  <rect x="20" y="60" width="90" height="50" rx="9" fill="url(#loopG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="65" y="89" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">10</text>
  <text x="65" y="58" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="9">HEAD</text>
  <line x1="110" y1="85" x2="133" y2="85" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowLoop)"/>
  <rect x="133" y="60" width="90" height="50" rx="9" fill="url(#loopG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="178" y="89" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">20</text>
  <line x1="223" y1="85" x2="246" y2="85" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowLoop)"/>
  <!-- Loop entry node (orange) -->
  <rect x="246" y="60" width="90" height="50" rx="9" fill="url(#loopN)" stroke="#f97316" stroke-width="2.5"/>
  <text x="291" y="78" text-anchor="middle" fill="#fed7aa" font-family="monospace" font-size="9">LOOP</text>
  <text x="291" y="94" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">30</text>
  <text x="291" y="58" text-anchor="middle" fill="#f97316" font-family="monospace" font-size="8">← ENTRY</text>
  <line x1="336" y1="85" x2="359" y2="85" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowLoop)"/>
  <rect x="359" y="60" width="90" height="50" rx="9" fill="url(#loopG)" stroke="#4f46e5" stroke-width="1.5"/>
  <text x="404" y="89" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">40</text>
  <line x1="449" y1="85" x2="472" y2="85" stroke="#818cf8" stroke-width="2" marker-end="url(#arrowLoop)"/>
  <!-- Meet node (flashing) -->
  <g class="meet-flash">
    <rect x="472" y="60" width="90" height="50" rx="9" fill="url(#loopN)" stroke="#f97316" stroke-width="3"/>
    <text x="517" y="78" text-anchor="middle" fill="#fed7aa" font-family="monospace" font-size="9">MEET!</text>
    <text x="517" y="94" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="16" font-weight="bold">50</text>
  </g>
  <!-- Loop back arc -->
  <path class="loop-arc" d="M 562 85 Q 620 180 291 140 Q 200 145 291 110" stroke="#f97316" stroke-width="2.5" fill="none" stroke-dasharray="15,8" marker-end="url(#arrowLoopR)"/>
  <text x="500" y="175" text-anchor="middle" fill="#f97316" font-family="monospace" font-size="10">↩ cycle back to node 30</text>
  <!-- Pointer legend -->
  <rect x="20" y="220" width="300" height="32" rx="8" fill="#0f172a" stroke="#1e293b" stroke-width="1"/>
  <text x="30" y="233" fill="#fbbf24" font-family="monospace" font-size="9">🐢 slow: one step at a time</text>
  <text x="30" y="246" fill="#38bdf8" font-family="monospace" font-size="9">🐇 fast: two steps at a time</text>
  <rect x="340" y="220" width="360" height="32" rx="8" fill="#0f172a" stroke="#1e293b" stroke-width="1"/>
  <text x="350" y="233" fill="#6ee7b7" font-family="monospace" font-size="9">If slow == fast → LOOP DETECTED ✅</text>
  <text x="350" y="246" fill="#94a3b8" font-family="monospace" font-size="9">If fast reaches null → NO LOOP ❌</text>
</svg>

</div>

```java
public boolean hasLoop() {
    Node slow = head;   // 🐢 moves 1 step per iteration
    Node fast = head;   // 🐇 moves 2 steps per iteration

    while (fast != null && fast.next != null) {
        slow = slow.next;        // advance slow by 1
        fast = fast.next.next;   // advance fast by 2

        if (slow == fast) return true;  // they MET → loop exists!
    }

    return false;   // fast reached null → no loop
}
```

> 🔑 **Why they always meet:** In a cycle, fast gains on slow by 1 node per step. In a loop of size `k`, they meet after at most `k` steps — guaranteed!

---

## 📊 Big-O Complexity Summary

<div align="center">

<!-- Complexity Table SVG -->
<svg width="720" height="380" viewBox="0 0 720 380" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <style>
      .row-hover{transition:fill 0.3s ease}
      .bar{animation:growBar 1s ease both}
      .bar:nth-child(1){animation-delay:0.1s}
      .bar:nth-child(2){animation-delay:0.2s}
      .bar:nth-child(3){animation-delay:0.3s}
      .bar:nth-child(4){animation-delay:0.4s}
      .bar:nth-child(5){animation-delay:0.5s}
      .bar:nth-child(6){animation-delay:0.6s}
      .bar:nth-child(7){animation-delay:0.7s}
      .bar:nth-child(8){animation-delay:0.8s}
      @keyframes growBar{from{width:0}to{}}
    </style>
  </defs>
  <rect width="720" height="380" fill="#0d1117" rx="14"/>
  <text x="360" y="28" text-anchor="middle" fill="#a78bfa" font-family="monospace" font-size="14" font-weight="bold">Time Complexity Overview</text>
  <!-- Header -->
  <rect x="20" y="40" width="680" height="32" rx="6" fill="#1e1b4b"/>
  <text x="130" y="61" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">OPERATION</text>
  <text x="390" y="61" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">COMPLEXITY</text>
  <text x="560" y="61" text-anchor="middle" fill="#a5b4fc" font-family="monospace" font-size="11" font-weight="bold">VISUAL</text>
  <!-- Rows -->
  <!-- O(1) operations -->
  <rect x="20" y="78" width="680" height="28" rx="4" fill="#0a1628"/>
  <text x="130" y="96" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Prepend / Remove First</text>
  <text x="390" y="96" text-anchor="middle" fill="#34d399" font-family="monospace" font-size="11" font-weight="bold">O(1) — Constant</text>
  <rect class="bar" x="470" y="84" width="100" height="16" rx="4" fill="#059669"/>
  <text x="575" y="96" fill="#6ee7b7" font-family="monospace" font-size="9">⚡ Fastest</text>
  <rect x="20" y="110" width="680" height="28" rx="4" fill="#0f172a"/>
  <text x="130" y="128" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Get / Set (index)</text>
  <text x="390" y="128" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="116" width="200" height="16" rx="4" fill="#d97706"/>
  <text x="675" y="128" fill="#fbbf24" font-family="monospace" font-size="9">traverse</text>
  <rect x="20" y="142" width="680" height="28" rx="4" fill="#0a1628"/>
  <text x="130" y="160" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Remove Last</text>
  <text x="390" y="160" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="148" width="200" height="16" rx="4" fill="#d97706"/>
  <rect x="20" y="174" width="680" height="28" rx="4" fill="#0f172a"/>
  <text x="130" y="192" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Insert at Index</text>
  <text x="390" y="192" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="180" width="200" height="16" rx="4" fill="#d97706"/>
  <rect x="20" y="206" width="680" height="28" rx="4" fill="#0a1628"/>
  <text x="130" y="224" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Remove at Index</text>
  <text x="390" y="224" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="212" width="200" height="16" rx="4" fill="#d97706"/>
  <rect x="20" y="238" width="680" height="28" rx="4" fill="#0f172a"/>
  <text x="130" y="256" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Reverse</text>
  <text x="390" y="256" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="244" width="200" height="16" rx="4" fill="#7c3aed"/>
  <rect x="20" y="270" width="680" height="28" rx="4" fill="#0a1628"/>
  <text x="130" y="288" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Find Middle Node</text>
  <text x="390" y="288" text-anchor="middle" fill="#fbbf24" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="276" width="200" height="16" rx="4" fill="#7c3aed"/>
  <rect x="20" y="302" width="680" height="28" rx="4" fill="#0f172a"/>
  <text x="130" y="320" text-anchor="middle" fill="#e2e8f0" font-family="monospace" font-size="10">Detect Loop (Floyd's)</text>
  <text x="390" y="320" text-anchor="middle" fill="#34d399" font-family="monospace" font-size="11" font-weight="bold">O(n) — Linear</text>
  <rect class="bar" x="470" y="308" width="200" height="16" rx="4" fill="#047857"/>
  <text x="675" y="320" fill="#6ee7b7" font-family="monospace" font-size="9">O(1) space</text>
  <!-- Space note -->
  <rect x="20" y="342" width="680" height="28" rx="6" fill="#1e1b4b"/>
  <text x="360" y="360" text-anchor="middle" fill="#94a3b8" font-family="monospace" font-size="10">Space Complexity: O(1) for all operations (no extra arrays) ✅</text>
</svg>

</div>

---

## 🆚 LinkedList vs Array

| Feature | LinkedList | Array |
|---------|-----------|-------|
| **Prepend** | ✅ O(1) | ❌ O(n) |
| **Append** | ✅ O(1) | ✅ O(1) amortized |
| **Random Access** | ❌ O(n) | ✅ O(1) |
| **Memory** | Extra pointer per node | Contiguous block |
| **Insert Middle** | O(n) traversal | O(n) shifting |
| **Cache Friendly** | ❌ | ✅ |

---

## 📁 Project Structure

```
LinkedList-Java/
│
├── src/
│   ├── Node.java              # Node building block
│   ├── LinkedList.java        # Main LinkedList class
│   └── Main.java              # Demo & test runner
│
└── README.md                  # This file ✨
```

---

<div align="center">

<!-- Footer SVG -->
<svg width="720" height="80" viewBox="0 0 720 80" xmlns="http://www.w3.org/2000/svg">
  <defs>
    <linearGradient id="footGrad" x1="0%" y1="0%" x2="100%" y2="0%">
      <stop offset="0%" style="stop-color:#0f0c29"/>
      <stop offset="100%" style="stop-color:#302b63"/>
    </linearGradient>
    <style>
      .footer-dot{animation:blink 1.5s ease-in-out infinite alternate}
      .footer-dot:nth-child(2){animation-delay:0.3s}
      .footer-dot:nth-child(3){animation-delay:0.6s}
      @keyframes blink{from{opacity:0.3}to{opacity:1}}
    </style>
  </defs>
  <rect width="720" height="80" fill="url(#footGrad)" rx="12"/>
  <circle class="footer-dot" cx="280" cy="40" r="5" fill="#7c3aed"/>
  <circle class="footer-dot" cx="360" cy="40" r="5" fill="#a78bfa"/>
  <circle class="footer-dot" cx="440" cy="40" r="5" fill="#7c3aed"/>
  <text x="360" y="25" text-anchor="middle" fill="#6b7280" font-family="monospace" font-size="10">Made with ❤️ while learning DSA</text>
  <text x="360" y="65" text-anchor="middle" fill="#4b5563" font-family="monospace" font-size="9">LinkedList · Java · Data Structures &amp; Algorithms</text>
</svg>

---

⭐ **Star this repo** if it helped you understand LinkedLists!

`Happy Coding! 🚀`

</div>