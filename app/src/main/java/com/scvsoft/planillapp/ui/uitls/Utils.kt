package com.scvsoft.planillapp.ui.uitls

import java.util.*

sealed class Tag

fun Date.toCalendar(): Calendar {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal
}