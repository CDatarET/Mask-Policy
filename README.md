# Mask-Policy
CodeChef Difficulty 1064 Problem

Mask Policy – Virus Spread Prevention
A city has been infected by a contagious virus.

In a recent survey, it was found that A out of the N people living in the city are currently infected. It has been observed that the only way for a person to get infected is if they come into contact with an already infected person, and both individuals are NOT wearing a mask.

The mayor of the city wants to implement a new Mask Policy and needs to find out the minimum number of people who must wear a mask to completely prevent further spread of the virus.

Note: The goal is only to prevent the virus from spreading, not to ensure that every infected person is masked.

Input Format
The first line contains an integer T — the number of test cases.

Each of the next T lines contains two integers:

N: Total number of people in the city.

A: Number of people already infected.

Output Format
For each test case, print a single integer — the minimum number of people who need to wear a mask to prevent the virus from spreading.

Sample Input
Copy
Edit
3
5 2
10 4
8 0
Sample Output
Copy
Edit
2
4
0
Explanation
In the first case, at least 2 non-infected people (or infected people) need to wear masks so that no maskless interaction between infected and healthy people occurs.

In the second case, the mayor can choose any 4 people (infected or not) to wear masks such that spread is prevented.

In the third case, since there are no infections, no masks are needed.

Logic
To stop the spread, you need to ensure that every interaction between an infected and uninfected person involves at least one person wearing a mask.

Thus, the minimum number of people to mask is:

ini
Copy
Edit
min_masks = min(A, N - A)
Where:

A is the number of infected people.

N - A is the number of uninfected people.

This ensures that all interactions are "safe".
