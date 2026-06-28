package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applogin.adapter.ComunicadoAdapter
import br.sp.etec.sebrae.model.Comunicado

class ComunicadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comunicados)

        val toolbar = findViewById<Toolbar>(R.id.toolbarComunicados)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<RecyclerView>(R.id.recyclerComunicados)
        recycler.layoutManager = LinearLayoutManager(this)

        val comunicados = listOf(
            Comunicado("Novo Bicicletário"),
            Comunicado("Portão de Veículos"),
            Comunicado("Alarme do Edifício"),
            Comunicado("Festa Junina")
        )
        recycler.adapter = ComunicadoAdapter(comunicados)

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
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