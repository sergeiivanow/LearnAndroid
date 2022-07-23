package su.codesign.p0311_simpleintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnWeb: Button
    lateinit var btnMap: Button
    lateinit var btnCall: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWeb = findViewById(R.id.btnWeb);
        btnMap =  findViewById(R.id.btnMap);
        btnCall =  findViewById(R.id.btnCall);

        btnWeb.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnCall.setOnClickListener(this);
    }

    override fun onClick(v: View) {
        val intent: Intent
        when (v.getId()) {
            R.id.btnWeb -> {
                intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"))
                startActivity(intent)
            }
            R.id.btnMap -> {
                intent = Intent()
                intent.action = Intent.ACTION_VIEW
                intent.data = Uri.parse("geo:55.754283,37.62002")
                startActivity(intent)
            }
            R.id.btnCall -> {
                intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:12345")
                startActivity(intent)
            }
        }
    }
}