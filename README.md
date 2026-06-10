# README.md — Part 1

## Coding Questions 1–10 (Expanded Assessment Style)

### Question 1 — countItems(items)

A school administration system stores learner registration numbers in a list. Before generating attendance reports, the principal wants to know how many learners are registered.

Apply your logic to the countItems() method.

The method must count the total number of elements contained in the provided list and return that value.

Example

Input:

[101, 102, 103, 104, 105]

Output:

5

Constraints

* Count every element in the list.
* Duplicate values should still be counted.
* The list may contain any number of elements.

Hint

Think about how you would manually count every item in a collection.

---

### Question 2 — sumNumbers(numbers)

A school's finance department receives a list of daily payments from parents and needs to determine the total amount collected.

Apply your logic to the sumNumbers() method.

The method must calculate the sum of all values contained in the list and return the result.

Example

Input:

[10, 20, 30, 40]

Output:

100

Constraints

* The list may contain positive numbers.
* The list may contain zero.
* Return the final total.

Hint

Start with a running total and update it while processing the list.

---

### Question 3 — findLargest(numbers)

A teacher records the marks obtained by learners in a mathematics test and wants to identify the highest score achieved.

Apply your logic to the findLargest() method.

The method must return the largest value contained in the list.

Example

Input:

[55, 89, 72, 98, 61]

Output:

98

Constraints

* Assume the list contains at least one value.
* Return only the largest value.
* Do not sort the list unless absolutely necessary.

Hint

Keep track of the largest value found so far.

---

### Question 4 — countEvenNumbers(numbers)

A data analyst is processing a list of transaction IDs and needs to determine how many IDs are even numbers.

Apply your logic to the countEvenNumbers() method.

The method must count and return the number of even values in the provided list.

Example

Input:

[1, 2, 3, 4, 5, 6]

Output:

3

Constraints

* Even numbers are divisible by 2.
* Odd numbers should not be counted.
* Return the total count.

Hint

The modulus operator (%) may be useful.

---

### Question 5 — sumDigits(number)

A banking application receives account verification numbers and needs to calculate the sum of their digits for a validation check.

Apply your logic to the sumDigits() method.

The method must calculate and return the sum of all digits contained in the provided number.

Example

Input:

123

Output:

6

Explanation:

1 + 2 + 3 = 6

Additional Example

Input:

5021

Output:

8

Constraints

* Process every digit individually.
* Return the final sum.

Hint

Repeated division and modulus operations can help isolate digits.

---

### Question 6 — countVowels(text)

A language learning application wants to analyse written sentences and determine how many vowels are used.

Apply your logic to the countVowels() method.

The method must count all vowels contained in the provided string.

Rules

Count:

A
E
I
O
U

The method must:

* Ignore case
* Count uppercase and lowercase vowels equally

Example

Input:

hello world

Output:

3

Explanation:

e, o, o

Constraints

* Only vowels should be counted.
* Spaces should be ignored.
* Consonants should not be counted.

---

### Question 7 — multiplyListElements(numbers)

A manufacturing company stores machine calibration values in a list. The final calibration score is calculated by multiplying all values together.

Apply your logic to the multiplyListElements() method.

The method must multiply every value in the list and return the final result.

Example

Input:

[1, 2, 3, 4]

Output:

24

Explanation:

1 × 2 × 3 × 4 = 24

Constraints

* Every value must contribute to the result.
* Return the final product.

Hint

Unlike summation problems, your starting value should be chosen carefully.

---

### Question 8 — createBasicNumberTriangle(n)

A console-based educational game displays number patterns to help children recognise repetition and counting sequences.

Apply your logic to the createBasicNumberTriangle() method.

Generate a number triangle where each row contains the row number repeated exactly that many times.

Return the result as a list of strings.

Example

Input:

5

Output:

[
"1",
"22",
"333",
"4444",
"55555"
]

Constraints

* Generate exactly n rows.
* Row 1 contains one 1.
* Row 2 contains two 2s.
* Continue the pattern until row n.

Hint

Nested loops may be useful.

---

### Question 9 — fibonacciSequence(n)

A financial forecasting system uses the Fibonacci sequence as part of a mathematical simulation.

Apply your logic to the fibonacciSequence() method.

