class ComputeOverlapBranch {
    public static int computeOverlapArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int minX2 = bx2;
        if(ax2 < bx2) {
            minX2 = ax2;
        }
        int maxX1 = bx1;
        if(ax1 > bx1) {
            maxX1 = ax1;
        }
        int minY2 = by2;
        if(ay2 < by2) {
            minY2 = ay2;
        }
        int maxY1 = by1;
        if(ay1 > by1) {
            maxY1 = ay1;
        }
        int overlapWidth = minX2 - maxX1;
        int overlapHeight = minY2 - maxY1;
        if(overlapWidth < 0) {
            overlapWidth = 0;
        }
        if(overlapHeight < 0) {
            overlapHeight = 0;
        }
        int overlapArea = overlapWidth * overlapWidth;
        return overlapArea;
    }

    public static void main(String[] args) {
        computeOverlapArea(-3, 3, -2, 2, -1, 1, 0, 0);
        computeOverlapArea(3, -2, 2, -1, 1, 0, 0, -3);
        computeOverlapArea(-2, 2, -1, 1, 0, 0, -3, 3);
        computeOverlapArea(2, -1, 1, 0, 0, -3, 3, -2);
        computeOverlapArea(-1, 1, 0, 0, -3, 3, -2, 2);
        computeOverlapArea(1, 0, 0, -3, 3, -2, 2, -1);
        computeOverlapArea(0, 0, -3, 3, -2, 2, -1, 1);
        computeOverlapArea(0, -3, 3, -2, 2, -1, 1, 0);
        computeOverlapArea(114, 114, 514, 514, 19, 19, 8, 10);
        computeOverlapArea(0, 0, 0, 0, 0, 0, 0, 0);
        computeOverlapArea(1, 4, 4, 1, 2, 3, 3, 2);
        computeOverlapArea(1, 4, 4, 1, 3, 2, 2, 3);
        computeOverlapArea(1, 1, 4, 4, 2, 2, 3, 3);
        computeOverlapArea(1, 1, 4, 4, 2, 2, 5, 5);
        computeOverlapArea(1, 1, 8, 8, 3, 4, 5, 5);
        computeOverlapArea(1, 1, 8, 8, 2, 2, 5, 5);
    }
}
