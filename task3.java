// Task 3: Stick-Cutting Square Problem
// The problem

// There are two wooden sticks of lengths A and B, respectively. Both sticks can be cut into shorter sticks of integer lengths. Your goal is to construct the largest possible square using the sticks. In order to do this, you must cut the sticks to achieve four sticks of the same length (note that there can be some leftover pieces). What is the longest side of a square you can achieve? If it is not possible to create any square, the answer is 0.

// For example, if A = 8 and B = 9, the correct answer is 4.

// The task

// You are given six functions that are attempts to solve the problem above. The functions were generated and commented by a generative AI tool. Some of these functions may solve the problem correctly, while others may not. Your task is to check the correctness of each of these functions. If the provided function is correct, print the string CORRECT using the statement System.out.println in the corresponding answer_solutionN function. Otherwise, print a test for which the given solution returns incorrect output. A test should be made of two numbers within the range 1 to 10^6, separated by a single space.

// Example: One of the possible counterexamples for the solution0 function is A = 1, B = 3. To pass the test, use System.out.println("1 3");.

// Assumptions:

// N and M (referring to A and B) are integers within the range [1..1,000,000]
// There exists a path of length 4 which doesn't start with 0 (this line is from Task 2, not applicable here — Task 3's actual assumption is that A and B are within the stated range)
// The correct approach

// For candidate side length L: total pieces = floor(A/L) + floor(B/L). This shrinks as L grows, so find the largest L where the total is still ≥4.

// Swap so A ≥ B, then check three candidates: all 4 pieces from A (A/4), 3 from A + 1 from B (min(A/3,B)), 2 from each (min(A/2,B/2)). Take the max.


public class task3 {

    public int solution0(int A, int B) {
    return A / 4;
}
// answerSolution0: "1 3"  (Incorrect -- ignores B)

    public static int countPieces(int length, int stick1, int stick2) {
    return (stick1 / length) + (stick2 / length);
}
public static boolean canFormSquare(int length, int stick1, int stick2) {
    return countPieces(length, stick1, stick2) >= 4;
}
public static int solution1(int A, int B) {
    for (int length = Math.min(A, B); length > 0; length--) {
        if (canFormSquare(length, A, B)) {
            return length;
        }
    }
    return 0;
}
// answerSolution1: "8 1"  (Incorrect -- search capped at min(A,B))

    public static boolean canBuildSquare(int sideLength, int A, int B) {
    int numA = A / sideLength;
    int numB = B / sideLength;
    return numA + numB >= 4;
}
public static int solution2(int A, int B) {
    int lo = 0;
    int hi = B;
    while (lo <= hi) {
        int mid = (lo + hi) / 2;
        if (canBuildSquare(mid, A, B)) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }
    }
    return hi;
}
// answerSolution2: "100 2"  (Incorrect -- binary search capped at hi=B)

    public static int solution3(int A, int B) {
    if (B > A) {
        int temp = A;
        A = B;
        B = temp;
    }
    int longestSide = Math.max(A / 4, Math.max(Math.min(A / 3, B), B / 2));
    return longestSide;
}
// answerSolution3: "CORRECT"

    public static int solution4(int A, int B) {
    int result = 1;
    for (int length = 1; length < A + B; length++) {
        int piecesA = A / length;
        int piecesB = B / length;
        if (piecesA + piecesB >= 4) {
            result = Math.max(result, length);
        }
    }
    return result;
}
// answerSolution4: "1 1"  (Incorrect -- result starts at 1, not 0)

    public static int solution5(int A, int B) {
    int case1 = A / 4;
    int case2 = Math.min(A / 3, B);
    int case3 = B / 2;
    return Math.max(case1, Math.max(case2, case3));
}
// answerSolution5: "1 2"  (Incorrect -- no swap; case3 doesn't verify A can supply 2 pieces)

    public static int solution6(int A, int B) {
    int maxSize = 0;
    maxSize = Math.max(maxSize, B / 4);
    if (A >= B / 3) {
        maxSize = Math.max(maxSize, B / 3);
    }

    if (A >= 2 * (B / 2)) {
        maxSize = Math.max(maxSize, B / 2);
    }

    if (B >= A / 3) {
        maxSize = Math.max(maxSize, A / 3);
    }
    
    maxSize = Math.max(maxSize, A / 4);
    return maxSize;
}
// answerSolution6: "9 11"  (Incorrect -- missing the A/2-guarded candidate)
    
}
