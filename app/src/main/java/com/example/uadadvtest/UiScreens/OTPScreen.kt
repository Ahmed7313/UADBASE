package com.example.uadadvertisore.UIscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uadadvertisore.UIscreens.uiComponent.UADEditText
import com.example.uadadvertisore.navigation.Screen
import com.example.uadadvtest.R
import com.example.uadadvtest.ui.theme.RedTextColor
import com.example.uadadvtest.ui.theme.textColor
import com.example.uadadvtest.ui.theme.textColor2

import com.example.ui_component.ui.theme.ui.UADButton

@Composable
fun OTBScreen(navigator : NavController){

    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_small_arrow),
            contentDescription = null,
            modifier = Modifier.padding(top = 24.dp, start = 24.dp)
        )

        Text(
            text = "sign up",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 83.dp, start = 24.dp, end = 24.dp),
            color = textColor
        )

        Text(
            text = "Verify your Account",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 8.dp, start = 24.dp, end = 24.dp)
                .width(224.dp)
                .height(70.dp)
        )

        Text(
            text = "Please enter the 4 digit code sent  to \n" +
                    "to your messages",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .width(229.dp)
                .height(38.dp),
            color = textColor2
        )

        Text(
            text = "OTP",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .fillMaxWidth(1F),
            color = RedTextColor
        )
        
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp, top = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            OTPViewItem()
            OTPViewItem()
            OTPViewItem()
            OTPViewItem()
        }

        Text(
            text = "Resend Code",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .clickable { },
            color = textColor
        )

            UADButton(
                text = "Continue",
                modifier = Modifier.padding(top = 38.dp, start = 24.dp, end = 24.dp))
            {
                navigator.navigate(Screen.CompanyProfileScreen.route)
            }

    }
}

@Composable
fun OTPViewItem(){
    UADEditText(label = "", modifier = Modifier
        .width(60.dp)
        .height(40.dp))
}

@Preview
@Composable
fun OTBScreenPreview(){
    OTBScreen(rememberNavController())
}