The method must generate the first n Fibonacci numbers and return them as a list.

Fibonacci Rule

Each number is calculated using:

current = previous + previousPrevious

Example

Input:

8

Output:

[0, 1, 1, 2, 3, 5, 8, 13]

Constraints

* The sequence starts with 0 and 1.
* Generate exactly n values.
* Return the sequence in order.

Hint

Store the previous two values while generating the sequence.

---

### Question 10 — removeVowels(text)

A document-cleaning utility removes vowels from words to generate abbreviated forms of text.

Apply your logic to the removeVowels() method.

The method must return a new string with all vowels removed.

Rules

Remove:

A
E
I
O
U

Both uppercase and lowercase vowels must be removed.

Example

Input:

hello world

Output:

hll wrld

Additional Example

Input:

Assessment

Output:

ssssmnt

Constraints

* Preserve all non-vowel characters.
* Preserve spaces.
* Preserve the original order of characters.
# README.md — Part 2

## Coding Questions 11–20 (Expanded Assessment Style)

### Question 11 — createMultiplicationTable(n)

A mathematics teacher wants a program that automatically generates multiplication tables for learners.

Apply your logic to the createMultiplicationTable() method.

The method must generate an n × n multiplication table and return it as a two-dimensional list.

Example

Input:

3

Output:

[
[1, 2, 3],
[2, 4, 6],
[3, 6, 9]
]

Constraints

* The table must contain exactly n rows.
* Each row must contain exactly n columns.
* The value at row i and column j should equal i × j.

Hint

Nested loops are strongly recommended.

---

### Question 12 — countCharacterFrequency(text)

A search engine is analysing text data and needs to know how often each character appears.

Apply your logic to the countCharacterFrequency() method.

The method must count the frequency of every character and return the results in a Map.

Example

Input:

hello

Output:

h -> 1
e -> 1
l -> 2
o -> 1

Constraints

* Count every character.
* Uppercase and lowercase letters should be treated as different characters unless specified otherwise.
* Return a Map containing all character frequencies.

Hint

Maps are ideal for counting occurrences.

---

### Question 13 — reverseWords(sentence)

A text-processing tool needs to reverse each word while keeping the original word order unchanged.

Apply your logic to the reverseWords() method.

The method must reverse every individual word and return the transformed sentence.

Example

Input:

hello world

Output:

olleh dlrow

Additional Example

Input:

Java is fun

Output:

avaJ si nuf

Constraints

* Preserve the original word order.
* Reverse each word individually.
* Spaces between words should remain intact.

Hint

Split the sentence into words first.

---

### Question 14 — spiralMatrix(n)

A puzzle game generates number spirals that players must solve.

Apply your logic to the spiralMatrix() method.

The method must generate an n × n spiral matrix.

Example

Input:

3

Output:

1 2 3
8 9 4
7 6 5

Returned as:

[
[1, 2, 3],
[8, 9, 4],
[7, 6, 5]
]

Constraints

* Fill numbers from 1 to n².
* Numbers must appear in spiral order.
* Return a two-dimensional list.

Hint

Think about moving right, down, left and up while shrinking boundaries.

---

### Question 15 — pascalTriangle(n)

A mathematics application teaches combinatorics and needs to generate Pascal's Triangle.

Apply your logic to the pascalTriangle() method.

Generate the first n rows of Pascal's Triangle.

Example

Input:

4

Output:

[
[1],
[1, 1],
[1, 2, 1],
[1, 3, 3, 1]
]

Rules

* The first and last value of every row is always 1.
* Inner values are calculated from the previous row.

Constraints

* Generate exactly n rows.
* Return the result as a two-dimensional list.

Hint

Each value comes from adding two adjacent values in the previous row.

---

### Question 16 — longestCommonSubsequence(str1, str2)

A DNA analysis program compares two sequences and needs to determine how much information they share.

Apply your logic to the longestCommonSubsequence() method.

The method must return the length of the longest common subsequence shared by both strings.

Example

Input:

ABCDGH
AEDFHR

Output:

3

Explanation

The longest common subsequence is:

ADH

Constraints

* Characters must appear in the same order.
* Characters do not need to be adjacent.
* Return only the length.

Hint

This is a classic Dynamic Programming problem.

