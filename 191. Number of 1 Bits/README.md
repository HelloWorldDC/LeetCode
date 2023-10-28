# 191. Number of 1 Bits

Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the [Hamming weight](http://en.wikipedia.org/wiki/Hamming_weight "Hamming weight")).

**Note:**

<li>Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.</li>
<li>In Java, the compiler represents the signed integers using <a href="https://en.wikipedia.org/wiki/Two%27s_complement" target="_blank" class="">2's complement notation</a>. Therefore, in <strong class="example">Example 3</strong>, the input represents the signed integer. <code>-3</code>.</li>
 

**Example 1:**

> **Input:** n = 00000000000000000000000000001011  
**Output:** 3  
**Explanation:** The input binary string **00000000000000000000000000001011** has a total of three '1' bits.

**Example 2:**

> **Input**: n = 00000000000000000000000010000000
**Output:** 1
**Explanation:** The input binary string **00000000000000000000000010000000** has a total of one '1' bit.

**Example 3:**

> **Input:** n = 11111111111111111111111111111101
**Output:** 31
**Explanation:** The input binary string **11111111111111111111111111111101** has a total of thirty one '1' bits.
 

**Constraints:**

<li>The input must be a <strong>binary string</strong> of length <code>32</code>.</li>
 
<br/>

**Follow up:** If this function is called many times, how would you optimize it?


**Exercise on Websie:** https://leetcode.com/problems/number-of-1-bits