package thuchanh.AbsoluteNumberCalculator;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
//        throw new UnsupportedOperationException();
        if (number < 0)
            return  -number;
        return number;
    }
}