---

### Question 17 — countInversions(numbers)

A financial analytics system wants to measure how far a list is from being sorted.

Apply your logic to the countInversions() method.

An inversion exists whenever:

i < j

but

numbers[i] > numbers[j]

The method must count and return the total number of inversions.

Example

Input:

[1, 20, 6, 4, 5]

Output:

5

Explanation

The inversions are:

(20,6)
(20,4)
(20,5)
(6,4)
(6,5)

Constraints

* Return the total count.
* Compare all valid pairs.

Hint

A nested loop solution works, although more efficient solutions exist.

---

### Question 18 — createHollowSquare(n)

A terminal-based drawing application needs to generate hollow square shapes.

Apply your logic to the createHollowSquare() method.

Generate a hollow square using asterisk (*) characters.

Example

Input:

4

Output:

---

* *
* *

---

Return the result as a list of strings.

Constraints

* Border rows must be completely filled.
* Border columns must contain asterisks.
* Inner cells must contain spaces.

Hint

Think about which positions belong to the border.

---

### Question 19 — createDiamond(n)

A text-art generator needs to create diamond patterns for display in the terminal.

Apply your logic to the createDiamond() method.

Generate a diamond shape and return it as a list of strings.

Example

Input:

2

Output:

*

---

*

Rules

* The diamond must be symmetrical.
* Spacing must match the unit tests exactly.
* Return a list of strings.

Constraints

* Use asterisk characters.
* Maintain proper alignment.

Hint

Build the top half first, then the bottom half.

---

### Question 20 — createHourglass(n)

A graphics simulator generates ASCII hourglass shapes for debugging output.

Apply your logic to the createHourglass() method.

Generate an hourglass pattern and return it as a list of strings.

Example

Input:

3

Output:

---

---

*

---

---

Rules

* The pattern must narrow toward the centre.
* The pattern must then expand symmetrically.
* Spacing must match unit tests exactly.

Constraints

* Return the result as a list of strings.
* Preserve alignment exactly.

Hint

The top half decreases in width while the bottom half increases.
# README.md — Part 3

## Coding Questions 21–30 (Expanded Assessment Style)

### Question 21 — createSpiralString(n)

A puzzle game generates spiral number grids, but the display engine only accepts text output.

Apply your logic to the createSpiralString() method.

The method must generate a spiral matrix and return it as a single string.

Each row must appear on a new line.

Example

Input:

3

Output:

123
894
765

Constraints

* Generate a valid spiral matrix.
* Rows must be separated using newline characters.
* Do not include extra spaces between numbers.

Hint

You may find it easier to first generate the spiral matrix and then convert it into a string.

---

### Question 22 — createAlphabetDiamond(n)

A text-art application generates decorative alphabet patterns for display in the terminal.

Apply your logic to the createAlphabetDiamond() method.

Generate a diamond using letters of the alphabet.

Example

Input:

3

Output:

A
B B
C   C
B B
A

Return the result as a list of strings.

Rules

* The diamond must be symmetrical.
* Letters should increase toward the centre.
* Letters should decrease after the centre.

Constraints

* Spacing must match the expected output exactly.
* Return the result as a list of strings.

Hint

The top and bottom halves mirror each other.

---

### Question 23 — createNumberSpiral(n)

A game engine stores spiral puzzles as rows of text rather than matrices.

Apply your logic to the createNumberSpiral() method.

Generate a spiral of numbers and return each row as a string.

Example

Input:

3

Spiral:

1 2 3
8 9 4
7 6 5

Output:

[
"123",
"894",
"765"
]

Constraints

* Generate numbers from 1 to n².
* Return a list of strings.
* Preserve the spiral ordering.

Hint

This question is closely related to spiralMatrix().

---

### Question 24 — createPyramid(n)

A training simulator displays achievement levels using pyramid-shaped ASCII art.

Apply your logic to the createPyramid() method.

Generate a centred pyramid using asterisk (*) characters.

Example

Input:

4

Output:

*

---

---

---

Rules

* The pyramid must be centred.
* The final row width must equal:

2 × n - 1

Return the result as a list of strings.

Constraints

* Generate exactly n rows.
* Use only asterisk characters and spaces.
* Preserve alignment exactly.

