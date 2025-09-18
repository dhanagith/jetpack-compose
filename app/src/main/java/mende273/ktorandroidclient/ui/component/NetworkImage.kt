package mende273.ktorandroidclient.ui.component

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest

@Composable
fun NetworkImage(
    modifier: Modifier = Modifier,
    url: String,
    contentDescription: String = "",
    contentScale: ContentScale = ContentScale.None
) {
    AsyncImage(
        modifier = modifier,
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .build(),
        contentDescription = contentDescription,
        contentScale = contentScale
    )
}


@Preview(showBackground = true)
@Composable
fun NetworkImagePreview() {
    // You'll need a placeholder image URL for the preview.
    // Replace this with a valid image URL that you can access during development.
    // For example, you can use a public placeholder image service.
    val placeholderImageUrl = "https://via.placeholder.com/150"

    NetworkImage(
        url = placeholderImageUrl,
        contentDescription = "Sample Image",
        modifier = Modifier.size(150.dp),
        contentScale = ContentScale.Crop
    )
}