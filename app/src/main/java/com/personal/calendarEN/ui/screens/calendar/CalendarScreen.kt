package com.personal.calendarEN.ui.screens.calendar


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.personal.calendarEN.R


import com.personal.calendarEN.ui.theme.black
import com.personal.calendarEN.ui.theme.blueApp
import com.personal.calendarEN.ui.theme.blueLight
import com.personal.calendarEN.ui.theme.grayLine
import com.personal.calendarEN.ui.theme.spacing
import com.personal.calendarEN.ui.theme.whiteDark
import java.util.Calendar


@Composable
fun CalendarSection(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.whiteDark,
    ) {
        CalendarScreen()
    }
}


@Composable
fun CalendarScreen(
    onDateSelected: (Calendar) -> Unit = {},
) {
    val infinitePageCount = Int.MAX_VALUE
//    val infinitePageCount = 50
    val initialPage = infinitePageCount / 2 // Centered around the current month

    val pagerState = rememberPagerState(
        initialPage = initialPage,
        pageCount = { infinitePageCount }
    )

    val currentMonth = remember { mutableStateOf(Calendar.getInstance()) }
    val headerMonth = remember { mutableStateOf(Calendar.getInstance()) }
    val isManualChange = remember { mutableStateOf(false) } // Flag to detect manual changes
    LaunchedEffect(isManualChange.value) {
        if (isManualChange.value) {
            val offset = Calendar.getInstance().monthsBetween(currentMonth.value)
            pagerState.scrollToPage(initialPage + offset)
            isManualChange.value = false
        }
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp)
            .background(
                color = MaterialTheme.colorScheme.blueLight,
                shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
            ),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        HeaderCalender(
            modifier = Modifier.padding(horizontal = 16.dp),
            month = headerMonth.value,
            onPreviousMonth = {
                val newMonth = currentMonth.value.addMonths(-1)
                currentMonth.value = newMonth
                isManualChange.value = true
            },

            onNextMonth = {
                val newMonth = currentMonth.value.addMonths(1)
                currentMonth.value = newMonth
                isManualChange.value = true
            }
        )

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp),
            thickness = 0.5.dp ,
            color = MaterialTheme.colorScheme.grayLine)

        CalendarPager(
            modifier = Modifier.padding(horizontal = 16.dp),
            pagerState = pagerState,
            initialPage = initialPage,
            onMonthChanged = { mnd ->
                headerMonth.value = mnd
                currentMonth.value = mnd
            },
            onDateSelected = {selectedDate->

            }
        )

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp),
            thickness = 0.5.dp ,
            color = MaterialTheme.colorScheme.grayLine)

    }
}

@Composable
fun HeaderCalender(
    modifier: Modifier,
    month: Calendar,
    onPreviousMonth: () -> Unit,
    onNextMonth: () -> Unit,
) {
    val persianWeekdays =
        listOf("S", "M", "T", "W", "T", "F", "S")

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 32.dp, top = 42.dp, bottom = 8.dp),
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.CenterStart),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clickable { onPreviousMonth() }
                    .size(
                        width = MaterialTheme.spacing.widthArrowCalendar,
                        height = MaterialTheme.spacing.heightArrowCalendar
                    )
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)
                    ),
                contentAlignment = Alignment.CenterStart
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_left_right_2),
                    contentDescription = "Previous Month"
                )
            }

            VerticalDivider(
                modifier = Modifier
                    .height(15.dp)
                    .width(0.dp),
                color = MaterialTheme.colorScheme.black
            )

            Box(
                modifier = Modifier
                    .clickable { onNextMonth() }
                    .size(
                        width = MaterialTheme.spacing.widthArrowCalendar,
                        height = MaterialTheme.spacing.heightArrowCalendar
                    )
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp)
                    ),
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_left_right_24),
                    contentDescription = "Next Month"
                )
            }
        }

        Text(
            modifier = Modifier.align(Alignment.CenterEnd),
            text = "${month.get(Calendar.YEAR)} ${month.get(Calendar.MONTH)}",
            style = MaterialTheme.typography.headlineMedium
        )
    }



    Spacer(modifier = Modifier.height(8.dp))

    // Display Days of the Week Header
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        persianWeekdays.forEach { day ->
            Text(
                text = day,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),
                textAlign = TextAlign.Center
            )
        }
    }

    Spacer(modifier = Modifier.height(8.dp))


}

