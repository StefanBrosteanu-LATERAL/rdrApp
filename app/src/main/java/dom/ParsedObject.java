package dom;

import com.leitner.wildest.rdr.GeoPoint;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import dom.gpx.WptType;


public interface ParsedObject extends Serializable {

    String getName();
    String getDescr();
    Vector<GeoPoint> getPoints();
    List<WptType> getPOIs();
}
