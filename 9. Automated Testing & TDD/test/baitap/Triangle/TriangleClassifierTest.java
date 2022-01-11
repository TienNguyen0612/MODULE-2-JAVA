package baitap.Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Testing 8,2,3")
    void checkTriangle1() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "Not a triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }

    @Test
    @DisplayName("Testing -1,2,1")
    void checkTriangle2() {
        int edgeA = -1;
        int edgeB = 2;
        int edgeC = 1;

        String expected = "Not a triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }

    @Test
    @DisplayName("Testing 0,1,1")
    void checkTriangle3() {
        int edgeA = 0;
        int edgeB = 1;
        int edgeC = 1;

        String expected = "Not a triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }

    @Test
    @DisplayName("Testing 2,2,2")
    void checkTriangle4() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;

        String expected = "A equilateral triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }

    @Test
    @DisplayName("Testing 2,2,3")
    void checkTriangle5() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "A isosceles triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }

    @Test
    @DisplayName("Testing 3,4,5")
    void checkTriangle6() {
        int edgeA = 3;
        int edgeB = 4;
        int edgeC = 5;

        String expected = "A normal triangle !";
        assertEquals(expected, TriangleClassifier.compareTriangle(edgeA, edgeB, edgeC));
    }
}