package com.example.lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolumn.model.Person
import com.example.lazycolumn.repository.PersonRepo
import com.example.lazycolumn.ui.theme.LazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnTheme {
                // Surface is often used as the top-level container
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val personRepository = PersonRepo()
                    val getAllData = personRepository.getAllData()

                    // LazyColumn to display the list of persons
                    LazyColumn {
                        items(items = getAllData) { person ->
                            CustomItem(person = person)
                        }
                    }
                }
            }
        }
    }
}

//To preview our Compose
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumnTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            // Use data from PersonRepo
            val personRepository = PersonRepo()
            val sampleData = personRepository.getAllData()

            LazyColumn (
                contentPadding = PaddingValues(all = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ){
                items(items = sampleData) { person ->
                    CustomItem(person = person)
                }
            }
        }
    }
}
