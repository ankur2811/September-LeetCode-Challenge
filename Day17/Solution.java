class Solution {
    public boolean isRobotBounded(String instructions) {
        int d = 0;
        int x = 0;
        int y = 0;
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                x += dirs[d][0];
                y += dirs[d][1];
            } else if (c == 'L') {
                d = (d + 3) % 4;
            } else {
                d = (d + 1) % 4;
            }
        }
        return d != 0 || x == 0 && y == 0;
    }
}