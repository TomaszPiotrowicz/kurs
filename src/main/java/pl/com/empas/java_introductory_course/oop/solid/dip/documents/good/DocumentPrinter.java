package pl.com.empas.java_introductory_course.oop.solid.dip.documents.good;

public class DocumentPrinter {


    public int getPrintoutPagesNumber(DocumentPagesProviderContract [] documents) {
        int pages = 0;
        for(DocumentPagesProviderContract doc : documents) {
            pages += doc.getPagesNumber();
        }
        return pages;
    }

}
