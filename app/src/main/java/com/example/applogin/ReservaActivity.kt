package com.example.applogin

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applogin.adapter.ReservaAdapter
import com.example.applogin.model.Reserva

class ReservaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva)

        val toolbar = findViewById<Toolbar>(R.id.toolbarReserva)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler = findViewById<RecyclerView>(R.id.recyclerReserva)
        recycler.layoutManager = LinearLayoutManager(this)

        val reservas = listOf(
            Reserva("Academia"),
            Reserva("Brinquedoteca"),
            Reserva("Churrasqueira"),
            Reserva("Salão de festa"),
            Reserva("Salão de jogos")
        )
        recycler.adapter = ReservaAdapter(reservas)
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