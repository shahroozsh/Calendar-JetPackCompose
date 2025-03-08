package com.personal.calendarEN

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.personal.calendarEN.navigation.SetupNavGraph
import com.personal.calendarEN.ui.component.ChangeStatusBarColor
import com.personal.calendarEN.ui.theme.CalendarJCPTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController



    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalendarJCPTheme {
                navController = rememberNavController()
                ChangeStatusBarColor(navController = navController)

//                LocaleUtils.setLocale(LocalContext.current, PERSIAN_LANG)

//                LocaleUtils.setLocale(LocalContext.current, PERSIAN_LANG)
//                val direction = if (USER_LANGUAGE == ENGLISH_LANG) {
//                    androidx.compose.ui.unit.LayoutDirection.Ltr
//                } else {
                val direction = LayoutDirection.Ltr
//                }

                CompositionLocalProvider(LocalLayoutDirection provides direction) {
                    Scaffold{

                        SetupNavGraph(
                            navController = navController
                        )
                    }
                }

            }
        }
    }
}

