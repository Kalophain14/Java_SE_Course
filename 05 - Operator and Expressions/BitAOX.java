/*
Bitwise operators = they can only perfomed on integer values (doesnt work on float and double)

AND & = Both values has to be true otherwise false
OR | = if any value is true then it is true
NOT ~ =
XOR (exclusive or) ^ = if any of the two values are different it is true
RIGHT SHIFT >>
UNSIGNED RIGHT SHIFT >>>
LEFT SHIFT <<

int x = 10, y = 6, 3;

// Binary form example
x = 0 0 0 0 1 0 1 0
y = 0 0 0 0 0 1 1 0

result = x & y (AND OPERATORS)
r = 0 0 0 0 0 0 1 0 (bit 10)

result2 = x | y (OR OPERATORS)
r2 = 0 0 0 0 1 1 1 0 (bit 14)

result3 = x ^ y (XOR Operators)
r3 = 0 0 0 0 1 1 0 0 (bit 12)

 */