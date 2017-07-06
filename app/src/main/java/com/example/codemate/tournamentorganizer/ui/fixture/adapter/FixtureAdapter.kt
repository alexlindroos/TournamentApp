package com.example.codemate.tournamentorganizer.ui.fixture.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.ui.addresult.activity.AddResultActivity

/**
 * Created by Alex Lindroos on 06/07/2017.
 */
class FixtureAdapter : RecyclerView.Adapter<FixtureAdapter.FixtureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FixtureViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FixtureViewHolder(layoutInflater.inflate(R.layout.row_fixture, parent, false))
    }

    override fun onBindViewHolder(holder: FixtureViewHolder, position: Int) {
        holder.team1.text = "Joukkue 1"
        holder.team2.text = "Joukkue 2"
        holder.addresult.setOnClickListener {
            val intent = Intent(holder.itemView.context, AddResultActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return 5
    }

    class FixtureViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val team1: TextView = itemView.findViewById(R.id.fixture_team1)
        val team2: TextView = itemView.findViewById(R.id.fixture_team2)
        val addresult: Button = itemView.findViewById(R.id.btn_add_result)

        init {

        }

    }
}
