package com.example.dmblu.shoppinglist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TableLayout
import com.example.dmblu.shoppinglist.R.id.tableLayout
import android.widget.TextView
import android.view.LayoutInflater



class CreateList: AppCompatActivity() {
    lateinit var dbHelper:RecipeDBHelper
    lateinit var tableLayout:TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dbHelper = RecipeDBHelper(this)

        //Setup for the table
        tableLayout = findViewById(R.id.tableLayout)
        setContentView(R.layout.activity_create_list)

        //Populate the table
        for (i in 1..5) {
            val tableRow = LayoutInflater.from(this).inflate(R.layout.table_row, null, false)
            val history_display_no = tableRow.findViewById(R.id.history_display_no) as TextView
            val history_display_date = tableRow.findViewById(R.id.history_display_date) as TextView
            val history_display_orderid = tableRow.findViewById(R.id.history_display_orderid) as TextView
            val history_display_quantity = tableRow.findViewById(R.id.history_display_quantity) as TextView

            history_display_no.text = "" + (i + 1)
            history_display_date.text = "2014-02-05"
            history_display_orderid.text = "S0" + (i + 1)
            history_display_quantity.text = "" + (20 + (i + 1))
            tableLayout.addView(tableRow)
        }
    }
}