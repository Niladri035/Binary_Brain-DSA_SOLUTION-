<div align="center">

# 🔍 Find Max & Min

### Java · Arrays · Interview Question

![Language](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-34D399?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Arrays-7C6DFA?style=for-the-badge)
![Type](https://img.shields.io/badge/Type-Interview-FBBF24?style=for-the-badge)

</div>

---

## 📌 Problem Statement

> Given an array of integers, write a method that finds the **maximum** and **minimum** numbers in the array.
> Return both as an integer array — **max at index 0**, **min at index 1**.

---

## 🔧 Method Signature

```java
public static int[] findMaxMin(int[] myList)
```

| Parameter | Type    | Description             |
|-----------|---------|-------------------------|
| `myList`  | `int[]` | Input array of integers |

**Returns:** `int[]` of size 2 → `[max, min]`

---

## 💡 Example

```
Input  : [5, 3, 8, 1, 6, 9]
Output : [9, 1]
```

### How it looks visually:

```svg
<svg width="100%" viewBox="0 0 680 200" xmlns="http://www.w3.org/2000/svg" role="img">
  <title>Array visualization showing max and min elements</title>

  <!-- Array boxes -->
  <!-- 5 -->
  <rect x="40" y="60" width="70" height="70" rx="10" fill="#F1EFE8" stroke="#888780" stroke-width="1.5"/>
  <text x="75" y="102" text-anchor="middle" font-family="monospace" font-size="22" font-weight="bold" fill="#2C2C2A">5</text>
  <text x="75" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[0]</text>

  <!-- 3 -->
  <rect x="120" y="60" width="70" height="70" rx="10" fill="#F1EFE8" stroke="#888780" stroke-width="1.5"/>
  <text x="155" y="102" text-anchor="middle" font-family="monospace" font-size="22" font-weight="bold" fill="#2C2C2A">3</text>
  <text x="155" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[1]</text>

  <!-- 8 -->
  <rect x="200" y="60" width="70" height="70" rx="10" fill="#F1EFE8" stroke="#888780" stroke-width="1.5"/>
  <text x="235" y="102" text-anchor="middle" font-family="monospace" font-size="22" font-weight="bold" fill="#2C2C2A">8</text>
  <text x="235" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[2]</text>

  <!-- 1 — MIN (highlighted blue) -->
  <rect x="280" y="50" width="76" height="80" rx="10" fill="#E6F1FB" stroke="#185FA5" stroke-width="2.5"/>
  <text x="318" y="96" text-anchor="middle" font-family="monospace" font-size="24" font-weight="bold" fill="#185FA5">1</text>
  <text x="318" y="118" text-anchor="middle" font-family="monospace" font-size="11" fill="#185FA5">MIN</text>
  <text x="318" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[3]</text>

  <!-- 6 -->
  <rect x="366" y="60" width="70" height="70" rx="10" fill="#F1EFE8" stroke="#888780" stroke-width="1.5"/>
  <text x="401" y="102" text-anchor="middle" font-family="monospace" font-size="22" font-weight="bold" fill="#2C2C2A">6</text>
  <text x="401" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[4]</text>

  <!-- 9 — MAX (highlighted orange) -->
  <rect x="446" y="50" width="76" height="80" rx="10" fill="#FAEEDA" stroke="#854F0B" stroke-width="2.5"/>
  <text x="484" y="96" text-anchor="middle" font-family="monospace" font-size="24" font-weight="bold" fill="#854F0B">9</text>
  <text x="484" y="118" text-anchor="middle" font-family="monospace" font-size="11" fill="#854F0B">MAX</text>
  <text x="484" y="145" text-anchor="middle" font-family="monospace" font-size="13" fill="#888780">[5]</text>

  <!-- Output arrow -->
  <text x="560" y="75" font-family="monospace" font-size="13" fill="#888780">Output:</text>
  <rect x="550" y="85" width="110" height="36" rx="8" fill="#FAEEDA" stroke="#854F0B" stroke-width="1.5"/>
  <text x="605" y="108" text-anchor="middle" font-family="monospace" font-size="16" font-weight="bold" fill="#854F0B">[ 9,</text>

  <rect x="550" y="128" width="110" height="36" rx="8" fill="#E6F1FB" stroke="#185FA5" stroke-width="1.5"/>
  <text x="605" y="152" text-anchor="middle" font-family="monospace" font-size="16" font-weight="bold" fill="#185FA5">  1 ]</text>

  <!-- Label for input -->
  <text x="250" y="25" text-anchor="middle" font-family="monospace" font-size="14" fill="#5F5E5A" font-weight="bold">myList = [5, 3, 8, 1, 6, 9]</text>
</svg>
```

---

## 🧠 Approach

### Step-by-step logic:

```svg
<svg width="100%" viewBox="0 0 680 320" xmlns="http://www.w3.org/2000/svg" role="img">
  <title>Flowchart showing findMaxMin algorithm steps</title>
  <defs>
    <marker id="arrow" viewBox="0 0 10 10" refX="8" refY="5" markerWidth="6" markerHeight="6" orient="auto-start-reverse">
      <path d="M2 1L8 5L2 9" fill="none" stroke="#5F5E5A" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/>
    </marker>
  </defs>

  <!-- Step 1: Start -->
  <rect x="240" y="10" width="200" height="48" rx="24" fill="#E1F5EE" stroke="#0F6E56" stroke-width="1.5"/>
  <text x="340" y="39" text-anchor="middle" font-family="sans-serif" font-size="14" font-weight="500" fill="#085041">Start: Set max = min = arr[0]</text>
  <line x1="340" y1="58" x2="340" y2="90" stroke="#5F5E5A" stroke-width="1.5" marker-end="url(#arrow)"/>

  <!-- Step 2: Loop -->
  <rect x="210" y="90" width="260" height="48" rx="8" fill="#EEEDFE" stroke="#534AB7" stroke-width="1.5"/>
  <text x="340" y="119" text-anchor="middle" font-family="sans-serif" font-size="14" font-weight="500" fill="#26215C">Loop: for each element in array</text>
  <line x1="340" y1="138" x2="340" y2="170" stroke="#5F5E5A" stroke-width="1.5" marker-end="url(#arrow)"/>

  <!-- Step 3: Compare max -->
  <rect x="170" y="170" width="180" height="48" rx="8" fill="#FAEEDA" stroke="#854F0B" stroke-width="1.5"/>
  <text x="260" y="194" text-anchor="middle" font-family="sans-serif" font-size="13" font-weight="500" fill="#633806">if element &gt; max</text>
  <text x="260" y="210" text-anchor="middle" font-family="sans-serif" font-size="12" fill="#854F0B">→ update max</text>

  <!-- Step 4: Compare min -->
  <rect x="370" y="170" width="180" height="48" rx="8" fill="#E6F1FB" stroke="#185FA5" stroke-width="1.5"/>
  <text x="460" y="194" text-anchor="middle" font-family="sans-serif" font-size="13" font-weight="500" fill="#0C447C">if element &lt; min</text>
  <text x="460" y="210" text-anchor="middle" font-family="sans-serif" font-size="12" fill="#185FA5">→ update min</text>

  <line x1="340" y1="170" x2="280" y2="170" stroke="#5F5E5A" stroke-width="1" stroke-dasharray="4 3"/>
  <line x1="340" y1="170" x2="430" y2="170" stroke="#5F5E5A" stroke-width="1" stroke-dasharray="4 3"/>

  <!-- Step 5: Return -->
  <line x1="260" y1="218" x2="260" y2="268" stroke="#5F5E5A" stroke-width="1" stroke-dasharray="4 3"/>
  <line x1="460" y1="218" x2="460" y2="268" stroke="#5F5E5A" stroke-width="1" stroke-dasharray="4 3"/>
  <line x1="260" y1="268" x2="460" y2="268" stroke="#5F5E5A" stroke-width="1" stroke-dasharray="4 3"/>
  <line x1="340" y1="268" x2="340" y2="275" stroke="#5F5E5A" stroke-width="1.5" marker-end="url(#arrow)"/>

  <rect x="215" y="275" width="250" height="40" rx="20" fill="#E1F5EE" stroke="#0F6E56" stroke-width="1.5"/>
  <text x="340" y="300" text-anchor="middle" font-family="sans-serif" font-size="14" font-weight="500" fill="#085041">Return [max, min]</text>
</svg>
```

---

## ✅ Solution (Java)

```java
/**
 * ╔══════════════════════════════════════════════════════════╗
 * ║  Find Max & Min in an Array — Java                       ║
 * ╚══════════════════════════════════════════════════════════╝
 *
 * Problem   : Find Maximum and Minimum in Array
 * Difficulty: Easy
 * Topic     : Arrays
 *
 * ── APPROACH ───────────────────────────────────────────────
 * Initialize max and min to the first element.
 * Loop through the array once, updating max and min.
 *
 * ── COMPLEXITY ─────────────────────────────────────────────
 * Time : O(n)  — single pass through the array
 * Space: O(1)  — only two extra variables used
 */
public class FindMaxMin {

    public static int[] findMaxMin(int[] myList) {

        // Edge case: empty array
        if (myList == null || myList.length == 0) {
            return new int[]{};
        }

        int max = myList[0];  // start with first element
        int min = myList[0];  // start with first element

        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];  // found a new max
            }
            if (myList[i] < min) {
                min = myList[i];  // found a new min
            }
        }

        return new int[]{max, min};
    }

    // ── TEST ──────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMaxMin(new int[]{5, 3, 8, 1, 6, 9})));
        // Expected: [9, 1]

        System.out.println(Arrays.toString(findMaxMin(new int[]{-5, -1, -10, 0})));
        // Expected: [0, -10]

        System.out.println(Arrays.toString(findMaxMin(new int[]{42})));
        // Expected: [42, 42]
    }
}
```

---

## 📊 Complexity Analysis

| | Brute Force | Optimal (This Solution) |
|---|---|---|
| **Time** | O(n²) | ✅ **O(n)** |
| **Space** | O(1) | ✅ **O(1)** |
| **Passes** | Multiple | ✅ **Single pass** |

---

## 🧪 Test Cases

| Input | Expected Output | Notes |
|-------|-----------------|-------|
| `[5, 3, 8, 1, 6, 9]` | `[9, 1]` | Normal case |
| `[-5, -1, -10, 0]` | `[0, -10]` | Negative numbers |
| `[7, 7, 7]` | `[7, 7]` | All duplicates |
| `[42]` | `[42, 42]` | Single element |
| `[0, 0, 1]` | `[1, 0]` | Contains zero |

---

## ⚠️ Edge Cases to Remember

- **Negative numbers** — `min` must be initialized to `arr[0]`, not `0`
- **All duplicates** — max and min will be equal, that's valid
- **Single element** — returns `[x, x]`
- **Null / empty array** — return `{}` or handle gracefully

---

## 🔑 Key Takeaway

> Initialize **both `max` and `min` to `arr[0]`** — never to `0` or `Integer.MAX_VALUE` unless you know your constraints.
> One pass is all you need. 🚀

---

<div align="center">

*Part of the **Binary Brain** DSA series by [@Niladri035](https://github.com/Niladri035)*

</div>