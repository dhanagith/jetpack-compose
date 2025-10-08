// In a new file, e.g., app/src/main/java/mende273/ktorandroidclient/data/model/Hotel.kt
package mende273.ktorandroidclient.data.model

import com.google.gson.annotations.SerializedName

// This is the main class that matches the root JSON object
data class HotelResponse(
    val paging: Int,
    val items: List<Hotel>
)

data class Hotel(
    val id: String,
    val title: String,
    val country: String,
    val city: String,
    val price: Double,
    val rating: String,
    val thumbnail: List<String>,
    @SerializedName("besthotel") // Use @SerializedName if the JSON key differs from your variable name
    val isBestHotel: Boolean,
    @SerializedName("moreInfo")
    val moreInfo: MoreInfo,
    // Add any other fields you need to display from the 'items' array
)

data class MoreInfo(
    val description: String,
    val rooms: List<Room>
)

data class Room(
    @SerializedName("roomId")
    val id: String,
    val title: String,
    val category: String,
    @SerializedName("noRoomsAvailable")
    val availableRooms: Int
    // Add other room details if necessary
)
