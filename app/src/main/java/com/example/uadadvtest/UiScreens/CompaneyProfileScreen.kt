package com.example.uadadvertisore.UIscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uadadvtest.R

import com.example.uadadvertisore.UIscreens.uiComponent.UADEditText
import com.example.uadadvertisore.navigation.Screen
import com.example.uadadvtest.ui.theme.RedTextColor
import com.example.uadadvtest.ui.theme.UADTextSecColor
import com.example.uadadvtest.ui.theme.buttonLightBackground
import com.example.uadadvtest.ui.theme.textColor2
import com.example.ui_component.ui.theme.ui.UADButton


@Composable
fun CompanyProfileScreen(navigator: NavController){
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_small_arrow),
            contentDescription = null,
            modifier = Modifier.padding(top = 24.dp, start = 24.dp)
        )

        Text(
            text = "Create Company " +
                    "Profile",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 44.dp, start = 24.dp, end = 24.dp)
                .width(224.dp)
                .height(90.dp)
        )

        Text(
            text = "Living in today’s metropolitan world of cellular phones, mobile computers.",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 18.dp, start = 24.dp, end = 24.dp)
                .width(327.dp)
                .height(38.dp),
            color = textColor2
        )

        Text(
            text = "Company Name",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 16.dp,start = 24.dp, end = 24.dp),
            color = RedTextColor
        )

        UADEditText(modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            label = "Golden Rush")

        Text(
            text = "Company Description",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 34.dp,start = 24.dp, end = 24.dp),
            color = RedTextColor
        )

        UADEditText(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .height(138.dp),
            label = "Lorem Ipsum is simply dummy text of the printing \n" +
                    "and typesetting industry. Lorem Ipsum has been")

        Text(
            text = "Commercial Registration Number",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 34.dp,start = 24.dp, end = 24.dp),
            color = RedTextColor
        )

        VerifyCommercialNumberView()

        Text(
            text = "Phone Number",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 16.dp,start = 24.dp, end = 24.dp),
            color = RedTextColor
        )

        UADEditText(modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            label = "564 123 789")


            UADButton(
                text = "Continue",
                modifier = Modifier.padding(top = 28.dp, start = 24.dp, end = 24.dp)
            ) {
                navigator.navigate(Screen.AddBusinessCategoryScreen.route)
            }

     }

}

@Composable
fun VerifyCommercialNumberView(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 24.dp, end = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier,
            colors = ButtonDefaults.buttonColors(containerColor = buttonLightBackground)
        ) {
            Text(text = "Verify", color = UADTextSecColor)
        }
        
        UADEditText(label = "REGN1230000XXX23",
            modifier = Modifier.padding(start = 8.dp))
    }
}

@Preview
@Composable
fun CompanyProfileScreenPreview(){
    CompanyProfileScreen(rememberNavController())
}