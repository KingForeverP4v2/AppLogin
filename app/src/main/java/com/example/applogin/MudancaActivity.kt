package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText

class MudancaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mudanca)

        val toolbar = findViewById<Toolbar>(R.id.toolbarMudanca)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<Button>(R.id.btnSolicitarMudanca).setOnClickListener {
            val nome = findViewById<TextInputEditText>(R.id.editNomeMorador).text.toString().trim()
            val apartamento = findViewById<TextInputEditText>(R.id.editApartamentoMudanca).text.toString().trim()
            val data = findViewById<TextInputEditText>(R.id.editDataMudanca).text.toString().trim()

            if (nome.isEmpty() || apartamento.isEmpty() || data.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Solicitação de mudança enviada!", Toast.LENGTH_LONG).show()
            }
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