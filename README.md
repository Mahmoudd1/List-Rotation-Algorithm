# List-Rotation-Algorithm
This repository contains a Java implementation of the "List Rotation Algorithm"
The algorithm is designed to rotate a given linked list to the right by k places.
## Problem Description

The problem statement is as follows:

Given the head of a linked list and an integer k, rotate the list to the right by k places.
## Algorithm
The rotateRight method takes the head of a linked list and an integer k as input parameters. It performs the following steps to rotate the list to the right by k places:

- Check if k is 0 or if the head is null. If true, return the head as it is.
- Calculate the length of the linked list by traversing it with a temporary pointer (temphead).
- Update the value of k to k modulo length. If k becomes 0, return the head as it is.
- Reset the temporary pointer (temphead) to the original head of the linked list.
- Set the value of len to length minus k.
- Traverse the linked list with the temporary pointer until the second-to-last node is reached.
- On reaching the second-to-last node, set the new head (newHead) as the next node and break the link between the current node and the next node.
- Set the next node of the current temporary pointer (temphead.next) as the original head.
- Return the new head as the result of the rotation.
 ## Complexity Analysis
The time complexity of the algorithm is O(n), where n is the length of the linked list. This is because we need to traverse the linked list twice to calculate the length and perform the rotation.

The space complexity of the algorithm is O(1) as it uses a constant amount of additional space.
