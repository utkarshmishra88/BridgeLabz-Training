package com.defaultmethodininterface.dataexportfeature;
public class ReportApp {

    public static void main(String[] args) {

        ReportExporter exporter = new AdvancedExporter();

        String reportData = "Sales Report 2026";

        exporter.exportToCSV(reportData);
        exporter.exportToPDF(reportData);
        exporter.exportToJSON(reportData);
    }
}
