# 392. Is Subsequence

Given two strings `s` and `t`, return `true` *if* `s` *is a **subsequence** of `t`, or `false` otherwise*.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

 

**Example 1:**

>**Input:** s = "abc", t = "ahbgdc"  
**Output:** true

**Example 2:**

>**Input:** s = "axc", t = "ahbgdc"  
**Output:** false
 

**Constraints:**

<li><code>0 &lt;= s.length &lt;= 100</code></li>
<li><code>0 &lt;= t.length &lt;= 10<sup>4</sup></code></li>
<li><code>s</code> and <code>t</code> consist only of lowercase English letters.</li>
 
 <br/>

**Follow up:** Suppose there are lots of incoming `s`, say <code>s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>k</sub></code> where <code>k &gt;= 10<sup>9</sup></code>, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

**Exercise on Website:** https://leetcode.com/problems/is-subsequence