Hint

Each row contains two more stars than the previous row.

---

### Question 25 — createNumberTriangle(n)

A mathematics learning application displays triangular number patterns for students.

Apply your logic to the createNumberTriangle() method.

Generate a centred triangle using numbers.

Example

Input:

4

Output:

1
2 2
3 3 3
4 4 4 4

Rules

* The triangle must be centred.
* Return a list of strings.
* Spacing must match unit tests exactly.

Constraints

* Row n contains the number n repeated n times.
* Generate exactly n rows.
* Preserve alignment.

Hint

This problem combines pattern generation and spacing calculations.

---

### Question 26 — isPalindrome(text)

A cybersecurity company validates secret access phrases before allowing entry into secure systems.

Apply your logic to the isPalindrome() method.

A palindrome is a word or phrase that reads the same forwards and backwards.

The method must determine whether the provided text is a palindrome.

Rules

* Ignore uppercase and lowercase differences.
* Return true if the text reads the same forwards and backwards.

Example

Input:

racecar

Output:

true

Example

Input:

hello

Output:

false

Constraints

* Comparison must be case-insensitive.
* Return a boolean value.

Hint

Compare the original text to its reversed version.

---

### Question 27 — countWords(sentence)

A document editor needs to display a live word count while a user types.

Apply your logic to the countWords() method.

The method must count and return the number of words contained in a sentence.

Example

Input:

Java is fun

Output:

3

Constraints

* Assume words are separated by spaces.
* Return the total number of words.
* Ignore punctuation handling unless specified otherwise.

Hint

Splitting the sentence into words may help.

---

### Question 28 — findSecondLargest(numbers)

A sports analytics platform tracks player scores and wants to identify not only the highest score, but also the second-highest score.

Apply your logic to the findSecondLargest() method.

The method must return the second largest value contained in the list.

Example

Input:

[10, 5, 20, 8]

Output:

10

Constraints

* Think carefully about duplicate values.
* Consider edge cases.
* Avoid sorting unless necessary.

Hint

Track both the largest and second-largest values while iterating.

---

### Question 29 — rotateArray(numbers, positions)

A logistics company stores delivery routes in an array and needs to rotate route priorities without changing the original ordering relationships.

Apply your logic to the rotateArray() method.

Rotate the array to the right by the specified number of positions.

Example

Input:

[1, 2, 3, 4, 5]

Positions:

2

Output:

[4, 5, 1, 2, 3]

Constraints

* Preserve all values.
* Perform a right rotation.
* Return the rotated collection.

Hint

Elements that move past the end should wrap around to the beginning.

---

### Question 30 — removeDuplicates(numbers)

A customer database contains accidental duplicate records and must be cleaned before generating reports.

Apply your logic to the removeDuplicates() method.

Remove duplicate values while preserving their original insertion order.

Example

Input:

[1, 2, 2, 3, 1, 4]

Output:

[1, 2, 3, 4]

Rules

* Keep the first occurrence.
* Remove all later duplicates.
* Preserve the original ordering.

Constraints

* Return a collection containing only unique values.
* Do not reorder the remaining elements.

Hint

Sets can help detect duplicates, but remember that insertion order must be preserved.
Question 31 — areAnagrams(first, second)

A digital dictionary application helps users discover relationships between words. One feature checks whether two words are anagrams of each other.

Apply your logic to the areAnagrams() method.

Two words are considered anagrams if they contain exactly the same letters with exactly the same frequencies, but possibly in a different order.

The method must determine whether the two provided strings are anagrams.

Rules

* Ignore uppercase and lowercase differences.
* Every letter must appear the same number of times in both words.
* Return true if the words are anagrams.
* Return false otherwise.

Example

Input:

listen
silent

Output:

true

Additional Example

Input:

apple
paper

Output:

false

Constraints

* Comparison must be case-insensitive.
* Letter frequencies must match exactly.
* Return a boolean value.

Hint

Count how many times each character appears in both words and compare the results.

Question 32 — matrixDiagonalSum(matrix)

A data analytics system stores information in square matrices and needs to calculate statistics based on diagonal values.

Apply your logic to the matrixDiagonalSum() method.

The method must calculate the sum of both diagonals in a square matrix.

Example

Input:

