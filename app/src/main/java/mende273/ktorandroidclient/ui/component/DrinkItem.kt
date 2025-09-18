package mende273.ktorandroidclient.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mende273.ktorandroidclient.data.model.Drink

@Composable
fun DrinkItem(item: Drink) {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item.strDrinkThumb?.let {
            NetworkImage(
                modifier = Modifier.size(50.dp),
                url = it,
                contentScale = ContentScale.Crop
            )
        }

        item.strDrink?.let { Text(text = it) }
    }
}

@Preview(showBackground = true)
@Composable
fun DrinkItemPreview() {
    val sampleDrinkWithImage = Drink(
        idDrink = 11007,
        strDrink = "Margarita",
        strDrinkThumb = "https://www.thecocktaildb.com/images/media/drink/5noda61589575158.jpg"
        // Add other properties if DrinkItem uses them, otherwise nulls are fine for preview
    )



    // You can have multiple previews or combine them in a Column if needed
    // For now, let's just preview one with an image
    DrinkItem(item = sampleDrinkWithImage)

    // If you want to see how it looks without an image, you can uncomment this
    // or create another @Preview function:
    // DrinkItem(item = sampleDrinkWithoutImage)
}

