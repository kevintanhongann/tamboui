/*
 * Copyright TamboUI Contributors
 * SPDX-License-Identifier: MIT
 */
package dev.tamboui.widgets.spinner;

/**
 * Built-in spinner frame sets for the {@link Spinner} widget.
 * <p>
 * Each style defines a sequence of frames that are cycled through
 * to create an animated loading indicator.
 *
 * <pre>{@code
 * // Use the DOTS style (braille characters)
 * Spinner spinner = Spinner.builder()
 *     .spinnerStyle(SpinnerStyle.DOTS)
 *     .build();
 *
 * // Use the LINE style (classic -\|/)
 * Spinner spinner = Spinner.builder()
 *     .spinnerStyle(SpinnerStyle.LINE)
 *     .build();
 *
 * // Use a custom frame set
 * Spinner spinner = Spinner.builder()
 *     .frameSet(SpinnerFrameSet.of("*", "+", "x", "+"))
 *     .build();
 * }</pre>
 *
 * @see SpinnerFrameSet
 */
public enum SpinnerStyle {

    /** Braille dot pattern spinner. */
    DOTS(SpinnerFrameSet.of("\u2800", "\u2801", "\u2803", "\u2807", "\u280f", "\u281f", "\u283f", "\u287f", "\u28ff",
            "\u28fe", "\u28fc", "\u28f8", "\u28f0", "\u28e0", "\u28c0", "\u2880")),

    /** Classic line spinner: {@code -\|/}. */
    LINE(SpinnerFrameSet.of("-", "\\", "|", "/")),

    /** Arc spinner using quarter-circle characters. */
    ARC(SpinnerFrameSet.of("\u25dc", "\u25dd", "\u25de", "\u25df")),

    /** Circle spinner using clock-position characters. */
    CIRCLE(SpinnerFrameSet.of("\u25cb", "\u25d4", "\u25d1", "\u25d5", "\u25cf", "\u25d5", "\u25d1", "\u25d4")),

    /** Bouncing bar spinner. */
    BOUNCING_BAR(SpinnerFrameSet.of("[    ]", "[=   ]", "[==  ]", "[=== ]", "[ ===]", "[  ==]", "[   =]", "[    ]",
            "[   =]", "[  ==]", "[ ===]", "[=== ]", "[==  ]", "[=   ]")),

    /** Toggle spinner with two states. */
    TOGGLE(SpinnerFrameSet.of("\u25b6", "\u25b7")),

    /** Gauge-style spinner using block fill characters (left to right). */
    GAUGE(SpinnerFrameSet.of("\u258f", "\u258e", "\u258d", "\u258c", "\u258b", "\u258a", "\u2589", "\u2588")),

    /** Growing vertical bar spinner (bottom to top). */
    VERTICAL_GAUGE(SpinnerFrameSet.of("\u2581", "\u2582", "\u2583", "\u2584", "\u2585", "\u2586", "\u2587", "\u2588")),

    /** Rotating arrow spinner. */
    ARROWS(SpinnerFrameSet.of("\u2190", "\u2196", "\u2191", "\u2197", "\u2192", "\u2198", "\u2193", "\u2199")),

    /** Clock spinner using clock face characters. */
    CLOCK(SpinnerFrameSet.of("\ud83d\udd50", "\ud83d\udd51", "\ud83d\udd52", "\ud83d\udd53", "\ud83d\udd54", "\ud83d\udd55",
            "\ud83d\udd56", "\ud83d\udd57", "\ud83d\udd58", "\ud83d\udd59", "\ud83d\udd5a", "\ud83d\udd5b")),

    /** Moon phases spinner. */
    MOON(SpinnerFrameSet.of("\ud83c\udf11", "\ud83c\udf12", "\ud83c\udf13", "\ud83c\udf14", "\ud83c\udf15",
            "\ud83c\udf16", "\ud83c\udf17", "\ud83c\udf18")),

    /** Square corners spinner. */
    SQUARE_CORNERS(SpinnerFrameSet.of("\u25f0", "\u25f3", "\u25f2", "\u25f1")),

