package su.codesign.p0261intentfilter

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    var resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            Toast.makeText(this, result.data?.getStringExtra("title"), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = findViewById(R.id.date) as Button
        val time = findViewById(R.id.time) as Button

        date.setOnClickListener {
            val intent = Intent("su.codesign.action.DATE")
            intent.putExtra("title", "Date")
        }

        time.setOnClickListener {
            val intent = Intent("su.codesign.action.TIME")
            resultLauncher.launch(intent)
        }
    }
}