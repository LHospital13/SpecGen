class IsBoomerang {
    public static boolean isBoomerang(int[][] points) {
        int[] v1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] v2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return v1[0] * v2[1] - v1[1] * v2[0] != 0;
    }

    public static void main(String[] args) {
        int[][] ps = {{0, 0}, {0, 0}, {0, 0}};
        isBoomerang(ps);
        ps = new int[][]{{-2, -1}, {0, 1}, {2, 3}};
        isBoomerang(ps);
        ps = new int[][]{{3, 2}, {1, 0}, {-1, -2}};
        isBoomerang(ps);
        ps = new int[][]{{-1, -2}, {3, 4}, {-4, -4}};
        isBoomerang(ps);
        ps = new int[][]{{-1, -2}, {-1, -2}, {-1, -2}};
        isBoomerang(ps);
        ps = new int[][]{{5, 5}, {4, 4}, {3, 3}};
        isBoomerang(ps);
    }
}