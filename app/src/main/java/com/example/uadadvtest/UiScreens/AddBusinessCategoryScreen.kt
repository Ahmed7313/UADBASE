package com.example.uadadvertisore.UIscreens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uadadvtest.R
import com.example.uadadvtest.ui.theme.RedTextColor
import com.example.uadadvtest.ui.theme.categoryItemBGColor
import com.example.uadadvtest.ui.theme.textColor2
import com.example.ui_component.ui.theme.ui.UADButton

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun AddBusinessCategoryScreen(){

    Box(modifier = Modifier.fillMaxSize()) {

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
                text = "Add Your\n" +
                        "Business Category",
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(top = 44.dp, start = 24.dp, end = 24.dp)
                    .width(250.dp)
                    .height(80.dp)
            )

            Text(
                text = "Choose the category that’s fits your business best.",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(top = 18.dp, start = 24.dp, end = 24.dp)
                    .width(327.dp)
                    .height(38.dp),
                color = textColor2
            )

            Text(
                text = "Business Category",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 32.dp,start = 24.dp, end = 24.dp),
                color = RedTextColor
            )

            val (sport, fashion, restaurant,health,hotel,caterer) = FocusRequester.createRefs()

            Row(modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 24.dp)) {
                Column(
                    modifier = Modifier.weight(0.5F),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    BusinessCategoryItem(
                        image = R.drawable.sports,
                        label = "Sport",
                    )
                    BusinessCategoryItem(
                        image = R.drawable.resturant,
                        label = "Restaurant",
                    )
                    BusinessCategoryItem(
                        image = R.drawable.hotel,
                        label = "Hotel",
                    )

                }

                Column(
                    modifier = Modifier.weight(0.5F),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    BusinessCategoryItem(
                        image = R.drawable.fashion,
                        label = "Fashion",
                    )
                    BusinessCategoryItem(
                        image = R.drawable.health,
                        label = "Health",
                    )
                    BusinessCategoryItem(
                        image = R.drawable.caterer,
                        label = "Caterer",
                    )
                }
            }
        }

            UADButton(text = "Next", modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 97.dp, start = 24.dp)) {}
        }


}

@Composable
fun BusinessCategoryItem(image: Int, label : String , modifier: Modifier = Modifier){

    var selected by remember { mutableStateOf(false) }
    var selectedImageState by remember {
        mutableStateOf( 0f)
    }

    Box() {

        Row(
            modifier = modifier
                .background(
                    color = if (selected) Color.White else categoryItemBGColor,
                    shape = RoundedCornerShape(8.dp)
                )
                .width(165.dp)
                .height(37.dp)
                .clickable {
                    selected != selected
                         if (selected) selectedImageState = 1f },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = image) ,
                contentDescription =null,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .width(28.dp)
                    .height(28.dp)
            )

            Text(text = label, fontSize = 14.sp, modifier = Modifier.padding(start = 16.dp))

        }

        Image(
            painter = painterResource(id = R.drawable.marked),
            contentDescription =null,
            modifier = Modifier
                .padding(end = 12.dp)
                .alpha(selectedImageState)
                .width(18.dp)
                .height(18.dp)
                .align(Alignment.CenterEnd)
        )
    }
}

@Preview
@Composable
fun AddBusinessCategoryScreenPreview(){
    AddBusinessCategoryScreen()
}

@Preview
@Composable
fun ItemPreview (){
    BusinessCategoryItem(R.drawable.sports, "Sports")

}