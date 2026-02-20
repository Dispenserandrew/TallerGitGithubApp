package me.davidangarita.tallergit

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.davidangarita.tallergit.ui.theme.TallerGitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}


@Composable
fun TarjetaPresentacion() {
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ){
        Image(
        painter = painterResource(R.drawable.lebron),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(120.dp).clip(CircleShape),
        )
    }
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=170.dp,)
    )
    Text(
        text = "LeBron James, conocido como «The King» es un \nmáximo anotador histórico de la NBA.",
        style = TextStyle(fontWeight = FontWeight.Bold),
        modifier = Modifier.offset(x=80.dp,y=180.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 10.sp
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=210.dp,)
    )
    Text(
        text = "Lebron James",
        style = TextStyle(fontWeight = FontWeight.Bold),
        modifier = Modifier.offset(x=130.dp,y=140.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 20.sp
    )
    Text(
        text = "Edad:\n41 años" ,
        modifier = Modifier.offset(x=40.dp,y=220.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 10.sp,
        color = Color.Gray
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=270.dp,)
    )
    Text(
        text="Correo:" ,
        modifier = Modifier.offset(x=40.dp,y=270.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 10.sp,
        color = Color.Gray
    )
    Text(
        text="Info@HouseThreeThirty.com" ,
        modifier = Modifier.offset(x=40.dp,y=289.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 10.sp,
        color = Color.Blue,
        textDecoration = TextDecoration.Underline
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=330.dp,)
    )
    Text(
        text = "Ciudad:\nL.A(Los Angeles California)" ,
        modifier = Modifier.offset(x=40.dp,y=340.dp,),
        fontFamily = FontFamily.SansSerif,
        fontSize = 10.sp,
        color = Color.Gray
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=330.dp,)
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=410.dp,)
    )
    Text(
        text = "Descripción:\nSoy un icónico jugador de baloncesto estadounidense de \nLos Angeles Lakers, considerado por uno de los mejores de todos los \ntiempos. Con mis 2,03 m de altura, destaco por mi versatilidad, \ninteligencia de juego y físico imponente. Soy el máximo anotador \nhistórico de la NBA. " ,
        modifier = Modifier.offset(x=5.dp,y=420.dp,),
        fontFamily = FontFamily.Default,
        fontSize = 10.sp,
        color = Color.Gray
    )
    HorizontalDivider(
        color = Color.Black,
        thickness = 2.dp,
        modifier = Modifier.offset(x=0.dp,y=590.dp,)
    )
    Button(
        onClick = { /* Acción */ },
        modifier = Modifier.padding(8.dp).offset(x=80.dp,y=600.dp),
        enabled = true
    ) {
        Text("Contacta conmigo")
    }

}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun GreetingPreview() {
    TallerGitTheme {
        TarjetaPresentacion()
    }
}