package com.practice.jatinassignment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.practice.jatinassignment.R
import com.practice.jatinassignment.model.States

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var adapter : CourseListAdapter
    private var selectedStates = ArrayList<States>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView : RecyclerView = root.findViewById(R.id.rcview_courses)
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())

        adapter = CourseListAdapter(this.requireContext())

        recyclerView.adapter = adapter

        root.findViewById<Button>(R.id.btn_pending).setOnClickListener{
            if(it.isSelected) {
                it.isSelected = false
                selectedStates.remove(States.Pending)
            } else {
                it.isSelected = true
                selectedStates.add(States.Pending)
            }
            homeViewModel.filterCoursesWith(selectedStates)
        }

        root.findViewById<Button>(R.id.btn_inprogress).setOnClickListener{
            if(it.isSelected) {
                it.isSelected = false
                selectedStates.remove(States.InProgress)
            } else {
                it.isSelected = true
                selectedStates.add(States.InProgress)
            }
            homeViewModel.filterCoursesWith(selectedStates)
        }

        root.findViewById<Button>(R.id.btn_complete).setOnClickListener{
            if(it.isSelected) {
                it.isSelected = false
                selectedStates.remove(States.Completed)
            } else {
                it.isSelected = true
                selectedStates.add(States.Completed)
            }
            homeViewModel.filterCoursesWith(selectedStates)
        }


//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(this, Observer {
//            textView.text = it
//        })


        homeViewModel.getCourseList().observe(this, Observer {
                adapter.setMyCourseList(it)
        })

        return root
    }
}