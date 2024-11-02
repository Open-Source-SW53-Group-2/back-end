package com.studentconnect.gouni.platform.payment.interfaces.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.studentconnect.gouni.platform.payment.application.PaymentService;
import com.studentconnect.gouni.platform.payment.domain.Payment;
import com.studentconnect.gouni.platform.payment.interfaces.rest.dto.PaymentRequestDTO;
import com.studentconnect.gouni.platform.payment.interfaces.rest.dto.PaymentResponseDTO;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*", maxAge = 3600)
@Tag(name = "Payment Controller", description = "Endpoints for payment processing")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @Operation(summary = "Process a payment")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Payment processed successfully",
                    content = @Content(schema = @Schema(implementation = PaymentResponseDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping
    public ResponseEntity<PaymentResponseDTO> processPayment(@Valid @RequestBody PaymentRequestDTO paymentRequest) {
        Payment payment = convertToPayment(paymentRequest);
        Payment processedPayment = paymentService.processPayment(payment);
        PaymentResponseDTO responseDTO = PaymentResponseDTO.fromPayment(processedPayment);
        return ResponseEntity.ok(responseDTO);
    }

    private Payment convertToPayment(PaymentRequestDTO dto) {
        Payment payment = new Payment();
        payment.setCardNumber(dto.getCardNumber());
        payment.setCardHolderName(dto.getCardHolderName());
        payment.setExpiryDate(dto.getExpiryDate());
        payment.setCvv(dto.getCvv());
        payment.setAmount(dto.getAmount());
        return payment;
    }
}