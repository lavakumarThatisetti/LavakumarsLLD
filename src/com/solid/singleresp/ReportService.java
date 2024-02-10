package com.solid.singleresp;

public class ReportService {

    ReportGenerator reportGenerator;

    ReportFormatter reportFormatter;

    public void report(){
        String formattedData = reportFormatter.formatter("Hello");
        reportGenerator.generate(formattedData);
    }
}
