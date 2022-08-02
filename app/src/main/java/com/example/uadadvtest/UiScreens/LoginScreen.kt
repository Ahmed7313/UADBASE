package com.example.uadadvertisore.UIscreens

import android.widget.EditText
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uadadvtest.R

import com.example.uadadvertisore.UIscreens.uiComponent.UADEditText
import com.example.uadadvertisore.navigation.Screen
import com.example.uadadvtest.ui.theme.RedTextColor
import com.example.uadadvtest.ui.theme.textColor
import com.example.uadadvtest.ui.theme.textColor2
import com.example.ui_component.ui.theme.ui.UADButton



@Composable
fun LogInScreen(
    navController: NavController,
    //loginViewModel: LoginViewModel = hiltViewModel()
){
    val context = LocalContext.current

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
            modifier = Modifier.padding(top = 83.dp,start = 24.dp, end = 24.dp),
            color = textColor
        )

        Text(
            text = "Welcome to Social Network !",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 8.dp, start = 24.dp, end = 24.dp)
                .width(224.dp)
                .height(70.dp)
        )

        Text(
            text = "Lorem ipsum is a placeholder text commonly used to \n" +
                    "demonstrate the visual form of a document.",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                .width(327.dp)
                .height(38.dp),
            color = textColor2
        )

        Text(
            text = "Email / Phone",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 16.dp,start = 24.dp, end = 24.dp),
            color = RedTextColor
        )

        UADEditText(modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            label = "business@example.com" )
        
        TermsAndConditionsField()


            UADButton(
                text = "Continue",
                modifier = Modifier.padding(top = 28.dp, start = 24.dp, end = 24.dp)
            ) {
                navController.navigate(route = Screen.OTPScreen.route)

            }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TermsAndConditionsField() {
    var checkedState by remember { mutableStateOf(false) }
    Row (
        modifier = Modifier.padding(start = 24.dp, end = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        ){
        Checkbox(
            checked = checkedState,
            onCheckedChange = { checkedState = it },
        )
        Text(text = "Checkbox Example")
        Text(
            text = "Terms & Policy",
            modifier = Modifier
                .padding(start = 8.dp)
                .clickable {

                },
            color = RedTextColor,
            )

    }
}

@androidx.compose.ui.tooling.preview.Preview
@Composable
fun LogInScreenPreview(){
    LogInScreen(rememberNavController())
}