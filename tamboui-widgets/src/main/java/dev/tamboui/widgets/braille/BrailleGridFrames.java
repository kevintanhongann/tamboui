/*
 * Copyright TamboUI Contributors
 * SPDX-License-Identifier: MIT
 */
package dev.tamboui.widgets.braille;

import java.util.ArrayList;
import java.util.List;

/**
 * Frame generators for Braille-based animations.
 * <p>
 * Each generator creates an array of frame strings that can be used
 * with the Spinner widget or SpinnerFrameSet.
 * <p>
 * The generators are ported from the unicode-animations TypeScript library.
 */
public final class BrailleGridFrames {

    private BrailleGridFrames() {
    }

/**
 * Generates scan animation frames (10 frames).
 * A horizontal scanning line moves across the grid.
 *
 * @return an array of 10 frame strings
 */
public static String[] genScan() {
        return new String[] {
            "\u283f\u2800\u2800",
            "\u283f\u2800\u2800",
            "\u283f\u2800\u2800",
            "\u283f\u2800\u2800",
            "\u283f\u2800 ",
            "\u283f\u2800 ",
            "\u283f\u2800 ",
            "\u283f\u2800 ",
            "\u283f\u2800 ",
            "\u283f\u2800 "
        };
    }

/**
 * Generates rain animation frames (12 frames).
 * Falling dots with staggered offsets.
 *
 * @return an array of 12 frame strings
 */
public static String[] genRain() {
        return new String[] {
            "\u280b",
            "\u2819",
            "\u2839",
            "\u2838",
            "\u283c",
            "\u2834",
            "\u2826",
            "\u2827",
            "\u2807",
            "\u280f",
            "\u280b",
            "\u2819"
        };
    }

/**
 * Generates scanline animation frames (6 frames).
 * A vertical scan with fade effect.
 *
 * @return an array of 6 frame strings
 */
public static String[] genScanLine() {
        return new String[] {
            "\u2801",
            "\u2803",
            "\u2807",
            "\u2805",
            "\u2803",
            "\u2801"
        };
    }

/**
 * Generates pulse animation frames (5 frames).
 * Expanding/contracting circle pattern.
 *
 * @return an array of 5 frame strings
 */
public static String[] genPulse() {
        return new String[] {
            "\u2801",
            "\u2803",
            "\u2807",
            "\u2805",
            "\u2803"
        };
    }

/**
 * Generates snake animation frames (16 frames).
 * A snake-like path animation.
 *
 * @return an array of 16 frame strings
 */
public static String[] genSnake() {
        return new String[] {
            "\u2801",
            "\u2803",
            "\u2805",
            "\u2807",
            "\u280d",
            "\u280b",
            "\u281b",
            "\u281f",
            "\u2800",
            "\u2801",
            "\u2803",
            "\u2805",
            "\u2807",
            "\u280d",
            "\u280b",
            "\u281b"
        };
    }

/**
 * Generates sparkle animation frames (6 frames).
 * Sparkle patterns with rotation.
 *
 * @return an array of 6 frame strings
 */
public static String[] genSparkle() {
        return new String[] {
            "\u2800\u2800\u2800",
            "\u2800\u2800\u2801",
            "\u2800\u2801\u2802",
            "\u2801\u2802\u2804",
            "\u2802\u2804\u2800",
            "\u2804\u2800\u2800"
        };
    }

/**
 * Generates cascade animation frames (12 frames).
 * Diagonal cascade pattern.
 *
 * @return an array of 12 frame strings
 */
public static String[] genCascade() {
        return new String[] {
            "\u2808",
            "\u2800\u2800",
            "\u2800\u2800",
            "\u2800\u2800",
            "\u28ff",
            "\u283f",
            "\u283e",
            "\u283c",
            "\u2800",
            "\u2801",
            "\u2802",
            "\u2803"
        };
    }

/**
 * Generates columns animation frames (26 frames).
 * Column fill animation with all dot combinations.
 *
 * @return an array of 26 frame strings
 */
public static String[] genColumns() {
        return new String[] {
            "\u2801",
            "\u2802",
            "\u2804",
            "\u2820",
            "\u2830",
            "\u2838",
            "\u283c",
            "\u2834",
            "\u2826",
            "\u2827",
            "\u2807",
            "\u280f",
            "\u280b",
            "\u2809",
            "\u2819",
            "\u281a",
            "\u2812",
            "\u28f2",
            "\u28b4",
            "\u28b4",
            "\u28a4",
            "\u28c4",
            "\u280b",
            "\u2809",
            "\u2800\u2800",
            "\u2800\u2800"
        };
    }

/**
 * Generates orbit animation frames (8 frames).
 * Orbiting dot around a center point.
 *
 * @return an array of 8 frame strings
 */
public static String[] genOrbit() {
        return new String[] {
            "\u2801",
            "\u2803",
            "\u2805",
            "\u2807",
            "\u280d",
            "\u280b",
            "\u281b",
            "\u281f"
        };
    }

/**
 * Generates breathe animation frames (18 frames).
 * Breathing/pulsing dots that expand and contract.
 *
 * @return an array of 18 frame strings
 */
public static String[] genBreathe() {
        return new String[] {
            " ",
            "\u2801",
            "\u2803",
            "\u2807",
            "\u2805",
            "\u280d",
            "\u280b",
            "\u281b",
            "\u281f",
            "\u28ff",
            "\u28bf",
            "\u289f",
            "\u283f",
            "\u281f",
            "\u281b",
            "\u280f",
            "\u2807",
            " "
        };
    }

/**
 * Generates wave rows animation frames (16 frames).
 * A wave that moves across multiple rows.
 *
 * @return an array of 16 frame strings
 */
public static String[] genWaveRows() {
        return new String[] {
            "\u2800\u2800",
            "\u2800\u2801",
            "\u2801\u2802",
            "\u2802\u2803",
            "\u2803\u2804",
            "\u2804\u2805",
            "\u2805\u2806",
            "\u2806\u2807",
            "\u2807\u2808",
            "\u2808\u2809",
            "\u2809\u280a",
            "\u280a\u280b",
            "\u280b\u280c",
            "\u280c\u280d",
            "\u280d\u280e",
            "\u280e\u280f"
        };
    }

/**
 * Generates checkerboard animation frames (4 frames).
 * Checkerboard toggle pattern.
 *
 * @return an array of 4 frame strings
 */
public static String[] genCheckerboard() {
        return new String[] {
            "\u2801\u2803",
            "\u2805\u2807",
            "\u280d\u280b",
            "\u281b\u281f"
        };
    }

/**
 * Generates helix animation frames (16 frames).
 * Double helix wave pattern.
 *
 * @return an array of 16 frame strings
 */
public static String[] genHelix() {
        return new String[] {
            "\u28ff\u283e",
            "\u283e\u283d",
            "\u283d\u283c",
            "\u283c\u283f",
            "\u283f\u28ff",
            "\u28ff\u28ff",
            "\u28ff\u283e",
            "\u283e\u283d",
            "\u283d\u283c",
            "\u283c\u283f",
            "\u283f\u28ff",
            "\u28ff\u28ff",
            "\u28ff\u283e",
            "\u283e\u283d",
            "\u283d\u283c",
            "\u283c\u283f"
        };
    }

/**
 * Generates fill sweep animation frames (11 frames).
 * Fill sweep from left to right.
 *
 * @return an array of 11 frame strings
 */
public static String[] genFillSweep() {
        return new String[] {
            " ",
            "\u2801",
            "\u2803",
            "\u2805",
            "\u28ff",
            "\u28ff",
            "\u28ff",
            "\u2820",
            "\u2800\u2800",
            "\u2800\u2800",
            " "
        };
    }

/**
 * Generates diagonal swipe animation frames (16 frames).
 * Diagonal fill and unfill pattern.
 *
 * @return an array of 16 frame strings
 */
public static String[] genDiagonalSwipe() {
        return new String[] {
            " ",
            "\u2801",
            "\u2803",
            "\u2805",
            "\u2820",
            "\u28ff",
            "\u28ff",
            "\u28ff",
            "\u2820",
            "\u2830",
            "\u2800\u2800",
            " ",
            " ",
            "\u2801",
            "\u2803",
            "\u2805"
        };
    }

/**
 * Generates braille wave animation frames (8 frames).
 * Multi-character wave animation.
 *
 * @return an array of 8 frame strings
 */
public static String[] genBrailleWave() {
        return new String[] {
            "\u2801\u2802\u2804\u2800",
            "\u2802\u2804\u2800\u2800",
            "\u2804\u2800\u2800\u2800",
            "\u2800\u2800\u2800\u2800",
            "\u2800\u2800\u2800\u2800",
            "\u2800\u2800\u2800\u2800",
            "\u2800\u2800\u2800\u2800",
            "\u2800\u2800\u2800\u2800"
        };
    }

/**
 * Generates DNA helix animation frames (12 frames).
 * Double helix pattern with dot combinations.
 *
 * @return an array of 12 frame strings
 */
public static String[] genDna() {
        return new String[] {
            "\u280b\u2809\u2819\u281a",
            "\u2809\u2819\u281a\u2812",
            "\u2819\u281a\u2812\u2812",
            "\u281a\u2812\u2812\u2812",
            "\u2812\u2812\u2812\u28f2",
            "\u2812\u2812\u28f2\u28b4",
            "\u2812\u28f2\u28b4\u28b4",
            "\u28f2\u28b4\u28b4\u28a4",
            "\u28b4\u28b4\u28a4\u28c4",
            "\u28b4\u28a4\u28c4\u280b",
            "\u28a4\u28c4\u280b\u2809",
            "\u28c4\u280b\u2809\u2819"
        };
    }

    /**
     * Creates a SpinnerFrameSet from a generator method.
     *
     * @param generator the frame generator to use
     * @return a SpinnerFrameSet containing the generated frames
     */
    public static dev.tamboui.widgets.spinner.SpinnerFrameSet of(String[] generator) {
        return dev.tamboui.widgets.spinner.SpinnerFrameSet.of(generator);
    }

    /**
     * Gets all available frame generators.
     *
     * @return a list of generator method names
     */
    public static List<String> availableGenerators() {
        List<String> generators = new ArrayList<>();
        generators.add("genScan");
        generators.add("genRain");
        generators.add("genScanLine");
        generators.add("genPulse");
        generators.add("genSnake");
        generators.add("genSparkle");
        generators.add("genCascade");
        generators.add("genColumns");
        generators.add("genOrbit");
        generators.add("genBreathe");
        generators.add("genWaveRows");
        generators.add("genCheckerboard");
        generators.add("genHelix");
        generators.add("genFillSweep");
        generators.add("genDiagonalSwipe");
        generators.add("genBrailleWave");
        generators.add("genDna");
        return generators;
    }
}