package com.sandesh.RESTAPIsSpringBoot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SishyaInsertDTO {
    @NotBlank(message = "naam is Required")
    @Size(min = 3, max = 50, message = "Naam has to be between length 3 and 50")
    private String naam;

    @NotBlank(message = "Baas/Nivasha Required")
    private String nivasha;

    @Email
    @NotBlank(message = "ePatram is Required")
    private String ePatram;
}
