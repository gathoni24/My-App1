package com.example.app1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1.ui.theme.App1Theme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

    Column (modifier = Modifier.fillMaxSize()){
        
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White)} ,
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray) ,
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector =Icons.Default.ArrowBack ,
                        contentDescription ="arrowback" ,
                        tint = Color.White)
                    
                }
            } ,
             actions =  {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector =Icons.Default.Share ,
                        contentDescription ="share" ,
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector =Icons.Default.Settings ,
                        contentDescription ="settings" ,
                        tint = Color.White)

                }
            }

            )

        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "BREEDS OF DOGS" ,
            fontSize = 20.sp ,
            fontWeight = FontWeight.Bold ,
            modifier = Modifier.fillMaxWidth() ,
            textAlign = TextAlign.Center

            )

        //Row1

        Row {

            Image(painter = painterResource(id = R.drawable.husky),
                contentDescription ="Husky" ,
                modifier = Modifier.size(width = 200.dp , height = 200.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = "Siberian Husky" , fontWeight = FontWeight.Bold , fontSize = 20.sp)
                Text(text = "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. It is recognizable by its thickly furred double coat, erect triangular ears, and distinctive markings, and is smaller than the similar-looking Alaskan Malamute.")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        //End Row1

        Row {

            Image(painter = painterResource(id = R.drawable.poodle),
                contentDescription ="Poodle" ,
                modifier = Modifier.size(width = 200.dp , height = 200.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = "Poodle" , fontWeight = FontWeight.Bold , fontSize = 20.sp)
                Text(text = "The Poodle, called the Pudel in German and the Caniche in French, is a breed of water dog. The breed is divided into four varieties based on size, the Standard Poodle, Medium Poodle, Miniature Poodle and Toy Poodle, although the Medium Poodle is not universally recognised.")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        //End Row2

        Row {

            Image(
                painter = painterResource(id = R.drawable.labrador),
                contentDescription = "Labrador",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = "Labrador Retriever", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "The Labrador Retriever or simply Labrador is a British breed of retriever gun dog. It was developed in the United Kingdom from St. John's water dogs imported from the colony of Newfoundland .")
            }
        }

        //End Row3

        Row {

            Button(onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp) ,
                colors = ButtonDefaults.buttonColors(Color.Gray) ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)

            ) {
                Text(text = "Next")

            }


        }
    }

}

@Preview(showBackground = true)

@Composable
fun LayoutPreview(){
    Layout()
}