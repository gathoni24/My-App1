package com.example.app1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1.ui.theme.App1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo(){

    Column(Modifier.fillMaxSize()){
        Text(text = "Welcome to Android",
            color = Color.Cyan ,
            fontSize = 30.sp ,
            fontStyle = FontStyle.Italic ,
            fontWeight = FontWeight.Bold )

        Button(onClick = { /*TODO*/ } ,
            shape = RoundedCornerShape(5.dp) ,
            colors = ButtonDefaults.buttonColors(Color.Cyan) ,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "See More")

        }

        Text(text = "Android is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. Android was developed by the Open Handset Alliance, led by Google, and other companies.")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cars",
            fontSize = 30.sp ,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(40.dp),
            textAlign = TextAlign.Center ,
            textDecoration = TextDecoration.Underline ,
            color = Color.Black ,
            fontWeight = FontWeight.Bold)

        Text(text ="1.Mercedes.")

        Text(text ="2.Ferrari.")

        Text(text ="3.BMW,")

        Text(text ="4.Buggati.")


        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Android Tutorial" ,
            fontSize = 30.sp ,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(40.dp),
            textAlign = TextAlign.Center ,
            color = Color.Black ,
            fontWeight = FontWeight.Bold)

        Text(text = "In this Android Tutorial, we cover both basic and advanced concepts. So whether you are a fresher (graduate) or an experienced candidate with several years of Android Development experience, you can follow this Android tutorial to kick-start your journey in Android app development. Our Android Tutorial is designed to take you from zero to hero level. Beginners can follow this Android tutorial in a sequential order to grasp the basics of Android development.\n" +
                "\n" +
                "Android is the best-selling open-source Linux-based operating system among various mobile platforms across the globe. Hundreds of millions of mobile devices are powered by Android in more than 190 countries of the world. It conquered around 75% of the global market share by the end of 2020, and this trend is growing bigger every other day." ,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Divider()

        Spacer(modifier = Modifier.height(20.dp))


        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image" ,
            modifier = Modifier.align(Alignment.CenterHorizontally))

        Text(
            text = "eMobilis Mobile Training Institute" ,
            fontSize = 20.sp ,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp) ,
            colors = ButtonDefaults.buttonColors(Color.Cyan) ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, top = 30.dp, end = 30.dp, bottom = 30.dp)

        ) {
            Text(text = "Continue")

        }

    }
}


@Preview(showBackground = true)

@Composable
fun DemoPreview(){
    Demo()
}

