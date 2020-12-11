package com.scvsoft.planillapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.scvsoft.planillapp.R
import com.scvsoft.planillapp.model.Payment
import com.scvsoft.planillapp.model.PaymentPreferences
import com.scvsoft.planillapp.model.Period
import com.scvsoft.planillapp.ui.theme.DarkColorPalette
import com.scvsoft.planillapp.ui.theme.LightColorPalette
import java.util.*

@Composable
fun PaymentRow(payment: Payment) {
    Card(

        backgroundColor = MaterialTheme.colors.secondary,
        modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp).then(
            Modifier.height(130.dp)
        ),
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.fillMaxSize().then(Modifier.padding(0.dp))) {
            PaymentRowHeader(payment)
            Divider(color =if (isSystemInDarkTheme()) Color(0xFF20233A) else Color(0xFFE3EBF2) )
            Row() {
                Text(text = payment.period.closeDate.toString())
                Text(text = payment.period.startDate.toString())
            }

        }
    }

}

@Preview(name = "Payment Row Light")
@Composable
fun PaymentRow() {
    MaterialTheme(LightColorPalette) {
        val payment =
            Payment(Period(Date(), Date(), 100), PaymentPreferences(100.00, 100.00, 100.00))
        PaymentRow(payment = payment)
    }
}


@Preview(name = "Payment Row Dark")
@Composable
fun PaymentRowDark() {
    MaterialTheme(DarkColorPalette) {
        val payment =
            Payment(Period(Date(), Date(), 100), PaymentPreferences(100.00, 100.00, 100.00))
        PaymentRow(payment = payment)
    }

}

@Composable
fun PaymentRowHeader(payment: Payment) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth().then(Modifier.padding(top = 5.dp,bottom = 5.dp))) {
        val (payMonth, payYear,rateTittle,rateValue) = createRefs()

        val month =
            Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        val year = Calendar.getInstance().get(Calendar.YEAR).toString();
        Text(
            modifier = Modifier.padding(8.dp).constrainAs(payMonth){
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            },
            text = month.capitalize(),
            style = TextStyle(
                fontWeight = FontWeight.W700,
                fontSynthesis = FontSynthesis.Weight,
                fontSize = TextUnit.Companion.Sp(20),
                letterSpacing = TextUnit.Companion.Sp(0.4),
                color = if (isSystemInDarkTheme()) Color(0xFF9BF4E4) else Color(0xFF01A67D)
            )

        )

        Text(
            color = if (isSystemInDarkTheme()) Color(0xFFE3EBF2) else Color(0xFF66687B),
            modifier = Modifier.constrainAs(payYear){
                start.linkTo(payMonth.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            },
            text = year,
            style = TextStyle(
                fontWeight = FontWeight.W400,
                fontSize = TextUnit.Companion.Sp(14),
            )

        )

        Text(
            modifier = Modifier.padding(8.dp).constrainAs(rateValue){
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            },
            text = "$"+ payment.period.rate.toString(),
            style = TextStyle(
                fontWeight = FontWeight.W700,
                fontSynthesis = FontSynthesis.Weight,
                fontSize = TextUnit.Companion.Sp(20),
                letterSpacing = TextUnit.Companion.Sp(0.4),
                color = if (isSystemInDarkTheme()) Color(0xFF9BF4E4) else Color(0xFF01A67D)
            )

        )

        Text(
            color = if (isSystemInDarkTheme()) Color(0xFFE3EBF2) else Color(0xFF66687B),
            modifier = Modifier.constrainAs(rateTittle){
                end.linkTo(rateValue.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            },
            text ="USD Rate:",
            style = TextStyle(
                fontWeight = FontWeight.W400,
                fontSize = TextUnit.Companion.Sp(14),
            )

        )
    }

}


