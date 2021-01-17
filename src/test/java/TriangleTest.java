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
    void triangleGetType_nonpositiveInputAllEqualInput_throwException() {
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
    void triangleGetType_firstAndSecondEdgeCombinedEqualsThirdInput_throwException() {
        Triangle triangle = new Triangle(2, 2, 4);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_secondAndThirdEdgeCombinedEqualsFirstInput_throwException() {
        Triangle triangle = new Triangle(10, 5, 5);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_thirdAndFirstEdgeCombinedEqualsSecondInput_throwException() {
        Triangle triangle = new Triangle(6, 12, 6);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedMessage = "Two edges combined are not longer than the third one";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void triangleGetType_allEdgesEqualInput_returnEquilateral() {
        Triangle triangle = new Triangle(2, 2, 2);
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
    void triangleGetType_allEdgesDifferentByOneInput_returnScalene() {
        Triangle triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }

    @Test
    void triangleGetType_allEdgesDifferentByTwoInput_returnScalene() {
        Triangle triangle = new Triangle(6, 8, 10);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }
}
