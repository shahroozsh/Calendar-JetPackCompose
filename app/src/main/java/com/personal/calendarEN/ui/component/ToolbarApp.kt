package com.personal.calendarEN.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.personal.calendarEN.R

import com.personal.calendarEN.ui.theme.roundedShape

import com.personal.calendarEN.ui.theme.blueLight

import com.personal.calendarEN.ui.theme.tintIcon


@Composable
fun ToolbarApp(
    text: String,
    onClick: () -> Unit
) {
    Surface( Modifier
        .fillMaxWidth()
        .height(55.dp)
        .border(width = 1.dp, shape = MaterialTheme.roundedShape.medium, color = MaterialTheme.colorScheme.blueLight),

        shape = MaterialTheme.roundedShape.medium
        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .padding(start = 8.dp, end = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Icon(
                painter = painterResource(R.drawable.ic_arrow_left_right_24),
                tint = MaterialTheme.colorScheme.tintIcon,
                contentDescription = null,
                modifier = Modifier.clickable { onClick() }
            )

            Text(
                text = text,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 12.dp, end = 12.dp)
            )

        }
    }

}

