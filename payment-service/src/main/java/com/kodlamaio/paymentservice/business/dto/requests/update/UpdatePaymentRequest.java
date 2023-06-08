package com.kodlamaio.paymentservice.business.dto.requests.update;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePaymentRequest {
    @NotBlank(message = "Kart numarası alanı boş bırakılamaz.")
    @Length(min = 16, max = 16, message = "Kart numarası 16 haneden oluşmalıdır.")
    private String cardNumber;

    @NotBlank(message = "Kart sahibi bilgisi boş bırakılamaz.")
    @Length(min = 5, message = "Kart sahibi bilgisi en az 5 karakterden oluşmalıdır.")
    private String cardHolder;

    @Min(value = 2023, message = "Kart son kullanma yılı geçersiz.")
    private int cardExpirationYear;

    @Max(value = 12)
    @Min(value = 1)
    private int cardExpirationMonth;

    @NotBlank(message = "Cvv bilgisi boş bırakılamaz")
    @Length(min = 3, max = 3, message = "Cvv numarası 3 haneli olmalıdır.")
    private String cardCvv;
    @NotNull
    @Min(value = 1)
    private double balance;
}
