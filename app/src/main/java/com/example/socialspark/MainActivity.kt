package com.example.socialspark

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "SocialSparkApp"

    private lateinit var etTimeOfDay: EditText
    private lateinit var btnGetSpark: Button
    private lateinit var btnReset: Button
    private lateinit var tvSuggestion: TextView
    private lateinit var tvTimePeriod: TextView
    private lateinit var tvError: TextView
    private lateinit var layoutResult: LinearLayout
    private lateinit var layoutError: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "App started")

        etTimeOfDay = findViewById(R.id.etTimeOfDay)
        btnGetSpark = findViewById(R.id.btnGetSpark)
        btnReset = findViewById(R.id.btnReset)
        tvSuggestion = findViewById(R.id.tvSuggestion)
        tvTimePeriod = findViewById(R.id.tvTimePeriod)
        tvError = findViewById(R.id.tvError)
        layoutResult = findViewById(R.id.layoutResult)
        layoutError = findViewById(R.id.layoutError)

        btnGetSpark.setOnClickListener {
            processTimeOfDay()
        }

        btnReset.setOnClickListener {
            resetApp()
        }
    }

    private fun processTimeOfDay() {

        val userInput = etTimeOfDay.text.toString().trim().lowercase()

        if (userInput.isEmpty()) {
            showError("Please enter a valid time of day.")
            return
        }

        if (userInput == "morning") {

            showSpark(
                "Send a 'Good morning' text to a family member.",
                "Morning"
            )

        } else if (userInput == "mid-morning" || userInput == "mid morning") {

            showSpark(
                "Reach out to a colleague with a thank you message.",
                "Mid-morning"
            )

        } else if (userInput == "afternoon") {

            showSpark(
                "Share a funny meme with a friend.",
                "Afternoon"
            )

        } else if (
            userInput == "afternoon snack time" ||
            userInput == "snack time" ||
            userInput == "snack"
        ) {

            showSpark(
                "Send a quick 'thinking of you' message.",
                "Afternoon Snack Time"
            )

        } else if (userInput == "dinner") {

            showSpark(
                "Call a friend or relative for a quick catch-up.",
                "Dinner"
            )

        } else if (
            userInput == "after dinner" ||
            userInput == "night" ||
            userInput == "evening"
        ) {

            showSpark(
                "Leave a thoughtful comment on a friend's social media post.",
                "After Dinner"
            )

        } else {

            showError(
                "Invalid input. Try: Morning, Mid-morning, Afternoon, Snack Time, Dinner, or After Dinner."
            )
        }
    }

    private fun showSpark(suggestion: String, timePeriod: String) {

        layoutError.visibility = View.GONE

        tvSuggestion.text = suggestion
        tvTimePeriod.text = "Time period: $timePeriod"

        layoutResult.visibility = View.VISIBLE
    }

    private fun showError(message: String) {

        layoutResult.visibility = View.GONE

        tvError.text = message

        layoutError.visibility = View.VISIBLE
    }

    private fun resetApp() {

        etTimeOfDay.text.clear()

        layoutResult.visibility = View.GONE
        layoutError.visibility = View.GONE
    }
}