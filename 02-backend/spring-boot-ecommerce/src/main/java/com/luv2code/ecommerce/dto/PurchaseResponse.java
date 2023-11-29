package com.luv2code.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // lombok create constructor for final or @NonNull
    private final String orderTrackingNumber;

}
