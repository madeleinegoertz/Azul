public class PlayerBoard {

    // 0 = blank
    // 1 = blue
    // 2 = yellow
    // 3 = red
    // 4 = black
    // 5 = turquoise
    private static int[][] WALL_TEMPLATE = {{1, 2, 3, 4, 5},
                                            {2, 3, 4, 5, 1},
                                            {3, 4, 5, 1, 2},
                                            {4, 5, 1, 2, 3},
                                            {5, 1, 2, 3, 4}};

    private int[][] wall;
    private int[][] patternLines;
    private boolean[] floorLine;
    private int numPoints;

    public PlayerBoard() {
        wall = new int[5][5];
        patternLines = new int[5][];
        for (int i = 0; i < patternLines.length; i++) {
            patternLines[i] = new int[i + 1]; // Set up jagged array of pattern lines
        }
        floorLine = new boolean[7]; // 1 1 2 2 2 3 3
        numPoints = 0;
    }

    public boolean placeInPatternLine(int color, int row) {
        boolean isValid = isValidColor(color) && isValidRow(row);
        if (isValid) {
            
        }
        return isValid;
    }

    private boolean isValidColor(int color) {
        return color > 0 && color < 5;
    }

    private boolean isValidRow(int row) {
        return row >= 0 && row < 5;
    }

}