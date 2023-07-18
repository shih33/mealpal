package com.example.meal_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.meal_kotlin.databinding.FragmentInvitefriendBinding

class InvitefriendFragment : Fragment() {
    private var _binding: FragmentInvitefriendBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInvitefriendBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.invitefriendbtn.setOnClickListener{
            findNavController().navigate(R.id.action_invitefriendFragment_to_manageFragment)
        }
        binding.begbtn1.setOnClickListener {
            binding.begbtn1.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.begbtn2.setOnClickListener {
            binding.begbtn2.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.begbtn3.setOnClickListener {
            binding.begbtn3.setBackgroundResource(R.drawable.ibtn2)
        }
        binding.begbtn4.setOnClickListener {
            binding.begbtn4.setBackgroundResource(R.drawable.ibtn2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}