package br.com.voll.medvoll.domain.medicalAppointment;

import java.time.LocalDateTime;

public class Query {
    private String doctorCrm;
    private String patientCPF;
    private LocalDateTime dateTime;
    private QueryStatus queryStatus;
}
