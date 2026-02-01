package com.defaultmethodininterface.dataexportfeature;
public class AdvancedExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV Export: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF Export: " + data);
    }

    // Override new feature
    @Override
    public void exportToJSON(String data) {
        System.out.println("Advanced JSON Export:");
        System.out.println("""
        {
            "reportData": "%s",
            "generatedBy": "System"
        }
        """.formatted(data));
    }
}