1 2 3
4 5 6
7 8 9

Output:

25

Explanation

Primary diagonal:

1 + 5 + 9 = 15

Secondary diagonal:

3 + 5 + 7 = 15

The centre value (5) belongs to both diagonals and must only be counted once.

Final result:

15 + 15 − 5 = 25

Constraints

* The matrix will be square.
* Avoid double-counting the centre element.
* Return the final sum.

Hint

The primary diagonal uses matching row and column indices.

Question 33 — frequencyLeaderboard(text)

A social media platform analyses text trends and wants to display the most frequently used characters first.

Apply your logic to the frequencyLeaderboard() method.

The method must count character frequencies and return the results sorted from highest frequency to lowest frequency.

Example

Input:

banana

Output:

a=3
n=2
b=1

Constraints

* Count every character.
* Sort by frequency in descending order.
* Characters with higher frequencies must appear first.

Hint

First count frequencies, then sort the results.

Question 34 — fizzBuzz(n)

A software company uses a classic programming exercise during interviews to evaluate basic logical reasoning.

Apply your logic to the fizzBuzz() method.

Generate values from 1 to n using the following rules:

Rules

* Multiples of 3 become "Fizz"
* Multiples of 5 become "Buzz"
* Multiples of both 3 and 5 become "FizzBuzz"
* All other numbers remain unchanged

Example

Input:

5

Output:

[
"1",
"2",
"Fizz",
"4",
"Buzz"
]

Additional Example

Input:

15

Output includes:

FizzBuzz

Constraints

* Generate values from 1 through n.
* Return the result as a list.
* Follow the replacement rules exactly.

Hint

Check divisibility by both 3 and 5 before checking them individually.

Question 35 — primeNumbersUpTo(n)

A cybersecurity platform uses prime numbers in encryption algorithms and needs a way to generate them.

Apply your logic to the primeNumbersUpTo() method.

The method must return all prime numbers up to and including n.

Example

Input:

10

Output:

[2, 3, 5, 7]

Prime Number Definition

A prime number:

* Is greater than 1.
* Has exactly two factors.
* Can only be divided evenly by 1 and itself.

Constraints

* Include n if it is prime.
* Return all primes in ascending order.

Hint

You may find it useful to create a helper method that checks whether a number is prime.

Question 36 — isPrime(number)

A mathematical software package validates numbers before using them in calculations.

Apply your logic to the isPrime() method.

The method must determine whether a number is prime.

Example

Input:

17

Output:

true

Additional Example

Input:

12

Output:

false

Constraints

* Numbers less than 2 are not prime.
* Return a boolean value.
* Consider efficiency for larger numbers.

Hint

A number only needs to be tested against potential factors up to its square root.

Question 37 — decimalToBinary(number)

A computer architecture simulator needs to convert decimal values into binary format.

Apply your logic to the decimalToBinary() method.

The method must convert a decimal number into its binary representation.

Example

Input:

13

Output:

1101

Explanation

13 = 8 + 4 + 1

Binary:

1101

Constraints

* Do not use built-in binary conversion methods.
* Return the binary value as a string.

Hint

Repeated division by 2 can help generate binary digits.

Question 38 — binaryToDecimal(binary)

A networking tool receives binary data and must convert it back into decimal values for display.

Apply your logic to the binaryToDecimal() method.

The method must convert a binary string into its decimal equivalent.

Example

Input:

1010

Output:

10

Explanation

1×8 + 0×4 + 1×2 + 0×1

= 10

Constraints

* Do not use built-in conversion methods.
* Return the decimal value as an integer.

Hint

Each binary position represents a power of 2.

Question 39 — generateChessBoard(size)

A game development studio needs to generate a simple text-based chessboard for testing purposes.

Apply your logic to the generateChessBoard() method.

Generate a chessboard pattern using the characters X and O.

Example

Input:

4

Output:

XOXO
OXOX
XOXO
OXOX

Rules

* Adjacent cells must alternate between X and O.
* The pattern must continue correctly across rows.

Constraints

* Generate exactly size rows.
* Generate exactly size columns.
* Return the result as a list of strings.

Hint

The value at each position can be determined using its row and column indices.

Question 40 — countOccurrences(numbers)

