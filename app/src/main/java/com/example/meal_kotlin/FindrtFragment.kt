package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentFindrtBinding

class FindrtFragment : Fragment() {
    private var _binding: FragmentFindrtBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFindrtBinding.inflate(inflater,container,false)
        val numbers = resources.getStringArray(R.array.numbers)
        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,numbers)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rtdonebtn.setOnClickListener{
            findNavController().navigate(R.id.action_findrtFragment_to_gachaFragment)
        }
        binding.food1.setOnClickListener { binding.food1.setBackgroundResource(R.drawable.food_cus2) }
        binding.food2.setOnClickListener { binding.food2.setBackgroundResource(R.drawable.food_cus2) }
        binding.food3.setOnClickListener { binding.food3.setBackgroundResource(R.drawable.food_cus2) }
        binding.food4.setOnClickListener { binding.food4.setBackgroundResource(R.drawable.food_cus2) }
        binding.food5.setOnClickListener { binding.food5.setBackgroundResource(R.drawable.food_cus2) }
        binding.food6.setOnClickListener { binding.food6.setBackgroundResource(R.drawable.food_cus2) }
        binding.food7.setOnClickListener { binding.food7.setBackgroundResource(R.drawable.food_cus2) }
        binding.food8.setOnClickListener { binding.food8.setBackgroundResource(R.drawable.food_cus2) }
        binding.food9.setOnClickListener { binding.food9.setBackgroundResource(R.drawable.food_cus2) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}