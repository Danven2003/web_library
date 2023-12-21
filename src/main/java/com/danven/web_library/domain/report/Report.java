package com.danven.web_library.domain.report;

import com.danven.web_library.domain.operation.SendReport;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Report {

    private String description;

    private SendReport sendReport;

    @Builder
    public Report(String description) {
        this.description = description;
    }
}
