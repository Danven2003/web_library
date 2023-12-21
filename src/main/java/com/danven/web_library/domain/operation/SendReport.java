package com.danven.web_library.domain.operation;

import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.report.Report;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
public class SendReport {

    private LocalDateTime dateTime;

    private Offer offer;

    private Report report;


    @Builder
    public SendReport(LocalDateTime dateTime, Offer offer, Report report) {
        this.dateTime = dateTime;
        this.offer = offer;
        this.report = report;
    }
}
