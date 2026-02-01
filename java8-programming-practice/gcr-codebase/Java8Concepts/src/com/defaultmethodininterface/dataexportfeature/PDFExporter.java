package com.defaultmethodininterface.dataexportfeature;
public class PDFExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV not supported in PDFExporter");
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting data to PDF: " + data);
    }
}
