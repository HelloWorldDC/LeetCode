# 58. Length of Last Word

Given a string `s` consisting of words and spaces, return *the length of the **last** word in the string*.

A **word** is a maximal substring [^1] consisting of non-space characters only.

 

**Example 1:**

> **Input:** s = "Hello World"  
**Output:** 5  
**Explanation:** The last word is "World" with length 5.

**Example 2:**

> **Input:** s = "   fly me   to   the moon  "  
**Output:** 4  
**Explanation:** The last word is "moon" with length 4.

**Example 3:**

> **Input:** s = "luffy is still joyboy"  
**Output:** 6  
**Explanation:** The last word is "joyboy" with length 6.
 

**Constraints:**

<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
<li><code>s</code> consists of only English letters and spaces <code>' '</code>.</li>
<li>There will be at least one word in <code>s</code>.</li>

[^1]: A **substring** is a contiguous non-empty sequence of characters within a string.

**Exercise on Website:** https://leetcode.com/problems/length-of-last-word/