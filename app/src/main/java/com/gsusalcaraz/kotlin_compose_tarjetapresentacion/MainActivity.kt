package com.gsusalcaraz.kotlin_compose_tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gsusalcaraz.kotlin_compose_tarjetapresentacion.ui.theme.Kotlin_ComposeTarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_ComposeTarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
    ){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.icono),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.nombre),
            textAlign = TextAlign.Center,
            fontSize = 34.sp
        )
        Text(
            text = stringResource(R.string.profesion),
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            color = Color.Blue
        )
        Column(
            modifier = Modifier.padding(30.dp)
        ) {
            Row(
                modifier = Modifier.padding(top = 50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.telefono),
                    contentDescription = "email",
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.telefono),
                    modifier = Modifier
                        .padding(top = 10.dp, end = 16.dp)
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.mail),
                    contentDescription = "email",
                    modifier = Modifier
                        .padding(top = 10.dp, end = 16.dp)
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    modifier = Modifier
                            .padding(top = 10.dp, end = 16.dp)
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.social),
                    contentDescription = "social",
                    modifier = Modifier
                        .padding(top = 10.dp, end = 16.dp)
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.social),
                    modifier = Modifier
                        .padding(top = 10.dp, end = 16.dp)
                )
            }
        }
    }
    }

}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    Kotlin_ComposeTarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}