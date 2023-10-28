# 551. Student Attendance Record I

You are given a string `s` representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

<li><code>'A'</code>: Absent.</li>
<li><code>'L'</code>: Late.</li>
<li><code>'P'</code>: Present.</li>

<br/>

The student is eligible for an attendance award if they meet **both** of the following criteria:

<li>The student was absent (<code>'A'</code>) for <strong>strictly</strong> fewer than 2 days <strong>total</strong>.</li>
<li>The student was <strong>never</strong> late (<code>'L'</code>) for 3 or more <strong>consecutive</strong> days.</li>

<br/>

Return `true` *if the student is eligible for an attendance award, or* `false` *otherwise*.

 


**Example 1:**

>**Input:** s = "PPALLP"  
**Output:** true  
**Explanation:** The student has fewer than 2 absences and was never late 3 or more consecutive days.

**Example 2:**

>**Input:** s = "PPALLL"  
**Output:** false  
**Explanation:** The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
 

**Constraints:**

<li><code>1 &lt;= s.length &lt;= 1000</code></li>
<li><code>s[i]</code> is either <code>'A'</code>, <code>'L'</code>, or <code>'P'</code>.</li>

<br/>

**Exercise on Website:** https://leetcode.com/problems/student-attendance-record-i
