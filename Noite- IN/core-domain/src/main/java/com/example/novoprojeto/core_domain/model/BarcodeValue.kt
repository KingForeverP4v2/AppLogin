package com.example.novoprojeto.core_domain.model

@JvmInline
value class BarcodeValue(val raw: String){
    int{
    val v = raw.trim()
    required(v.isNotEmpty()){"Barcode cannot be empty"}

}
    fun normalized(): String = raw.trim()
}