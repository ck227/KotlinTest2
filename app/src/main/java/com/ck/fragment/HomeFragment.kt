package com.ck.fragment

import android.icu.util.Calendar
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ck.kotlintest.R
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.CalendarMode
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by cnbs5 on 17/6/14.
 */
class HomeFragment : Fragment() {

    var calendarView: MaterialCalendarView? = null

    private val sdf = SimpleDateFormat("yyyy-MM-dd")
    private val str = sdf.format(Date())
    private var year = Integer.parseInt(str.substring(0, 4))
    private var month = Integer.parseInt(str.substring(5, 7)) - 1
    private var day = Integer.parseInt(str.substring(8, 10))

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        calendarView = rootView.findViewById(R.id.calendarView) as MaterialCalendarView
        setCalendar()
        return rootView
    }

    fun setCalendar() {
        calendarView!!.state().edit().setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(2017, 0, 1))
                .setMaximumDate(CalendarDay.from(year, month, day))
                .commit()
    }


}