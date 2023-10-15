# 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

**Example 1:**

> **Input:** nums = [1,3,5,6], target = 5  
**Output:** 2

**Example 2:**

> **Input:** nums = [1,3,5,6], target = 2  
**Output:** 1

**Example 3:**

> **Input:** nums = [1,3,5,6], target = 7  
**Output:** 4
 

**Constraints:**

<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
<li><code>nums</code> contains <strong>distinct</strong> values sorted in <strong>ascending</strong> order.</li>
<li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>

**Exercise on Webiste:** https://leetcode.com/problems/search-insert-position/