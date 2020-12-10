package com.scvsoft.planillapp.ui.views

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.scvsoft.planillapp.model.Payment
import com.scvsoft.planillapp.model.PaymentPreferences
import com.scvsoft.planillapp.model.Period
import java.util.*

@Composable
fun HistoryContent(payments: List<Payment>) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumnFor(items = payments,
            modifier = Modifier,
            itemContent = { payment ->
                PaymentRow(payment)
            })
    }

}

@Preview(showBackground = true)
@Composable
fun HistoryContentPreview() {
    HistoryContent(payments = mockData())
}


fun mockData() = listOf(
        Payment(Period(Date(), Date(), 100.00), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 30.00), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 70.00), PaymentPreferences(100.00, 100.00, 100.00))
)



