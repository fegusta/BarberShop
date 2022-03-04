package com.fegusta.recyclerview.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fegusta.recyclerview.R
import com.fegusta.recyclerview.model.Jogo
import java.util.*


class JogosAdapter(var listaJogos: ArrayList<Jogo>): RecyclerView.Adapter<JogosAdapter.JogoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {

    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(jogo: Jogo) {
            itemView.findViewById<TextView>(R.id.textNomeDoJogo).text = jogo.nomeJogo
            itemView.findViewById<TextView>(R.id.textConsole).text = jogo.console
            itemView.findViewById<RatingBar>(R.id.notaJogo).rating = jogo.notaJogo
        }
    }

}
