package dom;

import java.io.File;

import org.rdr.dom.kml.KmlType;

public class KMLFile implements ParsedFile {

    private String mPath = "";
    private File mFile;
    private KmlType mKmlType = null;

    protected KMLFile(String path, KmlType kmlType) {
        mPath = path;
        mKmlType = kmlType;
        mFile = new File(path);
    }

    public String getPath() {
        return mPath;
    }

    public String getExtention() {
        return "kml";
    }

    public String getFileName() {
        return mFile.getName();
    }

    public ParsedObject getParsedObject() {
        return mKmlType;
    }
}
