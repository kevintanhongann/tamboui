/*
 * Copyright TamboUI Contributors
 * SPDX-License-Identifier: MIT
 */
package dev.tamboui.widgets.braille;

/**
 * Utility class for converting boolean grids to Unicode Braille characters.
 * <p>
 * Each Braille character (U+2800 block) represents a 2x4 dot grid:
 * <pre>
 * Row 0: dot1 (0x01) dot4 (0x08)
 * Row 1: dot2 (0x02) dot5 (0x10)
 * Row 2: dot3 (0x04) dot6 (0x20)
 * Row 3: dot7 (0x40) dot8 (0x80)
 * </pre>
 *
 * <pre>{@code
 * boolean[][] grid = BrailleGrid.makeGrid(4, 4);
 * grid[0][0] = true; // Set dot1
 * grid[1][1] = true; // Set dot5
 * String braille = BrailleGrid.gridToBraille(grid);
 * }</pre>
 */
public final class BrailleGrid {

    private static final int[][] BRAILLE_DOT_MAP = {
        {0x01, 0x08}, // row 0
        {0x02, 0x10}, // row 1
        {0x04, 0x20}, // row 2
        {0x40, 0x80}, // row 3
    };

    private BrailleGrid() {
    }

    /**
     * Creates an empty grid of the specified dimensions.
     *
     * @param rows the number of rows (0-4 for valid Braille)
     * @param cols the number of columns (must be even for valid Braille)
     * @return a new grid filled with false values
     */
    public static boolean[][] makeGrid(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            return new boolean[0][0];
        }
        boolean[][] grid = new boolean[rows][cols];
        return grid;
    }

    /**
     * Converts a 2D boolean grid to a Braille string.
     * <p>
     * Each braille character encodes a 2-column by 4-row dot grid.
     * Width must be even (2 dot-columns per braille char).
     *
     * @param grid the grid where grid[row][col] = true means dot is raised
     * @return the Braille string representation
     */
    public static String gridToBraille(boolean[][] grid) {
        int rows = grid.length;
        int cols = rows > 0 ? grid[0].length : 0;
        int charCount = (cols + 1) / 2; // ceil(cols / 2)

        StringBuilder result = new StringBuilder();
        for (int c = 0; c < charCount; c++) {
            int code = 0x2800; // Braille pattern base
            for (int r = 0; r < 4 && r < rows; r++) {
                for (int d = 0; d < 2; d++) {
                    int col = c * 2 + d;
                    if (col < cols && grid[r][col]) {
                        code |= BRAILLE_DOT_MAP[r][d];
                    }
                }
            }
            result.append((char) code);
        }
        return result.toString();
    }

    /**
     * Returns a string representation of a grid for debugging.
     *
     * @param grid the grid to debug
     * @return a string representation using █ for true and ░ for false
     */
    public static String toString(boolean[][] grid) {
        StringBuilder sb = new StringBuilder();
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                sb.append(cell ? '\u2588' : '\u2591');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}