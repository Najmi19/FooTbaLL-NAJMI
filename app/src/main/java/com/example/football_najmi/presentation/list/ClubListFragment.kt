package com.example.football_najmi.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.football_najmi.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ClubListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = ClubAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_club_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.club_recyclerview)
        recyclerView.apply {
            layoutManager = this@ClubListFragment.layoutManager
            adapter = this@ClubListFragment.adapter
        }
        val clubList : ArrayList<String> = arrayListOf<String>().apply {
            add("Madrid")
            add("Barça")
            add("Paris")
            add("Marseiile")
            add("Bayern")
            add("Dortmund")
            add("IRT")
            add("widad")
            
        }
        adapter.updateList(clubList)
    }
}