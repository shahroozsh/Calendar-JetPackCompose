package com.personal.calendarEN.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

// Define custom shape sizes for Material 3
data class RoundedShape(
    val extraSmall: RoundedCornerShape = RoundedCornerShape(4.dp),
    val semiSmall: RoundedCornerShape = RoundedCornerShape(6.dp),
    val small: RoundedCornerShape = RoundedCornerShape(8.dp),
    val biggerSmall: RoundedCornerShape = RoundedCornerShape(10.dp),
    val semiMedium: RoundedCornerShape = RoundedCornerShape(14.dp),
    val medium: RoundedCornerShape = RoundedCornerShape(16.dp),
    val mediumSmall: RoundedCornerShape = RoundedCornerShape(12.dp),
    val biggerMedium: RoundedCornerShape = RoundedCornerShape(18.dp),
    val large: RoundedCornerShape = RoundedCornerShape(24.dp),
)

val LocalShape = compositionLocalOf { RoundedShape() }

val MaterialTheme.roundedShape: RoundedShape
    @Composable
    @ReadOnlyComposable
    get() = LocalShape.current

// Use LocalShape within MaterialTheme shapes
//@Composable
//fun ManagerPzkTheme(
//    content: @Composable () -> Unit
//) {
//    MaterialTheme(
//        shapes = Shapes(
//            extraSmall = LocalShape.current.extraSmall,
//            small = LocalShape.current.small,
//            medium = LocalShape.current.medium,
//            large = LocalShape.current.large,
//        ),
//        content = content
//    )
//}


