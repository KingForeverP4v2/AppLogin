package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applogin.adapter.ContatoAdapter
import com.example.applogin.model.Contato

class ContatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)

        val toolbar = findViewById<Toolbar>(R.id.toolbarContatos)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<RecyclerView>(R.id.recyclerContatos)
        recycler.layoutManager = LinearLayoutManager(this)

        val contatos = listOf(
            Contato("José da Silva", "(11) 99999-1111", "Síndico"),
            Contato("Maria Oliveira", "(11) 99999-2222", "Zeladora"),
            Contato("Carlos Santos", "(11) 99999-3333", "Porteiro"),
            Contato("Ana Paula", "(11) 99999-4444", "Administradora")
        )
        recycler.adapter = ContatoAdapter(contatos)
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