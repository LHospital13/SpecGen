public class Perimeter
{   

    public static long Perimeter(short x)
    {
	long squarePerimeter = 4 * (long)x;
	return squarePerimeter;
    }

    public static long Perimeter(int x)
    {
	long pentagonPerimeter = 5 * (long)x;
	return pentagonPerimeter;
    }

    public static long Perimeter(long x)
    {
	long hexagonalPerimeter = 6 * x;
	return hexagonalPerimeter;
    }

    public static long Perimeter(int x, int y)
    {
	long perimeterRectangle = 2*((long)x + (long)y);
	return perimeterRectangle;
    }

    public static long Perimeter(int x, int y, int z)
    {
	long trianglePerimeter = (long)x + (long)y + (long)z;
	return trianglePerimeter;
    }

    public static long Perimeter(int w, int x, int y, int z)
    {
	long trapeziumPerimeter = (long)w + (long)x + (long)y + (long)z;
	return trapeziumPerimeter;
    }

    public static void main(String[] args) {
        Perimeter((short)-2);
        Perimeter((short)-1);
        Perimeter((short)0);
        Perimeter((short)1);
        Perimeter((short)2);
        Perimeter(-2);
        Perimeter(-1);
        Perimeter(0);
        Perimeter(1);
        Perimeter(2);
        Perimeter((long)-2);
        Perimeter((long)-1);
        Perimeter((long)0);
        Perimeter((long)1);
        Perimeter((long)2);

        Perimeter(-4, 0);
        Perimeter(0, -4);
        Perimeter(4, 0);
        Perimeter(0, 4);
        Perimeter(-4, -4);
        Perimeter(4, 4);
        Perimeter(0, 0);
        Perimeter(-4, 4);
        Perimeter(4, -4);
        Perimeter(1, -1);
        Perimeter(-1, 1);

        Perimeter(-4, 0, -4);
        Perimeter(0, -4, 4);
        Perimeter(4, 0, 0);
        Perimeter(0, 4, 0);
        Perimeter(-4, -4, -1);
        Perimeter(4, 4, 1);
        Perimeter(0, 0, 2);
        Perimeter(-4, 4, -2);
        Perimeter(4, -4, 6);
        Perimeter(1, -1, -6);
        Perimeter(-1, 1, -1);

        Perimeter(-4, 0, -4, -4);
        Perimeter(0, -4, 4, 0);
        Perimeter(4, 0, 0, 1);
        Perimeter(0, 4, 0, -1);
        Perimeter(-4, -4, -1, 4);
        Perimeter(4, 4, 1, 0);
        Perimeter(0, 0, 2, 0);
        Perimeter(0, 2, 0, 0);
        Perimeter(-4, 4, -2, -2);
        Perimeter(4, -4, 6, 1);
        Perimeter(1, -1, -6, -2);
        Perimeter(-1, 1, -1, 1);
    }
}
