package com.turing.alan.cpifp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion

class ChampionAdapter(private val championList: List<Champion>) :
    RecyclerView.Adapter<ChampionAdapter.ChampionViewHolder>() {

    // ViewHolder para el RecyclerView
    class ChampionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.nombre)
        val title: TextView = view.findViewById(R.id.titulo)
        val lore: TextView = view.findViewById(R.id.lore)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.champion, parent, false)
        return ChampionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
        val champion = championList[position]
        holder.name.text = champion.name
        holder.title.text = champion.title
        holder.lore.text = champion.lore
    }

    override fun getItemCount(): Int {
        return championList.size
    }
}
