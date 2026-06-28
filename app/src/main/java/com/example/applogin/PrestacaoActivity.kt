package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applogin.adapter.ContaAdapter
import com.example.applogin.model.Conta

class PrestacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestacao)

        val toolbar = findViewById<Toolbar>(R.id.toolbarPrestacao)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<RecyclerView>(R.id.recyclerContas)
        recycler.layoutManager = LinearLayoutManager(this)

        val contas = listOf(
            Conta("Taxa de Condomínio", 800.00, "Despesa"),
            Conta("Água", 120.50, "Despesa"),
            Conta("Luz", 95.75, "Despesa"),
            Conta("Seguro", 60.00, "Despesa"),
            Conta("Aluguel de salão", 200.00, "Receita"),
            Conta("Contribuição Extra", 300.00, "Receita")
        )
        recycler.adapter = ContaAdapter(contas)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}