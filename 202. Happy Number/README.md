# 202. Happy Number

Write an algorithm to determine if a number `n` is happy.

A **happy number** is a number defined by the following process:

<li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
<li>Repeat the process until the number equals 1 (where it will stay), or it <strong>loops endlessly in a cycle</strong> which does not include 1.</li>
<li>Those numbers for which this process <strong>ends in 1</strong> are happy.</li>

 <br/>

**Example 1:**

<pre>
<strong>Input:</strong> n = 19
<strong>Output:</strong> true
<strong>Explanation:</strong>
1<sup>2</sup> + 9<sup>2</sup> = 82
8<sup>2</sup> + 2<sup>2</sup> = 68
6<sup>2</sup> + 8<sup>2</sup> = 100
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</pre>

**Example 2:**

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> false
</pre>
 

**Constraints:**

<li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>

<br/>

**Exercise on Website:** https://leetcode.com/problems/happy-number