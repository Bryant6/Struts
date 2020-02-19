package action;

import java.io.File;

public class UploadAction {
    private File doc;
    private String docFileName;
    private String docContentType;

    public String upload(){
        System.out.println(doc);
        System.out.println(docFileName);
        System.out.println(docContentType);

        return "success";
    }

    public File getDoc() {
        return doc;
    }

    public void setDoc(File doc) {
        this.doc = doc;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public String docContentType() {
        return docContentType;
    }

    public void docContentType(String docContentType) {
        this.docContentType = docContentType;
    }
}
