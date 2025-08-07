package ua.com.wetoo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SplashScreen()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp)
            .background(colorResource(id = R.color.backgroundCream)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome", fontSize = 30.sp, modifier = Modifier.padding(bottom = 20.dp))
        Text(text = "Find your hobby class", fontSize = 18.sp)
        Text(text = "or", fontSize = 18.sp)
        Text(text = "create your own", fontSize = 18.sp)

        Image(
            painter = painterResource(id = R.drawable.ic_splash),
            contentDescription = "splash icon",
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.primaryOrange),
                contentColor = colorResource(R.color.backgroundCream)
            ),
            shape = RoundedCornerShape(8),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register", fontSize = 18.sp)
        }
        TextButton(
            onClick = {}) {
            Text("Sign in", fontSize = 18.sp, color = colorResource(R.color.primaryOrange))
        }
    }

}
