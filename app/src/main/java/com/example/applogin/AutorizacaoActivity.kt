package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText

class AutorizacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorizacao)

        val toolbar = findViewById<Toolbar>(R.id.toolbarAutorizacao)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnAutorizar = findViewById<Button>(R.id.btnAutorizar)
        btnAutorizar.setOnClickListener {
            val nome = findViewById<TextInputEditText>(R.id.editNome).text.toString().trim()
            val documento = findViewById<TextInputEditText>(R.id.editDocumento).text.toString().trim()
            val apartamento = findViewById<TextInputEditText>(R.id.editApartamento).text.toString().trim()

            if (nome.isEmpty() || documento.isEmpty() || apartamento.isEmpty()) {
                Toast.makeText(this, "Dados obrigatórios não preenchidos", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Autorização realizada", Toast.LENGTH_LONG).show()
                // Aqui você pode chamar a API depois
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