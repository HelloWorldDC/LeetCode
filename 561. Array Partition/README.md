# 561. Array Partition

Given an integer array `nums` of `2n` integers, group these integers into `n` pairs <code>(a<sub>1</sub>, b<sub>1</sub>), (a<sub>2</sub>, b<sub>2</sub>), ..., (a<sub>n</sub>, b<sub>n</sub>)</code> such that the sum of <code>min(a<sub>i</sub>, b<sub>i</sub>)</code> for all `i` is **maximized**. Return *the maximized sum*.

 


**Example 1:**

<pre><strong>Input:</strong> nums = [1,4,3,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -&gt; min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -&gt; min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -&gt; min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.</pre>

**Example 2:**

<pre><strong>Input:</strong> nums = [6,2,6,5,1,2]
<strong>Output:</strong> 9
<strong>Explanation:</strong> The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
</pre>
 

**Constraints:**

<li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
<li><code>nums.length == 2 * n</code></li>
<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>

<br/>

**Exercise on Website:** https://leetcode.com/problems/array-partition
