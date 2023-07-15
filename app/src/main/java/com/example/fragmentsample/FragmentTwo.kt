package com.example.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentsample.databinding.FragmentTwoBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTwo.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTwo : Fragment() {
    private lateinit var binding:FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        val bundle =arguments
        val mainText = bundle?.getString("mainText")
        Toast.makeText(context,"Fragment 2 $mainText", Toast.LENGTH_SHORT).show()
        return binding.root
    }
}