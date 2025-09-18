package mende273.ktorandroidclient.ui.component.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


// Assuming you have a data class for your chat items
data class ChatMessage(val id: String, val sender: String, val message: String, val timestamp: String)

@Composable
fun ChatList(messages: List<ChatMessage>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(messages) { message ->
            // This is where you would define how each chat item looks
            // For a WhatsApp-like UI, you'd typically have a Row with
            // a profile picture, sender name, message preview, and timestamp.
            ChatMessageRow(message)
        }
    }
}

@Composable
fun ChatMessageRow(message: ChatMessage) {
    // Replace this with your actual chat item UI
    // Example:
    // Row(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
    //     Image(painter = painterResource(id = R.drawable.profile_placeholder), contentDescription = "Profile picture")
    //     Spacer(modifier = Modifier.width(8.dp))
    //     Column {
    //         Text(text = message.sender, fontWeight = FontWeight.Bold)
    //         Text(text = message.message, maxLines = 1, overflow = TextOverflow.Ellipsis)
    //     }
    //     Spacer(modifier = Modifier.weight(1f))
    //     Text(text = message.timestamp, fontSize = 12.sp, color = Color.Gray)
    // }
    Text("Sender: ${message.sender}, Message: ${message.message}") // Placeholder
}

@Preview(showBackground = true)
@Composable
fun ChatListPreview() {
    val sampleMessages = listOf(
        ChatMessage("1", "Alice", "Hey, how are you?", "10:00 AM"),
        ChatMessage("2", "Bob", "I'm good, thanks! What about you?", "10:01 AM"),
        ChatMessage("3", "Alice", "Doing well. Working on a new project.", "10:02 AM"),
        ChatMessage("4", "Charlie", "Sounds exciting! Can you tell me more?", "10:05 AM")
    )
    ChatList(messages = sampleMessages)
}

@Preview(showBackground = true)
@Composable
fun ChatMessageRowPreview() {
    val sampleMessage = ChatMessage("1", "Alice", "This is a sample message preview.", "10:30 AM")
    ChatMessageRow(message = sampleMessage)
}


