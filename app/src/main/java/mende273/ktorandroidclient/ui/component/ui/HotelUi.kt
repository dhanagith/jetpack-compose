package mende273.ktorandroidclient.ui.component.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mende273.ktorandroidclient.data.model.Hotel
import mende273.ktorandroidclient.ui.component.LazyImage
import mende273.ktorandroidclient.ui.component.TitleText


@Composable
fun HotelUI(innerPaddings: PaddingValues, dataList: List<Hotel>) {

    Column(modifier = Modifier.fillMaxWidth()) {

        LazyColumn(
            modifier = Modifier.padding(innerPaddings),
        ) {
            items(dataList) { item ->
                Box(modifier = Modifier.padding(all = 10.dp)) {
                    Row {
                        LazyImage()
                        Spacer(Modifier.padding(horizontal = 5.dp))

                        Column {
                            TitleText(item.title)
                            TitleText("Country : " + item.country)
                            TitleText("Price : " + item.price.toString())
                        }

                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ChatListPreview() {
    val sampleMessages = listOf(
        Hotel("1", "Hotel Hilton", "India", "", 12.2,"",
            emptyList(),true, moreInfo = mende273.ktorandroidclient.data.model.MoreInfo("", listOf())
        ),  Hotel("2", "Hotel Leela Palace", "", "", 12.2,"",
            emptyList(),true, moreInfo = mende273.ktorandroidclient.data.model.MoreInfo("", listOf())
        ),  Hotel("3", "Hotel Le Meredian", "", "", 12.2,"",
            emptyList(),true, moreInfo = mende273.ktorandroidclient.data.model.MoreInfo("", listOf())
        ),  Hotel("4", "Hotel Chola", "", "", 12.2,"",
            emptyList(),true, moreInfo = mende273.ktorandroidclient.data.model.MoreInfo("", listOf())
        ),  Hotel("5", "Hotel Accord", "", "", 12.2,"",
            emptyList(),true, moreInfo = mende273.ktorandroidclient.data.model.MoreInfo("", listOf())
        ),
    )
    HotelUI(innerPaddings = PaddingValues(16.dp), dataList = sampleMessages)
}




