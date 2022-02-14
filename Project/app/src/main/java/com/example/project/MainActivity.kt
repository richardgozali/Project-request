package com.example.project

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.util.*


class MainActivity : AppCompatActivity() {
    private fun adduser(email:String,full_name:String,password:String) {
        val url = "https://dw.digitalasiasolusindo.com/api/method/test_ecommerce.apis.v1.user.add"

        val request: StringRequest = object : StringRequest(
            Method.POST, url,
            Response.Listener { response ->
                if (response != null) {
                    Log.e("Your Array Response", response)
                } else {
                    Log.e("Your Array Response", "Data Null")
                }
            },
            Response.ErrorListener { error -> Log.e("error is ", "" + error) }) {
            //This is for Headers If You Needed
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["Authorization"] = "token 1baf1bdd74e71df:9f052addb5c6f3e"
                return params
            }

            //Pass Your Parameters here
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["email"] = email
                params["full_name"] = full_name
                params["password"] = password
                return params
            }
        }
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(request)
    }
    private fun login (email: String , password: String ) {
        val url = "https://dw.digitalasiasolusindo.com//api/method/test_ecommerce.apis.v1.user.auth"

        val request: StringRequest = object : StringRequest(
            Method.POST, url,
            Response.Listener { response ->
                if (response != null) {
                    Log.e("Your Array Response", response)
                } else {
                    Log.e("Your Array Response", "Data Null")
                }
            },
            Response.ErrorListener { error -> Log.e("error is ", "" + error) }) {
            //This is for Headers If You Needed
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["Authorization"] = "token 1baf1bdd74e71df:9f052addb5c6f3e"
                return params
            }

            //Pass Your Parameters here
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["email"] = email
                params["password"] = password
                return params
            }
        }
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(request)
    }
    private fun getitem (keyword:String, page:String){

        val url = "https://dw.digitalasiasolusindo.com//api/method/test_ecommerce.apis.v1.item.get"

        val request: StringRequest = object : StringRequest(
            Method.POST, url,
            Response.Listener { response ->
                if (response != null) {
                    Log.e("Your Array Response", response)
                } else {
                    Log.e("Your Array Response", "Data Null")
                }
            },
            Response.ErrorListener { error -> Log.e("error is ", "" + error) }) {
            //This is for Headers If You Needed
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["Authorization"] = "token 1baf1bdd74e71df:9f052addb5c6f3e"
                return params
            }

            //Pass Your Parameters here
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["keyword"] = keyword
                params ["page"] = page
                return params
            }
        }
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(request)
    }
    private fun getcart(){
        val url = "https://dw.digitalasiasolusindo.com/api/method/test_ecommerce.apis.v1.cart.get"

        val request: StringRequest = object : StringRequest(
            Method.POST, url,
            Response.Listener { response ->
                if (response != null) {
                    Log.e("Your Array Response", response)
                } else {
                    Log.e("Your Array Response", "Data Null")
                }
            },
            Response.ErrorListener { error -> Log.e("error is ", "" + error) }) {
            //This is for Headers If You Needed
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["Authorization"] = "token 1baf1bdd74e71df:9f052addb5c6f3e"
                return params
            }

            //Pass Your Parameters here
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()

                return params
            }
        }
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(request)
    }
    private fun addcart(item_code:String, qty:String){
        val url = "https://dw.digitalasiasolusindo.com/api/method/test_ecommerce.apis.v1.cart.add"

        val request: StringRequest = object : StringRequest(
            Method.POST, url,
            Response.Listener { response ->
                if (response != null) {
                    Log.e("Your Array Response", response)
                } else {
                    Log.e("Your Array Response", "Data Null")
                }
            },
            Response.ErrorListener { error -> Log.e("error is ", "" + error) }) {
            //This is for Headers If You Needed
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["Authorization"] = "token 1baf1bdd74e71df:9f052addb5c6f3e"
                return params
            }

            //Pass Your Parameters here
            override fun getParams(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["item_code"] = item_code
                params ["qty"] = qty
                return params
            }
        }
        val queue = Volley.newRequestQueue(applicationContext)
        queue.add(request)
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*adduser("doniss@gmail.com", "Coba", "LUpa")*/
       /* login("doniss@gmail.com", "LUpa")*/
       /* getitem("iphone", "0")*/
       /* addcart("iPhone 13.3","1")*/
        getcart()
    }


}