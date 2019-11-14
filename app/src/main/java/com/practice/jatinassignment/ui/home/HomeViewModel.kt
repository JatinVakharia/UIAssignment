package com.practice.jatinassignment.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practice.jatinassignment.model.Course
import com.practice.jatinassignment.model.States
import java.util.*
import kotlin.collections.ArrayList

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    private val staticCourses : List<Course> = prepareCoursesList()

    var coursesList : MutableLiveData<List<Course>> = MutableLiveData()

    private fun prepareCoursesList(): List<Course> {
        var myCourses = ArrayList<Course>()

        myCourses.add(Course("Maths (CBSE)", "Grade7", "252 Hrs", 11, Date(2020, 5, 15), States.InProgress))
        myCourses.add(Course("Science (CBSE)", "Grade7", "244 Hrs", 12, Date(2020, 1, 15), States.Completed))
        myCourses.add(Course("English (ICSC)", "Grade7", "234 Hrs", 12, Date(2020, 3, 15), States.Pending))
        myCourses.add(Course("Science (HSC)", "Grade7", "250 Hrs", 15, Date(2020, 7, 15), States.Completed))
        myCourses.add(Course("English (ICSC)", "Grade7", "234 Hrs", 12, Date(2020, 3, 15), States.InProgress))
        myCourses.add(Course("Science (HSC)", "Grade7", "256 Hrs", 14, Date(2020, 3, 15), States.Completed))
        myCourses.add(Course("English (ICSC)", "Grade7", "234 Hrs", 12, Date(2020, 3, 15), States.Completed))
        myCourses.add(Course("English (ICSC)", "Grade7", "232 Hrs", 11, Date(2020, 8, 15), States.Pending))
        myCourses.add(Course("Maths (HSC)", "Grade7", "223 Hrs", 12, Date(2020, 2, 15), States.Pending))
        myCourses.add(Course("English (ICSC)", "Grade7", "232 Hrs", 11, Date(2020, 8, 15), States.Completed))
        myCourses.add(Course("Maths (HSC)", "Grade7", "223 Hrs", 12, Date(2020, 2, 15), States.Completed))
        myCourses.add(Course("English (CBSE)", "Grade7", "253 Hrs", 15, Date(2020, 5, 15), States.Pending))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "244 Hrs", 16, Date(2020, 8, 15), States.InProgress))
        myCourses.add(Course("English (ICSC)", "Grade7", "232 Hrs", 11, Date(2020, 8, 15), States.InProgress))
        myCourses.add(Course("Science (CBSE)", "Grade7", "244 Hrs", 12, Date(2020, 1, 15), States.Pending))
        myCourses.add(Course("Maths (HSC)", "Grade7", "244 Hrs", 14, Date(2020, 5, 15), States.Pending))
        myCourses.add(Course("Science (ICSC)", "Grade7", "110 Hrs", 14, Date(2020, 5, 15), States.Pending))
        myCourses.add(Course("English (CBSE)", "Grade7", "222 Hrs", 14, Date(2020, 5, 15), States.Pending))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "244 Hrs", 16, Date(2020, 8, 15), States.Completed))
        myCourses.add(Course("Maths (HSC)", "Grade7", "223 Hrs", 12, Date(2020, 2, 15), States.InProgress))
        myCourses.add(Course("Science (CBSE)", "Grade7", "244 Hrs", 12, Date(2020, 1, 15), States.InProgress))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "250 Hrs", 15, Date(2020, 2, 15), States.Pending))
        myCourses.add(Course("Science (ICSC)", "Grade7", "255 Hrs", 14, Date(2020, 3, 15), States.Pending))
        myCourses.add(Course("English (ICSC)", "Grade7", "240 Hrs", 12, Date(2020, 4, 15), States.InProgress))
        myCourses.add(Course("Science (HSC)", "Grade7", "256 Hrs", 14, Date(2020, 3, 15), States.InProgress))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "252 Hrs", 11, Date(2020, 5, 15), States.Completed))
        myCourses.add(Course("English (ICSC)", "Grade7", "240 Hrs", 12, Date(2020, 4, 15), States.Completed))
        myCourses.add(Course("Maths (HSC)", "Grade7", "244 Hrs", 14, Date(2020, 5, 15), States.InProgress))
        myCourses.add(Course("Science (ICSC)", "Grade7", "110 Hrs", 14, Date(2020, 5, 15), States.InProgress))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "250 Hrs", 15, Date(2020, 2, 15), States.Completed))
        myCourses.add(Course("Science (ICSC)", "Grade7", "255 Hrs", 14, Date(2020, 3, 15), States.Completed))
        myCourses.add(Course("English (CBSE)", "Grade7", "253 Hrs", 15, Date(2020, 5, 15), States.Completed))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "250 Hrs", 15, Date(2020, 2, 15), States.InProgress))
        myCourses.add(Course("Science (HSC)", "Grade7", "256 Hrs", 14, Date(2020, 3, 15), States.Pending))
        myCourses.add(Course("Science (HSC)", "Grade7", "250 Hrs", 15, Date(2020, 7, 15), States.Pending))
        myCourses.add(Course("Maths (HSC)", "Grade7", "244 Hrs", 14, Date(2020, 5, 15), States.Completed))
        myCourses.add(Course("Science (ICSC)", "Grade7", "110 Hrs", 14, Date(2020, 5, 15), States.Completed))
        myCourses.add(Course("Science (ICSC)", "Grade7", "255 Hrs", 14, Date(2020, 3, 15), States.InProgress))
        myCourses.add(Course("English (CBSE)", "Grade7", "253 Hrs", 15, Date(2020, 5, 15), States.InProgress))
        myCourses.add(Course("Science (HSC)", "Grade7", "250 Hrs", 15, Date(2020, 7, 15), States.InProgress))
        myCourses.add(Course("English (CBSE)", "Grade7", "222 Hrs", 14, Date(2020, 5, 15), States.InProgress))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "252 Hrs", 11, Date(2020, 5, 15), States.Pending))
        myCourses.add(Course("English (ICSC)", "Grade7", "240 Hrs", 12, Date(2020, 4, 15), States.Pending))
        myCourses.add(Course("Maths (CBSE)", "Grade7", "244 Hrs", 16, Date(2020, 8, 15), States.Pending))
        myCourses.add(Course("English (CBSE)", "Grade7", "222 Hrs", 14, Date(2020, 5, 15), States.Completed))

        return myCourses
    }

    fun getCourseList() : LiveData<List<Course>> {
        coursesList.value = staticCourses
        return coursesList
    }

    fun filterCoursesWith(states : List<States>){
        if(states.isEmpty())
            coursesList.value = staticCourses
        else {
            var tempCourseList = ArrayList<Course>()

            staticCourses.forEach() {
                if (states.contains(it.status))
                    tempCourseList.add(it)
            }

            coursesList.value = tempCourseList
        }
    }
}