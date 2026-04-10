package com.example.novoprojeto.core_domain.usecase

import br.com.novoprojeto.core.domain.model.BarcodeScan
import br.com.novoprojeto.core.domain.repository.BarcodeRepository

class SaveBarcodeUseCase(
    private val repository: BarcodeRepository

){
    suspend operator fun invoke(scan: BarcodeScan){
        repository.save(scan)
    }
}