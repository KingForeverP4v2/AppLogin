package com.example.novoprojeto.core_domain.usecase
import br.com.novoprojeto.core.domain.model.BarcodeScan
import br.com.novoprojeto.core.domain.repository.BarcodeRepository
import ktlinx.coroutines.flow.Flow

clas ObserveHistoryUseCase(

  private val repository: BarcodeRepository
){
    operator fun invoke (): Flow<List<BarcodeScan>> = repository.observeHistory()
}

