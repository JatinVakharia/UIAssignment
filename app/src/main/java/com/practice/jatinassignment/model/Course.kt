package com.practice.jatinassignment.model

import java.util.Date


data class Course(val subject : String, val currentClass : String, val courseHrs : String,
                  val chapter :Int, val validTill : Date, val status : States)