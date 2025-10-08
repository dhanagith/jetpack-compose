package mende273.ktorandroidclient.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mende273.ktorandroidclient.R


@Composable
fun LazyImage(
) {
    Image(
        painter = painterResource(id = R.drawable.hotel_img),
        contentDescription = "ddsfsdgdfh",
        contentScale = ContentScale.Crop, // Crop the image to fill the space
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
    )
}

@Preview(showBackground = true)
@Composable
fun LazyImagePreview() {
    TitleText(
        title = "Accord",
    )
}