package com.example.controlacces

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var v:View
    var durAnimation:Int=0
    var context=applicationContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        v=findViewById(R.id.pass)

        v.visibility=View.GONE
        durAnimation=resources.getInteger(android.R.integer.config_shortAnimTime)

    }

    fun animar(){
        v.apply{
            alpha=0f
            visibility=View.VISIBLE

            animate()
                .alpha(1f)
                .setDuration(durAnimation.toLong())
                .setListener(object :AnimatorListenerAdapter(){

                    override fun onAnimationEnd(animation: Animator?) {
                        super.onAnimationEnd(animation)
                        Toast.makeText(context,"",Toast.LENGTH_LONG).show()
                    }

                })
        }
    }
}