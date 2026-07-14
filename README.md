<div align="center">
<br/>

[![Typing SVG](https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=700&size=22&pause=1000&color=7C6DFA&center=true&vCenter=true&multiline=true&width=700&height=80&lines=Niladri+Santra+%7C+@Niladri035;DSA+%26+CP+%E2%80%94+Basics+to+Deep+%7C+Java+%F0%9F%94%A5;One+commit+a+day.+Every+day.+No+excuses.)](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-)

<br/>

[![Language](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![LeetCode](https://img.shields.io/badge/LeetCode-@Niladri035-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com)
[![Repo Size](https://img.shields.io/github/repo-size/Niladri035/Binary_Brain-DSA_SOLUTION-?style=for-the-badge&color=7C6DFA&label=Repo+Size)](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-)
[![Last Commit](https://img.shields.io/github/last-commit/Niladri035/Binary_Brain-DSA_SOLUTION-?style=for-the-badge&color=34D399)](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-)
[![Stars](https://img.shields.io/github/stars/Niladri035/Binary_Brain-DSA_SOLUTION-?style=for-the-badge&color=FBBF24)](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-)

<br/>

[🧠 About](#-about) •
[📁 Structure](#-repository-structure) •
[🗺️ Roadmap](#-5-month-roadmap) •
[📊 Progress](#-progress-tracker) •
[📖 Templates](#-solution-template) •
[🔗 Resources](#-resources)

</div>

---

## 🧠 About

Hey, I'm **Niladri Santra** — a Java programmer from West Bengal, India. 🇮🇳

This repository is my **daily DSA & Competitive Programming practice log**. Every problem I solve gets committed here — no cherry-picking, no skipping days. Raw, real progress from **basics to deep**.

**Why Binary Brain?**
> Because DSA is about training your brain to *think in binary* — break every problem into smaller subproblems until it's trivially solvable.

**My story:**
I had a **1-year gap** from coding. I'm back, stronger, with a clear plan. This repo is my accountability partner. If you're on the same comeback journey — this is for you too.

**What you'll find here:**
- 🔁 Daily Java solutions — every topic, every pattern
- 📝 Clean code with approach comments in every file
- 🗺️ A full 5-month roadmap from basics to FAANG-level
- 📅 Daily logs with what I learned and what I struggled with
- 🧩 Algorithm templates I use in contests

---

## 📁 Repository Structure

```
📦 Binary_Brain-DSA_SOLUTION-/
│
├── 📂 01-Basics/
│   ├── TimeComplexity/
│   ├── BitManipulation/
│   └── MathFundamentals/
│
├── 📂 02-Arrays/
│   ├── Easy/
│   ├── Medium/
│   └── Hard/
│
├── 📂 03-Strings/
│
├── 📂 04-LinkedList/
│   ├── Singly/
│   ├── Doubly/
│   └── Circular/
│
├── 📂 05-Stack-Queue/
│   ├── Stack/
│   ├── Queue/
│   ├── MonotonicStack/
│   └── Deque/
│
├── 📂 06-Recursion-Backtracking/
│
├── 📂 07-Sorting-Searching/
│
├── 📂 08-Hashing/
│
├── 📂 09-Trees/
│   ├── BinaryTree/
│   ├── BST/
│   ├── AVL/
│   ├── SegmentTree/
│   ├── FenwickTree/
│   └── Trie/
│
├── 📂 10-Heaps/
│
├── 📂 11-Graphs/
│   ├── BFS-DFS/
│   ├── TopologicalSort/
│   ├── ShortestPath/
│   ├── MST/
│   ├── DSU/
│   └── Advanced/
│
├── 📂 12-Dynamic-Programming/
│   ├── 1D-DP/
│   ├── 2D-DP/
│   ├── Knapsack/
│   ├── LCS-LIS/
│   ├── DP-on-Trees/
│   └── BitmaskDP/
│
├── 📂 13-Greedy/
│
├── 📂 14-Divide-Conquer/
│
├── 📂 15-Advanced-DS/
│   ├── SparseTable/
│   ├── SqrtDecomposition/
│   └── SkipList/
│
├── 📂 16-Patterns/
│   ├── SlidingWindow/
│   ├── TwoPointers/
│   ├── FastSlowPointer/
│   ├── MergeIntervals/
│   └── MonotonicStack/
│
├── 📂 17-CP-Contests/
│   ├── Codeforces/
│   └── LeetCode-Weekly/
│
├── 📂 Daily-Log/
│   └── 2025-06/
│       ├── 2025-06-01.md
│       └── ...
│
├── 📜 README.md
└── 📜 PROGRESS.md
```

### 📌 File Naming Convention

```
ProblemName_Platform_Difficulty.java

Examples:
  TwoSum_LC_Easy.java
  MaxSlidingWindow_LC_Hard.java
  ShortestPath_GFG_Medium.java
  A_DivisionByZero_CF_800.java     ← Codeforces: rating instead of difficulty
```

---

## 📖 Solution Template

Every `.java` file in this repo follows this exact template — no exceptions:

```java
/**
 * ╔══════════════════════════════════════════════════════════╗
 * ║  BINARY BRAIN — Daily DSA | @Niladri035                  ║
 * ╚══════════════════════════════════════════════════════════╝
 *
 * Problem   : Two Sum
 * Platform  : LeetCode (#1)
 * Link      : https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * Topic     : Arrays, Hashing
 *
 * ── APPROACH ───────────────────────────────────────────────
 * Brute force: O(n²) — nested loops
 * Optimal   : HashMap to store complement values
 *             For each element x, check if (target - x) exists
 *
 * ── COMPLEXITY ─────────────────────────────────────────────
 * Time : O(n)
 * Space: O(n)
 *
 * ── DATE ───────────────────────────────────────────────────
 * 2025-06-01  |  Day 1 of grind  🔥
 */
public class TwoSum_LC_Easy {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // ── TEST ──────────────────────────────────────────────
    public static void main(String[] args) {
        TwoSum_LC_Easy sol = new TwoSum_LC_Easy();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));
        // Expected: [0, 1]
    }
}
```

---

## 🗺️ 5-Month Roadmap

> My complete journey — **basics to deep**. Checked off as I go.

### 🔵 Phase 1 — Revision Sprint (Month 1)
*Revise all topics using my personal notes. 5–8 LeetCode problems/day in Java.*

| Week | Topics | Status |
|------|--------|:------:|
| **Week 1** | Arrays (two-pointer, sliding window, prefix sum, Kadane) | ⬜ |
| **Week 1** | Strings (palindrome, anagram, KMP basics) | ⬜ |
| **Week 2** | Linked Lists (singly, doubly, fast-slow pointer, cycle detection) | ⬜ |
| **Week 2** | Stacks & Queues (monotonic stack, deque, NGE problems) | ⬜ |
| **Week 3** | Trees (traversals, BST, height, diameter, LCA) | ⬜ |
| **Week 3** | Heaps & Hashing (top-K, frequency maps, rolling hash) | ⬜ |
| **Week 4** | Graphs (BFS, DFS, topological sort, cycle detection, bipartite) | ⬜ |
| **Week 4** | Dynamic Programming (all major patterns from notes) | ⬜ |

### 🟡 Phase 2 — CS Core + Backtracking (Month 2)
*OOPS, DBMS, OS study + 30 min LeetCode daily to keep DSA warm.*

| Week | DSA Focus | Status |
|------|-----------|:------:|
| **Week 5–6** | Recursion deep dive, Backtracking (subsets, permutations, N-Queens, Sudoku) | ⬜ |
| **Week 7–8** | Divide & Conquer, Sorting from scratch, Binary Search on answer | ⬜ |

### 🟠 Phase 3 — Advanced Graphs & Trees (Month 3)
*CN, Web theory + advanced DSA.*

| Week | Topics | Status |
|------|--------|:------:|
| **Week 9–10** | Dijkstra, Bellman-Ford, Floyd-Warshall, Kruskal, Prim | ⬜ |
| **Week 10–11** | Trie, Segment Tree (point & range update), Fenwick Tree | ⬜ |
| **Week 11–12** | SCC (Kosaraju/Tarjan), Bridges, Articulation Points, DSU | ⬜ |

### 🔴 Phase 4 — Hard Problems + CP Contests (Month 4)
*System Design study + hard LeetCode + Codeforces Div.2.*

| Week | Topics | Status |
|------|--------|:------:|
| **Week 13–14** | DP — Bitmask DP, DP on Trees, Interval DP, Digit DP | ⬜ |
| **Week 15–16** | Bit Manipulation tricks, Sparse Table (RMQ), sqrt decomposition | ⬜ |
| **Week 15–16** | Regular Codeforces Div.2 contests (A, B, C problems) | ⬜ |

### 🟢 Phase 5 — Full Revision + Mock Interviews (Month 5)
*Basic ML + simulate real interviews.*

| Week | Focus | Status |
|------|-------|:------:|
| **Week 17–18** | Pattern-wise revision — all 17 patterns systematically | ⬜ |
| **Week 19–20** | Daily mock interviews (timed), cheat sheets, final push | ⬜ |

---

## 📊 Progress Tracker

> Updated every Sunday. Full log → [PROGRESS.md](PROGRESS.md)

### 📈 Overall Stats

| Metric | Count |
|--------|:-----:|
| 🟢 Total Problems Solved | **0** |
| 🟡 LeetCode Easy / Medium / Hard | 0 / 0 / 0 |
| 🔴 Codeforces Problems | 0 |
| 🔵 GFG Problems | 0 |
| 🏆 Contests Participated | 0 |
| 🔥 Current Streak | Day 1 |
| 📅 Grind Started | June 1, 2025 |

### 🗂️ Topic-wise Progress

| Topic | Solved | Confidence |
|-------|:------:|:----------:|
| Arrays & Strings | 0 | ○○○○○ |
| Linked Lists | 0 | ○○○○○ |
| Stack & Queue | 0 | ○○○○○ |
| Recursion & Backtracking | 0 | ○○○○○ |
| Trees | 0 | ○○○○○ |
| Heaps | 0 | ○○○○○ |
| Hashing | 0 | ○○○○○ |
| Graphs | 0 | ○○○○○ |
| Dynamic Programming | 0 | ○○○○○ |
| Greedy | 0 | ○○○○○ |
| Bit Manipulation | 0 | ○○○○○ |
| Advanced DS | 0 | ○○○○○ |

*Confidence: ○○○○○ → ●●●●● (5 levels)*

---

## 📅 Daily Log Format

Each day goes inside `Daily-Log/YYYY-MM/YYYY-MM-DD.md`:

```markdown
## 📅 2025-06-01  |  Day 1  |  🔥 Streak: 1

### ✅ Problems Solved

| # | Problem | Platform | Difficulty | Topic | Time Taken |
|---|---------|----------|------------|-------|-----------|
| 1 | Two Sum | LeetCode #1 | Easy | Arrays, Hashing | 12 min |
| 2 | Valid Parentheses | LeetCode #20 | Easy | Stack | 9 min |
| 3 | Best Time to Buy & Sell Stock | LeetCode #121 | Easy | Array, DP | 15 min |

### 🧠 What I Learned Today
- HashMap makes complement-search O(1) — completely eliminates the nested loop
- Stack is perfect for balanced bracket problems — always check before popping

### 😤 What I Struggled With
- Forgot edge case: empty stack before popping in parentheses check
- Overcomplicated the stock problem — simple one-pass with minPrice variable is enough

### 📌 Tomorrow's Plan
- Arrays: Kadane's Algorithm (max subarray)
- Start sliding window pattern
- Revise fast/slow pointer for linked lists
```

---

## 🧩 Key Java Templates

Templates I use in contests and interviews — copy-paste ready.

<details>
<summary><b>🔍 Binary Search (3 variations)</b></summary>

```java
// 1. Standard — find exact target
int binarySearch(int[] arr, int target) {
    int lo = 0, hi = arr.length - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) lo = mid + 1;
        else hi = mid - 1;
    }
    return -1;
}

// 2. Lower bound — first position >= target
int lowerBound(int[] arr, int target) {
    int lo = 0, hi = arr.length;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] < target) lo = mid + 1;
        else hi = mid;
    }
    return lo;
}

// 3. Binary search on answer — find min valid value
int searchOnAnswer(int lo, int hi) {
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (isValid(mid)) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
```
</details>

<details>
<summary><b>🌊 Sliding Window (fixed & variable)</b></summary>

```java
// Fixed window — max sum of k consecutive elements
int maxSumFixed(int[] arr, int k) {
    int sum = 0, maxSum = 0;
    for (int i = 0; i < k; i++) sum += arr[i];
    maxSum = sum;
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}

// Variable window — longest subarray with sum <= k
int longestSubarray(int[] arr, int k) {
    int left = 0, sum = 0, maxLen = 0;
    for (int right = 0; right < arr.length; right++) {
        sum += arr[right];
        while (sum > k) sum -= arr[left++];
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```
</details>

<details>
<summary><b>🌐 Graph BFS & DFS (grid + adjacency list)</b></summary>

```java
// BFS — shortest path in unweighted graph
int[] bfs(int src, List<List<Integer>> adj, int n) {
    int[] dist = new int[n];
    Arrays.fill(dist, -1);
    Queue<Integer> q = new LinkedList<>();
    q.offer(src); dist[src] = 0;
    while (!q.isEmpty()) {
        int u = q.poll();
        for (int v : adj.get(u)) {
            if (dist[v] == -1) { dist[v] = dist[u] + 1; q.offer(v); }
        }
    }
    return dist;
}

// DFS — recursive
void dfs(int u, boolean[] vis, List<List<Integer>> adj) {
    vis[u] = true;
    for (int v : adj.get(u)) if (!vis[v]) dfs(v, vis, adj);
}

// Grid BFS — 4-directional
int[][] DIRS = {{0,1},{0,-1},{1,0},{-1,0}};
void bfsGrid(int[][] grid, int sr, int sc) {
    int m = grid.length, n = grid[0].length;
    boolean[][] vis = new boolean[m][n];
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{sr, sc}); vis[sr][sc] = true;
    while (!q.isEmpty()) {
        int[] cur = q.poll();
        for (int[] d : DIRS) {
            int nr = cur[0]+d[0], nc = cur[1]+d[1];
            if (nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc]) {
                vis[nr][nc] = true; q.offer(new int[]{nr,nc});
            }
        }
    }
}
```
</details>

<details>
<summary><b>🔗 Union-Find (DSU) with path compression</b></summary>

```java
class DSU {
    int[] parent, rank, size;

    DSU(int n) {
        parent = new int[n]; rank = new int[n]; size = new int[n];
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        if (rank[px] < rank[py]) { int t = px; px = py; py = t; }
        parent[py] = px; size[px] += size[py];
        if (rank[px] == rank[py]) rank[px]++;
        return true;
    }

    int size(int x) { return size[find(x)]; }
}
```
</details>

<details>
<summary><b>🗺️ Dijkstra's Shortest Path</b></summary>

```java
int[] dijkstra(int src, List<int[]>[] adj, int n) {
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[src] = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
    pq.offer(new int[]{0, src});
    while (!pq.isEmpty()) {
        int[] cur = pq.poll();
        int d = cur[0], u = cur[1];
        if (d > dist[u]) continue; // skip stale
        for (int[] edge : adj[u]) {
            int v = edge[0], w = edge[1];
            if (dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w;
                pq.offer(new int[]{dist[v], v});
            }
        }
    }
    return dist;
}
```
</details>

<details>
<summary><b>💼 0/1 Knapsack & Unbounded Knapsack</b></summary>

```java
// 0/1 Knapsack — each item used at most once
int knapsack01(int[] w, int[] v, int cap) {
    int n = w.length;
    int[] dp = new int[cap + 1];
    for (int i = 0; i < n; i++)
        for (int c = cap; c >= w[i]; c--) // reverse to avoid reuse
            dp[c] = Math.max(dp[c], dp[c - w[i]] + v[i]);
    return dp[cap];
}

// Unbounded Knapsack — each item can be used multiple times
int knapsackUnbounded(int[] w, int[] v, int cap) {
    int n = w.length;
    int[] dp = new int[cap + 1];
    for (int c = 0; c <= cap; c++)
        for (int i = 0; i < n; i++)
            if (w[i] <= c) dp[c] = Math.max(dp[c], dp[c - w[i]] + v[i]);
    return dp[cap];
}
```
</details>

<details>
<summary><b>🌳 Segment Tree (sum, range query, point update)</b></summary>

```java
class SegTree {
    int[] tree; int n;

    SegTree(int[] arr) {
        n = arr.length; tree = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }

    void build(int[] arr, int node, int s, int e) {
        if (s == e) { tree[node] = arr[s]; return; }
        int mid = (s + e) / 2;
        build(arr, 2*node+1, s, mid);
        build(arr, 2*node+2, mid+1, e);
        tree[node] = tree[2*node+1] + tree[2*node+2];
    }

    int query(int node, int s, int e, int l, int r) {
        if (r < s || e < l) return 0;
        if (l <= s && e <= r) return tree[node];
        int mid = (s + e) / 2;
        return query(2*node+1, s, mid, l, r) + query(2*node+2, mid+1, e, l, r);
    }

    void update(int node, int s, int e, int idx, int val) {
        if (s == e) { tree[node] = val; return; }
        int mid = (s + e) / 2;
        if (idx <= mid) update(2*node+1, s, mid, idx, val);
        else update(2*node+2, mid+1, e, idx, val);
        tree[node] = tree[2*node+1] + tree[2*node+2];
    }

    // Public wrappers
    int query(int l, int r) { return query(0, 0, n-1, l, r); }
    void update(int idx, int val) { update(0, 0, n-1, idx, val); }
}
```
</details>

<details>
<summary><b>📝 Trie (insert, search, prefix)</b></summary>

```java
class Trie {
    private TrieNode root = new TrieNode();

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return true;
    }
}
```
</details>

---

## 💡 My Problem-Solving Process

I follow this *every single time* — no rushing:

```
1. READ     → Read twice. No skimming.
2. EXAMPLES → Trace through the given examples by hand.
3. BRUTE    → Think brute force first. What's the naive O(n²) or O(n³)?
4. PATTERN  → Which pattern does this look like? (See table below)
5. OPTIMAL  → Can I improve? Sliding window? DP? Greedy?
6. CODE     → Write clean Java. Meaningful variable names.
7. EDGE     → Test: empty input, single element, all same, max/min values
8. DOCUMENT → Fill the header comment with approach + complexity.
```

### Pattern Recognition Table

| Problem looks like... | Think... |
|----------------------|----------|
| Subarray sum / longest subarray | Sliding Window or Prefix Sum |
| Pair in sorted array | Two Pointers |
| Linked list cycle or middle | Fast & Slow Pointer |
| All subsets or permutations | Backtracking |
| Optimal choice at each step | Greedy |
| Overlapping subproblems | Dynamic Programming |
| Minimum in a range | Segment Tree / Sparse Table |
| Shortest path (unweighted graph) | BFS |
| Shortest path (weighted, positive) | Dijkstra |
| Connected components / union | DSU |
| Top-K elements | Heap (Priority Queue) |
| Check duplicates instantly | HashSet / HashMap |
| String matching / search | KMP / Rabin-Karp / Trie |
| Merge or sort intervals | Sort + Greedy |
| XOR tricks / bit operations | Bit Manipulation |
| Count 1s in range / frequency | Fenwick Tree |

---

## 🔗 Resources I Follow

| Resource | Purpose |
|----------|---------|
| [Striver's TUF YouTube](https://www.youtube.com/@takeUforward) | Primary — best DSA in Java, every topic |
| [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/) | Problem list for revision |
| [NeetCode 150](https://neetcode.io/practice) | Interview-focused 150 problems |
| [CSES Problem Set](https://cses.fi/problemset/) | 300 must-solve CP problems |
| [Gate Smashers](https://www.youtube.com/@GateSmashers) | OS, DBMS, CN theory |
| [Codeforces](https://codeforces.com/) | Weekly Div.2 contests |
| [LeetCode Discuss](https://leetcode.com/discuss/) | Community patterns & editorial |

---

## 🏆 My Competitive Programming Profiles

<div align="center">

| Platform | Profile |
|----------|---------|
| 🟠 LeetCode | [Niladri035](https://leetcode.com) |
| 🔵 Codeforces | [Niladri035](https://codeforces.com) |
| 🟢 GeeksForGeeks | [Niladri035](https://geeksforgeeks.org) |
| 🔴 CodeChef | [Niladri035](https://codechef.com) |

</div>

---

## 📝 Commit Message Format

```
[TOPIC] Platform | Problem Name | Difficulty

[ARRAY]    LC     | Two Sum                     | Easy
[DP]       LC     | Longest Common Subsequence  | Medium
[GRAPH]    CF     | Road Construction           | 800
[TREE]     GFG    | Height of Binary Tree       | Easy
[DAILY]    LOG    | 2025-06-01 | 5 problems | Arrays
[REVISION] WEEK-1 | Arrays & Strings complete   | ✅
[TEMPLATE] ADDED  | DSU + Segment Tree templates
```

---

## 📜 License

Open source under [MIT License](LICENSE).
Use any solution here to learn — never submit it directly to judges.

---

<img src="https://capsule-render.vercel.app/api?type=waving&color=7C6DFA&height=120&section=footer&animation=fadeIn" width="100%"/>

<div align="center">

**Built by [Niladri Santra](https://github.com/Niladri035) with ☕ stubbornness and Java.**

*1-year gap → back with a plan → Binary Brain activated 🧠*

*If this helped you, drop a ⭐ — it keeps the streak alive!*

[![Visitors](https://komarev.com/ghpvc/?username=Niladri035&color=7C6DFA&style=for-the-badge&label=Visitors)](https://github.com/Niladri035)

</div>

<!---LeetCode Topics Start-->
# LeetCode Topics
## Depth-First Search
|  |
| ------- |
| [2492-minimum-score-of-a-path-between-two-cities](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2492-minimum-score-of-a-path-between-two-cities) |
| [2685-count-the-number-of-complete-components](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2685-count-the-number-of-complete-components) |
## Breadth-First Search
|  |
| ------- |
| [2492-minimum-score-of-a-path-between-two-cities](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2492-minimum-score-of-a-path-between-two-cities) |
| [2685-count-the-number-of-complete-components](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2685-count-the-number-of-complete-components) |
## Union-Find
|  |
| ------- |
| [0128-longest-consecutive-sequence](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0128-longest-consecutive-sequence) |
| [2492-minimum-score-of-a-path-between-two-cities](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2492-minimum-score-of-a-path-between-two-cities) |
| [2685-count-the-number-of-complete-components](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2685-count-the-number-of-complete-components) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Graph Theory
|  |
| ------- |
| [2492-minimum-score-of-a-path-between-two-cities](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2492-minimum-score-of-a-path-between-two-cities) |
| [2685-count-the-number-of-complete-components](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/2685-count-the-number-of-complete-components) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Array
|  |
| ------- |
| [0031-next-permutation](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0031-next-permutation) |
| [0033-search-in-rotated-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0035-search-insert-position) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0088-merge-sorted-array) |
| [0128-longest-consecutive-sequence](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0128-longest-consecutive-sequence) |
| [0152-maximum-product-subarray](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0152-maximum-product-subarray) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0162-find-peak-element) |
| [0169-majority-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0169-majority-element) |
| [0229-majority-element-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0229-majority-element-ii) |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
| [0540-single-element-in-a-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0540-single-element-in-a-sorted-array) |
| [0875-koko-eating-bananas](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0875-koko-eating-bananas) |
| [1283-find-the-smallest-divisor-given-a-threshold](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1283-find-the-smallest-divisor-given-a-threshold) |
| [1288-remove-covered-intervals](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1288-remove-covered-intervals) |
| [1301-number-of-paths-with-max-score](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1301-number-of-paths-with-max-score) |
| [1331-rank-transform-of-an-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1331-rank-transform-of-an-array) |
| [1482-minimum-number-of-days-to-make-m-bouquets](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1482-minimum-number-of-days-to-make-m-bouquets) |
| [1752-check-if-array-is-sorted-and-rotated](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1752-check-if-array-is-sorted-and-rotated) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Two Pointers
|  |
| ------- |
| [0031-next-permutation](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0031-next-permutation) |
| [0088-merge-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0088-merge-sorted-array) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Hash Table
|  |
| ------- |
| [0128-longest-consecutive-sequence](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0128-longest-consecutive-sequence) |
| [0169-majority-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0169-majority-element) |
| [0229-majority-element-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0229-majority-element-ii) |
| [1331-rank-transform-of-an-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1331-rank-transform-of-an-array) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3532-path-existence-queries-in-a-graph-i) |
## Divide and Conquer
|  |
| ------- |
| [0169-majority-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0169-majority-element) |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
## Sorting
|  |
| ------- |
| [0088-merge-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0088-merge-sorted-array) |
| [0169-majority-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0169-majority-element) |
| [0229-majority-element-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0229-majority-element-ii) |
| [1288-remove-covered-intervals](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1288-remove-covered-intervals) |
| [1331-rank-transform-of-an-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1331-rank-transform-of-an-array) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0169-majority-element) |
| [0229-majority-element-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0229-majority-element-ii) |
## Binary Search
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0069-sqrtx) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0162-find-peak-element) |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
| [0540-single-element-in-a-sorted-array](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0540-single-element-in-a-sorted-array) |
| [0875-koko-eating-bananas](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0875-koko-eating-bananas) |
| [1283-find-the-smallest-divisor-given-a-threshold](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1283-find-the-smallest-divisor-given-a-threshold) |
| [1482-minimum-number-of-days-to-make-m-bouquets](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1482-minimum-number-of-days-to-make-m-bouquets) |
| [3532-path-existence-queries-in-a-graph-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3532-path-existence-queries-in-a-graph-i) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Binary Indexed Tree
|  |
| ------- |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
## Segment Tree
|  |
| ------- |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
## Merge Sort
|  |
| ------- |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
## Ordered Set
|  |
| ------- |
| [0493-reverse-pairs](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0493-reverse-pairs) |
## Dynamic Programming
|  |
| ------- |
| [0152-maximum-product-subarray](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0152-maximum-product-subarray) |
| [1301-number-of-paths-with-max-score](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1301-number-of-paths-with-max-score) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Matrix
|  |
| ------- |
| [1301-number-of-paths-with-max-score](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1301-number-of-paths-with-max-score) |
## Math
|  |
| ------- |
| [0069-sqrtx](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/0069-sqrtx) |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
| [3754-concatenate-non-zero-digits-and-multiply-by-sum-i](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3754-concatenate-non-zero-digits-and-multiply-by-sum-i) |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
## String
|  |
| ------- |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
## Prefix Sum
|  |
| ------- |
| [3756-concatenate-non-zero-digits-and-multiply-by-sum-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3756-concatenate-non-zero-digits-and-multiply-by-sum-ii) |
## Greedy
|  |
| ------- |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Bit Manipulation
|  |
| ------- |
| [3534-path-existence-queries-in-a-graph-ii](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3534-path-existence-queries-in-a-graph-ii) |
## Enumeration
|  |
| ------- |
| [1291-sequential-digits](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/1291-sequential-digits) |
## Number Theory
|  |
| ------- |
| [3336-find-the-number-of-subsequences-with-equal-gcd](https://github.com/Niladri035/Binary_Brain-DSA_SOLUTION-/tree/master/3336-find-the-number-of-subsequences-with-equal-gcd) |
<!---LeetCode Topics End-->