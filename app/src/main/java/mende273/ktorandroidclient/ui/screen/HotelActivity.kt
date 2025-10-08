package mende273.ktorandroidclient.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.delay
import mende273.ktorandroidclient.data.model.Hotel
import mende273.ktorandroidclient.ui.component.HeaderTitleText
import mende273.ktorandroidclient.ui.component.ui.HotelUI
import mende273.ktorandroidclient.ui.theme.KtorAndroidClientTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class HotelActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        val viewModel: HotelViewModel by viewModel()
        setContent {
            KtorAndroidClientTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentWindowInsets = WindowInsets.systemBars,
                    topBar = {
                        Box(modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars)) {
                            HeaderTitleText(
                                title = "Hotel Lists"
                            )
                        }
                    },
                    bottomBar = {
                        // Bottom bar content
                    }
                ) { innerPadding ->
                    val context = LocalContext.current
                    val dataList = remember { viewModel.loadMyDataList(context) }
                    HotelUi(innerPaddings = innerPadding, dataList = dataList)
                }
            }
        }

    }

    @Composable fun HotelUi(innerPaddings: PaddingValues, dataList: List<Hotel>) {
        HotelUI(dataList = dataList, innerPaddings = innerPaddings)
    }
}

