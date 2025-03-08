package com.personal.calendarEN.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define color values
val Purple200 = Color(0xFF107DD3)
val Purple500 = Color(0xFFCE3C4D)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val SplashBg = Color(0xFFF2F8FD)
val CursorColor = Color(0xFF018577)
val SelectedBottomBar = Color(0xFF43474C)
val UnselectedBottomBar = Color(0xFFA4A1A1)
val BottomBar = Color(0xFFFFFFFF)
val Gold = Color(0xFFF9BC01)
val GrayAlpha = Color(0xFFC1C2C6)
val GrayE = Color(0xFFDEDEDE)
val SearchBarBgLight = Color(0xFFF1F0EE)
val SearchBarBgDark = Color(0xFF303235)
val DarkTextLight = Color(0xFF414244)
val DarkTextDark = Color(0xFFD8D8D8)
val Amber = Color(0xFFFFBF00)
val GrayCategory = Color(0xFFF1F0EE)
val DigikalaLightRedLight = Color(0xFFEF4056)
val DigikalaLightRedDark = Color(0xFF8D2633)
val DigikalaDarkRed = Color(0xFFE6123D)
val DigikalaRed = Color(0xFFED1B34)
val BlueApp = Color(0xFF47A5F1)
val TintIcon = Color(0xFF47A5F1)
val WhiteDarkLight = Color(0xFFFFFFFF)
val WhiteDarkDark = Color(0xFF9E9FB1)
val SemiDarkTextLight = Color(0xFF181818)
val SemiDarkTextDark = Color(0xFFFFFFFF)
val SettingArrowLight = Color(0xFF9E9FB1)
val SettingArrowDark = Color(0xFFD8D8D8)
val DarkCyan = Color(0xFF0FABC6)
val LightCyan = Color(0xFF17BFD3)
val Oranges = Color(0xFFFF5722)
val DigikalaLightGreenLight = Color(0xFF86BF3C)
val DigikalaLightGreenDark = Color(0xFF3A531A)
val Green = Color(0xFF00A049)





// Light and Dark ColorSchemes for Material 3
val LightColorScheme = lightColorScheme(
    primary = Purple500,
    secondary = Teal200,
    background = SplashBg,
    surface = WhiteDarkLight,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = DarkTextLight,
    onSurface = DarkTextLight,
    // Custom colors
    tertiary = BlueApp,
    error = DigikalaLightRedLight,
    // Add your other colors as appropriate
)

val DarkColorScheme = darkColorScheme(
    primary = Purple200,
    secondary = Teal200,
    background = BottomBar,
    surface = WhiteDarkDark,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = DarkTextDark,
    onSurface = DarkTextDark,
    // Custom colors
    tertiary = BlueApp,
    error = DigikalaLightRedDark,
    // Add your other colors as appropriate
)



val ColorScheme.TestColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xff86bf3c) else Color(0xFF3A531A)

val ColorScheme.tintIcon: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF49A2E8) else Color(0xFF49A2E8)

val ColorScheme.blueApp: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF49A2E8) else Color(0xFF49A2E8)

val ColorScheme.whiteDark: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF595959) else Color(0xFFFDFDFD)

val ColorScheme.whiteCard: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFFFFFFFF)

val ColorScheme.valueText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF808080) else Color(0xFF808080)

val ColorScheme.splashBg: Color
    @Composable
    get() = Color(0xFFed1b34)





val ColorScheme.CursorColor : Color
    @Composable
    get() = Color(0xFF018577)


val ColorScheme.selectedBottomBar: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF43474C) else Color(0xFF3674C0)

val ColorScheme.unSelectedBottomBar: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFFA4A1A1) else Color(0xFFA4A1A1)

val ColorScheme.blue: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF3674C0) else Color(0xFF3674C0)

val ColorScheme.blueLight: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFFE6F9FF) else Color(0xFFE6F9FF)

val ColorScheme.whiteTransparent: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xD5F0F4FA) else Color(0xD5F0F4FA)

val ColorScheme.black: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF000000) else Color(0xFF000000)


val ColorScheme.bottomBar: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFF303235)


val ColorScheme.Gold : Color
    @Composable
    get() = Color(0xFFf9bc01)

val ColorScheme.grayAlpha: Color
    @Composable
    get() = Color(0xFFc1c2c6)

val ColorScheme.grayHint: Color
    @Composable
    get() = Color(0xFFAFAFAF)
val ColorScheme.grayLine: Color
    @Composable
    get() = Color(0xFFAFAFAF)

val ColorScheme.searchBarBg: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFFF1F0EE) else Color(0xFF303235)


val ColorScheme.darkText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFFD8D8D8) else Color(0xFF414244)


val ColorScheme.amber: Color
    @Composable
    get() =  Color(0xffFFBF00)


val ColorScheme.grayCategory: Color
    @Composable
    get() = Color(0xFFF1F0EE)

val ColorScheme.DigikalaLightRed: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xffef4056) else Color(0xFF8D2633)

val ColorScheme.DigikalaLightRedText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xffef4056) else Color(0xFFFFFFFF)

val ColorScheme.DigikalaDarkRed: Color
    @Composable
    get() = Color(0xFFe6123d)

val ColorScheme.digikalaRed: Color
    @Composable
    get() = Color(0xFFed1b34)

val ColorScheme.semiDarkText: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF5C5E61) else Color(0xFFD8D8D8)

val ColorScheme.settingArrow: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xFF9E9FB1) else Color(0xFFD8D8D8)

val ColorScheme.DarkCyan: Color
    @Composable
    get() = Color(0xFF0fabc6)

val ColorScheme.LightCyan: Color
    @Composable
    get() = Color(0xFF17BFD3)

val ColorScheme.Oranges: Color
    @Composable
    get() = Color(0xFFFF5722)



val ColorScheme.DigikalaLightGreen: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color(0xff86bf3c) else Color(0xFF3A531A)


val ColorScheme.Green : Color
    @Composable
    get() = Color(0xFF00A049)
