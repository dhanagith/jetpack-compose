package mende273.ktorandroidclient.data.model

import com.google.gson.annotations.SerializedName

data class RoomAvailabilityResponse(
    val items: List<RoomAvailability>
)

data class RoomAvailability(
    @SerializedName("noRoomsAvailable")
    val availableRooms: Int,

    @SerializedName("hotel_id")
    val hotelId: String,

    @SerializedName("room_type_id")
    val roomTypeId: String
)
