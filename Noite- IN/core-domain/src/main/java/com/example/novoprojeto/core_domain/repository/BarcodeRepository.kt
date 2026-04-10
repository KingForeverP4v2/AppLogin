package com.example.novoprojeto.core_domain.repository

import kotlinx.coroutines.flow.Flow

interface BarcodeRepository {
    suspend fun save(scan: BarcodeScan)
    fun observeHistory(): Flow<List<BarcodeScan>>
    suspend fun syncPending() //placeholder para o futuro (FireBase)

}