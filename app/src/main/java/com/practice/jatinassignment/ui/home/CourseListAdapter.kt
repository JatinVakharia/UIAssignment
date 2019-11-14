package com.practice.jatinassignment.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.practice.jatinassignment.R
import com.practice.jatinassignment.model.Course
import com.practice.jatinassignment.model.States
import kotlinx.android.synthetic.main.item_course.view.*
import java.text.SimpleDateFormat


class CourseListAdapter(val context : Context) : RecyclerView.Adapter<CourseItemViewHolder>(){

    private lateinit var courseList : List<Course>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseItemViewHolder {
        return CourseItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_course, parent, false))
    }

    fun setMyCourseList(courses : List<Course>){
        courseList = courses
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onBindViewHolder(holder: CourseItemViewHolder, position: Int) {
        holder.tvCourseName.text = courseList.get(index = position).subject
        holder.tvCourseDuration.text = courseList.get(index = position).courseHrs + " | " + courseList.get(index = position).chapter + " chapters"
        holder.tvCourseValidity.text = "Valid till : " + SimpleDateFormat("dd-MMM-yy").format(courseList.get(index = position).validTill)
        holder.tvCourseGrade.text = courseList.get(index = position).currentClass
        val state : States = courseList.get(position).status
        holder.tvCourseStatus.text = state.value
        when(state){
            States.Pending -> holder.tvCourseStatus.background = context.getDrawable(R.drawable.selector_pending)
            States.InProgress -> holder.tvCourseStatus.background = context.getDrawable(R.drawable.selector_inprogress)
            States.Completed -> holder.tvCourseStatus.background = context.getDrawable(R.drawable.selector_complete)
        }
    }
}

class CourseItemViewHolder(view : View ):RecyclerView.ViewHolder(view){
    val tvCourseName = view.tv_course_name
    val tvCourseDuration = view.tv_course_duration
    val tvCourseValidity = view.tv_course_validity
    val tvCourseGrade = view.tv_grade
    val tvCourseStatus = view.tv_status
    val card_slide1 = view.card_slide1
    val card_slide2 = view.card_slide2
    val card_slide3 = view.card_slide3

    init {
        view.setOnClickListener{
            if(view.card_slide1.isVisible) view.card_slide1.visibility = View.GONE
            else view.card_slide1.visibility = View.VISIBLE

            if(view.card_slide2.isVisible) view.card_slide2.visibility = View.GONE
            else view.card_slide2.visibility = View.VISIBLE

            if(view.card_slide3.isVisible) view.card_slide3.visibility = View.GONE
            else view.card_slide3.visibility = View.VISIBLE
        }
    }
}