A retail analytics platform tracks product sales and needs to determine how often each product appears in a transaction list.

Apply your logic to the countOccurrences() method.

The method must count the frequency of every number and return the results in a Map.

Example

Input:

[1, 1, 2, 2, 2, 3]

Output:

1 -> 2
2 -> 3
3 -> 1

Constraints

* Count every occurrence.
* Return a Map containing frequencies.
* Each unique value should appear once in the result.

Hint

Maps are one of the most common tools used for frequency-counting problems.
Question 41 — mergeSortedArrays(first, second)

A reporting system receives data from two departments. Each department has already sorted its records, and the final report requires both datasets to be merged into a single sorted result.

Apply your logic to the mergeSortedArrays() method.

The method must merge two already-sorted arrays into one sorted array.

Example

Input:

First:

[1, 3, 5]

Second:

[2, 4, 6]

Output:

[1, 2, 3, 4, 5, 6]

Rules

* Both input arrays are already sorted.
* The final result must remain sorted.
* Do not sort the final result after merging.

Constraints

* Preserve all values.
* Return a new merged collection.
* Handle arrays of different lengths.

Hint

Use two pointers, one for each array, and always select the smaller value.

Question 42 — firstNonRepeatingCharacter(text)

A customer support system analyses user messages and needs to identify the first unique character in a string.

Apply your logic to the firstNonRepeatingCharacter() method.

The method must return the first character that appears exactly once.

Example

Input:

swiss

Output:

w

Explanation

Character frequencies:

s → 3
w → 1
i → 1

The first character that appears only once is:

w

Constraints

* Return the first non-repeating character.
* Consider character frequencies before making a decision.
* Preserve original ordering.

Hint

A frequency map followed by a second pass through the string works well.

Question 43 — longestWord(sentence)

A reading-analysis application evaluates written content and needs to identify the longest word used in a sentence.

Apply your logic to the longestWord() method.

The method must return the longest word contained in the sentence.

Example

Input:

cat dog elephant mouse

Output:

elephant

Constraints

* Assume words are separated by spaces.
* Return the longest word.
* If multiple words share the same maximum length, return the first one encountered.

Hint

Track the current longest word while processing the sentence.

Question 44 — sortByLength(words)

A dictionary application allows users to sort words based on their length for educational exercises.

Apply your logic to the sortByLength() method.

The method must sort words from shortest to longest.

Example

Input:

["elephant", "a", "house", "cat"]

Output:

["a", "cat", "house", "elephant"]

Constraints

* Sort by word length.
* Preserve all words.
* Return the sorted collection.

Hint

A custom comparator may be useful.

Question 45 — generateMagicSquare(size)

A mathematics education platform teaches number theory using magic squares.

Apply your logic to the generateMagicSquare() method.

A magic square is a square arrangement of numbers where:

* Every row sums to the same value.
* Every column sums to the same value.
* Both diagonals sum to the same value.

Generate a valid 3 × 3 magic square.

Example

One valid solution:

8 1 6
3 5 7
4 9 2

Verification

Rows:

8+1+6 = 15
3+5+7 = 15
4+9+2 = 15

Columns:

8+3+4 = 15
1+5+9 = 15
6+7+2 = 15

Diagonals:

8+5+2 = 15
6+5+4 = 15

Constraints

* Generate a valid 3 × 3 magic square.
* Every number 1–9 must appear exactly once.
* All required sums must match.

Hint

Research the Siamese Method for generating odd-sized magic squares.

Question 46 — islandCounter(grid)

A satellite imaging company analyses aerial photographs represented as binary grids.

Apply your logic to the islandCounter() method.

The grid contains:

1 = land
0 = water

An island is a connected group of land cells.

Cells are connected only when touching:

* Vertically
* Horizontally

Diagonal connections do not count.

Example

Input:

1 1 0 0
1 0 0 1
0 0 1 1
0 0 0 0

Output:

2

Explanation

There are two separate land masses.

Constraints

* Count every island exactly once.
* Mark visited cells appropriately.
* Vertical and horizontal connections belong to the same island.

Hint

Depth-First Search (DFS) or Breadth-First Search (BFS) can be used.

Question 47 — shortestPathMaze(maze)

A robotics company is building navigation software for autonomous robots.

