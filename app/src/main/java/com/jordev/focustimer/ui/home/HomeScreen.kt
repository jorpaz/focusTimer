package com.jordev.focustimer.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jordev.focustimer.R
import com.jordev.focustimer.ui.theme.FocusTimerTheme

@Composable
fun HomeScreen(

){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(FocusTimerTheme.dimens.paddingMedium)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopEnd
        ){
            Icon(
                modifier = Modifier.size(FocusTimerTheme.dimens.iconSizeNormal),
                tint = MaterialTheme.colorScheme.primary,
                contentDescription = "Menu",
                painter = painterResource(id = R.drawable.ic_menu)
            )
        }
    }
}

@Preview(
    name = "HomeScreenPreview",
    showBackground = true,
)
@Composable
fun HomeScreenPreview(){
    FocusTimerTheme{
        HomeScreen()
    }
}