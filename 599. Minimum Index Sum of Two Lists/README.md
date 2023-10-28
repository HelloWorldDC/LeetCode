# 599. Minimum Index Sum of Two Lists

Given two arrays of strings `list1` and `list2`, find the **common strings with the least index sum**.

A **common string** is a string that appeared in both `list1` and `list2`.

A **common string with the least index sum** is a common string such that if it appeared at `list1[i]` and `list2[j]` then `i + j` should be the minimum value among all the other **common strings**.

Return *all the* **common strings with the least index sum**. Return the answer in **any order**.

 


**Example 1:**

>**Input:** list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]  
**Output:** ["Shogun"]  
**Explanation:** The only common string is "Shogun".

**Example 2:**

>**Input:** list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]  
**Output:** ["Shogun"]  
**Explanation:** The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.

**Example 3:**

>**Input:** list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]  
**Output:** ["sad","happy"]  
**Explanation:** There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
 

**Constraints:**

<li><code>1 &lt;= list1.length, list2.length &lt;= 1000</code></li>
<li><code>1 &lt;= list1[i].length, list2[i].length &lt;= 30</code></li>
<li><code>list1[i]</code> and <code>list2[i]</code> consist of spaces <code>' '</code> and English letters.</li>
<li>All the strings of <code>list1</code> are <strong>unique</strong>.</li>
<li>All the strings of <code>list2</code> are <strong>unique</strong>.</li>
<li>There is at least a common string between <code>list1</code> and <code>list2</code>.</li>

<br/>

**Exercise on Website:** https://leetcode.com/problems/minimum-index-sum-of-two-lists
