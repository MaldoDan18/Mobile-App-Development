package com.example.navigationpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate fragment layout using view binding
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Navigate to second fragment
        binding.navToSecondFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_second)
        }
        // Navigate to third fragment
        binding.navToThirdFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_third)
        }
        // Navigate to Actions Activity (SecondActivity)
        binding.navToSecActivityFromFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondActivity)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        // Clear binding reference to avoid memory leaks
        _binding = null
    }
}