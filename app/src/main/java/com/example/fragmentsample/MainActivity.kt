package com.example.fragmentsample

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.fragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val f1 = FragmentOne()
        val f2 = FragmentTwo()
        val f3 = FragmentThree()

        var mainText="This is a text from main activity"


        supportFragmentManager.beginTransaction().apply {
            var mBundle =Bundle()
            mBundle.putString("mainText",mainText)
            f1.arguments=mBundle
            replace(R.id.fragmentContainerView3,f1)
            commit()
        }

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menu_Home ->{
                    supportFragmentManager.beginTransaction().apply {
                        var mBundle =Bundle()
                        mBundle.putString("mainText",mainText)
                        f1.arguments=mBundle
                        replace(R.id.fragmentContainerView3, f1)
                        commit()
                    }
                }

                R.id.menu_Profile ->{
                    supportFragmentManager.beginTransaction().apply {
                        var mBundle =Bundle()
                        mBundle.putString("mainText",mainText)
                        f2.arguments=mBundle
                        replace(R.id.fragmentContainerView3, f2)
                        commit()
                    }

                }
                R.id.menu_notifications ->{
                    supportFragmentManager.beginTransaction().apply {
                        var mBundle =Bundle()
                        mBundle.putString("mainText",mainText)
                        f3.arguments=mBundle
                        replace(R.id.fragmentContainerView3, f3)
                        commit()
                    }

                }
            }
            true
        }
        binding.materialToolbar2.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.appBarSettings->{
                   showDialog()
                }
            }
            true
        }
    }

    private fun showDialog() {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("This is a dialog box")
            alertDialogBuilder.setMessage("This is a Dialog box!")

            alertDialogBuilder.setPositiveButton("OK"){ _: DialogInterface, _:Int->
                Toast.makeText(applicationContext,"OK is clicked", Toast.LENGTH_SHORT).show()
            }
            alertDialogBuilder.setNegativeButton("CANCEL"){ _: DialogInterface, _:Int->
                Toast.makeText(applicationContext,"Cancel is clicked", Toast.LENGTH_SHORT).show()
            }
            alertDialogBuilder.create().show()
    }
}
