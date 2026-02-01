package com.defaultmethodininterface.dataexportfeature;
public interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    // New feature added later (backward compatible)
    default void exportToJSON(String data) {
        System.out.println("Default JSON Export:");
        System.out.println("{ \"report\": \"" + data + "\" }");
    }
}