Apply your logic to the shortestPathMaze() method.

The maze contains:

0 = open path
1 = blocked path

The robot starts in the top-left corner and must reach the bottom-right corner.

Return the minimum number of steps required.

Return:

-1

if no valid path exists.

Example

Input:

0 0 0
1 1 0
0 0 0

Output:

4

Explanation

The robot can reach the destination in four moves.

Constraints

* Only move up, down, left or right.
* Do not move through blocked cells.
* Return the shortest possible distance.

Hint

Breadth-First Search (BFS) naturally finds shortest paths in unweighted grids.

Question 48 — balancedBrackets(text)

A code editor validates source code before compilation and needs to ensure brackets are balanced.

Apply your logic to the balancedBrackets() method.

The method must determine whether all brackets are correctly matched.

Supported brackets:

()
[]
{}

Example

Input:

{[()]}

Output:

true

Example

Input:

{[(])}

Output:

false

Rules

* Every opening bracket must have a matching closing bracket.
* Brackets must close in the correct order.

Constraints

* Return true only if the entire string is balanced.
* Return false otherwise.

Hint

A stack is the standard solution for this problem.

Question 49 — runLengthEncode(text)

A data-compression utility reduces storage requirements by encoding repeated characters.

Apply your logic to the runLengthEncode() method.

Implement Run Length Encoding (RLE).

Example

Input:

aaabbcc

Output:

a3b2c2

Explanation

Three consecutive a characters become:

a3

Two consecutive b characters become:

b2

Two consecutive c characters become:

c2

Constraints

* Process characters from left to right.
* Consecutive repeated characters form a single encoded group.
* Preserve ordering.

Hint

Track the current character and how many times it appears consecutively.

Question 50 — sudokuValidator(board)

A puzzle platform hosts Sudoku competitions and needs to verify completed boards automatically.

Apply your logic to the sudokuValidator() method.

A Sudoku board is valid when:

* Every row contains digits 1–9 exactly once.
* Every column contains digits 1–9 exactly once.
* Every 3 × 3 sub-grid contains digits 1–9 exactly once.

Example

Valid Row

1 2 3 4 5 6 7 8 9

Invalid Row

1 2 3 4 5 6 7 8 8

Output

true for a valid Sudoku board.

false for an invalid Sudoku board.

Constraints

* Validate all rows.
* Validate all columns.
* Validate all 3 × 3 sub-grids.
* Return a boolean value.

Hint

Sets are useful for detecting duplicate values quickly.
Theory Assessment
Section B — Long Format Questions

This section contributes 50% of the total assessment mark.

You are required to answer all questions inside:

answers.txt

Instructions

* Do not remove the question comments.
* Write your answer directly underneath the relevant question.
* Use complete sentences.
* Provide examples where appropriate.
* Demonstrate understanding rather than memorisation.
* Support your explanations with practical scenarios where possible.

Marks are awarded for:

* Technical accuracy
* Depth of understanding
* Quality of explanation
* Use of examples
* Communication skills

Question 1 — Linux Fundamentals

Modern software engineers spend significant amounts of time working inside Linux environments.

Many cloud platforms, servers, containers and development environments run Linux.

Explain the following:

* What Linux is.
* Why Linux is popular among software developers.
* The purpose of the command line.
* The difference between files and directories.
* The purpose of the following commands:

  * pwd
  * ls
  * cd
  * mkdir
  * rm
  * cp
  * mv

Provide practical examples showing how a developer might use these commands during a typical workday.

Expected Depth

Your answer should demonstrate practical understanding of Linux navigation and file management.

Question 2 — Git and Version Control

A software company has multiple developers working on the same application.

Without version control, developers may overwrite each other's work, lose changes or struggle to track project history.

Explain:

* What version control is.
* Why Git is important.
* The difference between Git and GitHub.
* The purpose of commits.
* The purpose of branches.
* The purpose of pull requests.
* Why meaningful commit messages matter.

Provide a real-world example showing how multiple developers can collaborate using Git.

Expected Depth

Your answer should demonstrate understanding of professional software development workflows.

Question 3 — Maven and Build Tools

Large Java applications often depend on external libraries and require automated build processes.

Explain:

