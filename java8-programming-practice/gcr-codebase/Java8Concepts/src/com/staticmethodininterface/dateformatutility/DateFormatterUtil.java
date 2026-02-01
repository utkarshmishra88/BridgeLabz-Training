package com.staticmethodininterface.dateformatutility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatterUtil {

    static String format(LocalDate date, String pattern) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    // predefined formats (commonly used in enterprise apps)

    static String toIndianFormat(LocalDate date) {
        return format(date, "dd-MM-yyyy");
    }

    static String toUSFormat(LocalDate date) {
        return format(date, "MM/dd/yyyy");
    }

    static String toInvoiceFormat(LocalDate date) {
        return format(date, "dd MMM yyyy");
    }
}
