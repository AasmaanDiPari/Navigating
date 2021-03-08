package com.harry.models

import androidx.appcompat.app.AppCompatActivity

class Model : AppCompatActivity() {
    data class Hobby(var title: String) {
        object Supplier {
            val hobbies = listOf<Hobby>(
                Hobby("Swimming"),
                Hobby("Reading"),
                Hobby("playing"),
                Hobby("Dancing"),
                Hobby("Swimming"),
                Hobby("Reading"),
                Hobby("playing"),
                Hobby("Dancing"),
                Hobby("Swimming"),
                Hobby("Reading"),
                Hobby("playing"),
                Hobby("Dancing"),
                Hobby("Swimming"),
                Hobby("Reading"),
                Hobby("playing"),
                Hobby("Dancing"),
                Hobby("Swimming"),
                Hobby("Reading"),
                Hobby("playing"),
                Hobby("Dancing")
            )
        }
    }
}
