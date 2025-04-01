package com.example.mealsuggestionappv3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Here i have declared my variables
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val buttonSuggest = findViewById<Button>(R.id.buttonSuggest)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val textViewSuggestion = findViewById<TextView>(R.id.textViewSuggestion)
    //Author:Zarah Bulbulia
    //url:https://github.com/zb662000/assignmen
    //This button will show meal suggestion when a user types any of the following times of day
    //author:Zarah Bulbulia
    //url:https://github.com/zb662000/assignmen
                    buttonSuggest.setOnClickListener {
                        val timeOfDay = editTextTime.text.toString().trim()
                        val suggestion = when(timeOfDay.lowercase()) {
                            "morning"->"Greek yogurt with honey and granola:)"
                            "mid-morning"->"Apple slices with peanut butter:)"
                            "lunch"->"Chicken and mayo toast on brown bread:)"
                            "afternoon"->"Eggs benedict with smoked salmon:)"
                            "mid-afternoon"->"Grilled chicken salad with avocado on toast:)"
                            "dinner"->"Chickpea curry with basmati rice:)"
                            else ->"Please enter a proper time of day :("
                        }
                        textViewSuggestion.text=suggestion
                    }
                    //This will reset the text view and edit text box in which case it will clear
                //author: Zarah bulbulia
               //url:https://github.com/zb662000/assignmen
                buttonReset.setOnClickListener {
                    editTextTime.text.clear()
                    textViewSuggestion.text = ""
                    //This code will now make the app fucntion and work properly user needs to input time of day and reset the textview

    }


}
}