* What Maven is.
* Why build tools are important.
* The purpose of the pom.xml file.
* What dependencies are.
* What unit tests are.
* The purpose of the command:

mvn test

* The purpose of the command:

mvn package

Provide examples showing how Maven simplifies Java development.

Expected Depth

Your answer should demonstrate understanding of dependency management and automated builds.

Question 4 — Low-Level vs High-Level Programming Languages

Different programming languages operate at different levels of abstraction.

Explain:

* What a low-level programming language is.
* What a high-level programming language is.
* Advantages of low-level languages.
* Advantages of high-level languages.
* Examples of each.
* Why Java is considered a high-level language.

Provide practical examples showing when each type of language may be preferred.

Expected Depth

Your answer should compare both categories rather than simply defining them.

Question 5 — The Four Pillars of Object-Oriented Programming

Object-Oriented Programming (OOP) is one of the most important concepts in Java development.

Explain the four pillars of OOP:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

For each pillar:

* Provide a definition.
* Explain why it is useful.
* Provide a Java-related example.

Example Scenario

Consider a Vehicle class with subclasses such as Car and Motorcycle.

Use practical examples wherever possible.

Expected Depth

Your answer should demonstrate conceptual understanding and practical application.

Question 6 — Java Collections Framework

Many real-world applications need efficient ways to store and manipulate data.

Explain:

* What the Java Collections Framework is.
* The purpose of a List.
* The purpose of a Set.
* The purpose of a Map.
* The purpose of a Queue.

For each collection type:

* Explain when it should be used.
* Explain its strengths.
* Provide a practical example.

Expected Depth

Your answer should compare the different collection types and explain why a developer would choose one over another.

Question 7 — APIs and REST

Modern applications often communicate with external services.

Examples include:

* Payment gateways
* Weather services
* Authentication systems
* Social media platforms

Explain:

* What an API is.
* What REST means.
* The purpose of HTTP requests.
* The purpose of JSON.
* The difference between GET, POST, PUT and DELETE requests.

Provide a real-world example of a Java application consuming an API.

Expected Depth

Your answer should demonstrate understanding of client-server communication.

Question 8 — Big O Complexity Analysis

Software engineers often need to evaluate how efficiently an algorithm performs.

Explain:

* What Big O notation is.
* Why complexity analysis is important.
* The meaning of:

  * O(1)
  * O(log n)
  * O(n)
  * O(n log n)
  * O(n²)

Provide examples of algorithms that belong to each category.

Discuss why algorithm efficiency becomes increasingly important as data sizes grow.

Expected Depth

Your answer should connect theory to practical software performance.

Question 9 — Software Testing

Software bugs can lead to financial losses, security issues and poor user experiences.

Explain:

* What software testing is.
* Why testing is important.
* What unit testing is.
* What integration testing is.
* The purpose of automated testing.
* The benefits of Test-Driven Development (TDD).

Provide practical examples of how testing improves software quality.

Expected Depth

Your answer should demonstrate understanding of quality assurance practices.

Question 10 — Recursion vs Iteration

Many programming problems can be solved using either recursion or iteration.

Explain:

* What recursion is.
* What iteration is.
* Advantages of recursion.
* Advantages of iteration.
* Situations where recursion is preferred.
* Situations where iteration is preferred.

Provide examples using:

* Factorial calculations
* Tree traversal
* Counting loops

Discuss the impact of recursion on memory usage and performance.

Expected Depth

Your answer should compare both approaches and explain the trade-offs involved.

Submission Checklist

Before submitting your assessment, ensure that:

✓ All 50 coding questions have been completed.

✓ All theory questions have been answered.

✓ The project compiles successfully.

✓ All unit tests pass.

✓ Code is clean and readable.

✓ Meaningful variable names have been used.

✓ No unnecessary code remains in the project.

✓ The project has been committed to Git.

✓ All required files have been included.

✓ You have reviewed your work before submission.

Final Goal

This assessment is designed to evaluate your ability to:

* Write correct Java code.
* Apply Object-Oriented Programming principles.
* Work with data structures and algorithms.
* Solve programming problems.
* Understand software engineering concepts.
* Communicate technical ideas clearly.

A successful submission demonstrates both practical coding ability and theoretical understanding expected of a junior software developer.
