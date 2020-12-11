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
import com.scvsoft.planillapp.ui.theme.DarkColorPalette
import com.scvsoft.planillapp.ui.theme.LightColorPalette
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

@Preview(name = "Payment History Light")
@Composable
fun HistoryContentPreview() {
    MaterialTheme(LightColorPalette) {
        HistoryContent(payments = mockData())
    }
}

@Preview(name = "Payment History Dark")
@Composable
fun HistoryContentPreviewDark() {
    MaterialTheme(DarkColorPalette) {
        HistoryContent(payments = mockData())
    }
}


fun mockData() = listOf(
        Payment(Period(Date(), Date(), 100), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(Date(), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00))
)



