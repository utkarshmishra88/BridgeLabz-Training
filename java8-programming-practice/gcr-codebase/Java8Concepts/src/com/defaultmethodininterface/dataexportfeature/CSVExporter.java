package com.defaultmethodininterface.dataexportfeature;
public class CSVExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF not supported in CSVExporter");
    }
}
