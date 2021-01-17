import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle {
    private int a, b, c;

    public TriangleType getType() {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("At least one number is nonpositive");
        double da = (double)a / 2147483647;
        double db = (double)b / 2147483647;
        double dc = (double)c / 2147483647;
        if (da + db > 1 || db + dc > 1 || dc + da > 1)
            throw new IllegalArgumentException("Two edges combined exceed max integer value");
        if (a + b <= c || b + c <= a || c + a <= b)
            throw new IllegalArgumentException("Two edges combined are not longer than the third one");
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("At least one number is nonpositive");
        if (a == b && b == c)
            return TriangleType.EQUILATERAL;
        if (a == b || b == c || c == a)
            return TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }
}
