package com.example.codemate.tournamentorganizer.app.ui.teampicker.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.codemate.tournamentorganizer.R

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

class TeamPickerAdapter : RecyclerView.Adapter<TeamPickerAdapter.TeamPickerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamPickerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TeamPickerViewHolder(layoutInflater.inflate(R.layout.row_teampicker, parent, false))
    }

    override fun onBindViewHolder(holder: TeamPickerViewHolder, position: Int) {
        holder.name.text = "Pelaajan nimi"
    }

    override fun getItemCount(): Int {
        return 5
    }

    class TeamPickerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.txt_playerName)

        init {

        }

    }
}