    /** Growing dots spinner using braille. */
    GROWING_DOTS(SpinnerFrameSet.of("\u2800", "\u2840", "\u28c0", "\u28e0", "\u28f0", "\u28f8", "\u28fc", "\u28fe", "\u28ff")),

/** Bouncing ball spinner. */
BOUNCING_BALL(SpinnerFrameSet.of("\u2801", "\u2802", "\u2804", "\u2840", "\u2880", "\u2820", "\u2810", "\u2808")),

/** Braille wave animation (8 frames). */
BRAILLE_WAVE(SpinnerFrameSet.of("\u2801\u2802\u2804\u2800", "\u2802\u2804\u2800\u2800", "\u2804\u2800\u2800\u2800", "\u2800\u2800\u2800\u2800",
    "\u2800\u2800\u2800\u2800", "\u2800\u2800\u2800\u2800", "\u2800\u2800\u2800\u2800", "\u2800\u2800\u2800\u2800")),

/** DNA double helix pattern (12 frames). */
DNA(SpinnerFrameSet.of("\u280b\u2809\u2819\u281a", "\u2809\u2819\u281a\u2812", "\u2819\u281a\u2812\u2812", "\u281a\u2812\u2812\u2812",
    "\u2812\u2812\u2812\u28f2", "\u2812\u2812\u28f2\u28b4", "\u2812\u28f2\u28b4\u28b4", "\u28f2\u28b4\u28b4\u28a4",
    "\u28b4\u28b4\u28a4\u28c4", "\u28b4\u28a4\u28c4\u280b", "\u28a4\u28c4\u280b\u2809", "\u28c4\u280b\u2809\u2819")),

/** Scanning line animation (10 frames). */
SCAN(SpinnerFrameSet.of("\u283f\u2800\u2800", "\u283f\u2800\u2800", "\u283f\u2800\u2800", "\u283f\u2800\u2800", "\u283f\u2800 ",
    "\u283f\u2800 ", "\u283f\u2800 ", "\u283f\u2800 ", "\u283f\u2800 ", "\u283f\u2800 ")),

/** Falling dots with offsets (12 frames). */
RAIN(SpinnerFrameSet.of("\u280b", "\u2819", "\u2839", "\u2838", "\u283c", "\u2834", "\u2826", "\u2827", "\u2807", "\u280f",
    "\u280b", "\u2819")),

/** Vertical scan with fade (6 frames). */
SCANLINE(SpinnerFrameSet.of("\u2801", "\u2803", "\u2807", "\u2805", "\u2803", "\u2801")),

/** Expanding/contracting circle (5 frames). */
PULSE(SpinnerFrameSet.of("\u2801", "\u2803", "\u2807", "\u2805", "\u2803")),

/** Snake path animation (16 frames). */
SNAKE(SpinnerFrameSet.of("\u2801", "\u2803", "\u2805", "\u2807", "\u280d", "\u280b", "\u281b", "\u281f",
    "\u2800", "\u2801", "\u2803", "\u2805", "\u2807", "\u280d", "\u280b", "\u281b")),

/** Sparkle patterns (6 frames). */
SPARKLE(SpinnerFrameSet.of("\u2800\u2800\u2800", "\u2800\u2800\u2801", "\u2800\u2801\u2802", "\u2801\u2802\u2804", "\u2802\u2804\u2800", "\u2804\u2800\u2800")),

/** Diagonal cascade (12 frames). */
CASCADE(SpinnerFrameSet.of("\u2808", "\u2800\u2800", "\u2800\u2800", "\u2800\u2800", "\u28ff", "\u283f", "\u283e", "\u283c", "\u2800", "\u2801", "\u2802", "\u2803")),

/** Column fill animation (26 frames). */
COLUMNS(SpinnerFrameSet.of("\u2801", "\u2802", "\u2804", "\u2820", "\u2830", "\u2838", "\u283c", "\u2834", "\u2826", "\u2827",
    "\u2807", "\u280f", "\u280b", "\u2809", "\u2819", "\u281a", "\u2812", "\u28f2", "\u28b4", "\u28b4",
    "\u28a4", "\u28c4", "\u280b", "\u2809", "\u2800\u2800", "\u2800\u2800")),

/** Orbiting dot (8 frames). */
ORBIT(SpinnerFrameSet.of("\u2801", "\u2803", "\u2805", "\u2807", "\u280d", "\u280b", "\u281b", "\u281f")),

/** Breathing/pulsing dots (17 frames). */
BREATHE(SpinnerFrameSet.of(" ", "\u2801", "\u2803", "\u2807", "\u2805", "\u280d", "\u280b", "\u281b", "\u281f",
    "\u28ff", "\u28bf", "\u289f", "\u283f", "\u281f", "\u281b", "\u280f", "\u2807", " ")),

/** Wave across rows (16 frames). */
WAVE_ROWS(SpinnerFrameSet.of("\u2800\u2800", "\u2800\u2801", "\u2801\u2802", "\u2802\u2803", "\u2803\u2804", "\u2804\u2805", "\u2805\u2806", "\u2806\u2807",
    "\u2807\u2808", "\u2808\u2809", "\u2809\u280a", "\u280a\u280b", "\u280b\u280c", "\u280c\u280d", "\u280d\u280e", "\u280e\u280f")),

/** Checkerboard toggle (4 frames). */
CHECKERBOARD(SpinnerFrameSet.of("\u2801\u2803", "\u2805\u2807", "\u280d\u280b", "\u281b\u281f")),

/** Double helix wave (16 frames). */
HELIX(SpinnerFrameSet.of("\u28ff\u283e", "\u283e\u283d", "\u283d\u283c", "\u283c\u283f", "\u283f\u28ff", "\u28ff\u28ff", "\u28ff\u283e", "\u283e\u283d",
    "\u283d\u283c", "\u283c\u283f", "\u283f\u28ff", "\u28ff\u28ff", "\u28ff\u283e", "\u283e\u283d", "\u283d\u283c", "\u283c\u283f")),

/** Fill sweep animation (11 frames). */
FILL_SWEEP(SpinnerFrameSet.of(" ", "\u2801", "\u2803", "\u2805", "\u28ff", "\u28ff", "\u28ff", "\u2820", "\u2800\u2800", "\u2800\u2800", " ")),

/** Diagonal fill/unfill (16 frames). */
DIAG_SWIPE(SpinnerFrameSet.of(" ", "\u2801", "\u2803", "\u2805", "\u2820", "\u28ff", "\u28ff", "\u28ff", "\u2820", "\u2830", "\u2800\u2800", " ",
    " ", "\u2801", "\u2803", "\u2805"));

private final SpinnerFrameSet frameSet;

    SpinnerStyle(SpinnerFrameSet frameSet) {
        this.frameSet = frameSet;
    }

    /**
     * Returns the frame set for this spinner style.
     *
     * @return the frame set
     */
    public SpinnerFrameSet frameSet() {
        return frameSet;
    }

    /**
     * Returns all frames for this spinner style.
     *
     * @return the frame array
     */
    public String[] frames() {
        return frameSet.frames();
    }

    /**
     * Returns the frame at the given index (wrapping around).
     *
     * @param index the frame index
     * @return the frame string
     */
    public String frame(int index) {
        return frameSet.frame(index);
    }

    /**
     * Returns the number of frames in this style.
     *
     * @return the frame count
     */
    public int frameCount() {
        return frameSet.frameCount();
    }
}
