package com.example.natcharat.lab9

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val receiverData = intent.extras.getParcelable(MainActivity.KEY_DATA_STUDENT) as Student
         text_view_result_id_std.text = "ID:${receiverData.id}"
        text_view_result_first_name.text = "First Name:${receiverData.firstName}"
        text_view_result_last_name.text="Last Name:${receiverData.lastName}"
    }
}
