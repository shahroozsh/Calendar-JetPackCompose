package com.personal.calendarEN.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.personal.calendarEN.ui.theme.roundedShape
import com.personal.calendarEN.ui.theme.spacing

import com.personal.calendarEN.ui.theme.blueApp


@Composable
fun LoadingButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.blueApp),
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(
//                start = MaterialTheme.spacing.semiLarge,
//                end = MaterialTheme.spacing.semiLarge,
                bottom = MaterialTheme.spacing.medium
            ),
        shape = MaterialTheme.roundedShape.medium
    ) {

        Loading3Dots(isDark = false)
    }
}