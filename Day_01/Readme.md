# 🚀 Array: Remove Element (Interview Question)

> **Difficulty:** Easy
> **Topic:** Arrays, Two Pointers
> **Companies:** Frequently asked in coding interviews

---

## 📖 Problem Statement

Given an integer array `nums` and an integer `val`, remove **all occurrences** of `val` **in-place** and return the new length `k`.

You **must not** use any extra array.

After removing the elements:

* The first `k` positions of `nums` should contain all elements that are **not equal** to `val`.
* The order of the remaining elements **does not matter**.
* Elements beyond index `k - 1` can be ignored.

---

## 🔹 Method Signature

```java
public static int removeElement(int[] nums, int val)
```

---

# Example 1

### Input

```text
nums = [3,2,2,3]
val = 3
```

### Output

```text
k = 2
```

### Valid Array State

```text
[2,2,_,_]
```

Only the first `k = 2` elements matter.

---

# Example 2

### Input

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
val = 1
```

### Output

```text
k = 7
```

### Valid Array State

```text
[-2,-3,4,-1,2,-5,4,_,_]
```

Again, only the first `k = 7` elements are checked.

---

# 💡 Intuition

We only care about keeping the elements that are **not equal** to `val`.

Use a variable called `writeIndex`.

### Idea

* Traverse the array from left to right.
* Whenever the current element is not equal to `val`,
  place it at `writeIndex`.
* Move `writeIndex` forward.
* At the end, `writeIndex` represents the new length `k`.

---

# 🎯 Visual Walkthrough

### Input

```text
nums = [3,2,2,3]
val = 3
```

### Initial State

```text
writeIndex = 0
```

### Step 1

```text
nums[0] = 3
```

Skip because it equals `val`.

```text
writeIndex = 0
```

---

### Step 2

```text
nums[1] = 2
```

Store at writeIndex.

```text
nums[0] = 2
writeIndex = 1
```

Array:

```text
[2,2,2,3]
```

---

### Step 3

```text
nums[2] = 2
```

Store at writeIndex.

```text
nums[1] = 2
writeIndex = 2
```

Array:

```text
[2,2,2,3]
```

---

### Step 4

```text
nums[3] = 3
```

Skip.

Final:

```text
[2,2,2,3]
```

New Length:

```text
k = 2
```

---

# ✅ Java Solution

```java
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int writeIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }

        }

        return writeIndex;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};

        int k = removeElement(nums, 3);

        System.out.println("New Length: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
```

---

# ⚡ Complexity Analysis

### Time Complexity

```text
O(n)
```

We scan the array only once.

---

### Space Complexity

```text
O(1)
```

No extra array is used.

---

# 🧠 Interview Takeaway

This problem teaches:

* In-place array modification
* Two-pointer technique
* Efficient space usage
* Array compaction pattern

This pattern is commonly used in:

* Removing duplicates
* Moving zeros
* Filtering elements
* Data stream processing

---

## 🏆 Key Insight

Instead of deleting elements, simply **overwrite valid elements at the front of the array** and keep track of the next available position using a `writeIndex`.

```text
Read Pointer ➜ scans the array
Write Pointer ➜ stores valid elements
```

This gives an optimal solution with:

✅ O(n) Time
✅ O(1) Space

---

### Happy Coding 🚀

### Learn • Code • Grow
