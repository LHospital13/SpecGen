public class Perimeter
{   

     //@ requires x >= 0;
     //@ ensures \result == 4 * (long)x;
     long Perimeter(short x)
    {
        long squarePerimeter = 4 * (long)x;
        return squarePerimeter;
    }

     //@ requires x >= 0;
     //@ ensures \result == 5 * (long)x;
     long Perimeter(int x)
    {
        long pentagonPerimeter = 5L * (long)x;
        return pentagonPerimeter;
    }

     //@ requires x >= 0;
     //@ ensures \result == 6 * x;
     long Perimeter(long x)
    {
        //@ assume x <= Long.MAX_VALUE / 6 && x >= Long.MIN_VALUE / 6;
        long hexagonalPerimeter = 6L * x;
        return hexagonalPerimeter;
    }

     //@ requires x >= 0 && y >= 0;
     //@ ensures \result == 2*((long)x + (long)y);
     long Perimeter(int x, int y)
    {
        //@ assume x <= (Long.MAX_VALUE - y) / 2 && y <= (Long.MAX_VALUE - x) / 2;
        long perimeterRectangle = 2L*((long)x + (long)y);
        return perimeterRectangle;
    }

     //@ requires x >= 0 && y >= 0 && z >= 0;
     //@ ensures \result == (long)x + (long)y + (long)z;
     long Perimeter(int x, int y, int z)
    {
        //@ assume x <= Long.MAX_VALUE - y - z && y <= Long.MAX_VALUE - x - z && z <= Long.MAX_VALUE - x - y;
        long trianglePerimeter = (long)x + (long)y + (long)z;
        return trianglePerimeter;
    }

     //@ requires w >= 0 && x >= 0 && y >= 0 && z >= 0;
     //@ ensures \result == (long)w + (long)x + (long)y + (long)z;
     long Perimeter(int w, int x, int y, int z)
    {
        //@ assume w <= Long.MAX_VALUE - x - y - z && x <= Long.MAX_VALUE - w - y - z && y <= Long.MAX_VALUE - w - x - z && z <= Long.MAX_VALUE - w - x - y;
        long trapeziumPerimeter = (long)w + (long)x + (long)y + (long)z;
        return trapeziumPerimeter;
    }
}
