package com.scvsoft.planillapp.model

import java.time.temporal.TemporalAmount
import java.util.*

class PaymentPreferences(val pesoAmount: Double, val dollarAmount: Double, val depositAmount: Double)
class Period(val closeDate: Date, val startDate: Date, val rate: Int)

class Payment(val period: Period, val paymentPreferences: PaymentPreferences)