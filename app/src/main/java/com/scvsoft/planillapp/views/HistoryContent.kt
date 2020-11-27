package com.scvsoft.planillapp.views

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview
import com.scvsoft.planillapp.model.Payment
import com.scvsoft.planillapp.model.PaymentPreferences
import com.scvsoft.planillapp.model.Period
import java.util.*

@Composable
fun HistoryContent(payments: List<Payment>) {
    LazyColumnFor(items = payments,
            modifier = Modifier,
            itemContent = { payment ->
                PaymentRow(payment)
            })

}

@Preview(showBackground = true)
@Composable
fun HistoryContentPreview() {
    HistoryContent(payments = mockData())
}

@Composable
fun PaymentRow(payment: Payment) {
    Column(modifier = Modifier) {
        Text(text = payment.period.rate.toString())
        Text(text = payment.period.closeDate.toString())
        Text(text = payment.period.startDate.toString())
    }
}

fun mockData() = listOf(
        Payment(Period(Date(), Date(), 100.00), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 30.00), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 70.00), PaymentPreferences(100.00, 100.00, 100.00))
)



