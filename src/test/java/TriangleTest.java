import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void triangleGetType_nonpositiveInput_throwException() {
        Triangle triangle = new Triangle(-1, 0, 1);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_nonpositiveAllEqualInput_throwException() {
        Triangle triangle = new Triangle(-2, -2, -2);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_allZeroInput_throwException() {
        Triangle triangle = new Triangle(0, 0, 0);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_oneZeroTwoEqualInput_throwException() {
        Triangle triangle = new Triangle(0, 3, 3);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_nonpositiveInputTwoEqualInput_throwException() {
        Triangle triangle = new Triangle(-4, -4, 4);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_minIntNonpositiveAllEqualInput_throwException() {
        Triangle triangle = new Triangle(-2147483648, -2147483648, -2147483648);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "At least one number is nonpositive";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_firstAndSecondEdgeCombinedShorterThanThirdInput_throwException() {
        Triangle triangle = new Triangle(1, 1, 3);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_secondAndThirdEdgeCombinedShorterThanFirstInput_throwException() {
        Triangle triangle = new Triangle(5, 2, 2);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_firstAndThirdEdgeCombinedShorterThanSecondInput_throwException() {
        Triangle triangle = new Triangle(1, 4, 1);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_firstAndSecondEdgeCombinedEqualThirdInput_throwException() {
        Triangle triangle = new Triangle(2, 2, 4);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_secondAndThirdEdgeCombinedEqualFirstInput_throwException() {
        Triangle triangle = new Triangle(10, 5, 5);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_thirdAndFirstEdgeCombinedEqualSecondInput_throwException() {
        Triangle triangle = new Triangle(6, 12, 6);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntAllEdgesInput_throwException() {
        Triangle triangle = new Triangle(2147483647, 2147483647, 2147483647);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntTwoEdgesInput_throwException() {
        Triangle triangle = new Triangle(2147483647, 2147483647, 10);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntOneEdgeInput_throwException() {
        Triangle triangle = new Triangle(7, 7, 2147483647);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntFirstAndSecondCombinedInput_throwException() {
        Triangle triangle = new Triangle(2000000000, 2000000000, 4);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntSecondAndThirdCombinedInput_throwException() {
        Triangle triangle = new Triangle(2, 2100000000, 2100000000);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntFirstAndThirdCombinedInput_throwException() {
        Triangle triangle = new Triangle(1900000000, 3, 2100000000);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_maxIntExceededByOneTwoEdgesEqualInput_returnIsosceles() {
        Triangle triangle = new Triangle(1073741824, 1073741824, 222);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined exceed max integer value";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_allEdgesEqualTwoInput_returnEquilateral() {
        Triangle triangle = new Triangle(2, 2, 2);
        Assertions.assertEquals(triangle.getType(), TriangleType.EQUILATERAL);
    }

    @Test
    void triangleGetType_allEdgesEqualMaxIntCombinedInput_returnEquilateral() {
        Triangle triangle = new Triangle(715827882, 715827882, 715827882);
        Assertions.assertEquals(triangle.getType(), TriangleType.EQUILATERAL);
    }

    @Test
    void triangleGetType_allEdgesEqualOneInput_returnEquilateral() {
        Triangle triangle = new Triangle(1, 1, 1);
        Assertions.assertEquals(triangle.getType(), TriangleType.EQUILATERAL);
    }

    @Test
    void triangleGetType_firstAndSecondEdgesEqualInput_returnIsosceles() {
        Triangle triangle = new Triangle(4, 4, 2);
        Assertions.assertEquals(triangle.getType(), TriangleType.ISOSCELES);
    }

    @Test
    void triangleGetType_secondAndThirdEdgesEqualInput_returnIsosceles() {
        Triangle triangle = new Triangle(1, 3, 3);
        Assertions.assertEquals(triangle.getType(), TriangleType.ISOSCELES);
    }

    @Test
    void triangleGetType_thirdAndFirstEdgesEqualInput_returnIsosceles() {
        Triangle triangle = new Triangle(6, 5, 6);
        Assertions.assertEquals(triangle.getType(), TriangleType.ISOSCELES);
    }

    @Test
    void triangleGetType_twoEdgesEqualMaxIntCombinedInput_returnIsosceles() {
        Triangle triangle = new Triangle(1073741823, 1073741823, 222);
        Assertions.assertEquals(triangle.getType(), TriangleType.ISOSCELES);
    }

    @Test
    void triangleGetType_allEdgesDifferentByOneInput_returnScalene() {
        Triangle triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }

    @Test
    void triangleGetType_allEdgesDifferentByTwoInput_returnScalene() {
        Triangle triangle = new Triangle(6, 8, 10);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }

    @Test
    void triangleGetType_allEdgesDifferentByThreeInput_returnScalene() {
        Triangle triangle = new Triangle(11, 14, 17);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }

    @Test
    void triangleGetType_allEdgesDifferentMaxIntCombinedInput_returnScalene() {
        Triangle triangle = new Triangle(715827883, 715827884, 715827880);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }
}
