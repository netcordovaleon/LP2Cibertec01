package com.cibertec.springproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ClientDTO {
    private int Id;
    private String Name;
    private String DocumentType;
    private String DocumentNumber;
    private boolean Status;
}
