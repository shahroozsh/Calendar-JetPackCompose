package com.personal.calendarEN.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.personal.calendarEN.R


val fontMedium = FontFamily(Font(R.font.en_font))
val fontBold = FontFamily(Font(R.font.en_font))
val fontStandard = FontFamily(Font(R.font.en_font))

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 25.sp
    ),
    displayMedium = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 25.sp
    ),
    displaySmall = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 25.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 25.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 25.sp
    ),
    titleLarge = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 25.sp
    ),
    titleMedium = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 25.sp
    ),
    titleSmall = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 25.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = fontMedium,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        lineHeight = 25.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 25.sp
    ),
    labelLarge = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        lineHeight = 25.sp
    ),
    labelMedium = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 25.sp
    ),
    labelSmall = TextStyle(
        fontFamily = fontStandard,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        lineHeight = 25.sp
    )
)

// Custom extension properties for additional text styles
val Typography.extraBoldNumber: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = fontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    )

val Typography.extraSmall: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = fontStandard,
        fontSize = 11.sp,
        lineHeight = 25.sp
    )

val Typography.veryExtraSmall: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = fontStandard,
        fontSize = 10.sp
    )