import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle {
    private int a, b, c;

    public TriangleType getType() {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("At least one number is nonpositive");
        if (a + b <= c || b + c <= a || c + a <= b)
            throw new IllegalArgumentException("Two edges combined are shorter than the third one");
        if (a == b && b == c)
            return TriangleType.EQUILATERAL;
        if (a == b || b == c || c == a)
            return TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }
}
