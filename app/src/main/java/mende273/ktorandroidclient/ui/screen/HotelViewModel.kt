package mende273.ktorandroidclient.ui.screen

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import kotlinx.io.IOException
import mende273.ktorandroidclient.data.model.Hotel
import mende273.ktorandroidclient.data.model.HotelResponse


class HotelViewModel() : ViewModel() {

    // Utility function to read JSON from assets
    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        return try {
            context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    // Function to parse JSON to a list of Hotels using Gson
    fun loadMyDataList(context: Context): List<Hotel> {
        val jsonString = getJsonDataFromAsset(context, "Listofhotel.json")

        // 1. Check if the JSON string is null or empty
        if (jsonString.isNullOrEmpty()) {
            return emptyList()
        }

        // 2. Parse the entire JSON into the single HotelApiResponse object
        val apiResponse = Gson().fromJson(jsonString, HotelResponse::class.java)

        // 3. Return the 'items' list from within that object
        // Use the null-safe ?. and Elvis operator ?: for safety
        return apiResponse?.items ?: emptyList()
    }

}
