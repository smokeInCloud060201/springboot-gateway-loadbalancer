package vn.com.smoke.paymentservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {

    @Value("${server.port}")
    private int servicePort;

    @GetMapping("/say")
    public ResponseEntity<String> getPaymentInfo() {
        return ResponseEntity.ok("Payment information retrieved successfully at port " + servicePort);
    }
}
