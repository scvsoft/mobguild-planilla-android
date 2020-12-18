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
import java.text.SimpleDateFormat
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
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/11/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/10/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/09/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/08/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/07/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/06/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/05/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/04/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/04/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/03/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/02/2020"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/01/2020"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/12/2019"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/11/2019"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/10/2019"), Date(), 30), PaymentPreferences(100.00, 100.00, 100.00)),
        Payment(Period(SimpleDateFormat("dd/MM/yyyy").parse("28/09/2019"), Date(), 70), PaymentPreferences(100.00, 100.00, 100.00)),


)



