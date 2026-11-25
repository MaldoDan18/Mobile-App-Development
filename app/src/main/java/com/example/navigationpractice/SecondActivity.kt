package com.example.navigationpractice

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationpractice.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Inflate activity layout using view binding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.secondMain) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupActionListeners()
    }

    private fun setupActionListeners() {
        // Write message to Logcat
        binding.writeToLogcatBtn.setOnClickListener {
            Log.d("ACTIONS_ACTIVITY", "Write to LogCat button clicked")
        }

        // Show short Toast message
        binding.showToastBtn.setOnClickListener {
            Toast.makeText(this, "Hello from Actions Activity", Toast.LENGTH_SHORT).show()
        }

        // Write text into the EditText field
        binding.writeToEditTextBtn.setOnClickListener {
            binding.actionsEditText.setText("Written from button")
        }

        // Close activity and return to the host fragment
        binding.backToFirstFragmentBtn.setOnClickListener {
            finish()
        }
    }
}