@Composable
fun CalendarPager(
    modifier: Modifier,
    pagerState: PagerState,
    initialPage: Int,
    onDateSelected: (Calendar) -> Unit,
    onMonthChanged: (Calendar) -> Unit,
) {
    val baseCalendar = remember { Calendar.getInstance() }
    var selectedDate by remember { mutableStateOf<Calendar?>(null) }

    HorizontalPager(
        modifier = modifier.fillMaxWidth().background(color = Color.Cyan),
        state = pagerState,
        pageSpacing = 8.dp,
        beyondViewportPageCount = 0
    ) { page ->
        val offset = page - initialPage
        val currentMonthDuringScroll = remember(offset) { baseCalendar.addMonths(offset) }

         MonthView(
            month = currentMonthDuringScroll,
            selectedDate = selectedDate,
            onDateSelected = { selectedDay ->
                selectedDate = selectedDay
                onDateSelected(selectedDay)
            }
        )

 //        LaunchedEffect(currentMonthDuringScroll) {
//            onMonthChanged(currentMonthDuringScroll)
//        }

         val offsetSettledPage = pagerState.settledPage - initialPage
        val currentMonthAfterScroll = remember(offsetSettledPage) { baseCalendar.addMonths(offsetSettledPage) }

         LaunchedEffect(pagerState.settledPage) {
            onMonthChanged(currentMonthAfterScroll)
        }
    }
}


@Composable
fun MonthView(
    month: Calendar,
    selectedDate: Calendar?,
    onDateSelected: (Calendar) -> Unit,
) {
    val daysGrid by remember(month) {
        derivedStateOf {
            val daysInMonth = month.getActualMaximum(Calendar.DAY_OF_MONTH)
            val firstDayOfWeek = month.firstDayOfWeek()
            createDaysGrid(daysInMonth, firstDayOfWeek)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
//            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


         val filteredDaysGrid = daysGrid.filter { week -> week.any { it != null } }

        filteredDaysGrid.forEach { week ->
            Row(
                modifier = Modifier
                    .wrapContentSize(),
//                    .background(MaterialTheme.colorScheme.blueLight),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                week.forEach { day ->
                     val isSelected = selectedDate?.timeInMillis == month.timeInMillis

                    if (day != null) {

                        if (isSelected){

                            Surface(
                                modifier = Modifier
                                    .size(width = 50.dp, height = 50.dp),

                                shape = CircleShape,
                                shadowElevation = 4.dp,
                                color = MaterialTheme.colorScheme.blueApp ,
                            ) {

                                Text(
                                    color = Color.White,
                                    text = AnnotatedString(day.toString()),
                                    textAlign = TextAlign.Center,

                                    modifier = Modifier
                                        .clickable {
                                            val selectedDay = month.copyWithDay(day)
                                            onDateSelected(selectedDay)
                                        }
                                        .fillMaxSize()
                                        .wrapContentSize(Alignment.Center)
//                                    .weight(1f)
                                )

                            }

                        }else{
                            Text(
                                color = Color.Black,
                                 text = AnnotatedString(day.toString()),
                                textAlign = TextAlign.Center,
                                modifier = Modifier.size(width = 50.dp, height = 50.dp)
                                    .weight(1f)
//                                    .padding(8.dp)
                                    .clickable {
                                        val selectedDay = month.copyWithDay(day)
                                        onDateSelected(selectedDay)
                                    }
                                    .wrapContentSize(Alignment.Center)
//                                    .weight(1f)
                            )
                        }


                    } else {
                        Text(
                            text = "",
                            textAlign = TextAlign.Center,
                            modifier = Modifier.size(width = 50.dp, height = 50.dp)
                                .weight(1f)


                        )
                    }
//                    }
                }
            }
        }
    }
}








