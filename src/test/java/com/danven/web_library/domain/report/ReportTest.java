package com.danven.web_library.domain.report;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReportTest {


    @Test
    public void createReportTest(){
        String description = "scam";
        Report report = Report.builder()
                .description(description)
                .build();

        Assertions.assertEquals(description, report.getDescription());
    }


}
