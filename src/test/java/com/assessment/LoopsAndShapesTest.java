package com.assessment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoopsAndShapesTest {

    // =====================================================
    // Question 1
    // =====================================================

    @Test
    void testCountItemsBasic() {
        assertEquals(
                5,
                LoopsAndShapes.countItems(
                        Arrays.asList(1,2,3,4,5)
                )
        );
    }

    @Test
    void testCountItemsEmpty() {
        assertEquals(
                0,
                LoopsAndShapes.countItems(
                        List.of()
                )
        );
    }

    @Test
    void testCountItemsStrings() {
        assertEquals(
                3,
                LoopsAndShapes.countItems(
                        Arrays.asList("A","B","C")
                )
        );
    }

    // =====================================================
    // Question 2
    // =====================================================

    @Test
    void testSumNumbersBasic() {
        assertEquals(
                15,
                LoopsAndShapes.sumNumbers(
                        Arrays.asList(1,2,3,4,5)
                )
        );
    }

    @Test
    void testSumNumbersEmpty() {
        assertEquals(
                0,
                LoopsAndShapes.sumNumbers(
                        List.of()
                )
        );
    }

    @Test
    void testSumNumbersNegative() {
        assertEquals(
                0,
                LoopsAndShapes.sumNumbers(
                        Arrays.asList(-1,0,1)
                )
        );
    }

    // =====================================================
    // Question 3
    // =====================================================

    @Test
    void testFindLargestBasic() {
        assertEquals(
                9,
                LoopsAndShapes.findLargest(
                        Arrays.asList(1,5,3,9,2)
                )
        );
    }

    @Test
    void testFindLargestNegative() {
        assertEquals(
                -2,
                LoopsAndShapes.findLargest(
                        Arrays.asList(-5,-2,-10)
                )
        );
    }

    @Test
    void testFindLargestSingle() {
        assertEquals(
                0,
                LoopsAndShapes.findLargest(
                        Arrays.asList(0)
                )
        );
    }

    // =====================================================
    // Question 4
    // =====================================================

    @Test
    void testCountEvenNumbersBasic() {
        assertEquals(
                3,
                LoopsAndShapes.countEvenNumbers(
                        Arrays.asList(1,2,3,4,5,6)
                )
        );
    }

    @Test
    void testCountEvenNumbersNone() {
        assertEquals(
                0,
                LoopsAndShapes.countEvenNumbers(
                        Arrays.asList(1,3,5,7,9)
                )
        );
    }

    @Test
    void testCountEvenNumbersAll() {
        assertEquals(
                4,
                LoopsAndShapes.countEvenNumbers(
                        Arrays.asList(2,4,6,8)
                )
        );
    }

    // =====================================================
    // Question 5
    // =====================================================

    @Test
    void testSumDigitsBasic() {
        assertEquals(
                6,
                LoopsAndShapes.sumDigits(123)
        );
    }

    @Test
    void testSumDigitsLarge() {
        assertEquals(
                36,
                LoopsAndShapes.sumDigits(9999)
        );
    }

    @Test
    void testSumDigitsZeros() {
        assertEquals(
                1,
                LoopsAndShapes.sumDigits(1000000)
        );
    }

    // =====================================================
    // Question 6
    // =====================================================

    @Test
    void testCountVowelsBasic() {
        assertEquals(
                3,
                LoopsAndShapes.countVowels(
                        "hello world"
                )
        );
    }

    @Test
    void testCountVowelsUppercase() {
        assertEquals(
                5,
                LoopsAndShapes.countVowels(
                        "AEIOU"
                )
        );
    }

    @Test
    void testCountVowelsNone() {
        assertEquals(
                0,
                LoopsAndShapes.countVowels(
                        "rhythm"
                )
        );
    }

    // =====================================================
    // Question 7
    // =====================================================

    @Test
    void testMultiplyListElementsBasic() {
        assertEquals(
                24,
                LoopsAndShapes.multiplyListElements(
                        Arrays.asList(1,2,3,4)
                )
        );
    }

    @Test
    void testMultiplyListElementsTwos() {
        assertEquals(
                8,
                LoopsAndShapes.multiplyListElements(
                        Arrays.asList(2,2,2)
                )
        );
    }

    @Test
    void testMultiplyListElementsZero() {
        assertEquals(
                0,
                LoopsAndShapes.multiplyListElements(
                        Arrays.asList(1,0,5)
                )
        );
    }

    // =====================================================
    // Question 8
    // =====================================================

    @Test
    void testCreateBasicNumberTriangleThree() {

        List<String> expected =
                Arrays.asList(
                        "1",
                        "22",
                        "333"
                );

        assertEquals(
                expected,
                LoopsAndShapes.createBasicNumberTriangle(3)
        );
    }

    @Test
    void testCreateBasicNumberTriangleFive() {

        List<String> expected =
                Arrays.asList(
                        "1",
                        "22",
                        "333",
                        "4444",
                        "55555"
                );

        assertEquals(
                expected,
                LoopsAndShapes.createBasicNumberTriangle(5)
        );
    }

    // =====================================================
    // Question 9
    // =====================================================

    @Test
    void testFibonacciFive() {

        assertEquals(
                Arrays.asList(0,1,1,2,3),
                LoopsAndShapes.fibonacciSequence(5)
        );
    }

    @Test
    void testFibonacciEight() {

        assertEquals(
                Arrays.asList(0,1,1,2,3,5,8,13),
                LoopsAndShapes.fibonacciSequence(8)
        );
    }

    // =====================================================
    // Question 10
    // =====================================================

    @Test
    void testRemoveVowelsBasic() {

        assertEquals(
                "hll wrld",
                LoopsAndShapes.removeVowels(
                        "hello world"
                )
        );
    }

    @Test
    void testRemoveVowelsUppercase() {

        assertEquals(
                "",
                LoopsAndShapes.removeVowels(
                        "AEIOU"
                )
        );
    }

    @Test
    void testRemoveVowelsNone() {

        assertEquals(
                "rhythm",
                LoopsAndShapes.removeVowels(
                        "rhythm"
                )
        );
    }
    
    // =====================================================
    // Question 11
    // =====================================================

    @Test
    void testCreateMultiplicationTableThree() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(2,4,6),
                Arrays.asList(3,6,9)
        );

        assertEquals(
                expected,
                LoopsAndShapes.createMultiplicationTable(3)
        );
    }

    @Test
    void testCreateMultiplicationTableOne() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );

        assertEquals(
                expected,
                LoopsAndShapes.createMultiplicationTable(1)
        );
    }

    // =====================================================
    // Question 12
    // =====================================================

    @Test
    void testCountCharacterFrequencyHello() {

        Map<Character, Integer> expected = Map.of(
                'h',1,
                'e',1,
                'l',2,
                'o',1
        );

        assertEquals(
                expected,
                LoopsAndShapes.countCharacterFrequency("hello")
        );
    }

    @Test
    void testCountCharacterFrequencyAABBCC() {

        Map<Character, Integer> expected = Map.of(
                'a',2,
                'b',2,
                'c',2
        );

        assertEquals(
                expected,
                LoopsAndShapes.countCharacterFrequency("aabbcc")
        );
    }

    // =====================================================
    // Question 13
    // =====================================================

    @Test
    void testReverseWordsBasic() {

        assertEquals(
                "olleh dlrow",
                LoopsAndShapes.reverseWords(
                        "hello world"
                )
        );
    }

    @Test
    void testReverseWordsSentence() {

        assertEquals(
                "avaJ si nuf",
                LoopsAndShapes.reverseWords(
                        "Java is fun"
                )
        );
    }

    // =====================================================
    // Question 14
    // =====================================================

    @Test
    void testSpiralMatrixThree() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(8,9,4),
                Arrays.asList(7,6,5)
        );

        assertEquals(
                expected,
                LoopsAndShapes.spiralMatrix(3)
        );
    }

    @Test
    void testSpiralMatrixOne() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );

        assertEquals(
                expected,
                LoopsAndShapes.spiralMatrix(1)
        );
    }

    // =====================================================
    // Question 15
    // =====================================================

    @Test
    void testPascalTriangleFive() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)
        );

        assertEquals(
                expected,
                LoopsAndShapes.pascalTriangle(5)
        );
    }

    @Test
    void testPascalTriangleOne() {

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );

        assertEquals(
                expected,
                LoopsAndShapes.pascalTriangle(1)
        );
    }

    // =====================================================
    // Question 16
    // =====================================================

    @Test
    void testLongestCommonSubsequenceOne() {

        assertEquals(
                3,
                LoopsAndShapes.longestCommonSubsequence(
                        "ABCDGH",
                        "AEDFHR"
                )
        );
    }

    @Test
    void testLongestCommonSubsequenceTwo() {

        assertEquals(
                4,
                LoopsAndShapes.longestCommonSubsequence(
                        "AGGTAB",
                        "GXTXAYB"
                )
        );
    }

    // =====================================================
    // Question 17
    // =====================================================

    @Test
    void testCountInversionsExample() {

        assertEquals(
                5,
                LoopsAndShapes.countInversions(
                        Arrays.asList(
                                1,20,6,4,5
                        )
                )
        );
    }

    @Test
    void testCountInversionsSorted() {

        assertEquals(
                0,
                LoopsAndShapes.countInversions(
                        Arrays.asList(
                                1,2,3,4,5
                        )
                )
        );
    }

    // =====================================================
    // Question 18
    // =====================================================

    @Test
    void testCreateHollowSquareThree() {

        List<String> expected = Arrays.asList(
                "***",
                "* *",
                "***"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createHollowSquare(3)
        );
    }

    @Test
    void testCreateHollowSquareFour() {

        List<String> expected = Arrays.asList(
                "****",
                "*  *",
                "*  *",
                "****"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createHollowSquare(4)
        );
    }

    // =====================================================
    // Question 19
    // =====================================================

    @Test
    void testCreateDiamondThree() {

        List<String> expected = Arrays.asList(
                " * ",
                "***",
                " * "
        );

        assertEquals(
                expected,
                LoopsAndShapes.createDiamond(3)
        );
    }

    // =====================================================
    // Question 20
    // =====================================================

    @Test
    void testCreateHourglassFive() {

        List<String> expected = Arrays.asList(
                "*****",
                " *** ",
                "  *  ",
                " *** ",
                "*****"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createHourglass(5)
        );
    }
    
    // =====================================================
    // Question 21
    // =====================================================

    @Test
    void testCreateSpiralStringThree() {

        String expected =
                "123\n" +
                "894\n" +
                "765";

        assertEquals(
                expected,
                LoopsAndShapes.createSpiralString(3)
        );
    }

    @Test
    void testCreateSpiralStringOne() {

        assertEquals(
                "1",
                LoopsAndShapes.createSpiralString(1)
        );
    }

    // =====================================================
    // Question 22
    // =====================================================

    @Test
    void testCreateAlphabetDiamondThree() {

        List<String> expected = Arrays.asList(
                "  A  ",
                " B B ",
                "C   C",
                " B B ",
                "  A  "
        );

        assertEquals(
                expected,
                LoopsAndShapes.createAlphabetDiamond(3)
        );
    }

    @Test
    void testCreateAlphabetDiamondOne() {

        List<String> expected = Arrays.asList(
                "A"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createAlphabetDiamond(1)
        );
    }

    // =====================================================
    // Question 23
    // =====================================================

    @Test
    void testCreateNumberSpiralThree() {

        List<String> expected = Arrays.asList(
                "123",
                "894",
                "765"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createNumberSpiral(3)
        );
    }

    @Test
    void testCreateNumberSpiralOne() {

        List<String> expected = Arrays.asList(
                "1"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createNumberSpiral(1)
        );
    }

    // =====================================================
    // Question 24
    // =====================================================

    @Test
    void testCreatePyramidThree() {

        List<String> expected = Arrays.asList(
                "  *  ",
                " *** ",
                "*****"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createPyramid(3)
        );
    }

    @Test
    void testCreatePyramidFour() {

        List<String> expected = Arrays.asList(
                "   *   ",
                "  ***  ",
                " ***** ",
                "*******"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createPyramid(4)
        );
    }

    // =====================================================
    // Question 25
    // =====================================================

    @Test
    void testCreateNumberTriangleThree() {

        List<String> expected = Arrays.asList(
                "  1  ",
                " 2 2 ",
                "3 3 3"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createNumberTriangle(3)
        );
    }

    @Test
    void testCreateNumberTriangleFour() {

        List<String> expected = Arrays.asList(
                "   1   ",
                "  2 2  ",
                " 3 3 3 ",
                "4 4 4 4"
        );

        assertEquals(
                expected,
                LoopsAndShapes.createNumberTriangle(4)
        );
    }

    // =====================================================
    // Question 26
    // =====================================================

    @Test
    void testIsPalindromeRacecar() {

        assertTrue(
                LoopsAndShapes.isPalindrome("racecar")
        );
    }

    @Test
    void testIsPalindromeCaseInsensitive() {

        assertTrue(
                LoopsAndShapes.isPalindrome("RaceCar")
        );
    }

    @Test
    void testIsPalindromeFalse() {

        assertFalse(
                LoopsAndShapes.isPalindrome("hello")
        );
    }

    // =====================================================
    // Question 27
    // =====================================================

    @Test
    void testCountWordsThree() {

        assertEquals(
                3,
                LoopsAndShapes.countWords(
                        "Java is fun"
                )
        );
    }

    @Test
    void testCountWordsOne() {

        assertEquals(
                1,
                LoopsAndShapes.countWords(
                        "Java"
                )
        );
    }

    @Test
    void testCountWordsFive() {

        assertEquals(
                5,
                LoopsAndShapes.countWords(
                        "I love learning Java today"
                )
        );
    }

    // =====================================================
    // Question 28
    // =====================================================

    @Test
    void testFindSecondLargestBasic() {

        assertEquals(
                10,
                LoopsAndShapes.findSecondLargest(
                        Arrays.asList(
                                10,5,20,8
                        )
                )
        );
    }

    @Test
    void testFindSecondLargestNegative() {

        assertEquals(
                -2,
                LoopsAndShapes.findSecondLargest(
                        Arrays.asList(
                                -1,-2,-3,-4
                        )
                )
        );
    }

    // =====================================================
    // Question 29
    // =====================================================

    @Test
    void testRotateArrayTwoPositions() {

        List<Integer> expected = Arrays.asList(
                4,5,1,2,3
        );

        assertEquals(
                expected,
                LoopsAndShapes.rotateArray(
                        Arrays.asList(
                                1,2,3,4,5
                        ),
                        2
                )
        );
    }

    @Test
    void testRotateArrayOnePosition() {

        List<Integer> expected = Arrays.asList(
                5,1,2,3,4
        );

        assertEquals(
                expected,
                LoopsAndShapes.rotateArray(
                        Arrays.asList(
                                1,2,3,4,5
                        ),
                        1
                )
        );
    }

    // =====================================================
    // Question 30
    // =====================================================

    @Test
    void testRemoveDuplicatesBasic() {

        List<Integer> expected = Arrays.asList(
                1,2,3,4
        );

        assertEquals(
                expected,
                LoopsAndShapes.removeDuplicates(
                        Arrays.asList(
                                1,2,2,3,1,4
                        )
                )
        );
    }

    @Test
    void testRemoveDuplicatesNone() {

        List<Integer> expected = Arrays.asList(
                1,2,3
        );

        assertEquals(
                expected,
                LoopsAndShapes.removeDuplicates(
                        Arrays.asList(
                                1,2,3
                        )
                )
        );
    }
    // =====================================================
    // Question 31
    // =====================================================

    @Test
    void testAreAnagramsTrue() {

        assertTrue(
                LoopsAndShapes.areAnagrams(
                        "listen",
                        "silent"
                )
        );
    }

    @Test
    void testAreAnagramsFalse() {

        assertFalse(
                LoopsAndShapes.areAnagrams(
                        "hello",
                        "world"
                )
        );
    }

    @Test
    void testAreAnagramsCaseInsensitive() {

        assertTrue(
                LoopsAndShapes.areAnagrams(
                        "Race",
                        "Care"
                )
        );
    }

    // =====================================================
    // Question 32
    // =====================================================

    @Test
    void testMatrixDiagonalSumThreeByThree() {

        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        assertEquals(
                25,
                LoopsAndShapes.matrixDiagonalSum(matrix)
        );
    }

    @Test
    void testMatrixDiagonalSumOneByOne() {

        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(7)
        );

        assertEquals(
                7,
                LoopsAndShapes.matrixDiagonalSum(matrix)
        );
    }

    // =====================================================
    // Question 33
    // =====================================================

    @Test
    void testFrequencyLeaderboardBanana() {

        List<String> expected = Arrays.asList(
                "a=3",
                "n=2",
                "b=1"
        );

        assertEquals(
                expected,
                LoopsAndShapes.frequencyLeaderboard("banana")
        );
    }

    @Test
    void testFrequencyLeaderboardSimple() {

        List<String> expected = Arrays.asList(
                "a=2",
                "b=1"
        );

        assertEquals(
                expected,
                LoopsAndShapes.frequencyLeaderboard("aab")
        );
    }

    // =====================================================
    // Question 34
    // =====================================================

    @Test
    void testFizzBuzzFive() {

        List<String> expected = Arrays.asList(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz"
        );

        assertEquals(
                expected,
                LoopsAndShapes.fizzBuzz(5)
        );
    }

    @Test
    void testFizzBuzzFifteen() {

        List<String> result =
                LoopsAndShapes.fizzBuzz(15);

        assertEquals(
                "FizzBuzz",
                result.get(14)
        );
    }

    // =====================================================
    // Question 35
    // =====================================================

    @Test
    void testPrimeNumbersUpToTen() {

        List<Integer> expected = Arrays.asList(
                2,3,5,7
        );

        assertEquals(
                expected,
                LoopsAndShapes.primeNumbersUpTo(10)
        );
    }

    @Test
    void testPrimeNumbersUpToTwenty() {

        List<Integer> expected = Arrays.asList(
                2,3,5,7,11,13,17,19
        );

        assertEquals(
                expected,
                LoopsAndShapes.primeNumbersUpTo(20)
        );
    }

    // =====================================================
    // Question 36
    // =====================================================

    @Test
    void testIsPrimeTrue() {

        assertTrue(
                LoopsAndShapes.isPrime(17)
        );
    }

    @Test
    void testIsPrimeFalse() {

        assertFalse(
                LoopsAndShapes.isPrime(15)
        );
    }

    @Test
    void testIsPrimeTwo() {

        assertTrue(
                LoopsAndShapes.isPrime(2)
        );
    }

    // =====================================================
    // Question 37
    // =====================================================

    @Test
    void testDecimalToBinaryThirteen() {

        assertEquals(
                "1101",
                LoopsAndShapes.decimalToBinary(13)
        );
    }

    @Test
    void testDecimalToBinaryTen() {

        assertEquals(
                "1010",
                LoopsAndShapes.decimalToBinary(10)
        );
    }

    // =====================================================
    // Question 38
    // =====================================================

    @Test
    void testBinaryToDecimalTen() {

        assertEquals(
                10,
                LoopsAndShapes.binaryToDecimal("1010")
        );
    }

    @Test
    void testBinaryToDecimalThirteen() {

        assertEquals(
                13,
                LoopsAndShapes.binaryToDecimal("1101")
        );
    }

    // =====================================================
    // Question 39
    // =====================================================

    @Test
    void testGenerateChessBoardFour() {

        List<String> expected = Arrays.asList(
                "XOXO",
                "OXOX",
                "XOXO",
                "OXOX"
        );

        assertEquals(
                expected,
                LoopsAndShapes.generateChessBoard(4)
        );
    }

    @Test
    void testGenerateChessBoardTwo() {

        List<String> expected = Arrays.asList(
                "XO",
                "OX"
        );

        assertEquals(
                expected,
                LoopsAndShapes.generateChessBoard(2)
        );
    }

    // =====================================================
    // Question 40
    // =====================================================

    @Test
    void testCountOccurrencesBasic() {

        Map<Integer,Integer> expected = Map.of(
                1,2,
                2,3,
                3,1
        );

        assertEquals(
                expected,
                LoopsAndShapes.countOccurrences(
                        Arrays.asList(
                                1,1,2,2,2,3
                        )
                )
        );
    }

    @Test
    void testCountOccurrencesSingleValue() {

        Map<Integer,Integer> expected = Map.of(
                5,4
        );

        assertEquals(
                expected,
                LoopsAndShapes.countOccurrences(
                        Arrays.asList(
                                5,5,5,5
                        )
                )
        );
    }
    // =====================================================
    // Question 41
    // =====================================================

    @Test
    void testMergeSortedArraysBasic() {

        List<Integer> expected = Arrays.asList(
                1,2,3,4,5,6
        );

        assertEquals(
                expected,
                LoopsAndShapes.mergeSortedArrays(
                        Arrays.asList(1,3,5),
                        Arrays.asList(2,4,6)
                )
        );
    }

    @Test
    void testMergeSortedArraysDifferentSizes() {

        List<Integer> expected = Arrays.asList(
                1,2,3,4,5,6,7
        );

        assertEquals(
                expected,
                LoopsAndShapes.mergeSortedArrays(
                        Arrays.asList(1,4,7),
                        Arrays.asList(2,3,5,6)
                )
        );
    }

    // =====================================================
    // Question 42
    // =====================================================

    @Test
    void testFirstNonRepeatingCharacterSwiss() {

        assertEquals(
                'w',
                LoopsAndShapes.firstNonRepeatingCharacter(
                        "swiss"
                )
        );
    }

    @Test
    void testFirstNonRepeatingCharacterProgramming() {

        assertEquals(
                'p',
                LoopsAndShapes.firstNonRepeatingCharacter(
                        "programming"
                )
        );
    }

    // =====================================================
    // Question 43
    // =====================================================

    @Test
    void testLongestWordBasic() {

        assertEquals(
                "elephant",
                LoopsAndShapes.longestWord(
                        "cat dog elephant mouse"
                )
        );
    }

    @Test
    void testLongestWordSingle() {

        assertEquals(
                "java",
                LoopsAndShapes.longestWord(
                        "java"
                )
        );
    }

    // =====================================================
    // Question 44
    // =====================================================

    @Test
    void testSortByLengthBasic() {

        List<String> expected = Arrays.asList(
                "a",
                "cat",
                "house",
                "elephant"
        );

        assertEquals(
                expected,
                LoopsAndShapes.sortByLength(
                        Arrays.asList(
                                "elephant",
                                "a",
                                "house",
                                "cat"
                        )
                )
        );
    }

    @Test
    void testSortByLengthAlreadySorted() {

        List<String> expected = Arrays.asList(
                "a",
                "ab",
                "abc"
        );

        assertEquals(
                expected,
                LoopsAndShapes.sortByLength(
                        Arrays.asList(
                                "a",
                                "ab",
                                "abc"
                        )
                )
        );
    }

    // =====================================================
    // Question 45
    // =====================================================

    @Test
    void testGenerateMagicSquareSizeThree() {

        List<List<Integer>> square =
                LoopsAndShapes.generateMagicSquare(3);

        int target =
                square.get(0).stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        for (List<Integer> row : square) {

            int rowSum = row.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            assertEquals(target, rowSum);
        }
    }

    @Test
    void testGenerateMagicSquareContainsNineValues() {

        List<List<Integer>> square =
                LoopsAndShapes.generateMagicSquare(3);

        assertEquals(3, square.size());
        assertEquals(3, square.get(0).size());
    }

    // =====================================================
    // Question 46
    // =====================================================

    @Test
    void testIslandCounterOneIsland() {

        int[][] grid = {
                {1,1,0},
                {1,1,0},
                {0,0,0}
        };

        assertEquals(
                1,
                LoopsAndShapes.islandCounter(grid)
        );
    }

    @Test
    void testIslandCounterThreeIslands() {

        int[][] grid = {
                {1,0,1},
                {0,0,0},
                {1,0,0}
        };

        assertEquals(
                3,
                LoopsAndShapes.islandCounter(grid)
        );
    }

    // =====================================================
    // Question 47
    // =====================================================

    @Test
    void testShortestPathMazeExists() {

        int[][] maze = {
                {0,0,0},
                {1,1,0},
                {0,0,0}
        };

        assertEquals(
                4,
                LoopsAndShapes.shortestPathMaze(maze)
        );
    }

    @Test
    void testShortestPathMazeBlocked() {

        int[][] maze = {
                {0,1,0},
                {1,1,0},
                {0,1,0}
        };

        assertEquals(
                -1,
                LoopsAndShapes.shortestPathMaze(maze)
        );
    }

    // =====================================================
    // Question 48
    // =====================================================

    @Test
    void testBalancedBracketsTrue() {

        assertTrue(
                LoopsAndShapes.balancedBrackets(
                        "{[()]}"
                )
        );
    }

    @Test
    void testBalancedBracketsFalse() {

        assertFalse(
                LoopsAndShapes.balancedBrackets(
                        "{[(])}"
                )
        );
    }

    @Test
    void testBalancedBracketsSimple() {

        assertTrue(
                LoopsAndShapes.balancedBrackets(
                        "()"
                )
        );
    }

    // =====================================================
    // Question 49
    // =====================================================

    @Test
    void testRunLengthEncodeBasic() {

        assertEquals(
                "a3b2c2",
                LoopsAndShapes.runLengthEncode(
                        "aaabbcc"
                )
        );
    }

    @Test
    void testRunLengthEncodeSingleCharacters() {

        assertEquals(
                "a1b1c1",
                LoopsAndShapes.runLengthEncode(
                        "abc"
                )
        );
    }

    // =====================================================
    // Question 50
    // =====================================================

    @Test
    void testSudokuValidatorValidBoard() {

        int[][] board = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };

        assertTrue(
                LoopsAndShapes.sudokuValidator(board)
        );
    }

    @Test
    void testSudokuValidatorInvalidBoard() {

        int[][] board = {
                {5,5,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };

        assertFalse(
                LoopsAndShapes.sudokuValidator(board)
        );
    }
}
