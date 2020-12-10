package com.scvsoft.planillapp.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.scvsoft.planillapp.model.Payment
import com.scvsoft.planillapp.model.PaymentPreferences
import com.scvsoft.planillapp.model.Period
import java.util.*

@Composable
fun PaymentRow(payment: Payment) {
    Card(backgroundColor = MaterialTheme.colors.secondary,modifier =  Modifier.padding(start = 8.dp,end = 8.dp,top = 4.dp,bottom = 4.dp),
            elevation = 2.dp) {
        Column(modifier = Modifier.fillMaxSize().then(Modifier.padding(8.dp))) {
            PaymentRowHeader(date = payment.period.closeDate)
            Row() {
                Text(text = payment.period.closeDate.toString())
                Text(text = payment.period.startDate.toString())
            }

        }
    }

}
@Composable
fun PaymentRowHeader(date: Date) {
    val month = Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
    val year = Calendar.getInstance().get(Calendar.YEAR).toString();
    Text(modifier = Modifier.padding(8.dp),text = month + " " + year,color = Color.Gray)

}

@Preview(showBackground = true)
@Composable
fun PaymentRow() {
    val payment = Payment(Period(Date(), Date(), 100.00), PaymentPreferences(100.00, 100.00, 100.00))
    PaymentRow(payment = payment)
}