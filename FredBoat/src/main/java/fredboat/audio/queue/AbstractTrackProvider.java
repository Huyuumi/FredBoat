/*
 * MIT License
 *
 * Copyright (c) 2017 Frederik Ar. Mikkelsen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package fredboat.audio.queue;

import fredboat.definitions.RepeatMode;

import java.util.List;

/**
 * Shuffle and repeat mode methods for track providers
 */
public abstract class AbstractTrackProvider implements ITrackProvider {

    private RepeatMode repeatMode = RepeatMode.OFF;
    private boolean shuffle = false;

    public RepeatMode getRepeatMode() {
        return repeatMode;
    }

    public boolean isShuffle() {
        return shuffle;
    }

    public void setRepeatMode(RepeatMode repeatMode) {
        this.repeatMode = repeatMode;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * @return the shuffled play list if shuffle is true, otherwise the regular one
     */
    public abstract List<AudioTrackContext> getAsListOrdered();

    public abstract void reshuffle();

}