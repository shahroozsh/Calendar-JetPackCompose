package com.personal.calendarEN.ui.screens.calendar

 import java.util.Calendar


fun createDaysGrid(daysInMonth: Int, firstDayOfWeek: Int): List<List<Int?>> {
    val totalSlots = 42 // 6 rows of 7 days
    val daysGrid = MutableList(totalSlots) { null as Int? }

    for (i in 0 until daysInMonth) {
        daysGrid[firstDayOfWeek + i] = i + 1
    }

    return daysGrid.chunked(7)
}


fun Calendar.addMonths(offset: Int): Calendar {
    val newCalendar = this.clone() as Calendar
    newCalendar.add(Calendar.MONTH, offset)
    return newCalendar
}



fun Calendar.firstDayOfWeek(): Int {
    val firstDay = this.clone() as Calendar
    firstDay.set(Calendar.DAY_OF_MONTH, 1)
    return firstDay.get(Calendar.DAY_OF_WEEK)
}


fun Calendar.monthDifference(other: Calendar): Int {
    val yearDiff = this.get(Calendar.YEAR) - other.get(Calendar.YEAR)
    val monthDiff = this.get(Calendar.MONTH) - other.get(Calendar.MONTH)
    return yearDiff * 12 + monthDiff
}

fun Calendar.monthsBetween(other: Calendar): Int {
    val yearDiff = other.get(Calendar.YEAR) - this.get(Calendar.YEAR)
    val monthDiff = other.get(Calendar.MONTH) - this.get(Calendar.MONTH)
    return yearDiff * 12 + monthDiff
}

fun Calendar.copyWithDay(day: Int): Calendar {
    val newCalendar = this.clone() as Calendar
    newCalendar.set(Calendar.DAY_OF_MONTH, day)
    return newCalendar
}



