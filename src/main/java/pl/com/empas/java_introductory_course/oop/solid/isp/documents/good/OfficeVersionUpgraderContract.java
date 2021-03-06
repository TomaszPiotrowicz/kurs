package pl.com.empas.java_introductory_course.oop.solid.isp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;

public interface OfficeVersionUpgraderContract {

    void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion);

}
