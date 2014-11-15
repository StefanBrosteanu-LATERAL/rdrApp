package dom;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import org.rdr.dom.gpx.WptType;
import org.rdr.newimp.GeoPoint;

public interface ParsedObject extends Serializable {

    String getName();
    String getDescr();
    Vector<GeoPoint> getPoints();
    List<WptType> getPOIs();
}
