package com.example.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentsample.databinding.FragmentOneBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {
    private lateinit var binding: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //DO THE BINDING HERE
        binding = FragmentOneBinding.inflate(layoutInflater,container,false)
        val bundle =arguments
        val mainText = bundle?.getString("mainText")
        Toast.makeText(context,"Fragment 1 $mainText",Toast.LENGTH_SHORT).show()
        return binding.root

    }
}