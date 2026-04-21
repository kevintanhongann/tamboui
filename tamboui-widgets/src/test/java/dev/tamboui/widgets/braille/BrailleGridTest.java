/*
 * Copyright TamboUI Contributors
 * SPDX-License-Identifier: MIT
 */
package dev.tamboui.widgets.braille;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.tamboui.widgets.spinner.SpinnerFrameSet;

import static org.assertj.core.api.Assertions.*;

class BrailleGridTest {

    @Test
    @DisplayName("makeGrid creates empty grid with correct dimensions")
    void makeGridCreatesCorrectDimensions() {
        boolean[][] grid = BrailleGrid.makeGrid(4, 4);
        assertThat(grid).hasDimensions(4, 4);

        boolean[][] grid2 = BrailleGrid.makeGrid(2, 6);
        assertThat(grid2).hasDimensions(2, 6);

        boolean[][] grid3 = BrailleGrid.makeGrid(0, 4);
        assertThat(grid3).isEmpty();

        boolean[][] grid4 = BrailleGrid.makeGrid(4, 0);
        assertThat(grid4).isEmpty();

        boolean[][] grid5 = BrailleGrid.makeGrid(-1, 4);
        assertThat(grid5).isEmpty();
    }

    @Test
    @DisplayName("makeGrid creates grid filled with false values")
    void makeGridFilledWithFalse() {
        boolean[][] grid = BrailleGrid.makeGrid(3, 3);
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                assertThat(cell).isFalse();
            }
        }
    }

    @Test
    @DisplayName("gridToBraille converts single dot correctly")
    void gridToBrailleSingleDot() {
        boolean[][] grid = BrailleGrid.makeGrid(4, 2);

        grid[0][0] = true;
        assertThat(BrailleGrid.gridToBraille(grid)).isEqualTo("\u2801");

        grid[0][0] = false;
        grid[0][1] = true;
        assertThat(BrailleGrid.gridToBraille(grid)).isEqualTo("\u2808");

        grid[0][0] = true;
        grid[0][1] = true;
        assertThat(BrailleGrid.gridToBraille(grid)).isEqualTo("\u2809");
    }

    @Test
    @DisplayName("gridToBraille handles empty grid")
    void gridToBrailleEmptyGrid() {
        boolean[][] grid = BrailleGrid.makeGrid(0, 0);
        assertThat(BrailleGrid.gridToBraille(grid)).isEmpty();

        boolean[][] grid2 = BrailleGrid.makeGrid(4, 0);
        assertThat(grid2).isEmpty();
    }

    @Test
    @DisplayName("gridToBraille handles multiple columns")
    void gridToBrailleMultipleColumns() {
        boolean[][] grid = BrailleGrid.makeGrid(4, 4);

        grid[0][0] = true;
        grid[0][2] = true;
        assertThat(BrailleGrid.gridToBraille(grid)).hasSize(2);

        grid[0][0] = true;
        grid[0][1] = true;
        grid[0][2] = true;
        grid[0][3] = true;
        assertThat(BrailleGrid.gridToBraille(grid)).hasSize(2);
    }

    @Test
    @DisplayName("gridToBraille handles partial rows")
    void gridToBraillePartialRows() {
        boolean[][] grid = BrailleGrid.makeGrid(2, 2);

        grid[0][0] = true;
        grid[1][0] = true;

        assertThat(BrailleGrid.gridToBraille(grid)).isEqualTo("\u2803");
    }

    @Test
    @DisplayName("toString creates debug representation")
    void toStringCreatesDebugRepresentation() {
        boolean[][] grid = BrailleGrid.makeGrid(2, 2);
        grid[0][0] = true;
        grid[1][1] = true;

        String debug = BrailleGrid.toString(grid);
        assertThat(debug).contains("\u2588");
        assertThat(debug).contains("\u2591");
    }

    @Test
    @DisplayName("BraillePatterns patterns return non-empty arrays")
    void framePatternsReturnNonEmpty() {
        assertThat(BraillePatterns.scan()).hasSize(10);
        assertThat(BraillePatterns.rain()).hasSize(12);
        assertThat(BraillePatterns.scanLine()).hasSize(6);
        assertThat(BraillePatterns.pulse()).hasSize(5);
        assertThat(BraillePatterns.snake()).hasSize(16);
        assertThat(BraillePatterns.sparkle()).hasSize(6);
        assertThat(BraillePatterns.cascade()).hasSize(12);
        assertThat(BraillePatterns.columns()).hasSize(26);
        assertThat(BraillePatterns.orbit()).hasSize(8);
        assertThat(BraillePatterns.breathe()).hasSize(18);
        assertThat(BraillePatterns.waveRows()).hasSize(16);
        assertThat(BraillePatterns.checkerboard()).hasSize(4);
        assertThat(BraillePatterns.helix()).hasSize(16);
        assertThat(BraillePatterns.fillSweep()).hasSize(11);
        assertThat(BraillePatterns.diagonalSwipe()).hasSize(16);
        assertThat(BraillePatterns.brailleWave()).hasSize(8);
        assertThat(BraillePatterns.dna()).hasSize(12);
    }

    @Test
    @DisplayName("BraillePatterns.of creates valid SpinnerFrameSet")
    void ofCreatesValidSpinnerFrameSet() {
        String[] frames = BraillePatterns.helix();
        SpinnerFrameSet frameSet = BraillePatterns.of(frames);

        assertThat(frameSet.frameCount()).isEqualTo(frames.length);
        assertThat(frameSet.frame(0)).isEqualTo(frames[0]);
        assertThat(frameSet.frame(15)).isEqualTo(frames[15]);
    }

    @Test
    @DisplayName("availablePatterns lists all patterns")
    void availablePatterns() {
        assertThat(BraillePatterns.availablePatterns()).hasSize(17);
    }
}