package com.danven.web_library.domain.operation;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.Selling;
import com.danven.web_library.domain.operation.SendReport;
import com.danven.web_library.domain.report.Report;
import com.danven.web_library.domain.user.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class SendReportTest {

    @Test
    public void createSendReportTest(){
        Offer offer = Factory.getOffer(2);
        Report report = Factory.getReport("some description ");
        LocalDateTime time = LocalDateTime.of(2022, 9, 11, 11, 34, 5);

        SendReport sendReport = SendReport.builder()
                .offer(offer)
                .report(report)
                .dateTime(time)
                .build();

        Assertions.assertEquals(offer, sendReport.getOffer());
        Assertions.assertEquals(report, sendReport.getReport());
        Assertions.assertEquals(time, sendReport.getDateTime());
    }

}
