package com.example.ejemplo1.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleView(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.White)
}

@Composable
fun Spacers(){
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun MainButton(name:String, backcolor:Color, color:Color,onClick:()->Unit){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        contentColor = color,
        containerColor = backcolor),
        modifier = Modifier.padding(top = 8.dp)){
        Text(text=name)
    }
}