package com.leitner.wildest.rdr;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Wildest on 11/13/2014.
 */

public class GpxParser {
    private InputStream mIs = null;
    private StringBuilder mStringBuilder = new StringBuilder();

    public GpxParser (InputStream is) {
        mIs = is;
    }

    public TrkPt nextTrkPt () throws IOException {
        mStringBuilder.delete(0, mStringBuilder.length());

        int c;
        while ( (c = mIs.read()) != -1 ) {
            mStringBuilder.append((char)c);

            TrkPt trkpt = new TrkPt();
            if (trkpt.parse(mStringBuilder)) {
                return trkpt;
            }
        }
        return null;
    }

    public TrkPtInputStream getTrkPtStream () {
        return new TrkPtInputStream(this);
    }
}