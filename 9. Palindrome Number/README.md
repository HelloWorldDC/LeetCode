# 9. Palindrome Number

Given an integer `x`, return `true` *if* `x` *is a palindrome[^1]*, *and* `false` *otherwise*.

 

**Example 1:**

> **Input:** x = 121  
**Output:** true  
**Explanation:** 121 reads as 121 from left to right and from right to left.

**Example 2:**

> **Input:** x = -121  
**Output:** false  
**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

**Example 3:**

> **Input:** x = 10  
**Output:** false  
**Explanation:** Reads 01 from right to left. Therefore it is not a palindrome.
 

**Constraints:**

<li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li>
 
<br/>

**Follow up:** Could you solve it without converting the integer to a string?

Exercise on Website: https://leetcode.com/problems/palindrome-number

[^1]: An integer is a **palindrome** when it reads the same forward and backward. For example, `121` is a palindrome while `123` is not.