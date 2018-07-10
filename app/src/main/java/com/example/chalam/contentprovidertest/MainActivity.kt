package com.example.chalam.contentprovidertest

import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.SimpleCursorAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resolver = contentResolver
        var cursor = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)

        var from = arrayOf(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER)
        var to = intArrayOf(R.id.tv1,R.id.tv2)

        var Myadapter =  SimpleCursorAdapter(this,R.layout.indiv_item,cursor,from,to,0)
        listView.adapter = Myadapter

    }
}
/* var resolver = contentResolver
   var cursor = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,
     ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)

        var from = arrayOf(
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                ContactsContract.CommonDataKinds.Phone.NUMBER)
        var to = intArrayOf(R.id.tv1,R.id.tv2)

        var adapter = SimpleCursorAdapter(this,
                R.layout.indiview,cursor,from,to,0)
        lview.adapter = adapter*/