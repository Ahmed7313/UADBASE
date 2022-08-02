package com.example.uadadvertisore.UIscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uadadvtest.R
import com.example.uadadvtest.ui.theme.categoryItemBGColor
import com.example.uadadvtest.ui.theme.textColor2


@Composable
fun AddYourBrands(){

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
            text = "Add your\n" +
                    "Brands",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 44.dp, start = 24.dp, end = 24.dp)
                .width(224.dp)
                .height(90.dp)
        )

        Text(
            text = "Choose the brands that’s fits your business business.",
            fontSize = 14.sp,
            modifier = Modifier
                .padding(top = 18.dp, start = 24.dp, end = 24.dp)
                .width(327.dp)
                .height(38.dp),
            color = textColor2
        )
    }
}

@Composable
fun BrandCategoryItem(image: Int, label : String , modifier: Modifier = Modifier){

    var selected by remember { mutableStateOf(false) }

    Box() {

        Row(
            modifier = Modifier
                .background(
                    color = if (selected) Color.White else categoryItemBGColor,
                    shape = RoundedCornerShape(8.dp)
                )
                .width(165.dp)
                .height(37.dp)
                .clickable { selected != selected }
                .align(Alignment.CenterEnd),
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
                .width(18.dp)
                .height(18.dp)
                .align(Alignment.CenterStart)
        )
    }
}

@Preview
@Composable
fun AddYourBrandsPreview(){
    AddYourBrands()
}

@Preview
@Composable
fun BrandCategoryItemPreview(){
    BusinessCategoryItem(R.drawable.sports, "Sports")
}