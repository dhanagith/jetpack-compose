package mende273.ktorandroidclient.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderTitleText(
    title: String
) {
    Column {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal),
            modifier = Modifier.padding(all = 16.dp),
        )
        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderTitleTextPreview() {
    TitleText(
        title = "Hotel Lists",
    )
}