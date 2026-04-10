package com.example.novoprojeto.core_domain.model
import java.time.Instant

data class BarcodeScan(
    val value: BarcodeValue,
    val scannedAt: Instant
)