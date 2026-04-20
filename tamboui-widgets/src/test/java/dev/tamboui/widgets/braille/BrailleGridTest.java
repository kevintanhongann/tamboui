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
    @DisplayName("BrailleGridFrames generators return non-empty arrays")
    void frameGeneratorsReturnNonEmpty() {
        assertThat(BrailleGridFrames.genScan()).hasSize(10);
        assertThat(BrailleGridFrames.genRain()).hasSize(12);
        assertThat(BrailleGridFrames.genScanLine()).hasSize(6);
        assertThat(BrailleGridFrames.genPulse()).hasSize(5);
        assertThat(BrailleGridFrames.genSnake()).hasSize(16);
        assertThat(BrailleGridFrames.genSparkle()).hasSize(6);
        assertThat(BrailleGridFrames.genCascade()).hasSize(12);
        assertThat(BrailleGridFrames.genColumns()).hasSize(26);
        assertThat(BrailleGridFrames.genOrbit()).hasSize(8);
        assertThat(BrailleGridFrames.genBreathe()).hasSize(18);
        assertThat(BrailleGridFrames.genWaveRows()).hasSize(16);
        assertThat(BrailleGridFrames.genCheckerboard()).hasSize(4);
        assertThat(BrailleGridFrames.genHelix()).hasSize(16);
        assertThat(BrailleGridFrames.genFillSweep()).hasSize(11);
        assertThat(BrailleGridFrames.genDiagonalSwipe()).hasSize(16);
        assertThat(BrailleGridFrames.genBrailleWave()).hasSize(8);
        assertThat(BrailleGridFrames.genDna()).hasSize(12);
    }

    @Test
    @DisplayName("BrailleGridFrames.of creates valid SpinnerFrameSet")
    void ofCreatesValidSpinnerFrameSet() {
        String[] frames = BrailleGridFrames.genHelix();
        SpinnerFrameSet frameSet = BrailleGridFrames.of(frames);

        assertThat(frameSet.frameCount()).isEqualTo(frames.length);
        assertThat(frameSet.frame(0)).isEqualTo(frames[0]);
        assertThat(frameSet.frame(15)).isEqualTo(frames[15]);
    }

    @Test
    @DisplayName("availableGenerators lists all generators")
    void availableGenerators() {
        assertThat(BrailleGridFrames.availableGenerators()).hasSize(17);
    }
}